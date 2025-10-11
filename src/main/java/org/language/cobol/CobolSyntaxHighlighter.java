package org.language.cobol;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.language.cobol.psi.CobolTypes;

public class CobolSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] KEYWORD_KEYS =
            pack(DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey[] STRING_KEYS =
            pack(DefaultLanguageHighlighterColors.STRING);
    private static final TextAttributesKey[] NUMBER_KEYS =
            pack(DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey[] OPERATOR_KEYS =
            pack(DefaultLanguageHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey[] PARENTHESES_KEYS =
            pack(DefaultLanguageHighlighterColors.PARENTHESES);
    private static final TextAttributesKey[] EMPTY_KEYS = EMPTY;

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CobolLexerAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType == CobolTypes.IDENTIFICATION ||
                tokenType == CobolTypes.DIVISION ||
                tokenType == CobolTypes.PROGRAM_ID ||
                tokenType == CobolTypes.DATA ||
                tokenType == CobolTypes.WORKING_STORAGE ||
                tokenType == CobolTypes.SECTION ||
                tokenType == CobolTypes.PROCEDURE ||
                tokenType == CobolTypes.PERFORM ||
                tokenType == CobolTypes.VARYING ||
                tokenType == CobolTypes.FROM ||
                tokenType == CobolTypes.BY ||
                tokenType == CobolTypes.UNTIL ||
                tokenType == CobolTypes.STOP ||
                tokenType == CobolTypes.RUN ||
                tokenType == CobolTypes.DISPLAY ||
                tokenType == CobolTypes.VALUE) {
            return KEYWORD_KEYS;
        }

        if (tokenType == CobolTypes.STRING) {
            return STRING_KEYS;
        }

        if (tokenType == CobolTypes.NUMBER || tokenType == CobolTypes.LINE_NUMBER) {
            return NUMBER_KEYS;
        }

        if (tokenType == CobolTypes.EQ || tokenType == CobolTypes.DOT) {
            return OPERATOR_KEYS;
        }

        if (tokenType == CobolTypes.LPAREN || tokenType == CobolTypes.RPAREN) {
            return PARENTHESES_KEYS;
        }

        return EMPTY_KEYS;
    }
}
