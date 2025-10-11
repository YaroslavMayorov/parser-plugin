// src/main/java/org/language/cobol/CobolTokenSets.java
package org.language.cobol.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.TokenSet;

public interface CobolTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(
            CobolTypes.IDENTIFIER
    );

    TokenSet KEYWORDS = TokenSet.create(
            CobolTypes.IDENTIFICATION,
            CobolTypes.DIVISION,
            CobolTypes.DATA,
            CobolTypes.PROCEDURE,
            CobolTypes.SECTION,
            CobolTypes.WORKING_STORAGE,
            CobolTypes.PERFORM,
            CobolTypes.BY,
            CobolTypes.FROM,
            CobolTypes.UNTIL,
            CobolTypes.VARYING,
            CobolTypes.STOP,
            CobolTypes.RUN,
            CobolTypes.DISPLAY,
            CobolTypes.PIC,
            CobolTypes.VALUE,
            CobolTypes.PROGRAM_ID
    );


    TokenSet NUMBERS  = TokenSet.create(CobolTypes.NUMBER);
    TokenSet STRINGS  = TokenSet.create(CobolTypes.STRING);
    TokenSet LITERALS = TokenSet.orSet(NUMBERS, STRINGS);

    TokenSet OPERATORS   = TokenSet.create(CobolTypes.EQ);
    TokenSet PARENTHESES = TokenSet.create(CobolTypes.LPAREN, CobolTypes.RPAREN);
    TokenSet PUNCTUATION = TokenSet.create(CobolTypes.DOT);

    TokenSet WHITESPACE = TokenSet.create(TokenType.WHITE_SPACE);
}
