package org.language.cobol;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.language.cobol.parser.CobolParser;
import org.language.cobol.psi.CobolFile;
import org.language.cobol.psi.CobolTypes;
import org.jetbrains.annotations.NotNull;

/**
 * ParserDefinition connects your lexer, parser, and PSI structure to the IntelliJ Platform.
 */
public class CobolParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(CobolLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CobolLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new CobolParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return TokenSet.create(TokenType.WHITE_SPACE);
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.create(CobolTypes.STRING);
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CobolTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CobolFile(viewProvider);
    }

    @Override
    public @NotNull SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
