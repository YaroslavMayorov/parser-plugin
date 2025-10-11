package org.language.cobol;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.language.cobol.psi.CobolTypes;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
  return;
%eof}

WHITE_SPACE = [ \t\r\n]+
IDENTIFIER  = [A-Z][A-Z0-9\-]*
NUMBER      = [0-9]+
STRING      = \'[A-Z0-9\- ]+\'
DOT = '.'
LPAREN="("
RPAREN=")"
EQ="="
IDENTIFICATION="IDENTIFICATION"
DIVISION="DIVISION"
PROGRAM_ID="PROGRAM-ID"
DATA="DATA"
WORKING_STORAGE="WORKING-STORAGE"
SECTION="SECTION"
PROCEDURE="PROCEDURE"
PERFORM="PERFORM"
VARYING="VARYING"
FROM="FROM"
BY="BY"
UNTIL="UNTIL"
STOP="STOP"
RUN="RUN"
DISPLAY="DISPLAY"
VALUE="VALUE"

%state PIC

%%

{WHITE_SPACE}                { return TokenType.WHITE_SPACE; }

"IDENTIFICATION"             { return CobolTypes.IDENTIFICATION; }
"DIVISION"                   { return CobolTypes.DIVISION; }
"PROGRAM-ID"                 { return CobolTypes.PROGRAM_ID; }
"DATA"                       { return CobolTypes.DATA; }
"WORKING-STORAGE"            { return CobolTypes.WORKING_STORAGE; }
"SECTION"                    { return CobolTypes.SECTION; }
"PROCEDURE"                  { return CobolTypes.PROCEDURE; }
"PERFORM"                    { return CobolTypes.PERFORM; }
"VARYING"                    { return CobolTypes.VARYING; }
"FROM"                       { return CobolTypes.FROM; }
"BY"                         { return CobolTypes.BY; }
"UNTIL"                      { return CobolTypes.UNTIL; }
"STOP"                       { return CobolTypes.STOP; }
"RUN"                        { return CobolTypes.RUN; }
"DISPLAY"                    { return CobolTypes.DISPLAY; }
"PIC"                        { yybegin(PIC); return CobolTypes.PIC; }
"VALUE"                      { return CobolTypes.VALUE; }

"="                          { return CobolTypes.EQ; }
"."                          { return CobolTypes.DOT; }
"("                          { return CobolTypes.LPAREN; }
")"                          { return CobolTypes.RPAREN; }

{STRING}                     { return CobolTypes.STRING; }
{IDENTIFIER}                 { return CobolTypes.IDENTIFIER; }
{NUMBER}                     { return CobolTypes.NUMBER; }

[^]                          { return TokenType.BAD_CHARACTER; }

/* ==========================
   PIC STATE
   ========================== */

<PIC> {WHITE_SPACE}+           { return TokenType.WHITE_SPACE; }

<PIC> "9"                      { return CobolTypes.NUMBER; }
<PIC> "("                      { return CobolTypes.LPAREN; }
<PIC> ")"                      { return CobolTypes.RPAREN; }
<PIC> {NUMBER}                 { return CobolTypes.NUMBER; }

<PIC> "VALUE"                  { yybegin(YYINITIAL); return CobolTypes.VALUE; }
<PIC> "."                      { yybegin(YYINITIAL); return CobolTypes.DOT; }

<PIC> .                        { yybegin(YYINITIAL); yypushback(1); }