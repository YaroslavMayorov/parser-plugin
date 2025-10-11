// This is a generated file. Not intended for manual editing.
package org.language.cobol.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.language.cobol.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.language.cobol.psi.*;

public class CobolDisplayStmtImpl extends ASTWrapperPsiElement implements CobolDisplayStmt {

  public CobolDisplayStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDisplayStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolDisplayOperands getDisplayOperands() {
    return findNotNullChildByClass(CobolDisplayOperands.class);
  }

}
