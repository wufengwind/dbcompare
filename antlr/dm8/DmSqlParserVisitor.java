// Generated from D:/project/dbcompare/src/main/java/com/antlr/dm8/DmSqlParser.g4 by ANTLR 4.13.2
package com.antlr.dm8;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DmSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DmSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dmprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmprogram(DmSqlParser.DmprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(DmSqlParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ddlsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlsql(DmSqlParser.DdlsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dmlsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlsql(DmSqlParser.DmlsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#privsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivsql(DmSqlParser.PrivsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#othersql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOthersql(DmSqlParser.OthersqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#utilsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilsql(DmSqlParser.UtilsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#explainsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainsql(DmSqlParser.ExplainsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#shutdown_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdown_stmt(DmSqlParser.Shutdown_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_diskgroup_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_diskgroup_stmt(DmSqlParser.Alter_diskgroup_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(DmSqlParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dmsubprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmsubprogram(DmSqlParser.DmsubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(DmSqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_var_cur_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_cur_list_options(DmSqlParser.Decl_var_cur_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_var_cur_list_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_cur_list_1(DmSqlParser.Decl_var_cur_list_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_var_cur_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_cur_list(DmSqlParser.Decl_var_cur_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_var_cur_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_cur_item(DmSqlParser.Decl_var_cur_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_plsql_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_plsql_type(DmSqlParser.Decl_plsql_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plsql_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_type_def(DmSqlParser.Plsql_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lt_int_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_int_lst(DmSqlParser.Lt_int_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rec_item_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRec_item_def_list(DmSqlParser.Rec_item_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rec_item_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRec_item_def(DmSqlParser.Rec_item_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_variable(DmSqlParser.Decl_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_null(DmSqlParser.Not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plsql_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_datatype(DmSqlParser.Plsql_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_clause_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause_option(DmSqlParser.Default_clause_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#variable_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name_list(DmSqlParser.Variable_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_except}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_except(DmSqlParser.Decl_exceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pragma_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_def(DmSqlParser.Pragma_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(DmSqlParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlbody(DmSqlParser.PlbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ss_plbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs_plbody(DmSqlParser.Ss_plbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(DmSqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_list(DmSqlParser.Label_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_list_options(DmSqlParser.Label_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label_demiliter_l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_demiliter_l(DmSqlParser.Label_demiliter_lContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label_demiliter_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_demiliter_r(DmSqlParser.Label_demiliter_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql(DmSqlParser.PlsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ur_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUr_option(DmSqlParser.Ur_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#flashback_trig_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_trig_enable(DmSqlParser.Flashback_trig_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#scn_or_lsn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScn_or_lsn(DmSqlParser.Scn_or_lsnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_table_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name_list(DmSqlParser.Full_table_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#flashback_tab_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_tab_stmt(DmSqlParser.Flashback_tab_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#flashback_tab_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_tab_element(DmSqlParser.Flashback_tab_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(DmSqlParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_system_set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_system_set_stmt(DmSqlParser.Alter_system_set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#defer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefer(DmSqlParser.DeferContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(DmSqlParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_session_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session_stmt(DmSqlParser.Alter_session_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session_option(DmSqlParser.Alter_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parallel_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_mode(DmSqlParser.Parallel_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parallel_degree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_degree(DmSqlParser.Parallel_degreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#purge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurge(DmSqlParser.PurgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sess_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSess_id(DmSqlParser.Sess_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_time_zone_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_time_zone_string(DmSqlParser.Set_time_zone_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sess_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSess_attr(DmSqlParser.Sess_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sess_attr_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSess_attr_val(DmSqlParser.Sess_attr_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_schema_stmt(DmSqlParser.Set_schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlblock(DmSqlParser.PlblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#except_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_option(DmSqlParser.Except_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#finally_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_option(DmSqlParser.Finally_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#finally_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_tail(DmSqlParser.Finally_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#except_handler_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_handler_list(DmSqlParser.Except_handler_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#except_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_handler(DmSqlParser.Except_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#except_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_name(DmSqlParser.Except_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#except_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_list(DmSqlParser.Except_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(DmSqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#if_stmt_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_clause(DmSqlParser.If_stmt_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#if_condition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition_clause(DmSqlParser.If_condition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#if_then_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_clause(DmSqlParser.If_then_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#elseif_lst_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_lst_option(DmSqlParser.Elseif_lst_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#elseif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_clause(DmSqlParser.Elseif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#else_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_option(DmSqlParser.Else_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ss_if_stmt_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs_if_stmt_clause(DmSqlParser.Ss_if_stmt_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ss_elseif_lst_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs_elseif_lst_option(DmSqlParser.Ss_elseif_lst_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ss_elseif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs_elseif_clause(DmSqlParser.Ss_elseif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ss_else_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs_else_option(DmSqlParser.Ss_else_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#case_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stmt(DmSqlParser.Case_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plsearched_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsearched_when_clause(DmSqlParser.Plsearched_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plsearched_when_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsearched_when_list(DmSqlParser.Plsearched_when_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#case_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_option(DmSqlParser.Case_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(DmSqlParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#assign_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_obj(DmSqlParser.Assign_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#assign_obj2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_obj2(DmSqlParser.Assign_obj2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(DmSqlParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#goto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stmt(DmSqlParser.Goto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(DmSqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(DmSqlParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#repeat_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_stmt(DmSqlParser.Repeat_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(DmSqlParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#forall_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_stmt(DmSqlParser.Forall_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#forall_between_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_between_option(DmSqlParser.Forall_between_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#forall_save_exception_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_save_exception_option(DmSqlParser.Forall_save_exception_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#forall_index_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_index_values(DmSqlParser.Forall_index_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#forall_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_start(DmSqlParser.Forall_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#forall_dml_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_dml_stmt(DmSqlParser.Forall_dml_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#in_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_option(DmSqlParser.In_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#for_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_condition(DmSqlParser.For_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pipe_row_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipe_row_stmt(DmSqlParser.Pipe_row_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(DmSqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(DmSqlParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(DmSqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(DmSqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#execute_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_stmt(DmSqlParser.Execute_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dyn_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDyn_return(DmSqlParser.Dyn_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(DmSqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#using_exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_exp_list(DmSqlParser.Using_exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#using_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_exp(DmSqlParser.Using_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_proc_stmt(DmSqlParser.Alter_proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_func_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_func_stmt(DmSqlParser.Alter_func_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_package_stmt(DmSqlParser.Alter_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pkg_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg_type(DmSqlParser.Pkg_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#declare_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_opt(DmSqlParser.Declare_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(DmSqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_stmt(DmSqlParser.Alter_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_index_name(DmSqlParser.Full_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_index_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_action(DmSqlParser.Alter_index_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rebuild_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRebuild_clause(DmSqlParser.Rebuild_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exclusive_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_options(DmSqlParser.Exclusive_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#asynchronous_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsynchronous_options(DmSqlParser.Asynchronous_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#visible_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisible_clause(DmSqlParser.Visible_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_list(DmSqlParser.Column_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock(DmSqlParser.LockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_table_partition_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_partition_action(DmSqlParser.Alter_table_partition_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#template_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_info(DmSqlParser.Template_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#template_item_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_item_2(DmSqlParser.Template_item_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#template_item_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_item_1(DmSqlParser.Template_item_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#including_indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluding_indexes(DmSqlParser.Including_indexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#truncate_partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_partition_name(DmSqlParser.Truncate_partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cons_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_enable(DmSqlParser.Cons_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#reuse_storage_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReuse_storage_option(DmSqlParser.Reuse_storage_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_action(DmSqlParser.Alter_table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fast_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFast_flag(DmSqlParser.Fast_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_stat_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_stat_flag(DmSqlParser.Storage_stat_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_stat_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_stat_cols(DmSqlParser.Storage_stat_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hfs_rebuild_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHfs_rebuild_level(DmSqlParser.Hfs_rebuild_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ata_lock_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAta_lock_option(DmSqlParser.Ata_lock_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mdf_column_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdf_column_def_list(DmSqlParser.Mdf_column_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mdf_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdf_column_def(DmSqlParser.Mdf_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(DmSqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_def_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_ex(DmSqlParser.Column_def_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_def_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_low(DmSqlParser.Column_def_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#virtual_column_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_datatype(DmSqlParser.Virtual_column_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#virtual_column_generated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_generated(DmSqlParser.Virtual_column_generatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#virtual_column_virtual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_virtual(DmSqlParser.Virtual_column_virtualContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#virtual_column_visible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_visible(DmSqlParser.Virtual_column_visibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#virtual_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_def(DmSqlParser.Virtual_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#charset_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset_option(DmSqlParser.Charset_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_def_4_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_4_option(DmSqlParser.Column_def_4_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#auto_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_update_clause(DmSqlParser.Auto_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_exp(DmSqlParser.Update_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#identity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentity_clause(DmSqlParser.Identity_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_clause_with_on_null_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause_with_on_null_opt(DmSqlParser.Default_clause_with_on_null_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(DmSqlParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_exp(DmSqlParser.Default_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_constraint_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_def(DmSqlParser.Column_constraint_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_name_def_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name_def_options(DmSqlParser.Constraint_name_def_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_name_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name_def(DmSqlParser.Constraint_name_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraints(DmSqlParser.Column_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(DmSqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_constraint_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_action(DmSqlParser.Column_constraint_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#not_null_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_null_spec(DmSqlParser.Not_null_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unique_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_spec(DmSqlParser.Unique_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#refs_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefs_spec(DmSqlParser.Refs_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#refs_spec_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefs_spec_action(DmSqlParser.Refs_spec_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key(DmSqlParser.Foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#refd_table_and_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefd_table_and_columns(DmSqlParser.Refd_table_and_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ref_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_column_list(DmSqlParser.Ref_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(DmSqlParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_list2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list2(DmSqlParser.Column_list2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_list(DmSqlParser.Full_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_list_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_list(DmSqlParser.Column_list_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_list(DmSqlParser.Drop_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#match_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_option(DmSqlParser.Match_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#match_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_type(DmSqlParser.Match_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ref_triggered_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_triggered_action(DmSqlParser.Ref_triggered_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_rule(DmSqlParser.Update_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#delete_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_rule(DmSqlParser.Delete_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ref_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_action(DmSqlParser.Ref_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#check_constraint_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_constraint_def(DmSqlParser.Check_constraint_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#check_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_condition(DmSqlParser.Check_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restrict_cascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrict_cascade(DmSqlParser.Restrict_cascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cascade_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascade_opt(DmSqlParser.Cascade_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_name_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name_options(DmSqlParser.Constraint_name_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#check_option_def_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_option_def_true(DmSqlParser.Check_option_def_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_attributes_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_attributes_options(DmSqlParser.Constraint_attributes_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_attributes(DmSqlParser.Constraint_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#deferrable_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferrable_option(DmSqlParser.Deferrable_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_check_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_check_time(DmSqlParser.Constraint_check_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_constraint_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_clause(DmSqlParser.Table_constraint_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(DmSqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_index_clause(DmSqlParser.Using_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(DmSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger_stmt(DmSqlParser.Alter_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_trigger_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger_option(DmSqlParser.Alter_trigger_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_table_partition_action_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_partition_action_options(DmSqlParser.Alter_table_partition_action_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#refresh_materialized_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_materialized_view_stmt(DmSqlParser.Refresh_materialized_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#complete_del_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplete_del_null(DmSqlParser.Complete_del_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#refresh_complete_del}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_complete_del(DmSqlParser.Refresh_complete_delContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_materialized_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_materialized_view_stmt(DmSqlParser.Alter_materialized_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_stmt(DmSqlParser.Alter_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_view_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_action(DmSqlParser.Alter_view_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cons_novalidate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_novalidate(DmSqlParser.Cons_novalidateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_constraint_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_constraint_clause(DmSqlParser.View_constraint_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_constraint(DmSqlParser.View_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_unique_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_unique_spec(DmSqlParser.View_unique_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_refs_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_refs_spec(DmSqlParser.View_refs_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_refs_spec_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_refs_spec_action(DmSqlParser.View_refs_spec_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#call_proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_proc_stmt(DmSqlParser.Call_proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#raw_call_proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_call_proc_stmt(DmSqlParser.Raw_call_proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#call_proc_stmt_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_proc_stmt_2(DmSqlParser.Call_proc_stmt_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exec_proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_proc_stmt(DmSqlParser.Exec_proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dblink_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblink_clause(DmSqlParser.Dblink_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dblink_clause2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblink_clause2(DmSqlParser.Dblink_clause2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(DmSqlParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DmSqlParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#raw_exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_exp_list(DmSqlParser.Raw_exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp_list_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_list_2(DmSqlParser.Exp_list_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_list(DmSqlParser.Exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ins_exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIns_exp_list(DmSqlParser.Ins_exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lt_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_exp(DmSqlParser.Lt_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_partition_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition_exp(DmSqlParser.Range_partition_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_partition_exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition_exp_list(DmSqlParser.Range_partition_exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_partition_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_exp(DmSqlParser.List_partition_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_partition_exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_exp_list(DmSqlParser.List_partition_exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_partition_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_value_list(DmSqlParser.List_partition_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#close_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_cursor_stmt(DmSqlParser.Close_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_cursor_statement(DmSqlParser.Close_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#begin_trans_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_trans_stmt(DmSqlParser.Begin_trans_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#commit_trans_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_trans_stmt(DmSqlParser.Commit_trans_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#commit_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_head(DmSqlParser.Commit_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#commit_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_tail(DmSqlParser.Commit_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#commit_wait_immed_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_wait_immed_option(DmSqlParser.Commit_wait_immed_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#connect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect_stmt(DmSqlParser.Connect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(DmSqlParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ts_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_storage(DmSqlParser.Ts_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ts_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_storage_clause(DmSqlParser.Ts_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_tablespace_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tablespace_stmt(DmSqlParser.Create_tablespace_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctss_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtss_with_clause(DmSqlParser.Ctss_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_tablespace_set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tablespace_set_stmt(DmSqlParser.Create_tablespace_set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_tablespace_set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_set_stmt(DmSqlParser.Alter_tablespace_set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCache(DmSqlParser.CacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_tablespace_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_stmt(DmSqlParser.Alter_tablespace_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#keep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep(DmSqlParser.KeepContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_action(DmSqlParser.Alter_tablespace_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#file_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_list(DmSqlParser.File_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pathname_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathname_list(DmSqlParser.Pathname_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#integer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_list(DmSqlParser.Integer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(DmSqlParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mirror}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirror(DmSqlParser.MirrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#autoextend_nextsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoextend_nextsize(DmSqlParser.Autoextend_nextsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#autoextend_maxsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoextend_maxsize(DmSqlParser.Autoextend_maxsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#autoextend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoextend(DmSqlParser.AutoextendContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#on_raft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_raft(DmSqlParser.On_raftContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#archfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchfile(DmSqlParser.ArchfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#archflag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchflag(DmSqlParser.ArchflagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#archstyle_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchstyle_options(DmSqlParser.Archstyle_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#archstyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchstyle(DmSqlParser.ArchstyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#archdir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchdir(DmSqlParser.ArchdirContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bakfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBakfile(DmSqlParser.BakfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parameters_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_option_list(DmSqlParser.Parameters_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parameter_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_option_list(DmSqlParser.Parameter_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parameter_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_option(DmSqlParser.Parameter_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pathname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathname(DmSqlParser.PathnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pathname_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathname_options(DmSqlParser.Pathname_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_stmt(DmSqlParser.Backup_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#back_range_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack_range_option(DmSqlParser.Back_range_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#back_archive_spec_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack_archive_spec_null(DmSqlParser.Back_archive_spec_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#not_backed_up}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_backed_up(DmSqlParser.Not_backed_upContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#archive_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchive_spec(DmSqlParser.Archive_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#spec_lsn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_lsn(DmSqlParser.Spec_lsnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_delete_archive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_delete_archive(DmSqlParser.Backup_delete_archiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_options(DmSqlParser.Backup_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cumulative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCumulative(DmSqlParser.CumulativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_bak_dir_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_bak_dir_list(DmSqlParser.With_bak_dir_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#base_on_backup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_on_backup(DmSqlParser.Base_on_backupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_to_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_to_options(DmSqlParser.Backup_to_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_path_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_path_null(DmSqlParser.Backup_path_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#device_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevice_type(DmSqlParser.Device_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parms_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParms_command(DmSqlParser.Parms_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#media_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia_name(DmSqlParser.Media_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_desc_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_desc_options(DmSqlParser.Backup_desc_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_desc(DmSqlParser.Backup_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_maxsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_maxsize(DmSqlParser.Backup_maxsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_limit(DmSqlParser.Backup_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_identified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_identified(DmSqlParser.Backup_identifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_compressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_compressed(DmSqlParser.Backup_compressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_without}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_without(DmSqlParser.Backup_withoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_tsk_thread_num_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_tsk_thread_num_null(DmSqlParser.Backup_tsk_thread_num_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_parallel_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_parallel_dir(DmSqlParser.Backup_parallel_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_trace_file_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_trace_file_level(DmSqlParser.Backup_trace_file_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_stmt(DmSqlParser.Restore_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_datafile_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_datafile_lst(DmSqlParser.Restore_datafile_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_mapped_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_mapped_file(DmSqlParser.Restore_mapped_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mapped_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapped_file(DmSqlParser.Mapped_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#res_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRes_struct(DmSqlParser.Res_structContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#tsk_thread_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsk_thread_num(DmSqlParser.Tsk_thread_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_tsk_thread_num_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_tsk_thread_num_null(DmSqlParser.Restore_tsk_thread_num_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_parallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_parallel(DmSqlParser.Restore_parallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_table_name_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name_options(DmSqlParser.Full_table_name_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#res_without_index_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRes_without_index_constraint(DmSqlParser.Res_without_index_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_from(DmSqlParser.Restore_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#res_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRes_until(DmSqlParser.Res_untilContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_file_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_file_list_options(DmSqlParser.Restore_file_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mirror_file_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirror_file_list_options(DmSqlParser.Mirror_file_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_trace_file_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_trace_file_level(DmSqlParser.Restore_trace_file_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_file_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_file_list(DmSqlParser.Restore_file_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_file(DmSqlParser.Restore_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mirror_file_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirror_file_list(DmSqlParser.Mirror_file_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mirror_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirror_file(DmSqlParser.Mirror_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_bak_arch_dir_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_bak_arch_dir_list(DmSqlParser.With_bak_arch_dir_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restore_identified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestore_identified(DmSqlParser.Restore_identifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_func_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_func_stmt(DmSqlParser.Create_func_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_aggr_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_aggr_clause(DmSqlParser.Func_aggr_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pipelined_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipelined_options(DmSqlParser.Pipelined_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#replace_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_option(DmSqlParser.Replace_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#edit_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdit_options(DmSqlParser.Edit_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#encryption_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_option(DmSqlParser.Encryption_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#calc_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_option(DmSqlParser.Calc_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_action(DmSqlParser.Func_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_call_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_options(DmSqlParser.Func_call_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_call_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_option_list(DmSqlParser.Func_call_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_call_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_option(DmSqlParser.Func_call_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#invoker_rights_clause_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause_options(DmSqlParser.Invoker_rights_clause_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause(DmSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#deterministic_clause_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterministic_clause_options(DmSqlParser.Deterministic_clause_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#deterministic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterministic_clause(DmSqlParser.Deterministic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_call_option2_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_option2_options(DmSqlParser.Func_call_option2_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_call_option_list2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_option_list2(DmSqlParser.Func_call_option_list2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_call_option2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_option2(DmSqlParser.Func_call_option2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_cache_clause(DmSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#inner_fun_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_fun_name(DmSqlParser.Inner_fun_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#platform_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_type(DmSqlParser.Platform_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_def_list_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_def_list_option(DmSqlParser.Param_def_list_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_def_list(DmSqlParser.Param_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_def(DmSqlParser.Param_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_in_out_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_in_out_option(DmSqlParser.Param_in_out_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#is_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_as(DmSqlParser.Is_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#stat_on_org_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_on_org_stmt(DmSqlParser.Stat_on_org_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#stat_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_size(DmSqlParser.Stat_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#stat_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_para(DmSqlParser.Stat_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bm_join_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBm_join_index_clause(DmSqlParser.Bm_join_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#parallel_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_stmt(DmSqlParser.Parallel_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(DmSqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_inner(DmSqlParser.With_innerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#index_no_sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_no_sort(DmSqlParser.Index_no_sortContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#online_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnline_options(DmSqlParser.Online_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unusable_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnusable_options(DmSqlParser.Unusable_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#reverse_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse_options(DmSqlParser.Reverse_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#index_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_list(DmSqlParser.Index_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#index_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_name(DmSqlParser.Index_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_hash_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_hash_tag(DmSqlParser.Storage_hash_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_hash(DmSqlParser.Storage_hashContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_tag(DmSqlParser.Storage_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_tag_nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_tag_nn(DmSqlParser.Storage_tag_nnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#tablespace_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_clause(DmSqlParser.Tablespace_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_table_substitution_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table_substitution_clause(DmSqlParser.Object_table_substitution_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table_substitution(DmSqlParser.Object_table_substitutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oid_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_clause(DmSqlParser.Oid_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oid_gen_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_gen_type(DmSqlParser.Oid_gen_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_index_clause(DmSqlParser.Oid_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oid_tablespace_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_tablespace_clause(DmSqlParser.Oid_tablespace_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oid_tablespace_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_tablespace_name(DmSqlParser.Oid_tablespace_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#local_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_option(DmSqlParser.Local_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_list(DmSqlParser.Storage_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_hashpartmap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_hashpartmap(DmSqlParser.Storage_hashpartmapContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage(DmSqlParser.StorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(DmSqlParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_proc_stmt(DmSqlParser.Create_proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_proc_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_proc_option(DmSqlParser.Create_proc_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(DmSqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pkg_cls_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg_cls_flag(DmSqlParser.Pkg_cls_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#blk_end_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlk_end_option(DmSqlParser.Blk_end_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#blk_end_option_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlk_end_option_low(DmSqlParser.Blk_end_option_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#package_def_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def_list_options(DmSqlParser.Package_def_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#package_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def_list(DmSqlParser.Package_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#package_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def(DmSqlParser.Package_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#restrict_param_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrict_param_lst(DmSqlParser.Restrict_param_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(DmSqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_pkg_body_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_pkg_body_header(DmSqlParser.Create_pkg_body_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pkg_cls_body_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg_cls_body_flag(DmSqlParser.Pkg_cls_body_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#package_body_init_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_init_option(DmSqlParser.Package_body_init_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#package_body_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_def_list(DmSqlParser.Package_body_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#package_body_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_def(DmSqlParser.Package_body_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#check_exec_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_exec_options(DmSqlParser.Check_exec_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpg_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpg_decl_stmt(DmSqlParser.Subpg_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_stmt(DmSqlParser.Create_type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#force_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForce_option(DmSqlParser.Force_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_option(DmSqlParser.Object_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#under_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnder_option(DmSqlParser.Under_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_def_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_def_list_options(DmSqlParser.Object_def_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_def_list(DmSqlParser.Object_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_def(DmSqlParser.Object_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#member_static}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_static(DmSqlParser.Member_staticContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#method_inherit_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_inherit_options(DmSqlParser.Method_inherit_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#method_inherit_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_inherit_option(DmSqlParser.Method_inherit_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#final_inst_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_inst_list_options(DmSqlParser.Final_inst_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#final_inst_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_inst_list(DmSqlParser.Final_inst_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#final_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_inst(DmSqlParser.Final_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#overriding_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverriding_option(DmSqlParser.Overriding_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#method_attr_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_attr_options(DmSqlParser.Method_attr_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#method_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_attr(DmSqlParser.Method_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_type_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_body_stmt(DmSqlParser.Create_type_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_body_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_body_def_list(DmSqlParser.Object_body_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#object_body_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_body_def(DmSqlParser.Object_body_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_context_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_context_stmt(DmSqlParser.Create_context_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(DmSqlParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#initialized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialized(DmSqlParser.InitializedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_directory_stmt(DmSqlParser.Create_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_crypto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_crypto_stmt(DmSqlParser.Create_crypto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_crypto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_crypto_stmt(DmSqlParser.Alter_crypto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_crypto_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_crypto_action(DmSqlParser.Alter_crypto_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#comment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_stmt(DmSqlParser.Comment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_partition_group_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_partition_group_stmt(DmSqlParser.Create_partition_group_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#storage_act_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_act_datatype(DmSqlParser.Storage_act_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pg_storage_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPg_storage_lst(DmSqlParser.Pg_storage_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pg_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPg_storage(DmSqlParser.Pg_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(DmSqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_append_attr_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_append_attr_clause(DmSqlParser.Ctab_append_attr_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_append_attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_append_attr_list(DmSqlParser.Ctab_append_attr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cobjtab_append_attr_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobjtab_append_attr_clause(DmSqlParser.Cobjtab_append_attr_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cobjtab_append_attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobjtab_append_attr_list(DmSqlParser.Cobjtab_append_attr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_append_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_append_attr(DmSqlParser.Ctab_append_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cobjtab_append_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobjtab_append_attr(DmSqlParser.Cobjtab_append_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_action(DmSqlParser.Create_table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_table_action_list_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_action_list_option(DmSqlParser.Create_table_action_list_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_log_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_log_options(DmSqlParser.Ctab_log_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_log_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_log_option(DmSqlParser.Ctab_log_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_error_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_error_options(DmSqlParser.Ctab_error_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#advance_log_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdvance_log_clause(DmSqlParser.Advance_log_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#add_log_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_log_clause(DmSqlParser.Add_log_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_error_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_error_option(DmSqlParser.Ctab_error_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ctab_row_movement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtab_row_movement_clause(DmSqlParser.Ctab_row_movement_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_distribute_act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_distribute_act(DmSqlParser.Range_distribute_actContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_distribute_act_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_distribute_act_lst(DmSqlParser.Range_distribute_act_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_distribute_act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_distribute_act(DmSqlParser.List_distribute_actContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_distribute_act_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_distribute_act_list(DmSqlParser.List_distribute_act_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#distribute_by_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistribute_by_option(DmSqlParser.Distribute_by_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#distribute_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistribute_by(DmSqlParser.Distribute_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#increment_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_set(DmSqlParser.Increment_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(DmSqlParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rowdependencies_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowdependencies_clause(DmSqlParser.Rowdependencies_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pg_sub_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPg_sub_partition(DmSqlParser.Pg_sub_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_type_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_option(DmSqlParser.Table_type_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_temp_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_temp_option(DmSqlParser.Table_temp_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#objtab_elem_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjtab_elem_constraint(DmSqlParser.Objtab_elem_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#objtab_element_cons_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjtab_element_cons_list(DmSqlParser.Objtab_element_cons_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#objtab_element_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjtab_element_cons(DmSqlParser.Objtab_element_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#objcol_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjcol_constraint(DmSqlParser.Objcol_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element_list(DmSqlParser.Table_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(DmSqlParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_constraint_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_def(DmSqlParser.Table_constraint_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#on_commit_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_commit_option(DmSqlParser.On_commit_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#on_commit_option_nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_commit_option_nn(DmSqlParser.On_commit_option_nnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#logging_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogging_option(DmSqlParser.Logging_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#logging_option_nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogging_option_nn(DmSqlParser.Logging_option_nnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_clause(DmSqlParser.Partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#partition_clause_nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_clause_nn(DmSqlParser.Partition_clause_nnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#horizon_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHorizon_partition_clause(DmSqlParser.Horizon_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#compress_tag_hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress_tag_hdr(DmSqlParser.Compress_tag_hdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#compress_clause_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress_clause_opt(DmSqlParser.Compress_clause_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#compress_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress_tag(DmSqlParser.Compress_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#compress_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress_level(DmSqlParser.Compress_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#compress_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress_type(DmSqlParser.Compress_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition(DmSqlParser.Range_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_partition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition_list(DmSqlParser.Range_partition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partition(DmSqlParser.Hash_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_partition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partition_list(DmSqlParser.Hash_partition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition(DmSqlParser.List_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_partition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_list(DmSqlParser.List_partition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#split_partition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplit_partition_list(DmSqlParser.Split_partition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#partition_act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_act(DmSqlParser.Partition_actContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#vertical_partition_act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertical_partition_act(DmSqlParser.Vertical_partition_actContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(DmSqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#horizon_partition_act_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHorizon_partition_act_datatype(DmSqlParser.Horizon_partition_act_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#horizon_partition_act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHorizon_partition_act(DmSqlParser.Horizon_partition_actContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lock_partitions_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_partitions_clause(DmSqlParser.Lock_partitions_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartion_template_list_datatype_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartion_template_list_datatype_options(DmSqlParser.Subpartion_template_list_datatype_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartion_template_list_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartion_template_list_datatype(DmSqlParser.Subpartion_template_list_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartion_template_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartion_template_list_options(DmSqlParser.Subpartion_template_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartion_template_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartion_template_list(DmSqlParser.Subpartion_template_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartion_template_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartion_template_datatype(DmSqlParser.Subpartion_template_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartion_template_datatype(DmSqlParser.Range_subpartion_template_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartion_template_datatype(DmSqlParser.Hash_subpartion_template_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_subpartions_template_datatype_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartions_template_datatype_option(DmSqlParser.Hash_subpartions_template_datatype_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartion_template_datatype(DmSqlParser.List_subpartion_template_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartion_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartion_template(DmSqlParser.Subpartion_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_subpartion_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartion_template(DmSqlParser.Range_subpartion_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_subpartion_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartion_template(DmSqlParser.Hash_subpartion_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_subpartions_template_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartions_template_option(DmSqlParser.Hash_subpartions_template_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_subpartion_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartion_template(DmSqlParser.List_subpartion_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_subpartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartition(DmSqlParser.Range_subpartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_subpartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartition(DmSqlParser.Hash_subpartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_subpartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartition(DmSqlParser.List_subpartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_subpartition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartition_list(DmSqlParser.Range_subpartition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_subpartition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartition_list(DmSqlParser.Hash_subpartition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#list_subpartition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartition_list(DmSqlParser.List_subpartition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_hash_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_hash_desc(DmSqlParser.Subpartition_hash_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_range_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_range_desc(DmSqlParser.Subpartition_range_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_list_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_list_desc(DmSqlParser.Subpartition_list_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_hash_desc_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_hash_desc_list(DmSqlParser.Subpartition_hash_desc_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_range_desc_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_range_desc_list(DmSqlParser.Subpartition_range_desc_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_list_desc_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_list_desc_list(DmSqlParser.Subpartition_list_desc_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_desc(DmSqlParser.Subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#subpartition_desc_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_desc_option(DmSqlParser.Subpartition_desc_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#add_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_subpartition_desc(DmSqlParser.Add_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#partition_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_no(DmSqlParser.Partition_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#comment_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_clause(DmSqlParser.Comment_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#encrypt_clause_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncrypt_clause_options(DmSqlParser.Encrypt_clause_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#encrypt_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncrypt_clause(DmSqlParser.Encrypt_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#encrypt_cipher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncrypt_cipher(DmSqlParser.Encrypt_cipherContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#crypto_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrypto_name(DmSqlParser.Crypto_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cipher_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCipher_name(DmSqlParser.Cipher_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_cipher_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_cipher_name(DmSqlParser.Full_cipher_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#encrypt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncrypt_type(DmSqlParser.Encrypt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#manual_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManual_clause(DmSqlParser.Manual_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_clause_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_clause_options(DmSqlParser.User_clause_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_clause(DmSqlParser.User_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_list_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_list_option(DmSqlParser.User_list_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_list(DmSqlParser.User_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_cipher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_cipher(DmSqlParser.Hash_cipherContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_type(DmSqlParser.Hash_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#space_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace_limit(DmSqlParser.Space_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#space_limit_nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace_limit_nn(DmSqlParser.Space_limit_nnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#space_limit_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace_limit_1(DmSqlParser.Space_limit_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#space_limit2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace_limit2(DmSqlParser.Space_limit2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#del_res}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_res(DmSqlParser.Del_resContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_enable(DmSqlParser.Trig_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#at_raft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_raft(DmSqlParser.At_raftContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(DmSqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#before_after}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBefore_after(DmSqlParser.Before_afterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_del_ins_upd_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_del_ins_upd_list(DmSqlParser.Trig_del_ins_upd_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_del_ins_upd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_del_ins_upd(DmSqlParser.Trig_del_ins_updContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_of_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_of_option(DmSqlParser.Update_of_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#nowait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowait(DmSqlParser.NowaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_event_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_event_list(DmSqlParser.Trig_event_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_event(DmSqlParser.Trig_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#event_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_object(DmSqlParser.Event_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_referencing_def_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_referencing_def_options(DmSqlParser.Trig_referencing_def_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_referencing_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_referencing_def(DmSqlParser.Trig_referencing_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_referencing_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_referencing_list(DmSqlParser.Trig_referencing_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_referencing_old}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_referencing_old(DmSqlParser.Trig_referencing_oldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_referencing_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_referencing_new(DmSqlParser.Trig_referencing_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_for_each_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_for_each_option(DmSqlParser.Trig_for_each_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_timer_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_timer_rate(DmSqlParser.Trig_timer_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exec_ep_seqno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_ep_seqno(DmSqlParser.Exec_ep_seqnoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rate_over_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRate_over_day(DmSqlParser.Rate_over_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#month_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_rate(DmSqlParser.Month_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#day_in_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_in_month(DmSqlParser.Day_in_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#day_in_month_week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_in_month_week(DmSqlParser.Day_in_month_weekContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#week_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek_rate(DmSqlParser.Week_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#day_of_week_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_of_week_list(DmSqlParser.Day_of_week_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#day_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_rate(DmSqlParser.Day_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rate_in_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRate_in_day(DmSqlParser.Rate_in_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#once_in_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnce_in_day(DmSqlParser.Once_in_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#times_in_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes_in_day(DmSqlParser.Times_in_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#duaring_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuaring_time(DmSqlParser.Duaring_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#duaring_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuaring_date(DmSqlParser.Duaring_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_when_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_when_option(DmSqlParser.Trig_when_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_when_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_when_condition(DmSqlParser.Trig_when_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#repeat_interval_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_interval_stmt(DmSqlParser.Repeat_interval_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#max_run_duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_run_duration(DmSqlParser.Max_run_durationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#repeat_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_interval(DmSqlParser.Repeat_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#frequency_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequency_clause(DmSqlParser.Frequency_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#frequency_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequency_define(DmSqlParser.Frequency_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#predefined_frequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_frequency(DmSqlParser.Predefined_frequencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_clause_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_clause_option(DmSqlParser.Interval_clause_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_clause_list(DmSqlParser.Interval_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_clause_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_clause_single(DmSqlParser.Interval_clause_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_clause(DmSqlParser.Interval_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#intervalnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalnum(DmSqlParser.IntervalnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bymonth_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBymonth_clause(DmSqlParser.Bymonth_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#monthlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthlist(DmSqlParser.MonthlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DmSqlParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#numeric_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_month(DmSqlParser.Numeric_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#char_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_month(DmSqlParser.Char_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byweekno_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByweekno_clause(DmSqlParser.Byweekno_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#weekno_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekno_list(DmSqlParser.Weekno_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#weekno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekno(DmSqlParser.WeeknoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byyearday_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByyearday_clause(DmSqlParser.Byyearday_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#yearday_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearday_list(DmSqlParser.Yearday_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#yearday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearday(DmSqlParser.YeardayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bymonthday_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBymonthday_clause(DmSqlParser.Bymonthday_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#monthday_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthday_list(DmSqlParser.Monthday_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#monthday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthday(DmSqlParser.MonthdayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byday_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByday_clause(DmSqlParser.Byday_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byday_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByday_list(DmSqlParser.Byday_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByday(DmSqlParser.BydayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#weekdaynum_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekdaynum_options(DmSqlParser.Weekdaynum_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#weekdaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekdaynum(DmSqlParser.WeekdaynumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(DmSqlParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byhour_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByhour_clause(DmSqlParser.Byhour_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hour_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour_list(DmSqlParser.Hour_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(DmSqlParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#byminute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByminute_clause(DmSqlParser.Byminute_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#minute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute_list(DmSqlParser.Minute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(DmSqlParser.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bysecond_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBysecond_clause(DmSqlParser.Bysecond_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#second_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_list(DmSqlParser.Second_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(DmSqlParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#query_rewrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_rewrite(DmSqlParser.Query_rewriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#build_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_clause(DmSqlParser.Build_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_refresh_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_refresh_option(DmSqlParser.Mv_refresh_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_refresh_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_refresh_option_list(DmSqlParser.Mv_refresh_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_refresh_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_refresh_clause(DmSqlParser.Mv_refresh_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_log_purge_syn_asyn_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_purge_syn_asyn_clause(DmSqlParser.Mv_log_purge_syn_asyn_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_purge_clause(DmSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_log_with_syntax_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_with_syntax_item(DmSqlParser.Mv_log_with_syntax_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_log_with_syntax_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_with_syntax_item_list(DmSqlParser.Mv_log_with_syntax_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_log_including_new_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_including_new_values(DmSqlParser.Mv_log_including_new_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mv_log_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_with_clause(DmSqlParser.Mv_log_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_materialized_view_log_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view_log_stmt(DmSqlParser.Create_materialized_view_log_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#prebuilt_table_clause_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrebuilt_table_clause_null(DmSqlParser.Prebuilt_table_clause_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_materialized_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view_stmt(DmSqlParser.Create_materialized_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(DmSqlParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_view_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt_body(DmSqlParser.Create_view_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_list3_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list3_options(DmSqlParser.Column_list3_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_list3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list3(DmSqlParser.Column_list3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_column_constraint_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_column_constraint_def(DmSqlParser.View_column_constraint_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_column_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_column_constraints(DmSqlParser.View_column_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_column_constraint(DmSqlParser.View_column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_column_constraint_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_column_constraint_action(DmSqlParser.View_column_constraint_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#view_constraint_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_constraint_def(DmSqlParser.View_constraint_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_schemabinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_schemabinding(DmSqlParser.With_schemabindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_options(DmSqlParser.Column_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_check_or_readonly_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_check_or_readonly_option(DmSqlParser.With_check_or_readonly_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#check_level_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_level_option(DmSqlParser.Check_level_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decl_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor(DmSqlParser.Decl_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(DmSqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#delete_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_body(DmSqlParser.Delete_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#delete_multi_tv_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_multi_tv_option(DmSqlParser.Delete_multi_tv_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#check_limit_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_limit_option(DmSqlParser.Check_limit_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#where_current_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_current_option(DmSqlParser.Where_current_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(DmSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#start_with_clause_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_with_clause_null(DmSqlParser.Start_with_clause_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#connect_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect_by_item(DmSqlParser.Connect_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#connect_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect_by_clause(DmSqlParser.Connect_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(DmSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#nocycle_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNocycle_flag(DmSqlParser.Nocycle_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(DmSqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#disconnect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect_stmt(DmSqlParser.Disconnect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#disconnect_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect_option(DmSqlParser.Disconnect_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(DmSqlParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_stmt_body_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt_body_1(DmSqlParser.Drop_stmt_body_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_stmt_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt_2(DmSqlParser.Drop_stmt_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_id_db_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_id_db_object(DmSqlParser.Drop_id_db_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#id_db_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_db_object(DmSqlParser.Id_db_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_db_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_db_object(DmSqlParser.Drop_db_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist(DmSqlParser.ExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#not_exist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_exist(DmSqlParser.Not_existContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#db_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_object(DmSqlParser.Db_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#is_detach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_detach(DmSqlParser.Is_detachContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#purge_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurge_option(DmSqlParser.Purge_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_stmt(DmSqlParser.Alter_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_system_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_system_action(DmSqlParser.Alter_system_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_database_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_action(DmSqlParser.Alter_database_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#force}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForce(DmSqlParser.ForceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#tablespace_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_name(DmSqlParser.Tablespace_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#raft_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaft_name(DmSqlParser.Raft_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_into(DmSqlParser.Fetch_intoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bulk_or_single_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_or_single_into(DmSqlParser.Bulk_or_single_intoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(DmSqlParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(DmSqlParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_tail(DmSqlParser.Fetch_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_limit_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_limit_option(DmSqlParser.Fetch_limit_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_option(DmSqlParser.Fetch_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fetch_direct_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_direct_option(DmSqlParser.Fetch_direct_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#log_errors_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_errors_into(DmSqlParser.Log_errors_intoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#log_errors_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_errors_expression(DmSqlParser.Log_errors_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#log_errors_unlimited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_errors_unlimited(DmSqlParser.Log_errors_unlimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#log_errors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_errors(DmSqlParser.Log_errorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(DmSqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#insert_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_body(DmSqlParser.Insert_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_column_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_list_options(DmSqlParser.Full_column_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ins_value_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIns_value_options(DmSqlParser.Ins_value_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#insert_into_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_single(DmSqlParser.Insert_into_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#multi_insert_into_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_insert_into_list(DmSqlParser.Multi_insert_into_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#multi_insert_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_insert_tag(DmSqlParser.Multi_insert_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#insert_into_single_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_single_condition(DmSqlParser.Insert_into_single_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#multi_insert_into_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_insert_into_condition_list(DmSqlParser.Multi_insert_into_condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#multi_insert_into_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_insert_into_else(DmSqlParser.Multi_insert_into_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#multi_insert_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_insert_stmt_body(DmSqlParser.Multi_insert_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#insert_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_tail(DmSqlParser.Insert_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#insert_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_action(DmSqlParser.Insert_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#record_var_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_var_values(DmSqlParser.Record_var_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#record_var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_var_value(DmSqlParser.Record_var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ins_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIns_value(DmSqlParser.Ins_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(DmSqlParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#open_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_tail(DmSqlParser.Open_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(DmSqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(DmSqlParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(DmSqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#to_savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_savepoint(DmSqlParser.To_savepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(DmSqlParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(DmSqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#all_distinct_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_option(DmSqlParser.All_distinct_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#corresponding_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorresponding_clause(DmSqlParser.Corresponding_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#top_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_option(DmSqlParser.Top_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#limit_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_option(DmSqlParser.Limit_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(DmSqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#limit_not_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_not_empty(DmSqlParser.Limit_not_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#row_limiting_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_limiting_clause(DmSqlParser.Row_limiting_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#row_num_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_num_desc(DmSqlParser.Row_num_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#first_next_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_next_desc(DmSqlParser.First_next_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_item_list(DmSqlParser.Select_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_item(DmSqlParser.Select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#as_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_alias(DmSqlParser.As_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_tail(DmSqlParser.Select_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(DmSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#from_tv_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_tv_list(DmSqlParser.From_tv_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#from_tv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_tv(DmSqlParser.From_tvContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(DmSqlParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#joined_table1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table1(DmSqlParser.Joined_table1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trxid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrxid(DmSqlParser.TrxidContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#flashback_query_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_low(DmSqlParser.Flashback_query_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trxid_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrxid_option(DmSqlParser.Trxid_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#range_from_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_from_to(DmSqlParser.Range_from_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sample_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_exp(DmSqlParser.Sample_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_sfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_sfun(DmSqlParser.Pivot_sfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_sfun_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_sfun_lst(DmSqlParser.Pivot_sfun_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(DmSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_in_clause1_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause1_expr(DmSqlParser.Pivot_in_clause1_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_in_clause_low_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_low_1(DmSqlParser.Pivot_in_clause_low_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_in_clause_low_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_low_2(DmSqlParser.Pivot_in_clause_low_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_in_clause_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_low(DmSqlParser.Pivot_in_clause_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_xml(DmSqlParser.Pivot_xmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pivot_clause_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause_low(DmSqlParser.Pivot_clause_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unpivot_val_col_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_val_col_lst(DmSqlParser.Unpivot_val_col_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#include_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_clause(DmSqlParser.Include_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unpivot_in_clause_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause_expr(DmSqlParser.Unpivot_in_clause_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unpivot_in_clause_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause_low(DmSqlParser.Unpivot_in_clause_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unpivot_clause_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause_low(DmSqlParser.Unpivot_clause_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sample_clause_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause_low(DmSqlParser.Sample_clause_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_name(DmSqlParser.Normal_tv_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_tail(DmSqlParser.Normal_tv_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_tail_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_tail_low(DmSqlParser.Normal_tv_tail_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_alias(DmSqlParser.Normal_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_tail_low2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_tail_low2(DmSqlParser.Normal_tv_tail_low2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_tail_low3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_tail_low3(DmSqlParser.Normal_tv_tail_low3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_derived_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_derived_table_options(DmSqlParser.Normal_tv_derived_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_derived_table_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_derived_table_low(DmSqlParser.Normal_tv_derived_table_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv_derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv_derived_table(DmSqlParser.Normal_tv_derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_with_paran_with_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_paran_with_alias(DmSqlParser.Select_with_paran_with_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#from_table_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_exp(DmSqlParser.From_table_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#from_table_select_with_paran}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_select_with_paran(DmSqlParser.From_table_select_with_paranContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#normal_tv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_tv(DmSqlParser.Normal_tvContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xml_passing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing(DmSqlParser.Xml_passingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlcoldef_lst_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlcoldef_lst_options(DmSqlParser.Xmlcoldef_lst_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlcoldef_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlcoldef_lst(DmSqlParser.Xmlcoldef_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlcoldef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlcoldef(DmSqlParser.XmlcoldefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#on_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_error(DmSqlParser.On_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#jsoncol_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsoncol_lst(DmSqlParser.Jsoncol_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#jsoncoldef_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsoncoldef_lst(DmSqlParser.Jsoncoldef_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#jsoncoldef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsoncoldef(DmSqlParser.JsoncoldefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_exists_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_exists_col(DmSqlParser.Json_exists_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_qurey_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_qurey_col(DmSqlParser.Json_qurey_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_value_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_value_col(DmSqlParser.Json_value_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_nested_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_nested_col(DmSqlParser.Json_nested_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ordinality_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinality_col(DmSqlParser.Ordinality_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cross_outer_apply_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_outer_apply_clause(DmSqlParser.Cross_outer_apply_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cross_outer_apply_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_outer_apply_join(DmSqlParser.Cross_outer_apply_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cross_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_join(DmSqlParser.Cross_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#partition_out_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_out_join(DmSqlParser.Partition_out_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#qualified_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_join(DmSqlParser.Qualified_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#qualified_joinspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_joinspec(DmSqlParser.Qualified_joinspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#named_columns_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_columns_join(DmSqlParser.Named_columns_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#join_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_hint(DmSqlParser.Join_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(DmSqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(DmSqlParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(DmSqlParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(DmSqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#group_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_item(DmSqlParser.Group_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp_rollup_cube_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_rollup_cube_item(DmSqlParser.Exp_rollup_cube_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grouping_set_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_set_items(DmSqlParser.Grouping_set_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grouping_set_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_set_item(DmSqlParser.Grouping_set_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(DmSqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#without_into_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithout_into_select(DmSqlParser.Without_into_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sel_clause_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSel_clause_app(DmSqlParser.Sel_clause_appContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(DmSqlParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#simple_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select(DmSqlParser.Simple_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#select_with_paran}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_paran(DmSqlParser.Select_with_paranContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#query_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_exp(DmSqlParser.Query_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#for_xml_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_xml_path(DmSqlParser.For_xml_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_tag(DmSqlParser.With_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_option(DmSqlParser.With_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(DmSqlParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_function_list(DmSqlParser.With_function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#func_def_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_inner(DmSqlParser.Func_def_innerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_function_list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_function_list_element(DmSqlParser.With_function_list_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_view_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_view_list(DmSqlParser.With_view_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#depth_type_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepth_type_option(DmSqlParser.Depth_type_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(DmSqlParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(DmSqlParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_view_list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_view_list_element(DmSqlParser.With_view_list_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#assignment_obj_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_obj_list(DmSqlParser.Assignment_obj_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#assignment_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_obj(DmSqlParser.Assignment_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#order_by_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_options(DmSqlParser.Order_by_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#order_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by(DmSqlParser.Order_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#asc_desc_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc_option(DmSqlParser.Asc_desc_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#nulls_last_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNulls_last_option(DmSqlParser.Nulls_last_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#collate_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate_option(DmSqlParser.Collate_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#order_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_list(DmSqlParser.Order_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#order_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_item(DmSqlParser.Order_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_options(DmSqlParser.For_update_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update(DmSqlParser.For_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_session_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_stmt(DmSqlParser.Set_session_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_trans_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_trans_stmt(DmSqlParser.Set_trans_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trans_mode_lstl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_mode_lstl(DmSqlParser.Trans_mode_lstlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trans_mode_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_mode_lst(DmSqlParser.Trans_mode_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trans_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_mode(DmSqlParser.Trans_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#time_zone_exp_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_exp_new(DmSqlParser.Time_zone_exp_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trans_rw_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_rw_option(DmSqlParser.Trans_rw_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trans_level_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_level_option(DmSqlParser.Trans_level_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lock_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_stmt(DmSqlParser.Lock_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lock_mode_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode_option(DmSqlParser.Lock_mode_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_identins_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_identins_stmt(DmSqlParser.Set_identins_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_identins_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_identins_option(DmSqlParser.Set_identins_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trunc_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrunc_table_stmt(DmSqlParser.Trunc_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(DmSqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_body(DmSqlParser.Update_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_tv_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_tv_list(DmSqlParser.Update_tv_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#return_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_item(DmSqlParser.Return_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#return_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_item_list(DmSqlParser.Return_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#return_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_option(DmSqlParser.Return_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#return_into_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_into_obj(DmSqlParser.Return_into_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#collect_into_rset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_into_rset(DmSqlParser.Collect_into_rsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alias_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_option(DmSqlParser.Alias_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_value_list(DmSqlParser.Set_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_value_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_value_node(DmSqlParser.Set_value_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#set_col_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_col_list(DmSqlParser.Set_col_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#update_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_from_clause(DmSqlParser.Update_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#merge_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_into_stmt(DmSqlParser.Merge_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#merge_into_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_into_stmt_body(DmSqlParser.Merge_into_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#merge_into_sub_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_into_sub_clause(DmSqlParser.Merge_into_sub_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(DmSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(DmSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_profile_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_profile_stmt(DmSqlParser.Create_profile_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_profile_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_profile_stmt(DmSqlParser.Alter_profile_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_user_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_stmt(DmSqlParser.Create_user_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_user_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_option(DmSqlParser.Create_user_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_ts_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_ts_name(DmSqlParser.Default_ts_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_ts_name_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_ts_name_lst(DmSqlParser.Default_ts_name_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_ts_name_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_ts_name_node(DmSqlParser.Default_ts_name_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_idx_ts_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_idx_ts_name(DmSqlParser.Default_idx_ts_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_ts_name_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_ts_name_low(DmSqlParser.Default_ts_name_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#temp_ts_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_ts_name(DmSqlParser.Temp_ts_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#default_ts_group_name_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_ts_group_name_low(DmSqlParser.Default_ts_group_name_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#on_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_schema(DmSqlParser.On_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#replace_old_pwd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_old_pwd(DmSqlParser.Replace_old_pwdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_user_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_stmt(DmSqlParser.Alter_user_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_encrypt_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_encrypt_options(DmSqlParser.User_encrypt_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_encrypt_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_encrypt_option(DmSqlParser.User_encrypt_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#authent_type_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthent_type_options(DmSqlParser.Authent_type_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#hash_cipher_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_cipher_option(DmSqlParser.Hash_cipher_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#authent_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthent_type(DmSqlParser.Authent_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#force_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForce_format(DmSqlParser.Force_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(DmSqlParser.AsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pwd_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPwd_policy(DmSqlParser.Pwd_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#account_lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount_lock(DmSqlParser.Account_lockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#read_only_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_only_flag(DmSqlParser.Read_only_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#read_only_flag_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_only_flag_not_null(DmSqlParser.Read_only_flag_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(DmSqlParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#expire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpire(DmSqlParser.ExpireContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit_options(DmSqlParser.Resource_limit_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit_list(DmSqlParser.Resource_limit_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit_list_with_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit_list_with_comma(DmSqlParser.Resource_limit_list_with_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit_list_with_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit_list_with_empty(DmSqlParser.Resource_limit_list_with_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit(DmSqlParser.Resource_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit_option(DmSqlParser.Resource_limit_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#resource_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_limit_value(DmSqlParser.Resource_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_audit_rule_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_audit_rule_stmt(DmSqlParser.Create_audit_rule_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rule_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_name(DmSqlParser.Rule_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#audit_rule_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_rule_action(DmSqlParser.Audit_rule_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#by_login_or_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_login_or_all(DmSqlParser.By_login_or_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#allow_ip_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_ip_list(DmSqlParser.Allow_ip_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#not_allow_ip_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_allow_ip_list(DmSqlParser.Not_allow_ip_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ip_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_list(DmSqlParser.Ip_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#allow_dt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_dt_list(DmSqlParser.Allow_dt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#not_allow_dt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_allow_dt_list(DmSqlParser.Not_allow_dt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDt_list(DmSqlParser.Dt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDt(DmSqlParser.DtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#op_freq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_freq(DmSqlParser.Op_freqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#quota_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuota_val(DmSqlParser.Quota_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#quota_ts_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuota_ts_node(DmSqlParser.Quota_ts_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#quota_ts_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuota_ts_lst(DmSqlParser.Quota_ts_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#quota_ts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuota_ts(DmSqlParser.Quota_tsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_role_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_role_stmt(DmSqlParser.Create_role_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_dblink_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_dblink_stmt(DmSqlParser.Create_dblink_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#db_type_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_type_str(DmSqlParser.Db_type_strContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dblink_option_lst_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblink_option_lst_options(DmSqlParser.Dblink_option_lst_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dblink_option_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblink_option_lst(DmSqlParser.Dblink_option_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dblink_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblink_option(DmSqlParser.Dblink_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_synonym_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym_stmt(DmSqlParser.Create_synonym_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_synonym_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_synonym_name(DmSqlParser.Full_synonym_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_obj_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_obj_name(DmSqlParser.Full_obj_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_domain_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_domain_stmt(DmSqlParser.Create_domain_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_default_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_default_option(DmSqlParser.Domain_default_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraints_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraints_option(DmSqlParser.Domain_constraints_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraints_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraints_def(DmSqlParser.Domain_constraints_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraints(DmSqlParser.Domain_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint(DmSqlParser.Domain_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraint_name_def_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint_name_def_options(DmSqlParser.Domain_constraint_name_def_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraint_name_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint_name_def(DmSqlParser.Domain_constraint_name_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#domain_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint_name(DmSqlParser.Domain_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_character_set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_character_set_stmt(DmSqlParser.Create_character_set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#character_set_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_set_source(DmSqlParser.Character_set_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#existing_character_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_character_set_name(DmSqlParser.Existing_character_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#character_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_set_name(DmSqlParser.Character_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#collate_clause_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate_clause_option(DmSqlParser.Collate_clause_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(DmSqlParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_collation_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_collation_stmt(DmSqlParser.Create_collation_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#existing_collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_collation_name(DmSqlParser.Existing_collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pad_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPad_option(DmSqlParser.Pad_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_sequence_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence_stmt(DmSqlParser.Create_sequence_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sequence_option_list_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_option_list_options(DmSqlParser.Sequence_option_list_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sequence_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_option_list(DmSqlParser.Sequence_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sequence_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_option(DmSqlParser.Sequence_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_name(DmSqlParser.Sequence_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#increment_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_option(DmSqlParser.Increment_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#start_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_option(DmSqlParser.Start_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#current_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_option(DmSqlParser.Current_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#maxvalue_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxvalue_option(DmSqlParser.Maxvalue_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#minvalue_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinvalue_option(DmSqlParser.Minvalue_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cycle_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_option(DmSqlParser.Cycle_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cache_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCache_option(DmSqlParser.Cache_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#order_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_option(DmSqlParser.Order_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#seq_local_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_local_option(DmSqlParser.Seq_local_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#whenever_stmt_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenever_stmt_options(DmSqlParser.Whenever_stmt_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#whenever_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenever_stmt(DmSqlParser.Whenever_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(DmSqlParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_body(DmSqlParser.Grant_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#revoke_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_stmt(DmSqlParser.Revoke_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#revoke_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_stmt_body(DmSqlParser.Revoke_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_privs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_privs(DmSqlParser.Grant_privsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_priv_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_priv_list(DmSqlParser.Grant_priv_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_priv_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_priv_off(DmSqlParser.Grant_priv_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_priv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_priv(DmSqlParser.Grant_privContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#revoke_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_action(DmSqlParser.Revoke_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#db_priv_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_priv_list(DmSqlParser.Db_priv_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#db_priv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_priv(DmSqlParser.Db_privContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#by_grantor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_grantor(DmSqlParser.By_grantorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grantees}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantees(DmSqlParser.GranteesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_stmt(DmSqlParser.Create_schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oprt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprt_arg(DmSqlParser.Oprt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#oprt_arg_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprt_arg_lst(DmSqlParser.Oprt_arg_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_operator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_stmt(DmSqlParser.Create_operator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_operator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_stmt(DmSqlParser.Drop_operator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#grant_and_ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_and_ddl(DmSqlParser.Grant_and_ddlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#top_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_exp(DmSqlParser.Top_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#u_oprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU_oprt(DmSqlParser.U_oprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#qualified_u_oprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_u_oprt(DmSqlParser.Qualified_u_oprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp_u_oprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_u_oprt(DmSqlParser.Exp_u_oprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#raw_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_exp(DmSqlParser.Raw_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(DmSqlParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(DmSqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp_pfx_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_pfx_option(DmSqlParser.Exp_pfx_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#exp_invocation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_invocation_option(DmSqlParser.Exp_invocation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#from_first_last_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_first_last_option(DmSqlParser.From_first_last_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#afun_arg_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfun_arg_lst(DmSqlParser.Afun_arg_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#afun_arg_lst_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfun_arg_lst_low(DmSqlParser.Afun_arg_lst_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#in_value_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_value_exp(DmSqlParser.In_value_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#afun_partition_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfun_partition_by(DmSqlParser.Afun_partition_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#afun_windowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfun_windowing(DmSqlParser.Afun_windowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#afun_windowing_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfun_windowing_type(DmSqlParser.Afun_windowing_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#afun_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfun_range_clause(DmSqlParser.Afun_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp(DmSqlParser.PexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_pfx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_pfx(DmSqlParser.Pexp_pfxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_pfx_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_pfx_option(DmSqlParser.Pexp_pfx_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_cast(DmSqlParser.Pexp_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_b(DmSqlParser.Pexp_bContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_a(DmSqlParser.Pexp_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_c(DmSqlParser.Pexp_cContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_c_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_c_insert(DmSqlParser.Pexp_c_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_d(DmSqlParser.Pexp_dContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_e(DmSqlParser.Pexp_eContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_pfx2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_pfx2(DmSqlParser.Pexp_pfx2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_pfx2_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_pfx2_option(DmSqlParser.Pexp_pfx2_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#member2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember2(DmSqlParser.Member2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pexp_c2_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp_c2_insert(DmSqlParser.Pexp_c2_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#member_access2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access2(DmSqlParser.Member_access2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#invocation_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation_expression2(DmSqlParser.Invocation_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(DmSqlParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(DmSqlParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access(DmSqlParser.Member_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#invocation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation_expression(DmSqlParser.Invocation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#invocation_expression_low}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation_expression_low(DmSqlParser.Invocation_expression_lowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlagg_inv_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlagg_inv_expression(DmSqlParser.Xmlagg_inv_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlfun_inv_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlfun_inv_expression(DmSqlParser.Xmlfun_inv_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlele_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlele_name(DmSqlParser.Xmlele_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlele_sub_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlele_sub_lst(DmSqlParser.Xmlele_sub_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlattr_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlattr_lst(DmSqlParser.Xmlattr_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlattr(DmSqlParser.XmlattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#xmlval_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlval_lst(DmSqlParser.Xmlval_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_clause(DmSqlParser.Keep_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#within_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_clause(DmSqlParser.Within_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#typeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeof_expression(DmSqlParser.Typeof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#new_obj_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_obj_expression(DmSqlParser.New_obj_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#new_arr_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_arr_expression(DmSqlParser.New_arr_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#array_creation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_creation_expression(DmSqlParser.Array_creation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#plsql_datatype_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_datatype_ex(DmSqlParser.Plsql_datatype_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#new_array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_array_type(DmSqlParser.New_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opt_array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_array_initializer(DmSqlParser.Opt_array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#array_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_initializer(DmSqlParser.Array_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#variable_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer_list(DmSqlParser.Variable_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#variable_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer(DmSqlParser.Variable_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opt_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_comma(DmSqlParser.Opt_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(DmSqlParser.Sizeof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#element_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_access(DmSqlParser.Element_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#decode_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecode_case(DmSqlParser.Decode_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#else_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_exp(DmSqlParser.Else_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#boolean_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_case(DmSqlParser.Boolean_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#if_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exp(DmSqlParser.If_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bool_when_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_when_list(DmSqlParser.Bool_when_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(DmSqlParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(DmSqlParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#in_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_value_list(DmSqlParser.In_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#value_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list_set(DmSqlParser.Value_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#comma_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_list(DmSqlParser.Comma_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ins_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIns_value_list(DmSqlParser.Ins_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#null_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_value(DmSqlParser.Null_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#id_and_rsvd_word_others}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_and_rsvd_word_others(DmSqlParser.Id_and_rsvd_word_othersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#id_and_rsvd_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_and_rsvd_word(DmSqlParser.Id_and_rsvd_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#stm_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm_param(DmSqlParser.Stm_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#stm_param_normal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm_param_normal(DmSqlParser.Stm_param_normalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#stm_param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm_param_name(DmSqlParser.Stm_param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_name_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name_options(DmSqlParser.Param_name_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#contains_query_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_query_exp(DmSqlParser.Contains_query_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#contains_query_exp_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_query_exp_lst(DmSqlParser.Contains_query_exp_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#contains_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_exp(DmSqlParser.Contains_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#strict_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrict_option(DmSqlParser.Strict_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_unique_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_unique_option(DmSqlParser.With_unique_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#type_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_option(DmSqlParser.Type_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_element(DmSqlParser.Type_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_element_list(DmSqlParser.Type_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_exp(DmSqlParser.Bool_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bool_exp_compound_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_exp_compound_option(DmSqlParser.Bool_exp_compound_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#bool_exp_list_compound_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_exp_list_compound_option(DmSqlParser.Bool_exp_list_compound_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#query_any_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_any_options(DmSqlParser.Query_any_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#global_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_var(DmSqlParser.Global_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sql_reserved_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_reserved_word(DmSqlParser.Sql_reserved_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#reserved_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved_word(DmSqlParser.Reserved_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#new_none_reserved_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_none_reserved_word(DmSqlParser.New_none_reserved_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_nresvd_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_nresvd_word(DmSqlParser.Interval_nresvd_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#variable_resvd_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_resvd_word(DmSqlParser.Variable_resvd_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alias_resvd_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_resvd_word(DmSqlParser.Alias_resvd_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#schname_resvd_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchname_resvd_word(DmSqlParser.Schname_resvd_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#raw_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_id(DmSqlParser.Raw_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DmSqlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(DmSqlParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#qualified_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name2(DmSqlParser.Qualified_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(DmSqlParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#end_loop_label_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_loop_label_null(DmSqlParser.End_loop_label_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label_name_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name_options(DmSqlParser.Label_name_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(DmSqlParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(DmSqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#backup_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_name(DmSqlParser.Backup_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_proc_name(DmSqlParser.Full_proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_proc_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_proc_name2(DmSqlParser.Full_proc_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_fun_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_fun_name(DmSqlParser.Full_fun_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(DmSqlParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_grp_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_grp_name(DmSqlParser.Full_grp_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_table_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name2(DmSqlParser.Full_table_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_partition_name(DmSqlParser.Full_partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_schema_name(DmSqlParser.Full_schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(DmSqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(DmSqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(DmSqlParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_trigger_name(DmSqlParser.Full_trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_trigger_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_trigger_name2(DmSqlParser.Full_trigger_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_view_name(DmSqlParser.Full_view_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_view_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_view_name2(DmSqlParser.Full_view_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(DmSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(DmSqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#login_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin_name(DmSqlParser.Login_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#profile_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfile_name(DmSqlParser.Profile_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_name(DmSqlParser.User_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(DmSqlParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#user_role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_role_name(DmSqlParser.User_role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#role_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name_list(DmSqlParser.Role_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_func_name(DmSqlParser.Full_func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(DmSqlParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(DmSqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#index_name2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name2(DmSqlParser.Index_name2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_old_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_old_name(DmSqlParser.Trig_old_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#trig_new_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrig_new_name(DmSqlParser.Trig_new_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_tv_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_tv_name(DmSqlParser.Full_tv_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_object_name(DmSqlParser.Full_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#orient_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrient_option(DmSqlParser.Orient_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#datepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatepart(DmSqlParser.DatepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#datepart_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatepart_op(DmSqlParser.Datepart_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#datead_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatead_fun(DmSqlParser.Datead_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#returning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning(DmSqlParser.ReturningContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#pretty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPretty(DmSqlParser.PrettyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#wrapper_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapper_flag(DmSqlParser.Wrapper_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#array_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_wrapper(DmSqlParser.Array_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_tail_on_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_tail_on_empty(DmSqlParser.Json_tail_on_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#empty_handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_handle(DmSqlParser.Empty_handleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_tail_on_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_tail_on_error(DmSqlParser.Json_tail_on_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#error_handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_handle(DmSqlParser.Error_handleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(DmSqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(DmSqlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alias_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_2(DmSqlParser.Alias_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(DmSqlParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(DmSqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#unique_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_tag(DmSqlParser.Unique_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#partition_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_tag(DmSqlParser.Partition_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_grant_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_grant_option(DmSqlParser.With_grant_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_admin_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_admin_option(DmSqlParser.With_admin_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#time_zone_or_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_or_local(DmSqlParser.Time_zone_or_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sub_plsql_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_plsql_datatype(DmSqlParser.Sub_plsql_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#datatype_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_list(DmSqlParser.Datatype_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(DmSqlParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#datatype2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype2(DmSqlParser.Datatype2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opr_dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr_dtype(DmSqlParser.Opr_dtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opr_datatype_lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr_datatype_lst(DmSqlParser.Opr_datatype_lstContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#interval_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_qualifier(DmSqlParser.Interval_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(DmSqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dtype1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype1(DmSqlParser.Dtype1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dtype2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype2(DmSqlParser.Dtype2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#double_length_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_length_option(DmSqlParser.Double_length_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#size_unit_caluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_unit_caluse(DmSqlParser.Size_unit_caluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lt_integer_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_integer_negative(DmSqlParser.Lt_integer_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lt_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_integer(DmSqlParser.Lt_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lt_decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_decimal(DmSqlParser.Lt_decimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(DmSqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#create_contextindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_contextindex_stmt(DmSqlParser.Create_contextindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lexer_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_name(DmSqlParser.Lexer_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#lexer_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_clause(DmSqlParser.Lexer_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync(DmSqlParser.SyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#drop_contextindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_contextindex_stmt(DmSqlParser.Drop_contextindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#alter_contextindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_contextindex_stmt(DmSqlParser.Alter_contextindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cti_sync_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCti_sync_option(DmSqlParser.Cti_sync_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(DmSqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sizeof_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_type(DmSqlParser.Sizeof_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(DmSqlParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#builtin_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_types(DmSqlParser.Builtin_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#integral_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_type(DmSqlParser.Integral_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#sql_builtin_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_builtin_types(DmSqlParser.Sql_builtin_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(DmSqlParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_declaration_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration_2(DmSqlParser.Cursor_declaration_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_attrs_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_attrs_options(DmSqlParser.Cursor_attrs_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_attrs(DmSqlParser.Cursor_attrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_attr(DmSqlParser.Cursor_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opt_rank_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_rank_specifier(DmSqlParser.Opt_rank_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rank_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifiers(DmSqlParser.Rank_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#rank_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifier(DmSqlParser.Rank_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opt_dim_separators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_dim_separators(DmSqlParser.Opt_dim_separatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opt_rank_specifier2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_rank_specifier2(DmSqlParser.Opt_rank_specifier2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#dim_separators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_separators(DmSqlParser.Dim_separatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#opt_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_argument_list(DmSqlParser.Opt_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#json_fun_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_fun_tail(DmSqlParser.Json_fun_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#ignore_nulls_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore_nulls_clause(DmSqlParser.Ignore_nulls_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mixed_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_param_list(DmSqlParser.Mixed_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#mixed_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_param(DmSqlParser.Mixed_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(DmSqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option(DmSqlParser.Cursor_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#without_into_select2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithout_into_select2(DmSqlParser.Without_into_select2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#cursor_option_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option_2(DmSqlParser.Cursor_option_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#region_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegion_size(DmSqlParser.Region_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#copy_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_num(DmSqlParser.Copy_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#redundancy_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedundancy_clause(DmSqlParser.Redundancy_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#striping_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStriping_clause(DmSqlParser.Striping_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#with_huge_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_huge_clause(DmSqlParser.With_huge_clauseContext ctx);
}