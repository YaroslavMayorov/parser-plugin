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

public class CobolStatementImpl extends ASTWrapperPsiElement implements CobolStatement {

  public CobolStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataDivision getDataDivision() {
    return findChildByClass(CobolDataDivision.class);
  }

  @Override
  @Nullable
  public CobolDataItemDecl getDataItemDecl() {
    return findChildByClass(CobolDataItemDecl.class);
  }

  @Override
  @Nullable
  public CobolDisplayStmt getDisplayStmt() {
    return findChildByClass(CobolDisplayStmt.class);
  }

  @Override
  @Nullable
  public CobolIdentificationDivision getIdentificationDivision() {
    return findChildByClass(CobolIdentificationDivision.class);
  }

  @Override
  @Nullable
  public CobolParagraph getParagraph() {
    return findChildByClass(CobolParagraph.class);
  }

  @Override
  @Nullable
  public CobolPerformStmt getPerformStmt() {
    return findChildByClass(CobolPerformStmt.class);
  }

  @Override
  @Nullable
  public CobolProcedureDivision getProcedureDivision() {
    return findChildByClass(CobolProcedureDivision.class);
  }

  @Override
  @Nullable
  public CobolProgramName getProgramName() {
    return findChildByClass(CobolProgramName.class);
  }

  @Override
  @Nullable
  public CobolStopRun getStopRun() {
    return findChildByClass(CobolStopRun.class);
  }

  @Override
  @Nullable
  public CobolWorkingStorageSection getWorkingStorageSection() {
    return findChildByClass(CobolWorkingStorageSection.class);
  }

}
