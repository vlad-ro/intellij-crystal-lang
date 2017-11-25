// This is a generated file. Not intended for manual editing.
package net.kenro.ji.jin.crystal;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static net.kenro.ji.jin.crystal.psi.CrystalElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CrystalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ARG) {
      result_ = arg(builder_, 0);
    }
    else if (root_ == ARG_DECL) {
      result_ = argDecl(builder_, 0);
    }
    else if (root_ == ARG_LIST) {
      result_ = argList(builder_, 0);
    }
    else if (root_ == ARGS) {
      result_ = args(builder_, 0);
    }
    else if (root_ == ASSOC) {
      result_ = assoc(builder_, 0);
    }
    else if (root_ == ASSOCS) {
      result_ = assocs(builder_, 0);
    }
    else if (root_ == BLOCK_VARIABLE) {
      result_ = blockVariable(builder_, 0);
    }
    else if (root_ == CALL) {
      result_ = call(builder_, 0);
    }
    else if (root_ == CALL_ARGS) {
      result_ = callArgs(builder_, 0);
    }
    else if (root_ == COMMAND) {
      result_ = command(builder_, 0);
    }
    else if (root_ == COMPOSITE_STATEMENT) {
      result_ = compositeStatement(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, 0);
    }
    else if (root_ == EXPRESSIONS) {
      result_ = expressions(builder_, 0);
    }
    else if (root_ == FNAME) {
      result_ = fname(builder_, 0);
    }
    else if (root_ == FUNCTION) {
      result_ = function(builder_, 0);
    }
    else if (root_ == GLOBAL) {
      result_ = global(builder_, 0);
    }
    else if (root_ == LHS) {
      result_ = lhs(builder_, 0);
    }
    else if (root_ == LITERAL) {
      result_ = literal(builder_, 0);
    }
    else if (root_ == MLHS) {
      result_ = mlhs(builder_, 0);
    }
    else if (root_ == MLHS_ITEM) {
      result_ = mlhsItem(builder_, 0);
    }
    else if (root_ == MRHS) {
      result_ = mrhs(builder_, 0);
    }
    else if (root_ == OP_ASGN) {
      result_ = opAsgn(builder_, 0);
    }
    else if (root_ == OPERATION) {
      result_ = operation(builder_, 0);
    }
    else if (root_ == PRIMARY) {
      result_ = primary(builder_, 0);
    }
    else if (root_ == SINGLETON) {
      result_ = singleton(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == STATEMENTS) {
      result_ = statements(builder_, 0);
    }
    else if (root_ == SYMBOL) {
      result_ = symbol(builder_, 0);
    }
    else if (root_ == VAR_NAME) {
      result_ = varName(builder_, 0);
    }
    else if (root_ == VARIABLE) {
      result_ = variable(builder_, 0);
    }
    else if (root_ == WHEN_ARGS) {
      result_ = whenArgs(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return crystalFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // lhs '=' arg
  // //  | lhs opAsgn arg
  // //  | arg '..' arg | arg '...' arg
  // //  | arg '+' arg | arg '-' arg | arg '*' arg | arg '/' arg
  // //  | arg '%' arg | arg '**' arg
  // //  | '+' arg | '-' arg
  // //  | arg '|' arg
  // //  | arg '^' arg | arg '&' arg
  // //  | arg '<=>' arg
  // //  | arg '>' arg | arg '>=' arg | arg '<' arg | arg '<=' arg
  // //  | arg '==' arg | arg '===' arg | arg '!=' arg
  // //  | arg '='  '~' arg | arg '!' '~' arg
  // //  | '!' arg | '~' arg
  // //  | arg '<<' arg | arg '>>' arg
  // //  | arg '&&' arg | arg '||' arg
  // //  | 'defined?' arg
  //   | primary
  public static boolean arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG, "<arg>");
    result_ = arg_0(builder_, level_ + 1);
    if (!result_) result_ = primary(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // lhs '=' arg
  private static boolean arg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lhs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' argList ')' | argList
  public static boolean argDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_DECL, "<arg decl>");
    result_ = argDecl_0(builder_, level_ + 1);
    if (!result_) result_ = argList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' argList ')'
  private static boolean argDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argDecl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && argList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENT (',' IDENT)* [',' '*' [IDENT]][',' '&' IDENT]
  // | '*' IDENT [',' '&' IDENT]
  // | [ '&' IDENT]
  public static boolean argList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_LIST, "<arg list>");
    result_ = argList_0(builder_, level_ + 1);
    if (!result_) result_ = argList_1(builder_, level_ + 1);
    if (!result_) result_ = argList_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // IDENT (',' IDENT)* [',' '*' [IDENT]][',' '&' IDENT]
  private static boolean argList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENT);
    result_ = result_ && argList_0_1(builder_, level_ + 1);
    result_ = result_ && argList_0_2(builder_, level_ + 1);
    result_ = result_ && argList_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' IDENT)*
  private static boolean argList_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!argList_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "argList_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' IDENT
  private static boolean argList_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, IDENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '*' [IDENT]]
  private static boolean argList_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0_2")) return false;
    argList_0_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' '*' [IDENT]
  private static boolean argList_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, TIMES);
    result_ = result_ && argList_0_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [IDENT]
  private static boolean argList_0_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0_2_0_2")) return false;
    consumeToken(builder_, IDENT);
    return true;
  }

  // [',' '&' IDENT]
  private static boolean argList_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_0_3")) return false;
    parseTokens(builder_, 0, COMMA, AND, IDENT);
    return true;
  }

  // '*' IDENT [',' '&' IDENT]
  private static boolean argList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TIMES, IDENT);
    result_ = result_ && argList_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '&' IDENT]
  private static boolean argList_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_1_2")) return false;
    parseTokens(builder_, 0, COMMA, AND, IDENT);
    return true;
  }

  // [ '&' IDENT]
  private static boolean argList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argList_2")) return false;
    parseTokens(builder_, 0, AND, IDENT);
    return true;
  }

  /* ********************************************************** */
  // arg (',' arg)*
  public static boolean args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGS, "<args>");
    result_ = arg(builder_, level_ + 1);
    result_ = result_ && args_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (',' arg)*
  private static boolean args_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!args_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "args_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' arg
  private static boolean args_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // arg '=>' arg
  public static boolean assoc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assoc")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSOC, "<assoc>");
    result_ = arg(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_ARROW);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // assoc {',' assoc}
  public static boolean assocs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assocs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSOCS, "<assocs>");
    result_ = assoc(builder_, level_ + 1);
    result_ = result_ && assocs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' assoc
  private static boolean assocs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assocs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && assoc(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lhs | mlhs
  public static boolean blockVariable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockVariable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_VARIABLE, "<block variable>");
    result_ = lhs(builder_, level_ + 1);
    if (!result_) result_ = mlhs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // function | command
  public static boolean call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CALL, "<call>");
    result_ = function(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // args
  //        | args [',' assocs] [',' '*' args] [',' '&' arg]
  //        | assocs [',' '*' args] [',' '&' arg]
  //        | '*' arg [',' '&' arg] | '&' arg
  //        | command
  public static boolean callArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CALL_ARGS, "<call args>");
    result_ = args(builder_, level_ + 1);
    if (!result_) result_ = callArgs_1(builder_, level_ + 1);
    if (!result_) result_ = callArgs_2(builder_, level_ + 1);
    if (!result_) result_ = callArgs_3(builder_, level_ + 1);
    if (!result_) result_ = callArgs_4(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // args [',' assocs] [',' '*' args] [',' '&' arg]
  private static boolean callArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = args(builder_, level_ + 1);
    result_ = result_ && callArgs_1_1(builder_, level_ + 1);
    result_ = result_ && callArgs_1_2(builder_, level_ + 1);
    result_ = result_ && callArgs_1_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' assocs]
  private static boolean callArgs_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1_1")) return false;
    callArgs_1_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' assocs
  private static boolean callArgs_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && assocs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '*' args]
  private static boolean callArgs_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1_2")) return false;
    callArgs_1_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' '*' args
  private static boolean callArgs_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, TIMES);
    result_ = result_ && args(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '&' arg]
  private static boolean callArgs_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1_3")) return false;
    callArgs_1_3_0(builder_, level_ + 1);
    return true;
  }

  // ',' '&' arg
  private static boolean callArgs_1_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_1_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, AND);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // assocs [',' '*' args] [',' '&' arg]
  private static boolean callArgs_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assocs(builder_, level_ + 1);
    result_ = result_ && callArgs_2_1(builder_, level_ + 1);
    result_ = result_ && callArgs_2_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '*' args]
  private static boolean callArgs_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_2_1")) return false;
    callArgs_2_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' '*' args
  private static boolean callArgs_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, TIMES);
    result_ = result_ && args(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '&' arg]
  private static boolean callArgs_2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_2_2")) return false;
    callArgs_2_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' '&' arg
  private static boolean callArgs_2_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_2_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, AND);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' arg [',' '&' arg]
  private static boolean callArgs_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    result_ = result_ && arg(builder_, level_ + 1);
    result_ = result_ && callArgs_3_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '&' arg]
  private static boolean callArgs_3_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_3_2")) return false;
    callArgs_3_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' '&' arg
  private static boolean callArgs_3_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_3_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, AND);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' arg
  private static boolean callArgs_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callArgs_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // operation callArgs
  //          | primary '.' operation callArgs
  //          | primary '::' operation callArgs
  //          | 'super' callArgs
  public static boolean command(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMMAND, "<command>");
    result_ = command_0(builder_, level_ + 1);
    if (!result_) result_ = command_1(builder_, level_ + 1);
    if (!result_) result_ = command_2(builder_, level_ + 1);
    if (!result_) result_ = command_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // operation callArgs
  private static boolean command_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = operation(builder_, level_ + 1);
    result_ = result_ && callArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // primary '.' operation callArgs
  private static boolean command_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && operation(builder_, level_ + 1);
    result_ = result_ && callArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // primary '::' operation callArgs
  private static boolean command_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NAMESPACE);
    result_ = result_ && operation(builder_, level_ + 1);
    result_ = result_ && callArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'super' callArgs
  private static boolean command_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SUPER);
    result_ = result_ && callArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // statements | expressions
  public static boolean compositeStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compositeStatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPOSITE_STATEMENT, "<composite statement>");
    result_ = statements(builder_, level_ + 1);
    if (!result_) result_ = expressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // item_*
  static boolean crystalFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "crystalFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "crystalFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // mlhs '=' mrhs
  // | 'return' callArgs
  // | 'yield' callArgs
  // | 'and' expression
  // | 'or' expression
  // | 'not' expression
  // | command
  // | '!' command
  // | arg
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = expression_0(builder_, level_ + 1);
    if (!result_) result_ = expression_1(builder_, level_ + 1);
    if (!result_) result_ = expression_2(builder_, level_ + 1);
    if (!result_) result_ = expression_3(builder_, level_ + 1);
    if (!result_) result_ = expression_4(builder_, level_ + 1);
    if (!result_) result_ = expression_5(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
    if (!result_) result_ = expression_7(builder_, level_ + 1);
    if (!result_) result_ = arg(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // mlhs '=' mrhs
  private static boolean expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = mlhs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && mrhs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'return' callArgs
  private static boolean expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN);
    result_ = result_ && callArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'yield' callArgs
  private static boolean expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YIELD);
    result_ = result_ && callArgs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'and' expression
  private static boolean expression_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "and");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'or' expression
  private static boolean expression_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "or");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'not' expression
  private static boolean expression_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "not");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '!' command
  private static boolean expression_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    result_ = result_ && command(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression [expressions]
  public static boolean expressions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSIONS, "<expressions>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && expressions_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [expressions]
  private static boolean expressions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions_1")) return false;
    expressions(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENT | '..' | '|' | '^'|'&'| '<=>' | '==' | '===' | '=~'  | '>' | '>=' | '<' | '<=' | '+' | '-' | '*' | '/'
  //              | '%'| '**' | '<<' | '>>' | '~' | '+@' | '-@' | '[]' | '[]='
  public static boolean fname(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fname")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FNAME, "<fname>");
    result_ = consumeToken(builder_, IDENT);
    if (!result_) result_ = consumeToken(builder_, DOT_DOT);
    if (!result_) result_ = consumeToken(builder_, PIPE);
    if (!result_) result_ = consumeToken(builder_, CAROT);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, LEFT_RIGHT_ARROW);
    if (!result_) result_ = consumeToken(builder_, EQUAL_EQUAL);
    if (!result_) result_ = consumeToken(builder_, EQUAL_EQUAL_EQUAL);
    if (!result_) result_ = consumeToken(builder_, APROX_ARROW);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    if (!result_) result_ = consumeToken(builder_, GREATER_EQUAL);
    if (!result_) result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, LEFT_ARROW);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, TIMES);
    if (!result_) result_ = consumeToken(builder_, DIVIDENTE);
    if (!result_) result_ = consumeToken(builder_, "%");
    if (!result_) result_ = consumeToken(builder_, TIMES_TIMES);
    if (!result_) result_ = consumeToken(builder_, INSERT);
    if (!result_) result_ = consumeToken(builder_, GREATER_GREATER);
    if (!result_) result_ = consumeToken(builder_, TILDE);
    if (!result_) result_ = consumeToken(builder_, "+@");
    if (!result_) result_ = consumeToken(builder_, "-@");
    if (!result_) result_ = consumeToken(builder_, ARRAY);
    if (!result_) result_ = consumeToken(builder_, ARRAY_EQUAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // operation ['(' [callArgs] ')']
  //          | primary ('.' | '::') operation ['(' [callArgs] ')']
  //          | 'super' ['(' [callArgs] ')']
  //          | 'for' blockVariable 'in' expression 'do' compositeStatement 'end'
  //          | 'begin' compositeStatement {'rescue' [args] do compositeStatement} [('else' | 'ensure') compositeStatement] 'end'
  //          | 'class' IDENT ['<' IDENT]  [compositeStatement] 'end'
  //          | 'module' IDENT [compositeStatement] 'end'
  //          | 'def' fname argDecl compositeStatement 'end'
  //          | 'def' singleton ('.' | '::') fname argDecl compositeStatement 'end'
  public static boolean function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION, "<function>");
    result_ = function_0(builder_, level_ + 1);
    if (!result_) result_ = function_1(builder_, level_ + 1);
    if (!result_) result_ = function_2(builder_, level_ + 1);
    if (!result_) result_ = function_3(builder_, level_ + 1);
    if (!result_) result_ = function_4(builder_, level_ + 1);
    if (!result_) result_ = function_5(builder_, level_ + 1);
    if (!result_) result_ = function_6(builder_, level_ + 1);
    if (!result_) result_ = function_7(builder_, level_ + 1);
    if (!result_) result_ = function_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // operation ['(' [callArgs] ')']
  private static boolean function_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = operation(builder_, level_ + 1);
    result_ = result_ && function_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['(' [callArgs] ')']
  private static boolean function_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0_1")) return false;
    function_0_1_0(builder_, level_ + 1);
    return true;
  }

  // '(' [callArgs] ')'
  private static boolean function_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && function_0_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [callArgs]
  private static boolean function_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0_1_0_1")) return false;
    callArgs(builder_, level_ + 1);
    return true;
  }

  // primary ('.' | '::') operation ['(' [callArgs] ')']
  private static boolean function_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary(builder_, level_ + 1);
    result_ = result_ && function_1_1(builder_, level_ + 1);
    result_ = result_ && operation(builder_, level_ + 1);
    result_ = result_ && function_1_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.' | '::'
  private static boolean function_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, NAMESPACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['(' [callArgs] ')']
  private static boolean function_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_3")) return false;
    function_1_3_0(builder_, level_ + 1);
    return true;
  }

  // '(' [callArgs] ')'
  private static boolean function_1_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && function_1_3_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [callArgs]
  private static boolean function_1_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_3_0_1")) return false;
    callArgs(builder_, level_ + 1);
    return true;
  }

  // 'super' ['(' [callArgs] ')']
  private static boolean function_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SUPER);
    result_ = result_ && function_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['(' [callArgs] ')']
  private static boolean function_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_2_1")) return false;
    function_2_1_0(builder_, level_ + 1);
    return true;
  }

  // '(' [callArgs] ')'
  private static boolean function_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && function_2_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [callArgs]
  private static boolean function_2_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_2_1_0_1")) return false;
    callArgs(builder_, level_ + 1);
    return true;
  }

  // 'for' blockVariable 'in' expression 'do' compositeStatement 'end'
  private static boolean function_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FOR);
    result_ = result_ && blockVariable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'begin' compositeStatement {'rescue' [args] do compositeStatement} [('else' | 'ensure') compositeStatement] 'end'
  private static boolean function_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BEGIN);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && function_4_2(builder_, level_ + 1);
    result_ = result_ && function_4_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'rescue' [args] do compositeStatement
  private static boolean function_4_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_4_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RESCUE);
    result_ = result_ && function_4_2_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [args]
  private static boolean function_4_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_4_2_1")) return false;
    args(builder_, level_ + 1);
    return true;
  }

  // [('else' | 'ensure') compositeStatement]
  private static boolean function_4_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_4_3")) return false;
    function_4_3_0(builder_, level_ + 1);
    return true;
  }

  // ('else' | 'ensure') compositeStatement
  private static boolean function_4_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_4_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = function_4_3_0_0(builder_, level_ + 1);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'else' | 'ensure'
  private static boolean function_4_3_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_4_3_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    if (!result_) result_ = consumeToken(builder_, ENSURE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'class' IDENT ['<' IDENT]  [compositeStatement] 'end'
  private static boolean function_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CLASS, IDENT);
    result_ = result_ && function_5_2(builder_, level_ + 1);
    result_ = result_ && function_5_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['<' IDENT]
  private static boolean function_5_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_5_2")) return false;
    parseTokens(builder_, 0, LESS, IDENT);
    return true;
  }

  // [compositeStatement]
  private static boolean function_5_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_5_3")) return false;
    compositeStatement(builder_, level_ + 1);
    return true;
  }

  // 'module' IDENT [compositeStatement] 'end'
  private static boolean function_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, MODULE, IDENT);
    result_ = result_ && function_6_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [compositeStatement]
  private static boolean function_6_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_6_2")) return false;
    compositeStatement(builder_, level_ + 1);
    return true;
  }

  // 'def' fname argDecl compositeStatement 'end'
  private static boolean function_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEF);
    result_ = result_ && fname(builder_, level_ + 1);
    result_ = result_ && argDecl(builder_, level_ + 1);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'def' singleton ('.' | '::') fname argDecl compositeStatement 'end'
  private static boolean function_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEF);
    result_ = result_ && singleton(builder_, level_ + 1);
    result_ = result_ && function_8_2(builder_, level_ + 1);
    result_ = result_ && fname(builder_, level_ + 1);
    result_ = result_ && argDecl(builder_, level_ + 1);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.' | '::'
  private static boolean function_8_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_8_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, NAMESPACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '$' IDENT
  public static boolean global(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "global")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GLOBAL, "<global>");
    result_ = consumeToken(builder_, "$");
    result_ = result_ && consumeToken(builder_, IDENT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // statements | expressions | primary | function
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statements(builder_, level_ + 1);
    if (!result_) result_ = expressions(builder_, level_ + 1);
    if (!result_) result_ = primary(builder_, level_ + 1);
    if (!result_) result_ = function(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable
  //    | primary '[' [args] ']'
  //    | primary '.' IDENT
  public static boolean lhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lhs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LHS, "<lhs>");
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = lhs_1(builder_, level_ + 1);
    if (!result_) result_ = lhs_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // primary '[' [args] ']'
  private static boolean lhs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lhs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && lhs_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [args]
  private static boolean lhs_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lhs_1_2")) return false;
    args(builder_, level_ + 1);
    return true;
  }

  // primary '.' IDENT
  private static boolean lhs_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lhs_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, IDENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NIL
  //                     | TRUE
  //                     | FALSE
  //                     | NUMBER_LITERAL
  //                     | CHAR_LITERAL
  //                     | STRING_LITERAL
  //                     | symbol
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = consumeToken(builder_, NIL);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, NUMBER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, CHAR_LITERAL);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = symbol(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // mlhsItem ',' [mlhsItem (',' mlhsItem)*] [ '*' lhs] | '*' lhs
  public static boolean mlhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MLHS, "<mlhs>");
    result_ = mlhs_0(builder_, level_ + 1);
    if (!result_) result_ = mlhs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // mlhsItem ',' [mlhsItem (',' mlhsItem)*] [ '*' lhs]
  private static boolean mlhs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = mlhsItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && mlhs_0_2(builder_, level_ + 1);
    result_ = result_ && mlhs_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [mlhsItem (',' mlhsItem)*]
  private static boolean mlhs_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0_2")) return false;
    mlhs_0_2_0(builder_, level_ + 1);
    return true;
  }

  // mlhsItem (',' mlhsItem)*
  private static boolean mlhs_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = mlhsItem(builder_, level_ + 1);
    result_ = result_ && mlhs_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' mlhsItem)*
  private static boolean mlhs_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!mlhs_0_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "mlhs_0_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' mlhsItem
  private static boolean mlhs_0_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && mlhsItem(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ '*' lhs]
  private static boolean mlhs_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0_3")) return false;
    mlhs_0_3_0(builder_, level_ + 1);
    return true;
  }

  // '*' lhs
  private static boolean mlhs_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    result_ = result_ && lhs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' lhs
  private static boolean mlhs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    result_ = result_ && lhs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lhs | '(' mlhs ')'
  public static boolean mlhsItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhsItem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MLHS_ITEM, "<mlhs item>");
    result_ = lhs(builder_, level_ + 1);
    if (!result_) result_ = mlhsItem_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' mlhs ')'
  private static boolean mlhsItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mlhsItem_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && mlhs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // args [',' '*' arg] | '*' arg
  public static boolean mrhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mrhs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MRHS, "<mrhs>");
    result_ = mrhs_0(builder_, level_ + 1);
    if (!result_) result_ = mrhs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // args [',' '*' arg]
  private static boolean mrhs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mrhs_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = args(builder_, level_ + 1);
    result_ = result_ && mrhs_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '*' arg]
  private static boolean mrhs_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mrhs_0_1")) return false;
    mrhs_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' '*' arg
  private static boolean mrhs_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mrhs_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, TIMES);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' arg
  private static boolean mrhs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mrhs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '+='|'-='|'*='|'/='|'%='|'**=' |'&='|'|='|'ˆ='|'<<='|'>>=' |'&&='|'||='
  public static boolean opAsgn(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opAsgn")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OP_ASGN, "<op asgn>");
    result_ = consumeToken(builder_, PLUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, MINUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, TIMES_EQUAL);
    if (!result_) result_ = consumeToken(builder_, DIVIDENTE_EQUAL);
    if (!result_) result_ = consumeToken(builder_, MODULO_EQUAL);
    if (!result_) result_ = consumeToken(builder_, TIMES_TIMES_EQUAL);
    if (!result_) result_ = consumeToken(builder_, AND_EQUAL);
    if (!result_) result_ = consumeToken(builder_, OR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, "ˆ=");
    if (!result_) result_ = consumeToken(builder_, LEFT_LEFT_ARROW);
    if (!result_) result_ = consumeToken(builder_, GREATER_GREATER_EQUAL);
    if (!result_) result_ = consumeToken(builder_, AND_AND_EQUAL);
    if (!result_) result_ = consumeToken(builder_, OR_OR_EQUAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENT ['!' | '?']
  public static boolean operation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operation")) return false;
    if (!nextTokenIs(builder_, IDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENT);
    result_ = result_ && operation_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, OPERATION, result_);
    return result_;
  }

  // ['!' | '?']
  private static boolean operation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operation_1")) return false;
    operation_1_0(builder_, level_ + 1);
    return true;
  }

  // '!' | '?'
  private static boolean operation_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operation_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, QUESTION);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' compositeStatement ')'
  // | literal
  // | variable
  // //| primary '::' IDENT
  // //| '::' IDENT
  // //| primary '[' [args] ']'
  // //| '[' [args [',']] ']'
  // //| '{' [args | assocs [',']] '}'
  // //| 'return' ['(' [callArgs] ')']
  // //| 'yield' ['(' [callArgs] ')']
  // //| 'defined?' '(' arg ')'
  // //| function
  // //| function '{' ['|' [blockVariable] '|'] compositeStatement '}'
  // | 'if' expression 'then' compositeStatement ['elsif' expression 'then' compositeStatement] ['else' compositeStatement] 'end'
  public static boolean primary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMARY, "<primary>");
    result_ = primary_0(builder_, level_ + 1);
    if (!result_) result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = primary_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' compositeStatement ')'
  private static boolean primary_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'if' expression 'then' compositeStatement ['elsif' expression 'then' compositeStatement] ['else' compositeStatement] 'end'
  private static boolean primary_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && primary_3_4(builder_, level_ + 1);
    result_ = result_ && primary_3_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['elsif' expression 'then' compositeStatement]
  private static boolean primary_3_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_3_4")) return false;
    primary_3_4_0(builder_, level_ + 1);
    return true;
  }

  // 'elsif' expression 'then' compositeStatement
  private static boolean primary_3_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_3_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSIF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['else' compositeStatement]
  private static boolean primary_3_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_3_5")) return false;
    primary_3_5_0(builder_, level_ + 1);
    return true;
  }

  // 'else' compositeStatement
  private static boolean primary_3_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_3_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable | '(' expressions ')'
  public static boolean singleton(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleton")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SINGLETON, "<singleton>");
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = singleton_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' expressions ')'
  private static boolean singleton_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleton_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && expressions(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // call 'do' ['|' [blockVariable] '|'] compositeStatement 'end'
  // //   | 'if' expression
  //    | 'undef' fname
  //    | 'alias' fname fname
  //    | 'while' expression
  //    | 'unless' expression
  //    | 'until' expression
  //    | 'begin' '{' compositeStatement '}'
  //    | 'end' '{' compositeStatement '}'
  //    | lhs '=' command ['do' ['|' [blockVariable] '|'] compositeStatement 'end']
  //    | expression
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = statement_0(builder_, level_ + 1);
    if (!result_) result_ = statement_1(builder_, level_ + 1);
    if (!result_) result_ = statement_2(builder_, level_ + 1);
    if (!result_) result_ = statement_3(builder_, level_ + 1);
    if (!result_) result_ = statement_4(builder_, level_ + 1);
    if (!result_) result_ = statement_5(builder_, level_ + 1);
    if (!result_) result_ = statement_6(builder_, level_ + 1);
    if (!result_) result_ = statement_7(builder_, level_ + 1);
    if (!result_) result_ = statement_8(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // call 'do' ['|' [blockVariable] '|'] compositeStatement 'end'
  private static boolean statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = call(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && statement_0_2(builder_, level_ + 1);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['|' [blockVariable] '|']
  private static boolean statement_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_2")) return false;
    statement_0_2_0(builder_, level_ + 1);
    return true;
  }

  // '|' [blockVariable] '|'
  private static boolean statement_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && statement_0_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIPE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [blockVariable]
  private static boolean statement_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_2_0_1")) return false;
    blockVariable(builder_, level_ + 1);
    return true;
  }

  // 'undef' fname
  private static boolean statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "undef");
    result_ = result_ && fname(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'alias' fname fname
  private static boolean statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ALIAS);
    result_ = result_ && fname(builder_, level_ + 1);
    result_ = result_ && fname(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'while' expression
  private static boolean statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "while");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'unless' expression
  private static boolean statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "unless");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'until' expression
  private static boolean statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UNTIL);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'begin' '{' compositeStatement '}'
  private static boolean statement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, BEGIN, LEFT_BRACE);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'end' '{' compositeStatement '}'
  private static boolean statement_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, END, LEFT_BRACE);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // lhs '=' command ['do' ['|' [blockVariable] '|'] compositeStatement 'end']
  private static boolean statement_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lhs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && command(builder_, level_ + 1);
    result_ = result_ && statement_8_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['do' ['|' [blockVariable] '|'] compositeStatement 'end']
  private static boolean statement_8_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_8_3")) return false;
    statement_8_3_0(builder_, level_ + 1);
    return true;
  }

  // 'do' ['|' [blockVariable] '|'] compositeStatement 'end'
  private static boolean statement_8_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_8_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DO);
    result_ = result_ && statement_8_3_0_1(builder_, level_ + 1);
    result_ = result_ && compositeStatement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['|' [blockVariable] '|']
  private static boolean statement_8_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_8_3_0_1")) return false;
    statement_8_3_0_1_0(builder_, level_ + 1);
    return true;
  }

  // '|' [blockVariable] '|'
  private static boolean statement_8_3_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_8_3_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && statement_8_3_0_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIPE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [blockVariable]
  private static boolean statement_8_3_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_8_3_0_1_0_1")) return false;
    blockVariable(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // statement [statements]
  public static boolean statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENTS, "<statements>");
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && statements_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [statements]
  private static boolean statements_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1")) return false;
    statements(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ':' (fname | varName)
  public static boolean symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && symbol_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SYMBOL, result_);
    return result_;
  }

  // fname | varName
  private static boolean symbol_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = fname(builder_, level_ + 1);
    if (!result_) result_ = varName(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // global | '@' IDENT | IDENT
  public static boolean varName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varName")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_NAME, "<var name>");
    result_ = global(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, AT, IDENT);
    if (!result_) result_ = consumeToken(builder_, IDENT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // varName | 'nil' | 'self'
  public static boolean variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIABLE, "<variable>");
    result_ = varName(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NIL);
    if (!result_) result_ = consumeToken(builder_, SELF);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // args [',' '*' arg] | '*' arg
  public static boolean whenArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whenArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WHEN_ARGS, "<when args>");
    result_ = whenArgs_0(builder_, level_ + 1);
    if (!result_) result_ = whenArgs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // args [',' '*' arg]
  private static boolean whenArgs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whenArgs_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = args(builder_, level_ + 1);
    result_ = result_ && whenArgs_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '*' arg]
  private static boolean whenArgs_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whenArgs_0_1")) return false;
    whenArgs_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' '*' arg
  private static boolean whenArgs_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whenArgs_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, TIMES);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' arg
  private static boolean whenArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whenArgs_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    result_ = result_ && arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
