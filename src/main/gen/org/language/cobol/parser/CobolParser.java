// This is a generated file. Not intended for manual editing.
package org.language.cobol.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.language.cobol.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean LINE_NUMBER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LINE_NUMBER")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, LINE_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // DATA DIVISION
  public static boolean data_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, DIVISION);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER IDENTIFIER PIC pic_9n value_clause?
  public static boolean data_item_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_item_decl")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, IDENTIFIER, PIC);
    r = r && pic_9n(b, l + 1);
    r = r && data_item_decl_4(b, l + 1);
    exit_section_(b, m, DATA_ITEM_DECL, r);
    return r;
  }

  // value_clause?
  private static boolean data_item_decl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_item_decl_4")) return false;
    value_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (STRING | IDENTIFIER)+
  public static boolean display_operands(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_operands")) return false;
    if (!nextTokenIs(b, "<display operands>", IDENTIFIER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_OPERANDS, "<display operands>");
    r = display_operands_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_operands_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_operands", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING | IDENTIFIER
  private static boolean display_operands_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_operands_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // DISPLAY display_operands
  public static boolean display_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_stmt")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && display_operands(b, l + 1);
    exit_section_(b, m, DISPLAY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // line*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFICATION DIVISION
  public static boolean identification_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identification_division")) return false;
    if (!nextTokenIs(b, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFICATION, DIVISION);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER statement
  public static boolean line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LINE_NUMBER(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, LINE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM IDENTIFIER VARYING IDENTIFIER FROM NUMBER BY NUMBER UNTIL IDENTIFIER EQ NUMBER
  public static boolean perform_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_stmt")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERFORM, IDENTIFIER, VARYING, IDENTIFIER, FROM, NUMBER, BY, NUMBER, UNTIL, IDENTIFIER, EQ, NUMBER);
    exit_section_(b, m, PERFORM_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER LPAREN NUMBER RPAREN
  public static boolean pic_9n(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pic_9n")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NUMBER, LPAREN, NUMBER, RPAREN);
    exit_section_(b, m, PIC_9_N, r);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION
  public static boolean procedure_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCEDURE, DIVISION);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // PROGRAM-ID DOT IDENTIFIER
  public static boolean program_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_name")) return false;
    if (!nextTokenIs(b, PROGRAM_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROGRAM_ID, DOT, IDENTIFIER);
    exit_section_(b, m, PROGRAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // identification_division DOT
  //              | program_name DOT
  //              | data_division DOT
  //              | working_storage_section DOT
  //              | data_item_decl DOT
  //              | procedure_division DOT
  //              | paragraph DOT
  //              | perform_stmt
  //              | stop_run DOT
  //              | display_stmt DOT
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    if (!r) r = statement_3(b, l + 1);
    if (!r) r = statement_4(b, l + 1);
    if (!r) r = statement_5(b, l + 1);
    if (!r) r = statement_6(b, l + 1);
    if (!r) r = perform_stmt(b, l + 1);
    if (!r) r = statement_8(b, l + 1);
    if (!r) r = statement_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identification_division DOT
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identification_division(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // program_name DOT
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // data_division DOT
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_division(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // working_storage_section DOT
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = working_storage_section(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // data_item_decl DOT
  private static boolean statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_item_decl(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // procedure_division DOT
  private static boolean statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_division(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // paragraph DOT
  private static boolean statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paragraph(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // stop_run DOT
  private static boolean statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stop_run(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // display_stmt DOT
  private static boolean statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_stmt(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STOP RUN
  public static boolean stop_run(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_run")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STOP, RUN);
    exit_section_(b, m, STOP_RUN, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE NUMBER
  public static boolean value_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_clause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALUE, NUMBER);
    exit_section_(b, m, VALUE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // WORKING-STORAGE SECTION
  public static boolean working_storage_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section")) return false;
    if (!nextTokenIs(b, WORKING_STORAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORKING_STORAGE, SECTION);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

}
