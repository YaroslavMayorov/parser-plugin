// This is a generated file. Not intended for manual editing.
package org.language.cobol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.language.cobol.psi.impl.*;

public interface CobolTypes {

  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_ITEM_DECL = new CobolElementType("DATA_ITEM_DECL");
  IElementType DISPLAY_OPERANDS = new CobolElementType("DISPLAY_OPERANDS");
  IElementType DISPLAY_STMT = new CobolElementType("DISPLAY_STMT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType LINE = new CobolElementType("LINE");
  IElementType LINE_NUMBER = new CobolElementType("LINE_NUMBER");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PERFORM_STMT = new CobolElementType("PERFORM_STMT");
  IElementType PIC_9_N = new CobolElementType("PIC_9_N");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_NAME = new CobolElementType("PROGRAM_NAME");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STOP_RUN = new CobolElementType("STOP_RUN");
  IElementType VALUE_CLAUSE = new CobolElementType("VALUE_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType EQ = new CobolTokenType("EQ");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType LPAREN = new CobolTokenType("LPAREN");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM-ID");
  IElementType RPAREN = new CobolTokenType("RPAREN");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING-STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DATA_ITEM_DECL) {
        return new CobolDataItemDeclImpl(node);
      }
      else if (type == DISPLAY_OPERANDS) {
        return new CobolDisplayOperandsImpl(node);
      }
      else if (type == DISPLAY_STMT) {
        return new CobolDisplayStmtImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == LINE) {
        return new CobolLineImpl(node);
      }
      else if (type == LINE_NUMBER) {
        return new CobolLineNumberImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PERFORM_STMT) {
        return new CobolPerformStmtImpl(node);
      }
      else if (type == PIC_9_N) {
        return new CobolPic9NImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_NAME) {
        return new CobolProgramNameImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STOP_RUN) {
        return new CobolStopRunImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new CobolValueClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
