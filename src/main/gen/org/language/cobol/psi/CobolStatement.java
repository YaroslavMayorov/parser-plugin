// This is a generated file. Not intended for manual editing.
package org.language.cobol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolStatement extends PsiElement {

  @Nullable
  CobolDataDivision getDataDivision();

  @Nullable
  CobolDataItemDecl getDataItemDecl();

  @Nullable
  CobolDisplayStmt getDisplayStmt();

  @Nullable
  CobolIdentificationDivision getIdentificationDivision();

  @Nullable
  CobolParagraph getParagraph();

  @Nullable
  CobolPerformStmt getPerformStmt();

  @Nullable
  CobolProcedureDivision getProcedureDivision();

  @Nullable
  CobolProgramName getProgramName();

  @Nullable
  CobolStopRun getStopRun();

  @Nullable
  CobolWorkingStorageSection getWorkingStorageSection();

}
