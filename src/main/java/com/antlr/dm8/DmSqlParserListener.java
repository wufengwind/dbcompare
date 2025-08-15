// Generated from D:/project/dbcompare/src/main/java/com/antlr/dm8/DmSqlParser.g4 by ANTLR 4.13.2
package com.antlr.dm8;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DmSqlParser}.
 */
public interface DmSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dmprogram}.
	 * @param ctx the parse tree
	 */
	void enterDmprogram(DmSqlParser.DmprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dmprogram}.
	 * @param ctx the parse tree
	 */
	void exitDmprogram(DmSqlParser.DmprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(DmSqlParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(DmSqlParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ddlsql}.
	 * @param ctx the parse tree
	 */
	void enterDdlsql(DmSqlParser.DdlsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ddlsql}.
	 * @param ctx the parse tree
	 */
	void exitDdlsql(DmSqlParser.DdlsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dmlsql}.
	 * @param ctx the parse tree
	 */
	void enterDmlsql(DmSqlParser.DmlsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dmlsql}.
	 * @param ctx the parse tree
	 */
	void exitDmlsql(DmSqlParser.DmlsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#privsql}.
	 * @param ctx the parse tree
	 */
	void enterPrivsql(DmSqlParser.PrivsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#privsql}.
	 * @param ctx the parse tree
	 */
	void exitPrivsql(DmSqlParser.PrivsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#othersql}.
	 * @param ctx the parse tree
	 */
	void enterOthersql(DmSqlParser.OthersqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#othersql}.
	 * @param ctx the parse tree
	 */
	void exitOthersql(DmSqlParser.OthersqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#utilsql}.
	 * @param ctx the parse tree
	 */
	void enterUtilsql(DmSqlParser.UtilsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#utilsql}.
	 * @param ctx the parse tree
	 */
	void exitUtilsql(DmSqlParser.UtilsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#explainsql}.
	 * @param ctx the parse tree
	 */
	void enterExplainsql(DmSqlParser.ExplainsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#explainsql}.
	 * @param ctx the parse tree
	 */
	void exitExplainsql(DmSqlParser.ExplainsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#shutdown_stmt}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_stmt(DmSqlParser.Shutdown_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#shutdown_stmt}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_stmt(DmSqlParser.Shutdown_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_diskgroup_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_diskgroup_stmt(DmSqlParser.Alter_diskgroup_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_diskgroup_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_diskgroup_stmt(DmSqlParser.Alter_diskgroup_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(DmSqlParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(DmSqlParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dmsubprogram}.
	 * @param ctx the parse tree
	 */
	void enterDmsubprogram(DmSqlParser.DmsubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dmsubprogram}.
	 * @param ctx the parse tree
	 */
	void exitDmsubprogram(DmSqlParser.DmsubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(DmSqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(DmSqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_var_cur_list_options}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_cur_list_options(DmSqlParser.Decl_var_cur_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_var_cur_list_options}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_cur_list_options(DmSqlParser.Decl_var_cur_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_var_cur_list_1}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_cur_list_1(DmSqlParser.Decl_var_cur_list_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_var_cur_list_1}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_cur_list_1(DmSqlParser.Decl_var_cur_list_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_var_cur_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_cur_list(DmSqlParser.Decl_var_cur_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_var_cur_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_cur_list(DmSqlParser.Decl_var_cur_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_var_cur_item}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_cur_item(DmSqlParser.Decl_var_cur_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_var_cur_item}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_cur_item(DmSqlParser.Decl_var_cur_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_plsql_type}.
	 * @param ctx the parse tree
	 */
	void enterDecl_plsql_type(DmSqlParser.Decl_plsql_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_plsql_type}.
	 * @param ctx the parse tree
	 */
	void exitDecl_plsql_type(DmSqlParser.Decl_plsql_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plsql_type_def}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_type_def(DmSqlParser.Plsql_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plsql_type_def}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_type_def(DmSqlParser.Plsql_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lt_int_lst}.
	 * @param ctx the parse tree
	 */
	void enterLt_int_lst(DmSqlParser.Lt_int_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lt_int_lst}.
	 * @param ctx the parse tree
	 */
	void exitLt_int_lst(DmSqlParser.Lt_int_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rec_item_def_list}.
	 * @param ctx the parse tree
	 */
	void enterRec_item_def_list(DmSqlParser.Rec_item_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rec_item_def_list}.
	 * @param ctx the parse tree
	 */
	void exitRec_item_def_list(DmSqlParser.Rec_item_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rec_item_def}.
	 * @param ctx the parse tree
	 */
	void enterRec_item_def(DmSqlParser.Rec_item_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rec_item_def}.
	 * @param ctx the parse tree
	 */
	void exitRec_item_def(DmSqlParser.Rec_item_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_variable}.
	 * @param ctx the parse tree
	 */
	void enterDecl_variable(DmSqlParser.Decl_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_variable}.
	 * @param ctx the parse tree
	 */
	void exitDecl_variable(DmSqlParser.Decl_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#not_null}.
	 * @param ctx the parse tree
	 */
	void enterNot_null(DmSqlParser.Not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#not_null}.
	 * @param ctx the parse tree
	 */
	void exitNot_null(DmSqlParser.Not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plsql_datatype}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_datatype(DmSqlParser.Plsql_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plsql_datatype}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_datatype(DmSqlParser.Plsql_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_clause_option}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause_option(DmSqlParser.Default_clause_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_clause_option}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause_option(DmSqlParser.Default_clause_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#variable_name_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name_list(DmSqlParser.Variable_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#variable_name_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name_list(DmSqlParser.Variable_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_except}.
	 * @param ctx the parse tree
	 */
	void enterDecl_except(DmSqlParser.Decl_exceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_except}.
	 * @param ctx the parse tree
	 */
	void exitDecl_except(DmSqlParser.Decl_exceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pragma_def}.
	 * @param ctx the parse tree
	 */
	void enterPragma_def(DmSqlParser.Pragma_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pragma_def}.
	 * @param ctx the parse tree
	 */
	void exitPragma_def(DmSqlParser.Pragma_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(DmSqlParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(DmSqlParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plbody}.
	 * @param ctx the parse tree
	 */
	void enterPlbody(DmSqlParser.PlbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plbody}.
	 * @param ctx the parse tree
	 */
	void exitPlbody(DmSqlParser.PlbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ss_plbody}.
	 * @param ctx the parse tree
	 */
	void enterSs_plbody(DmSqlParser.Ss_plbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ss_plbody}.
	 * @param ctx the parse tree
	 */
	void exitSs_plbody(DmSqlParser.Ss_plbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(DmSqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(DmSqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label_list}.
	 * @param ctx the parse tree
	 */
	void enterLabel_list(DmSqlParser.Label_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label_list}.
	 * @param ctx the parse tree
	 */
	void exitLabel_list(DmSqlParser.Label_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label_list_options}.
	 * @param ctx the parse tree
	 */
	void enterLabel_list_options(DmSqlParser.Label_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label_list_options}.
	 * @param ctx the parse tree
	 */
	void exitLabel_list_options(DmSqlParser.Label_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label_demiliter_l}.
	 * @param ctx the parse tree
	 */
	void enterLabel_demiliter_l(DmSqlParser.Label_demiliter_lContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label_demiliter_l}.
	 * @param ctx the parse tree
	 */
	void exitLabel_demiliter_l(DmSqlParser.Label_demiliter_lContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label_demiliter_r}.
	 * @param ctx the parse tree
	 */
	void enterLabel_demiliter_r(DmSqlParser.Label_demiliter_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label_demiliter_r}.
	 * @param ctx the parse tree
	 */
	void exitLabel_demiliter_r(DmSqlParser.Label_demiliter_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plsql}.
	 * @param ctx the parse tree
	 */
	void enterPlsql(DmSqlParser.PlsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plsql}.
	 * @param ctx the parse tree
	 */
	void exitPlsql(DmSqlParser.PlsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ur_option}.
	 * @param ctx the parse tree
	 */
	void enterUr_option(DmSqlParser.Ur_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ur_option}.
	 * @param ctx the parse tree
	 */
	void exitUr_option(DmSqlParser.Ur_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#flashback_trig_enable}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_trig_enable(DmSqlParser.Flashback_trig_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#flashback_trig_enable}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_trig_enable(DmSqlParser.Flashback_trig_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#scn_or_lsn}.
	 * @param ctx the parse tree
	 */
	void enterScn_or_lsn(DmSqlParser.Scn_or_lsnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#scn_or_lsn}.
	 * @param ctx the parse tree
	 */
	void exitScn_or_lsn(DmSqlParser.Scn_or_lsnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_table_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name_list(DmSqlParser.Full_table_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_table_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name_list(DmSqlParser.Full_table_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#flashback_tab_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_tab_stmt(DmSqlParser.Flashback_tab_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#flashback_tab_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_tab_stmt(DmSqlParser.Flashback_tab_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#flashback_tab_element}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_tab_element(DmSqlParser.Flashback_tab_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#flashback_tab_element}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_tab_element(DmSqlParser.Flashback_tab_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(DmSqlParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(DmSqlParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_system_set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_system_set_stmt(DmSqlParser.Alter_system_set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_system_set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_system_set_stmt(DmSqlParser.Alter_system_set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#defer}.
	 * @param ctx the parse tree
	 */
	void enterDefer(DmSqlParser.DeferContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#defer}.
	 * @param ctx the parse tree
	 */
	void exitDefer(DmSqlParser.DeferContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(DmSqlParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(DmSqlParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_session_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session_stmt(DmSqlParser.Alter_session_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_session_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session_stmt(DmSqlParser.Alter_session_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_session_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session_option(DmSqlParser.Alter_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_session_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session_option(DmSqlParser.Alter_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parallel_mode}.
	 * @param ctx the parse tree
	 */
	void enterParallel_mode(DmSqlParser.Parallel_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parallel_mode}.
	 * @param ctx the parse tree
	 */
	void exitParallel_mode(DmSqlParser.Parallel_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parallel_degree}.
	 * @param ctx the parse tree
	 */
	void enterParallel_degree(DmSqlParser.Parallel_degreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parallel_degree}.
	 * @param ctx the parse tree
	 */
	void exitParallel_degree(DmSqlParser.Parallel_degreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#purge}.
	 * @param ctx the parse tree
	 */
	void enterPurge(DmSqlParser.PurgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#purge}.
	 * @param ctx the parse tree
	 */
	void exitPurge(DmSqlParser.PurgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sess_id}.
	 * @param ctx the parse tree
	 */
	void enterSess_id(DmSqlParser.Sess_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sess_id}.
	 * @param ctx the parse tree
	 */
	void exitSess_id(DmSqlParser.Sess_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_time_zone_string}.
	 * @param ctx the parse tree
	 */
	void enterSet_time_zone_string(DmSqlParser.Set_time_zone_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_time_zone_string}.
	 * @param ctx the parse tree
	 */
	void exitSet_time_zone_string(DmSqlParser.Set_time_zone_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sess_attr}.
	 * @param ctx the parse tree
	 */
	void enterSess_attr(DmSqlParser.Sess_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sess_attr}.
	 * @param ctx the parse tree
	 */
	void exitSess_attr(DmSqlParser.Sess_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sess_attr_val}.
	 * @param ctx the parse tree
	 */
	void enterSess_attr_val(DmSqlParser.Sess_attr_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sess_attr_val}.
	 * @param ctx the parse tree
	 */
	void exitSess_attr_val(DmSqlParser.Sess_attr_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema_stmt(DmSqlParser.Set_schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema_stmt(DmSqlParser.Set_schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plblock}.
	 * @param ctx the parse tree
	 */
	void enterPlblock(DmSqlParser.PlblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plblock}.
	 * @param ctx the parse tree
	 */
	void exitPlblock(DmSqlParser.PlblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#except_option}.
	 * @param ctx the parse tree
	 */
	void enterExcept_option(DmSqlParser.Except_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#except_option}.
	 * @param ctx the parse tree
	 */
	void exitExcept_option(DmSqlParser.Except_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#finally_option}.
	 * @param ctx the parse tree
	 */
	void enterFinally_option(DmSqlParser.Finally_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#finally_option}.
	 * @param ctx the parse tree
	 */
	void exitFinally_option(DmSqlParser.Finally_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#finally_tail}.
	 * @param ctx the parse tree
	 */
	void enterFinally_tail(DmSqlParser.Finally_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#finally_tail}.
	 * @param ctx the parse tree
	 */
	void exitFinally_tail(DmSqlParser.Finally_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#except_handler_list}.
	 * @param ctx the parse tree
	 */
	void enterExcept_handler_list(DmSqlParser.Except_handler_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#except_handler_list}.
	 * @param ctx the parse tree
	 */
	void exitExcept_handler_list(DmSqlParser.Except_handler_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#except_handler}.
	 * @param ctx the parse tree
	 */
	void enterExcept_handler(DmSqlParser.Except_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#except_handler}.
	 * @param ctx the parse tree
	 */
	void exitExcept_handler(DmSqlParser.Except_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#except_name}.
	 * @param ctx the parse tree
	 */
	void enterExcept_name(DmSqlParser.Except_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#except_name}.
	 * @param ctx the parse tree
	 */
	void exitExcept_name(DmSqlParser.Except_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#except_list}.
	 * @param ctx the parse tree
	 */
	void enterExcept_list(DmSqlParser.Except_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#except_list}.
	 * @param ctx the parse tree
	 */
	void exitExcept_list(DmSqlParser.Except_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(DmSqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(DmSqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#if_stmt_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_clause(DmSqlParser.If_stmt_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#if_stmt_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_clause(DmSqlParser.If_stmt_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#if_condition_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition_clause(DmSqlParser.If_condition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#if_condition_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition_clause(DmSqlParser.If_condition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#if_then_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_clause(DmSqlParser.If_then_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#if_then_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_clause(DmSqlParser.If_then_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#elseif_lst_option}.
	 * @param ctx the parse tree
	 */
	void enterElseif_lst_option(DmSqlParser.Elseif_lst_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#elseif_lst_option}.
	 * @param ctx the parse tree
	 */
	void exitElseif_lst_option(DmSqlParser.Elseif_lst_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#elseif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElseif_clause(DmSqlParser.Elseif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#elseif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElseif_clause(DmSqlParser.Elseif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#else_option}.
	 * @param ctx the parse tree
	 */
	void enterElse_option(DmSqlParser.Else_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#else_option}.
	 * @param ctx the parse tree
	 */
	void exitElse_option(DmSqlParser.Else_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ss_if_stmt_clause}.
	 * @param ctx the parse tree
	 */
	void enterSs_if_stmt_clause(DmSqlParser.Ss_if_stmt_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ss_if_stmt_clause}.
	 * @param ctx the parse tree
	 */
	void exitSs_if_stmt_clause(DmSqlParser.Ss_if_stmt_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ss_elseif_lst_option}.
	 * @param ctx the parse tree
	 */
	void enterSs_elseif_lst_option(DmSqlParser.Ss_elseif_lst_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ss_elseif_lst_option}.
	 * @param ctx the parse tree
	 */
	void exitSs_elseif_lst_option(DmSqlParser.Ss_elseif_lst_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ss_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void enterSs_elseif_clause(DmSqlParser.Ss_elseif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ss_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void exitSs_elseif_clause(DmSqlParser.Ss_elseif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ss_else_option}.
	 * @param ctx the parse tree
	 */
	void enterSs_else_option(DmSqlParser.Ss_else_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ss_else_option}.
	 * @param ctx the parse tree
	 */
	void exitSs_else_option(DmSqlParser.Ss_else_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(DmSqlParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(DmSqlParser.Case_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plsearched_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterPlsearched_when_clause(DmSqlParser.Plsearched_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plsearched_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitPlsearched_when_clause(DmSqlParser.Plsearched_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plsearched_when_list}.
	 * @param ctx the parse tree
	 */
	void enterPlsearched_when_list(DmSqlParser.Plsearched_when_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plsearched_when_list}.
	 * @param ctx the parse tree
	 */
	void exitPlsearched_when_list(DmSqlParser.Plsearched_when_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#case_option}.
	 * @param ctx the parse tree
	 */
	void enterCase_option(DmSqlParser.Case_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#case_option}.
	 * @param ctx the parse tree
	 */
	void exitCase_option(DmSqlParser.Case_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(DmSqlParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(DmSqlParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#assign_obj}.
	 * @param ctx the parse tree
	 */
	void enterAssign_obj(DmSqlParser.Assign_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#assign_obj}.
	 * @param ctx the parse tree
	 */
	void exitAssign_obj(DmSqlParser.Assign_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#assign_obj2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_obj2(DmSqlParser.Assign_obj2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#assign_obj2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_obj2(DmSqlParser.Assign_obj2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(DmSqlParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(DmSqlParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGoto_stmt(DmSqlParser.Goto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGoto_stmt(DmSqlParser.Goto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(DmSqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(DmSqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(DmSqlParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(DmSqlParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_stmt(DmSqlParser.Repeat_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_stmt(DmSqlParser.Repeat_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(DmSqlParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(DmSqlParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#forall_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForall_stmt(DmSqlParser.Forall_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#forall_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForall_stmt(DmSqlParser.Forall_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#forall_between_option}.
	 * @param ctx the parse tree
	 */
	void enterForall_between_option(DmSqlParser.Forall_between_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#forall_between_option}.
	 * @param ctx the parse tree
	 */
	void exitForall_between_option(DmSqlParser.Forall_between_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#forall_save_exception_option}.
	 * @param ctx the parse tree
	 */
	void enterForall_save_exception_option(DmSqlParser.Forall_save_exception_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#forall_save_exception_option}.
	 * @param ctx the parse tree
	 */
	void exitForall_save_exception_option(DmSqlParser.Forall_save_exception_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#forall_index_values}.
	 * @param ctx the parse tree
	 */
	void enterForall_index_values(DmSqlParser.Forall_index_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#forall_index_values}.
	 * @param ctx the parse tree
	 */
	void exitForall_index_values(DmSqlParser.Forall_index_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#forall_start}.
	 * @param ctx the parse tree
	 */
	void enterForall_start(DmSqlParser.Forall_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#forall_start}.
	 * @param ctx the parse tree
	 */
	void exitForall_start(DmSqlParser.Forall_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#forall_dml_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForall_dml_stmt(DmSqlParser.Forall_dml_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#forall_dml_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForall_dml_stmt(DmSqlParser.Forall_dml_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#in_option}.
	 * @param ctx the parse tree
	 */
	void enterIn_option(DmSqlParser.In_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#in_option}.
	 * @param ctx the parse tree
	 */
	void exitIn_option(DmSqlParser.In_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(DmSqlParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(DmSqlParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pipe_row_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row_stmt(DmSqlParser.Pipe_row_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pipe_row_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row_stmt(DmSqlParser.Pipe_row_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(DmSqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(DmSqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(DmSqlParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(DmSqlParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(DmSqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(DmSqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(DmSqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(DmSqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExecute_stmt(DmSqlParser.Execute_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExecute_stmt(DmSqlParser.Execute_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dyn_return}.
	 * @param ctx the parse tree
	 */
	void enterDyn_return(DmSqlParser.Dyn_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dyn_return}.
	 * @param ctx the parse tree
	 */
	void exitDyn_return(DmSqlParser.Dyn_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(DmSqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(DmSqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#using_exp_list}.
	 * @param ctx the parse tree
	 */
	void enterUsing_exp_list(DmSqlParser.Using_exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#using_exp_list}.
	 * @param ctx the parse tree
	 */
	void exitUsing_exp_list(DmSqlParser.Using_exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#using_exp}.
	 * @param ctx the parse tree
	 */
	void enterUsing_exp(DmSqlParser.Using_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#using_exp}.
	 * @param ctx the parse tree
	 */
	void exitUsing_exp(DmSqlParser.Using_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_proc_stmt(DmSqlParser.Alter_proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_proc_stmt(DmSqlParser.Alter_proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_func_stmt(DmSqlParser.Alter_func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_func_stmt(DmSqlParser.Alter_func_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package_stmt(DmSqlParser.Alter_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package_stmt(DmSqlParser.Alter_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pkg_type}.
	 * @param ctx the parse tree
	 */
	void enterPkg_type(DmSqlParser.Pkg_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pkg_type}.
	 * @param ctx the parse tree
	 */
	void exitPkg_type(DmSqlParser.Pkg_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#declare_opt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_opt(DmSqlParser.Declare_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#declare_opt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_opt(DmSqlParser.Declare_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(DmSqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(DmSqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_stmt(DmSqlParser.Alter_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_stmt(DmSqlParser.Alter_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_index_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_index_name(DmSqlParser.Full_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_index_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_index_name(DmSqlParser.Full_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_index_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_action(DmSqlParser.Alter_index_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_index_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_action(DmSqlParser.Alter_index_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rebuild_clause}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_clause(DmSqlParser.Rebuild_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rebuild_clause}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_clause(DmSqlParser.Rebuild_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exclusive_options}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_options(DmSqlParser.Exclusive_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exclusive_options}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_options(DmSqlParser.Exclusive_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#asynchronous_options}.
	 * @param ctx the parse tree
	 */
	void enterAsynchronous_options(DmSqlParser.Asynchronous_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#asynchronous_options}.
	 * @param ctx the parse tree
	 */
	void exitAsynchronous_options(DmSqlParser.Asynchronous_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#visible_clause}.
	 * @param ctx the parse tree
	 */
	void enterVisible_clause(DmSqlParser.Visible_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#visible_clause}.
	 * @param ctx the parse tree
	 */
	void exitVisible_clause(DmSqlParser.Visible_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_def_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_list(DmSqlParser.Column_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_def_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_list(DmSqlParser.Column_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lock}.
	 * @param ctx the parse tree
	 */
	void enterLock(DmSqlParser.LockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lock}.
	 * @param ctx the parse tree
	 */
	void exitLock(DmSqlParser.LockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_table_partition_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_partition_action(DmSqlParser.Alter_table_partition_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_table_partition_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_partition_action(DmSqlParser.Alter_table_partition_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#template_info}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_info(DmSqlParser.Template_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#template_info}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_info(DmSqlParser.Template_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#template_item_2}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_item_2(DmSqlParser.Template_item_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#template_item_2}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_item_2(DmSqlParser.Template_item_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#template_item_1}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_item_1(DmSqlParser.Template_item_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#template_item_1}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_item_1(DmSqlParser.Template_item_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#including_indexes}.
	 * @param ctx the parse tree
	 */
	void enterIncluding_indexes(DmSqlParser.Including_indexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#including_indexes}.
	 * @param ctx the parse tree
	 */
	void exitIncluding_indexes(DmSqlParser.Including_indexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#truncate_partition_name}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_partition_name(DmSqlParser.Truncate_partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#truncate_partition_name}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_partition_name(DmSqlParser.Truncate_partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cons_enable}.
	 * @param ctx the parse tree
	 */
	void enterCons_enable(DmSqlParser.Cons_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cons_enable}.
	 * @param ctx the parse tree
	 */
	void exitCons_enable(DmSqlParser.Cons_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#reuse_storage_option}.
	 * @param ctx the parse tree
	 */
	void enterReuse_storage_option(DmSqlParser.Reuse_storage_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#reuse_storage_option}.
	 * @param ctx the parse tree
	 */
	void exitReuse_storage_option(DmSqlParser.Reuse_storage_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_table_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_action(DmSqlParser.Alter_table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_table_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_action(DmSqlParser.Alter_table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fast_flag}.
	 * @param ctx the parse tree
	 */
	void enterFast_flag(DmSqlParser.Fast_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fast_flag}.
	 * @param ctx the parse tree
	 */
	void exitFast_flag(DmSqlParser.Fast_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_stat_flag}.
	 * @param ctx the parse tree
	 */
	void enterStorage_stat_flag(DmSqlParser.Storage_stat_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_stat_flag}.
	 * @param ctx the parse tree
	 */
	void exitStorage_stat_flag(DmSqlParser.Storage_stat_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_stat_cols}.
	 * @param ctx the parse tree
	 */
	void enterStorage_stat_cols(DmSqlParser.Storage_stat_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_stat_cols}.
	 * @param ctx the parse tree
	 */
	void exitStorage_stat_cols(DmSqlParser.Storage_stat_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hfs_rebuild_level}.
	 * @param ctx the parse tree
	 */
	void enterHfs_rebuild_level(DmSqlParser.Hfs_rebuild_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hfs_rebuild_level}.
	 * @param ctx the parse tree
	 */
	void exitHfs_rebuild_level(DmSqlParser.Hfs_rebuild_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ata_lock_option}.
	 * @param ctx the parse tree
	 */
	void enterAta_lock_option(DmSqlParser.Ata_lock_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ata_lock_option}.
	 * @param ctx the parse tree
	 */
	void exitAta_lock_option(DmSqlParser.Ata_lock_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mdf_column_def_list}.
	 * @param ctx the parse tree
	 */
	void enterMdf_column_def_list(DmSqlParser.Mdf_column_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mdf_column_def_list}.
	 * @param ctx the parse tree
	 */
	void exitMdf_column_def_list(DmSqlParser.Mdf_column_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mdf_column_def}.
	 * @param ctx the parse tree
	 */
	void enterMdf_column_def(DmSqlParser.Mdf_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mdf_column_def}.
	 * @param ctx the parse tree
	 */
	void exitMdf_column_def(DmSqlParser.Mdf_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(DmSqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(DmSqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_def_ex}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_ex(DmSqlParser.Column_def_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_def_ex}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_ex(DmSqlParser.Column_def_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_def_low}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_low(DmSqlParser.Column_def_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_def_low}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_low(DmSqlParser.Column_def_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#virtual_column_datatype}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_datatype(DmSqlParser.Virtual_column_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#virtual_column_datatype}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_datatype(DmSqlParser.Virtual_column_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#virtual_column_generated}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_generated(DmSqlParser.Virtual_column_generatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#virtual_column_generated}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_generated(DmSqlParser.Virtual_column_generatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#virtual_column_virtual}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_virtual(DmSqlParser.Virtual_column_virtualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#virtual_column_virtual}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_virtual(DmSqlParser.Virtual_column_virtualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#virtual_column_visible}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_visible(DmSqlParser.Virtual_column_visibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#virtual_column_visible}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_visible(DmSqlParser.Virtual_column_visibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#virtual_column_def}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_def(DmSqlParser.Virtual_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#virtual_column_def}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_def(DmSqlParser.Virtual_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#charset_option}.
	 * @param ctx the parse tree
	 */
	void enterCharset_option(DmSqlParser.Charset_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#charset_option}.
	 * @param ctx the parse tree
	 */
	void exitCharset_option(DmSqlParser.Charset_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_def_4_option}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_4_option(DmSqlParser.Column_def_4_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_def_4_option}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_4_option(DmSqlParser.Column_def_4_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#auto_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterAuto_update_clause(DmSqlParser.Auto_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#auto_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitAuto_update_clause(DmSqlParser.Auto_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_exp}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_exp(DmSqlParser.Update_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_exp}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_exp(DmSqlParser.Update_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#identity_clause}.
	 * @param ctx the parse tree
	 */
	void enterIdentity_clause(DmSqlParser.Identity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#identity_clause}.
	 * @param ctx the parse tree
	 */
	void exitIdentity_clause(DmSqlParser.Identity_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_clause_with_on_null_opt}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause_with_on_null_opt(DmSqlParser.Default_clause_with_on_null_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_clause_with_on_null_opt}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause_with_on_null_opt(DmSqlParser.Default_clause_with_on_null_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(DmSqlParser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(DmSqlParser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_exp}.
	 * @param ctx the parse tree
	 */
	void enterDefault_exp(DmSqlParser.Default_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_exp}.
	 * @param ctx the parse tree
	 */
	void exitDefault_exp(DmSqlParser.Default_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_constraint_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_def(DmSqlParser.Column_constraint_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_constraint_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_def(DmSqlParser.Column_constraint_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_name_def_options}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name_def_options(DmSqlParser.Constraint_name_def_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_name_def_options}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name_def_options(DmSqlParser.Constraint_name_def_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_name_def}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name_def(DmSqlParser.Constraint_name_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_name_def}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name_def(DmSqlParser.Constraint_name_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraints(DmSqlParser.Column_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraints(DmSqlParser.Column_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(DmSqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(DmSqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_constraint_action}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_action(DmSqlParser.Column_constraint_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_constraint_action}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_action(DmSqlParser.Column_constraint_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#not_null_spec}.
	 * @param ctx the parse tree
	 */
	void enterNot_null_spec(DmSqlParser.Not_null_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#not_null_spec}.
	 * @param ctx the parse tree
	 */
	void exitNot_null_spec(DmSqlParser.Not_null_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unique_spec}.
	 * @param ctx the parse tree
	 */
	void enterUnique_spec(DmSqlParser.Unique_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unique_spec}.
	 * @param ctx the parse tree
	 */
	void exitUnique_spec(DmSqlParser.Unique_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#refs_spec}.
	 * @param ctx the parse tree
	 */
	void enterRefs_spec(DmSqlParser.Refs_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#refs_spec}.
	 * @param ctx the parse tree
	 */
	void exitRefs_spec(DmSqlParser.Refs_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#refs_spec_action}.
	 * @param ctx the parse tree
	 */
	void enterRefs_spec_action(DmSqlParser.Refs_spec_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#refs_spec_action}.
	 * @param ctx the parse tree
	 */
	void exitRefs_spec_action(DmSqlParser.Refs_spec_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key(DmSqlParser.Foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key(DmSqlParser.Foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#refd_table_and_columns}.
	 * @param ctx the parse tree
	 */
	void enterRefd_table_and_columns(DmSqlParser.Refd_table_and_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#refd_table_and_columns}.
	 * @param ctx the parse tree
	 */
	void exitRefd_table_and_columns(DmSqlParser.Refd_table_and_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ref_column_list}.
	 * @param ctx the parse tree
	 */
	void enterRef_column_list(DmSqlParser.Ref_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ref_column_list}.
	 * @param ctx the parse tree
	 */
	void exitRef_column_list(DmSqlParser.Ref_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(DmSqlParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(DmSqlParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_list2}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list2(DmSqlParser.Column_list2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_list2}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list2(DmSqlParser.Column_list2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_column_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_list(DmSqlParser.Full_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_column_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_list(DmSqlParser.Full_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_list_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_list(DmSqlParser.Column_list_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_list_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_list(DmSqlParser.Column_list_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_column_list}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_list(DmSqlParser.Drop_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_column_list}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_list(DmSqlParser.Drop_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#match_option}.
	 * @param ctx the parse tree
	 */
	void enterMatch_option(DmSqlParser.Match_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#match_option}.
	 * @param ctx the parse tree
	 */
	void exitMatch_option(DmSqlParser.Match_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#match_type}.
	 * @param ctx the parse tree
	 */
	void enterMatch_type(DmSqlParser.Match_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#match_type}.
	 * @param ctx the parse tree
	 */
	void exitMatch_type(DmSqlParser.Match_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ref_triggered_action}.
	 * @param ctx the parse tree
	 */
	void enterRef_triggered_action(DmSqlParser.Ref_triggered_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ref_triggered_action}.
	 * @param ctx the parse tree
	 */
	void exitRef_triggered_action(DmSqlParser.Ref_triggered_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_rule}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_rule(DmSqlParser.Update_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_rule}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_rule(DmSqlParser.Update_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#delete_rule}.
	 * @param ctx the parse tree
	 */
	void enterDelete_rule(DmSqlParser.Delete_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#delete_rule}.
	 * @param ctx the parse tree
	 */
	void exitDelete_rule(DmSqlParser.Delete_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ref_action}.
	 * @param ctx the parse tree
	 */
	void enterRef_action(DmSqlParser.Ref_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ref_action}.
	 * @param ctx the parse tree
	 */
	void exitRef_action(DmSqlParser.Ref_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#check_constraint_def}.
	 * @param ctx the parse tree
	 */
	void enterCheck_constraint_def(DmSqlParser.Check_constraint_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#check_constraint_def}.
	 * @param ctx the parse tree
	 */
	void exitCheck_constraint_def(DmSqlParser.Check_constraint_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#check_condition}.
	 * @param ctx the parse tree
	 */
	void enterCheck_condition(DmSqlParser.Check_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#check_condition}.
	 * @param ctx the parse tree
	 */
	void exitCheck_condition(DmSqlParser.Check_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restrict_cascade}.
	 * @param ctx the parse tree
	 */
	void enterRestrict_cascade(DmSqlParser.Restrict_cascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restrict_cascade}.
	 * @param ctx the parse tree
	 */
	void exitRestrict_cascade(DmSqlParser.Restrict_cascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cascade_opt}.
	 * @param ctx the parse tree
	 */
	void enterCascade_opt(DmSqlParser.Cascade_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cascade_opt}.
	 * @param ctx the parse tree
	 */
	void exitCascade_opt(DmSqlParser.Cascade_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_name_options}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name_options(DmSqlParser.Constraint_name_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_name_options}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name_options(DmSqlParser.Constraint_name_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#check_option_def_true}.
	 * @param ctx the parse tree
	 */
	void enterCheck_option_def_true(DmSqlParser.Check_option_def_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#check_option_def_true}.
	 * @param ctx the parse tree
	 */
	void exitCheck_option_def_true(DmSqlParser.Check_option_def_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_attributes_options}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_attributes_options(DmSqlParser.Constraint_attributes_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_attributes_options}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_attributes_options(DmSqlParser.Constraint_attributes_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_attributes}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_attributes(DmSqlParser.Constraint_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_attributes}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_attributes(DmSqlParser.Constraint_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#deferrable_option}.
	 * @param ctx the parse tree
	 */
	void enterDeferrable_option(DmSqlParser.Deferrable_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#deferrable_option}.
	 * @param ctx the parse tree
	 */
	void exitDeferrable_option(DmSqlParser.Deferrable_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_check_time}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_check_time(DmSqlParser.Constraint_check_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_check_time}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_check_time(DmSqlParser.Constraint_check_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_clause(DmSqlParser.Table_constraint_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_clause(DmSqlParser.Table_constraint_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(DmSqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(DmSqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_index_clause(DmSqlParser.Using_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_index_clause(DmSqlParser.Using_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(DmSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(DmSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger_stmt(DmSqlParser.Alter_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger_stmt(DmSqlParser.Alter_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_trigger_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger_option(DmSqlParser.Alter_trigger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_trigger_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger_option(DmSqlParser.Alter_trigger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_table_partition_action_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_partition_action_options(DmSqlParser.Alter_table_partition_action_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_table_partition_action_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_partition_action_options(DmSqlParser.Alter_table_partition_action_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#refresh_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRefresh_materialized_view_stmt(DmSqlParser.Refresh_materialized_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#refresh_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRefresh_materialized_view_stmt(DmSqlParser.Refresh_materialized_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#complete_del_null}.
	 * @param ctx the parse tree
	 */
	void enterComplete_del_null(DmSqlParser.Complete_del_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#complete_del_null}.
	 * @param ctx the parse tree
	 */
	void exitComplete_del_null(DmSqlParser.Complete_del_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#refresh_complete_del}.
	 * @param ctx the parse tree
	 */
	void enterRefresh_complete_del(DmSqlParser.Refresh_complete_delContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#refresh_complete_del}.
	 * @param ctx the parse tree
	 */
	void exitRefresh_complete_del(DmSqlParser.Refresh_complete_delContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_materialized_view_stmt(DmSqlParser.Alter_materialized_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_materialized_view_stmt(DmSqlParser.Alter_materialized_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_stmt(DmSqlParser.Alter_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_stmt(DmSqlParser.Alter_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_view_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_action(DmSqlParser.Alter_view_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_view_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_action(DmSqlParser.Alter_view_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cons_novalidate}.
	 * @param ctx the parse tree
	 */
	void enterCons_novalidate(DmSqlParser.Cons_novalidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cons_novalidate}.
	 * @param ctx the parse tree
	 */
	void exitCons_novalidate(DmSqlParser.Cons_novalidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void enterView_constraint_clause(DmSqlParser.View_constraint_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void exitView_constraint_clause(DmSqlParser.View_constraint_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_constraint}.
	 * @param ctx the parse tree
	 */
	void enterView_constraint(DmSqlParser.View_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_constraint}.
	 * @param ctx the parse tree
	 */
	void exitView_constraint(DmSqlParser.View_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_unique_spec}.
	 * @param ctx the parse tree
	 */
	void enterView_unique_spec(DmSqlParser.View_unique_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_unique_spec}.
	 * @param ctx the parse tree
	 */
	void exitView_unique_spec(DmSqlParser.View_unique_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_refs_spec}.
	 * @param ctx the parse tree
	 */
	void enterView_refs_spec(DmSqlParser.View_refs_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_refs_spec}.
	 * @param ctx the parse tree
	 */
	void exitView_refs_spec(DmSqlParser.View_refs_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_refs_spec_action}.
	 * @param ctx the parse tree
	 */
	void enterView_refs_spec_action(DmSqlParser.View_refs_spec_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_refs_spec_action}.
	 * @param ctx the parse tree
	 */
	void exitView_refs_spec_action(DmSqlParser.View_refs_spec_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#call_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_proc_stmt(DmSqlParser.Call_proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#call_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_proc_stmt(DmSqlParser.Call_proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#raw_call_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaw_call_proc_stmt(DmSqlParser.Raw_call_proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#raw_call_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaw_call_proc_stmt(DmSqlParser.Raw_call_proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#call_proc_stmt_2}.
	 * @param ctx the parse tree
	 */
	void enterCall_proc_stmt_2(DmSqlParser.Call_proc_stmt_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#call_proc_stmt_2}.
	 * @param ctx the parse tree
	 */
	void exitCall_proc_stmt_2(DmSqlParser.Call_proc_stmt_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exec_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_proc_stmt(DmSqlParser.Exec_proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exec_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_proc_stmt(DmSqlParser.Exec_proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dblink_clause}.
	 * @param ctx the parse tree
	 */
	void enterDblink_clause(DmSqlParser.Dblink_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dblink_clause}.
	 * @param ctx the parse tree
	 */
	void exitDblink_clause(DmSqlParser.Dblink_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dblink_clause2}.
	 * @param ctx the parse tree
	 */
	void enterDblink_clause2(DmSqlParser.Dblink_clause2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dblink_clause2}.
	 * @param ctx the parse tree
	 */
	void exitDblink_clause2(DmSqlParser.Dblink_clause2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(DmSqlParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(DmSqlParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DmSqlParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DmSqlParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#raw_exp_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_exp_list(DmSqlParser.Raw_exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#raw_exp_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_exp_list(DmSqlParser.Raw_exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp_list_2}.
	 * @param ctx the parse tree
	 */
	void enterExp_list_2(DmSqlParser.Exp_list_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp_list_2}.
	 * @param ctx the parse tree
	 */
	void exitExp_list_2(DmSqlParser.Exp_list_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(DmSqlParser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(DmSqlParser.Exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ins_exp_list}.
	 * @param ctx the parse tree
	 */
	void enterIns_exp_list(DmSqlParser.Ins_exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ins_exp_list}.
	 * @param ctx the parse tree
	 */
	void exitIns_exp_list(DmSqlParser.Ins_exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lt_exp}.
	 * @param ctx the parse tree
	 */
	void enterLt_exp(DmSqlParser.Lt_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lt_exp}.
	 * @param ctx the parse tree
	 */
	void exitLt_exp(DmSqlParser.Lt_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_partition_exp}.
	 * @param ctx the parse tree
	 */
	void enterRange_partition_exp(DmSqlParser.Range_partition_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_partition_exp}.
	 * @param ctx the parse tree
	 */
	void exitRange_partition_exp(DmSqlParser.Range_partition_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_partition_exp_list}.
	 * @param ctx the parse tree
	 */
	void enterRange_partition_exp_list(DmSqlParser.Range_partition_exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_partition_exp_list}.
	 * @param ctx the parse tree
	 */
	void exitRange_partition_exp_list(DmSqlParser.Range_partition_exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_partition_exp}.
	 * @param ctx the parse tree
	 */
	void enterList_partition_exp(DmSqlParser.List_partition_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_partition_exp}.
	 * @param ctx the parse tree
	 */
	void exitList_partition_exp(DmSqlParser.List_partition_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_partition_exp_list}.
	 * @param ctx the parse tree
	 */
	void enterList_partition_exp_list(DmSqlParser.List_partition_exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_partition_exp_list}.
	 * @param ctx the parse tree
	 */
	void exitList_partition_exp_list(DmSqlParser.List_partition_exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_partition_value_list}.
	 * @param ctx the parse tree
	 */
	void enterList_partition_value_list(DmSqlParser.List_partition_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_partition_value_list}.
	 * @param ctx the parse tree
	 */
	void exitList_partition_value_list(DmSqlParser.List_partition_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#close_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_cursor_stmt(DmSqlParser.Close_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#close_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_cursor_stmt(DmSqlParser.Close_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_cursor_statement(DmSqlParser.Close_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_cursor_statement(DmSqlParser.Close_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#begin_trans_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_trans_stmt(DmSqlParser.Begin_trans_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#begin_trans_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_trans_stmt(DmSqlParser.Begin_trans_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#commit_trans_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_trans_stmt(DmSqlParser.Commit_trans_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#commit_trans_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_trans_stmt(DmSqlParser.Commit_trans_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#commit_head}.
	 * @param ctx the parse tree
	 */
	void enterCommit_head(DmSqlParser.Commit_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#commit_head}.
	 * @param ctx the parse tree
	 */
	void exitCommit_head(DmSqlParser.Commit_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#commit_tail}.
	 * @param ctx the parse tree
	 */
	void enterCommit_tail(DmSqlParser.Commit_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#commit_tail}.
	 * @param ctx the parse tree
	 */
	void exitCommit_tail(DmSqlParser.Commit_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#commit_wait_immed_option}.
	 * @param ctx the parse tree
	 */
	void enterCommit_wait_immed_option(DmSqlParser.Commit_wait_immed_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#commit_wait_immed_option}.
	 * @param ctx the parse tree
	 */
	void exitCommit_wait_immed_option(DmSqlParser.Commit_wait_immed_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#connect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConnect_stmt(DmSqlParser.Connect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#connect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConnect_stmt(DmSqlParser.Connect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(DmSqlParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(DmSqlParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ts_storage}.
	 * @param ctx the parse tree
	 */
	void enterTs_storage(DmSqlParser.Ts_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ts_storage}.
	 * @param ctx the parse tree
	 */
	void exitTs_storage(DmSqlParser.Ts_storageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ts_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterTs_storage_clause(DmSqlParser.Ts_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ts_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitTs_storage_clause(DmSqlParser.Ts_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace_stmt(DmSqlParser.Create_tablespace_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace_stmt(DmSqlParser.Create_tablespace_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctss_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterCtss_with_clause(DmSqlParser.Ctss_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctss_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitCtss_with_clause(DmSqlParser.Ctss_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_tablespace_set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace_set_stmt(DmSqlParser.Create_tablespace_set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_tablespace_set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace_set_stmt(DmSqlParser.Create_tablespace_set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_tablespace_set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace_set_stmt(DmSqlParser.Alter_tablespace_set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_tablespace_set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace_set_stmt(DmSqlParser.Alter_tablespace_set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cache}.
	 * @param ctx the parse tree
	 */
	void enterCache(DmSqlParser.CacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cache}.
	 * @param ctx the parse tree
	 */
	void exitCache(DmSqlParser.CacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace_stmt(DmSqlParser.Alter_tablespace_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace_stmt(DmSqlParser.Alter_tablespace_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#keep}.
	 * @param ctx the parse tree
	 */
	void enterKeep(DmSqlParser.KeepContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#keep}.
	 * @param ctx the parse tree
	 */
	void exitKeep(DmSqlParser.KeepContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace_action(DmSqlParser.Alter_tablespace_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace_action(DmSqlParser.Alter_tablespace_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#file_list}.
	 * @param ctx the parse tree
	 */
	void enterFile_list(DmSqlParser.File_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#file_list}.
	 * @param ctx the parse tree
	 */
	void exitFile_list(DmSqlParser.File_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pathname_list}.
	 * @param ctx the parse tree
	 */
	void enterPathname_list(DmSqlParser.Pathname_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pathname_list}.
	 * @param ctx the parse tree
	 */
	void exitPathname_list(DmSqlParser.Pathname_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#integer_list}.
	 * @param ctx the parse tree
	 */
	void enterInteger_list(DmSqlParser.Integer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#integer_list}.
	 * @param ctx the parse tree
	 */
	void exitInteger_list(DmSqlParser.Integer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(DmSqlParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(DmSqlParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mirror}.
	 * @param ctx the parse tree
	 */
	void enterMirror(DmSqlParser.MirrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mirror}.
	 * @param ctx the parse tree
	 */
	void exitMirror(DmSqlParser.MirrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#autoextend_nextsize}.
	 * @param ctx the parse tree
	 */
	void enterAutoextend_nextsize(DmSqlParser.Autoextend_nextsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#autoextend_nextsize}.
	 * @param ctx the parse tree
	 */
	void exitAutoextend_nextsize(DmSqlParser.Autoextend_nextsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#autoextend_maxsize}.
	 * @param ctx the parse tree
	 */
	void enterAutoextend_maxsize(DmSqlParser.Autoextend_maxsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#autoextend_maxsize}.
	 * @param ctx the parse tree
	 */
	void exitAutoextend_maxsize(DmSqlParser.Autoextend_maxsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#autoextend}.
	 * @param ctx the parse tree
	 */
	void enterAutoextend(DmSqlParser.AutoextendContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#autoextend}.
	 * @param ctx the parse tree
	 */
	void exitAutoextend(DmSqlParser.AutoextendContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#on_raft}.
	 * @param ctx the parse tree
	 */
	void enterOn_raft(DmSqlParser.On_raftContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#on_raft}.
	 * @param ctx the parse tree
	 */
	void exitOn_raft(DmSqlParser.On_raftContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#archfile}.
	 * @param ctx the parse tree
	 */
	void enterArchfile(DmSqlParser.ArchfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#archfile}.
	 * @param ctx the parse tree
	 */
	void exitArchfile(DmSqlParser.ArchfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#archflag}.
	 * @param ctx the parse tree
	 */
	void enterArchflag(DmSqlParser.ArchflagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#archflag}.
	 * @param ctx the parse tree
	 */
	void exitArchflag(DmSqlParser.ArchflagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#archstyle_options}.
	 * @param ctx the parse tree
	 */
	void enterArchstyle_options(DmSqlParser.Archstyle_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#archstyle_options}.
	 * @param ctx the parse tree
	 */
	void exitArchstyle_options(DmSqlParser.Archstyle_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#archstyle}.
	 * @param ctx the parse tree
	 */
	void enterArchstyle(DmSqlParser.ArchstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#archstyle}.
	 * @param ctx the parse tree
	 */
	void exitArchstyle(DmSqlParser.ArchstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#archdir}.
	 * @param ctx the parse tree
	 */
	void enterArchdir(DmSqlParser.ArchdirContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#archdir}.
	 * @param ctx the parse tree
	 */
	void exitArchdir(DmSqlParser.ArchdirContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bakfile}.
	 * @param ctx the parse tree
	 */
	void enterBakfile(DmSqlParser.BakfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bakfile}.
	 * @param ctx the parse tree
	 */
	void exitBakfile(DmSqlParser.BakfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parameters_option_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_option_list(DmSqlParser.Parameters_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parameters_option_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_option_list(DmSqlParser.Parameters_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parameter_option_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_option_list(DmSqlParser.Parameter_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parameter_option_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_option_list(DmSqlParser.Parameter_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parameter_option}.
	 * @param ctx the parse tree
	 */
	void enterParameter_option(DmSqlParser.Parameter_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parameter_option}.
	 * @param ctx the parse tree
	 */
	void exitParameter_option(DmSqlParser.Parameter_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pathname}.
	 * @param ctx the parse tree
	 */
	void enterPathname(DmSqlParser.PathnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pathname}.
	 * @param ctx the parse tree
	 */
	void exitPathname(DmSqlParser.PathnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pathname_options}.
	 * @param ctx the parse tree
	 */
	void enterPathname_options(DmSqlParser.Pathname_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pathname_options}.
	 * @param ctx the parse tree
	 */
	void exitPathname_options(DmSqlParser.Pathname_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBackup_stmt(DmSqlParser.Backup_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBackup_stmt(DmSqlParser.Backup_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#back_range_option}.
	 * @param ctx the parse tree
	 */
	void enterBack_range_option(DmSqlParser.Back_range_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#back_range_option}.
	 * @param ctx the parse tree
	 */
	void exitBack_range_option(DmSqlParser.Back_range_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#back_archive_spec_null}.
	 * @param ctx the parse tree
	 */
	void enterBack_archive_spec_null(DmSqlParser.Back_archive_spec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#back_archive_spec_null}.
	 * @param ctx the parse tree
	 */
	void exitBack_archive_spec_null(DmSqlParser.Back_archive_spec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#not_backed_up}.
	 * @param ctx the parse tree
	 */
	void enterNot_backed_up(DmSqlParser.Not_backed_upContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#not_backed_up}.
	 * @param ctx the parse tree
	 */
	void exitNot_backed_up(DmSqlParser.Not_backed_upContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#archive_spec}.
	 * @param ctx the parse tree
	 */
	void enterArchive_spec(DmSqlParser.Archive_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#archive_spec}.
	 * @param ctx the parse tree
	 */
	void exitArchive_spec(DmSqlParser.Archive_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#spec_lsn}.
	 * @param ctx the parse tree
	 */
	void enterSpec_lsn(DmSqlParser.Spec_lsnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#spec_lsn}.
	 * @param ctx the parse tree
	 */
	void exitSpec_lsn(DmSqlParser.Spec_lsnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_delete_archive}.
	 * @param ctx the parse tree
	 */
	void enterBackup_delete_archive(DmSqlParser.Backup_delete_archiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_delete_archive}.
	 * @param ctx the parse tree
	 */
	void exitBackup_delete_archive(DmSqlParser.Backup_delete_archiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_options}.
	 * @param ctx the parse tree
	 */
	void enterBackup_options(DmSqlParser.Backup_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_options}.
	 * @param ctx the parse tree
	 */
	void exitBackup_options(DmSqlParser.Backup_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cumulative}.
	 * @param ctx the parse tree
	 */
	void enterCumulative(DmSqlParser.CumulativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cumulative}.
	 * @param ctx the parse tree
	 */
	void exitCumulative(DmSqlParser.CumulativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_bak_dir_list}.
	 * @param ctx the parse tree
	 */
	void enterWith_bak_dir_list(DmSqlParser.With_bak_dir_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_bak_dir_list}.
	 * @param ctx the parse tree
	 */
	void exitWith_bak_dir_list(DmSqlParser.With_bak_dir_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#base_on_backup}.
	 * @param ctx the parse tree
	 */
	void enterBase_on_backup(DmSqlParser.Base_on_backupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#base_on_backup}.
	 * @param ctx the parse tree
	 */
	void exitBase_on_backup(DmSqlParser.Base_on_backupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_to_options}.
	 * @param ctx the parse tree
	 */
	void enterBackup_to_options(DmSqlParser.Backup_to_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_to_options}.
	 * @param ctx the parse tree
	 */
	void exitBackup_to_options(DmSqlParser.Backup_to_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_path_null}.
	 * @param ctx the parse tree
	 */
	void enterBackup_path_null(DmSqlParser.Backup_path_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_path_null}.
	 * @param ctx the parse tree
	 */
	void exitBackup_path_null(DmSqlParser.Backup_path_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#device_type}.
	 * @param ctx the parse tree
	 */
	void enterDevice_type(DmSqlParser.Device_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#device_type}.
	 * @param ctx the parse tree
	 */
	void exitDevice_type(DmSqlParser.Device_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parms_command}.
	 * @param ctx the parse tree
	 */
	void enterParms_command(DmSqlParser.Parms_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parms_command}.
	 * @param ctx the parse tree
	 */
	void exitParms_command(DmSqlParser.Parms_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#media_name}.
	 * @param ctx the parse tree
	 */
	void enterMedia_name(DmSqlParser.Media_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#media_name}.
	 * @param ctx the parse tree
	 */
	void exitMedia_name(DmSqlParser.Media_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_desc_options}.
	 * @param ctx the parse tree
	 */
	void enterBackup_desc_options(DmSqlParser.Backup_desc_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_desc_options}.
	 * @param ctx the parse tree
	 */
	void exitBackup_desc_options(DmSqlParser.Backup_desc_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_desc}.
	 * @param ctx the parse tree
	 */
	void enterBackup_desc(DmSqlParser.Backup_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_desc}.
	 * @param ctx the parse tree
	 */
	void exitBackup_desc(DmSqlParser.Backup_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_maxsize}.
	 * @param ctx the parse tree
	 */
	void enterBackup_maxsize(DmSqlParser.Backup_maxsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_maxsize}.
	 * @param ctx the parse tree
	 */
	void exitBackup_maxsize(DmSqlParser.Backup_maxsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_limit}.
	 * @param ctx the parse tree
	 */
	void enterBackup_limit(DmSqlParser.Backup_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_limit}.
	 * @param ctx the parse tree
	 */
	void exitBackup_limit(DmSqlParser.Backup_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_identified}.
	 * @param ctx the parse tree
	 */
	void enterBackup_identified(DmSqlParser.Backup_identifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_identified}.
	 * @param ctx the parse tree
	 */
	void exitBackup_identified(DmSqlParser.Backup_identifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_compressed}.
	 * @param ctx the parse tree
	 */
	void enterBackup_compressed(DmSqlParser.Backup_compressedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_compressed}.
	 * @param ctx the parse tree
	 */
	void exitBackup_compressed(DmSqlParser.Backup_compressedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_without}.
	 * @param ctx the parse tree
	 */
	void enterBackup_without(DmSqlParser.Backup_withoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_without}.
	 * @param ctx the parse tree
	 */
	void exitBackup_without(DmSqlParser.Backup_withoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_tsk_thread_num_null}.
	 * @param ctx the parse tree
	 */
	void enterBackup_tsk_thread_num_null(DmSqlParser.Backup_tsk_thread_num_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_tsk_thread_num_null}.
	 * @param ctx the parse tree
	 */
	void exitBackup_tsk_thread_num_null(DmSqlParser.Backup_tsk_thread_num_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_parallel_dir}.
	 * @param ctx the parse tree
	 */
	void enterBackup_parallel_dir(DmSqlParser.Backup_parallel_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_parallel_dir}.
	 * @param ctx the parse tree
	 */
	void exitBackup_parallel_dir(DmSqlParser.Backup_parallel_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_trace_file_level}.
	 * @param ctx the parse tree
	 */
	void enterBackup_trace_file_level(DmSqlParser.Backup_trace_file_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_trace_file_level}.
	 * @param ctx the parse tree
	 */
	void exitBackup_trace_file_level(DmSqlParser.Backup_trace_file_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRestore_stmt(DmSqlParser.Restore_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRestore_stmt(DmSqlParser.Restore_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_datafile_lst}.
	 * @param ctx the parse tree
	 */
	void enterRestore_datafile_lst(DmSqlParser.Restore_datafile_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_datafile_lst}.
	 * @param ctx the parse tree
	 */
	void exitRestore_datafile_lst(DmSqlParser.Restore_datafile_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_mapped_file}.
	 * @param ctx the parse tree
	 */
	void enterRestore_mapped_file(DmSqlParser.Restore_mapped_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_mapped_file}.
	 * @param ctx the parse tree
	 */
	void exitRestore_mapped_file(DmSqlParser.Restore_mapped_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mapped_file}.
	 * @param ctx the parse tree
	 */
	void enterMapped_file(DmSqlParser.Mapped_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mapped_file}.
	 * @param ctx the parse tree
	 */
	void exitMapped_file(DmSqlParser.Mapped_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#res_struct}.
	 * @param ctx the parse tree
	 */
	void enterRes_struct(DmSqlParser.Res_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#res_struct}.
	 * @param ctx the parse tree
	 */
	void exitRes_struct(DmSqlParser.Res_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#tsk_thread_num}.
	 * @param ctx the parse tree
	 */
	void enterTsk_thread_num(DmSqlParser.Tsk_thread_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#tsk_thread_num}.
	 * @param ctx the parse tree
	 */
	void exitTsk_thread_num(DmSqlParser.Tsk_thread_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_tsk_thread_num_null}.
	 * @param ctx the parse tree
	 */
	void enterRestore_tsk_thread_num_null(DmSqlParser.Restore_tsk_thread_num_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_tsk_thread_num_null}.
	 * @param ctx the parse tree
	 */
	void exitRestore_tsk_thread_num_null(DmSqlParser.Restore_tsk_thread_num_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_parallel}.
	 * @param ctx the parse tree
	 */
	void enterRestore_parallel(DmSqlParser.Restore_parallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_parallel}.
	 * @param ctx the parse tree
	 */
	void exitRestore_parallel(DmSqlParser.Restore_parallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_table_name_options}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name_options(DmSqlParser.Full_table_name_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_table_name_options}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name_options(DmSqlParser.Full_table_name_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#res_without_index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterRes_without_index_constraint(DmSqlParser.Res_without_index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#res_without_index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitRes_without_index_constraint(DmSqlParser.Res_without_index_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_from}.
	 * @param ctx the parse tree
	 */
	void enterRestore_from(DmSqlParser.Restore_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_from}.
	 * @param ctx the parse tree
	 */
	void exitRestore_from(DmSqlParser.Restore_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#res_until}.
	 * @param ctx the parse tree
	 */
	void enterRes_until(DmSqlParser.Res_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#res_until}.
	 * @param ctx the parse tree
	 */
	void exitRes_until(DmSqlParser.Res_untilContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_file_list_options}.
	 * @param ctx the parse tree
	 */
	void enterRestore_file_list_options(DmSqlParser.Restore_file_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_file_list_options}.
	 * @param ctx the parse tree
	 */
	void exitRestore_file_list_options(DmSqlParser.Restore_file_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mirror_file_list_options}.
	 * @param ctx the parse tree
	 */
	void enterMirror_file_list_options(DmSqlParser.Mirror_file_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mirror_file_list_options}.
	 * @param ctx the parse tree
	 */
	void exitMirror_file_list_options(DmSqlParser.Mirror_file_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_trace_file_level}.
	 * @param ctx the parse tree
	 */
	void enterRestore_trace_file_level(DmSqlParser.Restore_trace_file_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_trace_file_level}.
	 * @param ctx the parse tree
	 */
	void exitRestore_trace_file_level(DmSqlParser.Restore_trace_file_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_file_list}.
	 * @param ctx the parse tree
	 */
	void enterRestore_file_list(DmSqlParser.Restore_file_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_file_list}.
	 * @param ctx the parse tree
	 */
	void exitRestore_file_list(DmSqlParser.Restore_file_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_file}.
	 * @param ctx the parse tree
	 */
	void enterRestore_file(DmSqlParser.Restore_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_file}.
	 * @param ctx the parse tree
	 */
	void exitRestore_file(DmSqlParser.Restore_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mirror_file_list}.
	 * @param ctx the parse tree
	 */
	void enterMirror_file_list(DmSqlParser.Mirror_file_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mirror_file_list}.
	 * @param ctx the parse tree
	 */
	void exitMirror_file_list(DmSqlParser.Mirror_file_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mirror_file}.
	 * @param ctx the parse tree
	 */
	void enterMirror_file(DmSqlParser.Mirror_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mirror_file}.
	 * @param ctx the parse tree
	 */
	void exitMirror_file(DmSqlParser.Mirror_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_bak_arch_dir_list}.
	 * @param ctx the parse tree
	 */
	void enterWith_bak_arch_dir_list(DmSqlParser.With_bak_arch_dir_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_bak_arch_dir_list}.
	 * @param ctx the parse tree
	 */
	void exitWith_bak_arch_dir_list(DmSqlParser.With_bak_arch_dir_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restore_identified}.
	 * @param ctx the parse tree
	 */
	void enterRestore_identified(DmSqlParser.Restore_identifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restore_identified}.
	 * @param ctx the parse tree
	 */
	void exitRestore_identified(DmSqlParser.Restore_identifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_func_stmt(DmSqlParser.Create_func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_func_stmt(DmSqlParser.Create_func_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_aggr_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunc_aggr_clause(DmSqlParser.Func_aggr_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_aggr_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunc_aggr_clause(DmSqlParser.Func_aggr_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pipelined_options}.
	 * @param ctx the parse tree
	 */
	void enterPipelined_options(DmSqlParser.Pipelined_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pipelined_options}.
	 * @param ctx the parse tree
	 */
	void exitPipelined_options(DmSqlParser.Pipelined_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#replace_option}.
	 * @param ctx the parse tree
	 */
	void enterReplace_option(DmSqlParser.Replace_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#replace_option}.
	 * @param ctx the parse tree
	 */
	void exitReplace_option(DmSqlParser.Replace_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#edit_options}.
	 * @param ctx the parse tree
	 */
	void enterEdit_options(DmSqlParser.Edit_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#edit_options}.
	 * @param ctx the parse tree
	 */
	void exitEdit_options(DmSqlParser.Edit_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_option(DmSqlParser.Encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_option(DmSqlParser.Encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#calc_option}.
	 * @param ctx the parse tree
	 */
	void enterCalc_option(DmSqlParser.Calc_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#calc_option}.
	 * @param ctx the parse tree
	 */
	void exitCalc_option(DmSqlParser.Calc_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_action}.
	 * @param ctx the parse tree
	 */
	void enterFunc_action(DmSqlParser.Func_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_action}.
	 * @param ctx the parse tree
	 */
	void exitFunc_action(DmSqlParser.Func_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_call_options}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_options(DmSqlParser.Func_call_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_call_options}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_options(DmSqlParser.Func_call_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_call_option_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_option_list(DmSqlParser.Func_call_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_call_option_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_option_list(DmSqlParser.Func_call_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_call_option}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_option(DmSqlParser.Func_call_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_call_option}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_option(DmSqlParser.Func_call_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#invoker_rights_clause_options}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause_options(DmSqlParser.Invoker_rights_clause_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#invoker_rights_clause_options}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause_options(DmSqlParser.Invoker_rights_clause_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(DmSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(DmSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#deterministic_clause_options}.
	 * @param ctx the parse tree
	 */
	void enterDeterministic_clause_options(DmSqlParser.Deterministic_clause_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#deterministic_clause_options}.
	 * @param ctx the parse tree
	 */
	void exitDeterministic_clause_options(DmSqlParser.Deterministic_clause_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#deterministic_clause}.
	 * @param ctx the parse tree
	 */
	void enterDeterministic_clause(DmSqlParser.Deterministic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#deterministic_clause}.
	 * @param ctx the parse tree
	 */
	void exitDeterministic_clause(DmSqlParser.Deterministic_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_call_option2_options}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_option2_options(DmSqlParser.Func_call_option2_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_call_option2_options}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_option2_options(DmSqlParser.Func_call_option2_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_call_option_list2}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_option_list2(DmSqlParser.Func_call_option_list2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_call_option_list2}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_option_list2(DmSqlParser.Func_call_option_list2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_call_option2}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_option2(DmSqlParser.Func_call_option2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_call_option2}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_option2(DmSqlParser.Func_call_option2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(DmSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(DmSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#inner_fun_name}.
	 * @param ctx the parse tree
	 */
	void enterInner_fun_name(DmSqlParser.Inner_fun_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#inner_fun_name}.
	 * @param ctx the parse tree
	 */
	void exitInner_fun_name(DmSqlParser.Inner_fun_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#platform_type}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_type(DmSqlParser.Platform_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#platform_type}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_type(DmSqlParser.Platform_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_def_list_option}.
	 * @param ctx the parse tree
	 */
	void enterParam_def_list_option(DmSqlParser.Param_def_list_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_def_list_option}.
	 * @param ctx the parse tree
	 */
	void exitParam_def_list_option(DmSqlParser.Param_def_list_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_def_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_def_list(DmSqlParser.Param_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_def_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_def_list(DmSqlParser.Param_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_def}.
	 * @param ctx the parse tree
	 */
	void enterParam_def(DmSqlParser.Param_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_def}.
	 * @param ctx the parse tree
	 */
	void exitParam_def(DmSqlParser.Param_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_in_out_option}.
	 * @param ctx the parse tree
	 */
	void enterParam_in_out_option(DmSqlParser.Param_in_out_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_in_out_option}.
	 * @param ctx the parse tree
	 */
	void exitParam_in_out_option(DmSqlParser.Param_in_out_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#is_as}.
	 * @param ctx the parse tree
	 */
	void enterIs_as(DmSqlParser.Is_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#is_as}.
	 * @param ctx the parse tree
	 */
	void exitIs_as(DmSqlParser.Is_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#stat_on_org_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStat_on_org_stmt(DmSqlParser.Stat_on_org_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#stat_on_org_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStat_on_org_stmt(DmSqlParser.Stat_on_org_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#stat_size}.
	 * @param ctx the parse tree
	 */
	void enterStat_size(DmSqlParser.Stat_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#stat_size}.
	 * @param ctx the parse tree
	 */
	void exitStat_size(DmSqlParser.Stat_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#stat_para}.
	 * @param ctx the parse tree
	 */
	void enterStat_para(DmSqlParser.Stat_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#stat_para}.
	 * @param ctx the parse tree
	 */
	void exitStat_para(DmSqlParser.Stat_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bm_join_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterBm_join_index_clause(DmSqlParser.Bm_join_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bm_join_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitBm_join_index_clause(DmSqlParser.Bm_join_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#parallel_stmt}.
	 * @param ctx the parse tree
	 */
	void enterParallel_stmt(DmSqlParser.Parallel_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#parallel_stmt}.
	 * @param ctx the parse tree
	 */
	void exitParallel_stmt(DmSqlParser.Parallel_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(DmSqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(DmSqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_inner}.
	 * @param ctx the parse tree
	 */
	void enterWith_inner(DmSqlParser.With_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_inner}.
	 * @param ctx the parse tree
	 */
	void exitWith_inner(DmSqlParser.With_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#index_no_sort}.
	 * @param ctx the parse tree
	 */
	void enterIndex_no_sort(DmSqlParser.Index_no_sortContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#index_no_sort}.
	 * @param ctx the parse tree
	 */
	void exitIndex_no_sort(DmSqlParser.Index_no_sortContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#online_options}.
	 * @param ctx the parse tree
	 */
	void enterOnline_options(DmSqlParser.Online_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#online_options}.
	 * @param ctx the parse tree
	 */
	void exitOnline_options(DmSqlParser.Online_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unusable_options}.
	 * @param ctx the parse tree
	 */
	void enterUnusable_options(DmSqlParser.Unusable_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unusable_options}.
	 * @param ctx the parse tree
	 */
	void exitUnusable_options(DmSqlParser.Unusable_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#reverse_options}.
	 * @param ctx the parse tree
	 */
	void enterReverse_options(DmSqlParser.Reverse_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#reverse_options}.
	 * @param ctx the parse tree
	 */
	void exitReverse_options(DmSqlParser.Reverse_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#index_column_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_list(DmSqlParser.Index_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#index_column_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_list(DmSqlParser.Index_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_name(DmSqlParser.Index_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_name(DmSqlParser.Index_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_hash_tag}.
	 * @param ctx the parse tree
	 */
	void enterStorage_hash_tag(DmSqlParser.Storage_hash_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_hash_tag}.
	 * @param ctx the parse tree
	 */
	void exitStorage_hash_tag(DmSqlParser.Storage_hash_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_hash}.
	 * @param ctx the parse tree
	 */
	void enterStorage_hash(DmSqlParser.Storage_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_hash}.
	 * @param ctx the parse tree
	 */
	void exitStorage_hash(DmSqlParser.Storage_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_tag}.
	 * @param ctx the parse tree
	 */
	void enterStorage_tag(DmSqlParser.Storage_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_tag}.
	 * @param ctx the parse tree
	 */
	void exitStorage_tag(DmSqlParser.Storage_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_tag_nn}.
	 * @param ctx the parse tree
	 */
	void enterStorage_tag_nn(DmSqlParser.Storage_tag_nnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_tag_nn}.
	 * @param ctx the parse tree
	 */
	void exitStorage_tag_nn(DmSqlParser.Storage_tag_nnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_clause(DmSqlParser.Tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_clause(DmSqlParser.Tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_table_substitution_clause}.
	 * @param ctx the parse tree
	 */
	void enterObject_table_substitution_clause(DmSqlParser.Object_table_substitution_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_table_substitution_clause}.
	 * @param ctx the parse tree
	 */
	void exitObject_table_substitution_clause(DmSqlParser.Object_table_substitution_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 */
	void enterObject_table_substitution(DmSqlParser.Object_table_substitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 */
	void exitObject_table_substitution(DmSqlParser.Object_table_substitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oid_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_clause(DmSqlParser.Oid_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oid_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_clause(DmSqlParser.Oid_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oid_gen_type}.
	 * @param ctx the parse tree
	 */
	void enterOid_gen_type(DmSqlParser.Oid_gen_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oid_gen_type}.
	 * @param ctx the parse tree
	 */
	void exitOid_gen_type(DmSqlParser.Oid_gen_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_index_clause(DmSqlParser.Oid_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_index_clause(DmSqlParser.Oid_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oid_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_tablespace_clause(DmSqlParser.Oid_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oid_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_tablespace_clause(DmSqlParser.Oid_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oid_tablespace_name}.
	 * @param ctx the parse tree
	 */
	void enterOid_tablespace_name(DmSqlParser.Oid_tablespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oid_tablespace_name}.
	 * @param ctx the parse tree
	 */
	void exitOid_tablespace_name(DmSqlParser.Oid_tablespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#local_option}.
	 * @param ctx the parse tree
	 */
	void enterLocal_option(DmSqlParser.Local_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#local_option}.
	 * @param ctx the parse tree
	 */
	void exitLocal_option(DmSqlParser.Local_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_list}.
	 * @param ctx the parse tree
	 */
	void enterStorage_list(DmSqlParser.Storage_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_list}.
	 * @param ctx the parse tree
	 */
	void exitStorage_list(DmSqlParser.Storage_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_hashpartmap}.
	 * @param ctx the parse tree
	 */
	void enterStorage_hashpartmap(DmSqlParser.Storage_hashpartmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_hashpartmap}.
	 * @param ctx the parse tree
	 */
	void exitStorage_hashpartmap(DmSqlParser.Storage_hashpartmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage}.
	 * @param ctx the parse tree
	 */
	void enterStorage(DmSqlParser.StorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage}.
	 * @param ctx the parse tree
	 */
	void exitStorage(DmSqlParser.StorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(DmSqlParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(DmSqlParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_proc_stmt(DmSqlParser.Create_proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_proc_stmt(DmSqlParser.Create_proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_proc_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_proc_option(DmSqlParser.Create_proc_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_proc_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_proc_option(DmSqlParser.Create_proc_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(DmSqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(DmSqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pkg_cls_flag}.
	 * @param ctx the parse tree
	 */
	void enterPkg_cls_flag(DmSqlParser.Pkg_cls_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pkg_cls_flag}.
	 * @param ctx the parse tree
	 */
	void exitPkg_cls_flag(DmSqlParser.Pkg_cls_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#blk_end_option}.
	 * @param ctx the parse tree
	 */
	void enterBlk_end_option(DmSqlParser.Blk_end_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#blk_end_option}.
	 * @param ctx the parse tree
	 */
	void exitBlk_end_option(DmSqlParser.Blk_end_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#blk_end_option_low}.
	 * @param ctx the parse tree
	 */
	void enterBlk_end_option_low(DmSqlParser.Blk_end_option_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#blk_end_option_low}.
	 * @param ctx the parse tree
	 */
	void exitBlk_end_option_low(DmSqlParser.Blk_end_option_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#package_def_list_options}.
	 * @param ctx the parse tree
	 */
	void enterPackage_def_list_options(DmSqlParser.Package_def_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#package_def_list_options}.
	 * @param ctx the parse tree
	 */
	void exitPackage_def_list_options(DmSqlParser.Package_def_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#package_def_list}.
	 * @param ctx the parse tree
	 */
	void enterPackage_def_list(DmSqlParser.Package_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#package_def_list}.
	 * @param ctx the parse tree
	 */
	void exitPackage_def_list(DmSqlParser.Package_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#package_def}.
	 * @param ctx the parse tree
	 */
	void enterPackage_def(DmSqlParser.Package_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#package_def}.
	 * @param ctx the parse tree
	 */
	void exitPackage_def(DmSqlParser.Package_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#restrict_param_lst}.
	 * @param ctx the parse tree
	 */
	void enterRestrict_param_lst(DmSqlParser.Restrict_param_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#restrict_param_lst}.
	 * @param ctx the parse tree
	 */
	void exitRestrict_param_lst(DmSqlParser.Restrict_param_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(DmSqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(DmSqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_pkg_body_header}.
	 * @param ctx the parse tree
	 */
	void enterCreate_pkg_body_header(DmSqlParser.Create_pkg_body_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_pkg_body_header}.
	 * @param ctx the parse tree
	 */
	void exitCreate_pkg_body_header(DmSqlParser.Create_pkg_body_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pkg_cls_body_flag}.
	 * @param ctx the parse tree
	 */
	void enterPkg_cls_body_flag(DmSqlParser.Pkg_cls_body_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pkg_cls_body_flag}.
	 * @param ctx the parse tree
	 */
	void exitPkg_cls_body_flag(DmSqlParser.Pkg_cls_body_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#package_body_init_option}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_init_option(DmSqlParser.Package_body_init_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#package_body_init_option}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_init_option(DmSqlParser.Package_body_init_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#package_body_def_list}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_def_list(DmSqlParser.Package_body_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#package_body_def_list}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_def_list(DmSqlParser.Package_body_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#package_body_def}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_def(DmSqlParser.Package_body_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#package_body_def}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_def(DmSqlParser.Package_body_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#check_exec_options}.
	 * @param ctx the parse tree
	 */
	void enterCheck_exec_options(DmSqlParser.Check_exec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#check_exec_options}.
	 * @param ctx the parse tree
	 */
	void exitCheck_exec_options(DmSqlParser.Check_exec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpg_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubpg_decl_stmt(DmSqlParser.Subpg_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpg_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubpg_decl_stmt(DmSqlParser.Subpg_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(DmSqlParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(DmSqlParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#force_option}.
	 * @param ctx the parse tree
	 */
	void enterForce_option(DmSqlParser.Force_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#force_option}.
	 * @param ctx the parse tree
	 */
	void exitForce_option(DmSqlParser.Force_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_option}.
	 * @param ctx the parse tree
	 */
	void enterObject_option(DmSqlParser.Object_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_option}.
	 * @param ctx the parse tree
	 */
	void exitObject_option(DmSqlParser.Object_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#under_option}.
	 * @param ctx the parse tree
	 */
	void enterUnder_option(DmSqlParser.Under_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#under_option}.
	 * @param ctx the parse tree
	 */
	void exitUnder_option(DmSqlParser.Under_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_def_list_options}.
	 * @param ctx the parse tree
	 */
	void enterObject_def_list_options(DmSqlParser.Object_def_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_def_list_options}.
	 * @param ctx the parse tree
	 */
	void exitObject_def_list_options(DmSqlParser.Object_def_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_def_list}.
	 * @param ctx the parse tree
	 */
	void enterObject_def_list(DmSqlParser.Object_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_def_list}.
	 * @param ctx the parse tree
	 */
	void exitObject_def_list(DmSqlParser.Object_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_def(DmSqlParser.Object_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_def(DmSqlParser.Object_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#member_static}.
	 * @param ctx the parse tree
	 */
	void enterMember_static(DmSqlParser.Member_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#member_static}.
	 * @param ctx the parse tree
	 */
	void exitMember_static(DmSqlParser.Member_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#method_inherit_options}.
	 * @param ctx the parse tree
	 */
	void enterMethod_inherit_options(DmSqlParser.Method_inherit_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#method_inherit_options}.
	 * @param ctx the parse tree
	 */
	void exitMethod_inherit_options(DmSqlParser.Method_inherit_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#method_inherit_option}.
	 * @param ctx the parse tree
	 */
	void enterMethod_inherit_option(DmSqlParser.Method_inherit_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#method_inherit_option}.
	 * @param ctx the parse tree
	 */
	void exitMethod_inherit_option(DmSqlParser.Method_inherit_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#final_inst_list_options}.
	 * @param ctx the parse tree
	 */
	void enterFinal_inst_list_options(DmSqlParser.Final_inst_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#final_inst_list_options}.
	 * @param ctx the parse tree
	 */
	void exitFinal_inst_list_options(DmSqlParser.Final_inst_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#final_inst_list}.
	 * @param ctx the parse tree
	 */
	void enterFinal_inst_list(DmSqlParser.Final_inst_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#final_inst_list}.
	 * @param ctx the parse tree
	 */
	void exitFinal_inst_list(DmSqlParser.Final_inst_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#final_inst}.
	 * @param ctx the parse tree
	 */
	void enterFinal_inst(DmSqlParser.Final_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#final_inst}.
	 * @param ctx the parse tree
	 */
	void exitFinal_inst(DmSqlParser.Final_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#overriding_option}.
	 * @param ctx the parse tree
	 */
	void enterOverriding_option(DmSqlParser.Overriding_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#overriding_option}.
	 * @param ctx the parse tree
	 */
	void exitOverriding_option(DmSqlParser.Overriding_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#method_attr_options}.
	 * @param ctx the parse tree
	 */
	void enterMethod_attr_options(DmSqlParser.Method_attr_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#method_attr_options}.
	 * @param ctx the parse tree
	 */
	void exitMethod_attr_options(DmSqlParser.Method_attr_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#method_attr}.
	 * @param ctx the parse tree
	 */
	void enterMethod_attr(DmSqlParser.Method_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#method_attr}.
	 * @param ctx the parse tree
	 */
	void exitMethod_attr(DmSqlParser.Method_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_type_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_body_stmt(DmSqlParser.Create_type_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_type_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_body_stmt(DmSqlParser.Create_type_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_body_def_list}.
	 * @param ctx the parse tree
	 */
	void enterObject_body_def_list(DmSqlParser.Object_body_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_body_def_list}.
	 * @param ctx the parse tree
	 */
	void exitObject_body_def_list(DmSqlParser.Object_body_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#object_body_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_body_def(DmSqlParser.Object_body_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#object_body_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_body_def(DmSqlParser.Object_body_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_context_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_context_stmt(DmSqlParser.Create_context_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_context_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_context_stmt(DmSqlParser.Create_context_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(DmSqlParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(DmSqlParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#initialized}.
	 * @param ctx the parse tree
	 */
	void enterInitialized(DmSqlParser.InitializedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#initialized}.
	 * @param ctx the parse tree
	 */
	void exitInitialized(DmSqlParser.InitializedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_directory_stmt(DmSqlParser.Create_directory_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_directory_stmt(DmSqlParser.Create_directory_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_crypto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_crypto_stmt(DmSqlParser.Create_crypto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_crypto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_crypto_stmt(DmSqlParser.Create_crypto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_crypto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_crypto_stmt(DmSqlParser.Alter_crypto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_crypto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_crypto_stmt(DmSqlParser.Alter_crypto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_crypto_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_crypto_action(DmSqlParser.Alter_crypto_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_crypto_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_crypto_action(DmSqlParser.Alter_crypto_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#comment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComment_stmt(DmSqlParser.Comment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#comment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComment_stmt(DmSqlParser.Comment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_partition_group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_group_stmt(DmSqlParser.Create_partition_group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_partition_group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_group_stmt(DmSqlParser.Create_partition_group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#storage_act_datatype}.
	 * @param ctx the parse tree
	 */
	void enterStorage_act_datatype(DmSqlParser.Storage_act_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#storage_act_datatype}.
	 * @param ctx the parse tree
	 */
	void exitStorage_act_datatype(DmSqlParser.Storage_act_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pg_storage_lst}.
	 * @param ctx the parse tree
	 */
	void enterPg_storage_lst(DmSqlParser.Pg_storage_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pg_storage_lst}.
	 * @param ctx the parse tree
	 */
	void exitPg_storage_lst(DmSqlParser.Pg_storage_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pg_storage}.
	 * @param ctx the parse tree
	 */
	void enterPg_storage(DmSqlParser.Pg_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pg_storage}.
	 * @param ctx the parse tree
	 */
	void exitPg_storage(DmSqlParser.Pg_storageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(DmSqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(DmSqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_append_attr_clause}.
	 * @param ctx the parse tree
	 */
	void enterCtab_append_attr_clause(DmSqlParser.Ctab_append_attr_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_append_attr_clause}.
	 * @param ctx the parse tree
	 */
	void exitCtab_append_attr_clause(DmSqlParser.Ctab_append_attr_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_append_attr_list}.
	 * @param ctx the parse tree
	 */
	void enterCtab_append_attr_list(DmSqlParser.Ctab_append_attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_append_attr_list}.
	 * @param ctx the parse tree
	 */
	void exitCtab_append_attr_list(DmSqlParser.Ctab_append_attr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cobjtab_append_attr_clause}.
	 * @param ctx the parse tree
	 */
	void enterCobjtab_append_attr_clause(DmSqlParser.Cobjtab_append_attr_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cobjtab_append_attr_clause}.
	 * @param ctx the parse tree
	 */
	void exitCobjtab_append_attr_clause(DmSqlParser.Cobjtab_append_attr_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cobjtab_append_attr_list}.
	 * @param ctx the parse tree
	 */
	void enterCobjtab_append_attr_list(DmSqlParser.Cobjtab_append_attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cobjtab_append_attr_list}.
	 * @param ctx the parse tree
	 */
	void exitCobjtab_append_attr_list(DmSqlParser.Cobjtab_append_attr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_append_attr}.
	 * @param ctx the parse tree
	 */
	void enterCtab_append_attr(DmSqlParser.Ctab_append_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_append_attr}.
	 * @param ctx the parse tree
	 */
	void exitCtab_append_attr(DmSqlParser.Ctab_append_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cobjtab_append_attr}.
	 * @param ctx the parse tree
	 */
	void enterCobjtab_append_attr(DmSqlParser.Cobjtab_append_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cobjtab_append_attr}.
	 * @param ctx the parse tree
	 */
	void exitCobjtab_append_attr(DmSqlParser.Cobjtab_append_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_table_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_action(DmSqlParser.Create_table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_table_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_action(DmSqlParser.Create_table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_table_action_list_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_action_list_option(DmSqlParser.Create_table_action_list_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_table_action_list_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_action_list_option(DmSqlParser.Create_table_action_list_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_log_options}.
	 * @param ctx the parse tree
	 */
	void enterCtab_log_options(DmSqlParser.Ctab_log_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_log_options}.
	 * @param ctx the parse tree
	 */
	void exitCtab_log_options(DmSqlParser.Ctab_log_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_log_option}.
	 * @param ctx the parse tree
	 */
	void enterCtab_log_option(DmSqlParser.Ctab_log_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_log_option}.
	 * @param ctx the parse tree
	 */
	void exitCtab_log_option(DmSqlParser.Ctab_log_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_error_options}.
	 * @param ctx the parse tree
	 */
	void enterCtab_error_options(DmSqlParser.Ctab_error_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_error_options}.
	 * @param ctx the parse tree
	 */
	void exitCtab_error_options(DmSqlParser.Ctab_error_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#advance_log_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdvance_log_clause(DmSqlParser.Advance_log_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#advance_log_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdvance_log_clause(DmSqlParser.Advance_log_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#add_log_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_log_clause(DmSqlParser.Add_log_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#add_log_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_log_clause(DmSqlParser.Add_log_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_error_option}.
	 * @param ctx the parse tree
	 */
	void enterCtab_error_option(DmSqlParser.Ctab_error_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_error_option}.
	 * @param ctx the parse tree
	 */
	void exitCtab_error_option(DmSqlParser.Ctab_error_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ctab_row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void enterCtab_row_movement_clause(DmSqlParser.Ctab_row_movement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ctab_row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void exitCtab_row_movement_clause(DmSqlParser.Ctab_row_movement_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_distribute_act}.
	 * @param ctx the parse tree
	 */
	void enterRange_distribute_act(DmSqlParser.Range_distribute_actContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_distribute_act}.
	 * @param ctx the parse tree
	 */
	void exitRange_distribute_act(DmSqlParser.Range_distribute_actContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_distribute_act_lst}.
	 * @param ctx the parse tree
	 */
	void enterRange_distribute_act_lst(DmSqlParser.Range_distribute_act_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_distribute_act_lst}.
	 * @param ctx the parse tree
	 */
	void exitRange_distribute_act_lst(DmSqlParser.Range_distribute_act_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_distribute_act}.
	 * @param ctx the parse tree
	 */
	void enterList_distribute_act(DmSqlParser.List_distribute_actContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_distribute_act}.
	 * @param ctx the parse tree
	 */
	void exitList_distribute_act(DmSqlParser.List_distribute_actContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_distribute_act_list}.
	 * @param ctx the parse tree
	 */
	void enterList_distribute_act_list(DmSqlParser.List_distribute_act_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_distribute_act_list}.
	 * @param ctx the parse tree
	 */
	void exitList_distribute_act_list(DmSqlParser.List_distribute_act_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#distribute_by_option}.
	 * @param ctx the parse tree
	 */
	void enterDistribute_by_option(DmSqlParser.Distribute_by_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#distribute_by_option}.
	 * @param ctx the parse tree
	 */
	void exitDistribute_by_option(DmSqlParser.Distribute_by_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#distribute_by}.
	 * @param ctx the parse tree
	 */
	void enterDistribute_by(DmSqlParser.Distribute_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#distribute_by}.
	 * @param ctx the parse tree
	 */
	void exitDistribute_by(DmSqlParser.Distribute_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#increment_set}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_set(DmSqlParser.Increment_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#increment_set}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_set(DmSqlParser.Increment_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(DmSqlParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(DmSqlParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rowdependencies_clause}.
	 * @param ctx the parse tree
	 */
	void enterRowdependencies_clause(DmSqlParser.Rowdependencies_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rowdependencies_clause}.
	 * @param ctx the parse tree
	 */
	void exitRowdependencies_clause(DmSqlParser.Rowdependencies_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pg_sub_partition}.
	 * @param ctx the parse tree
	 */
	void enterPg_sub_partition(DmSqlParser.Pg_sub_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pg_sub_partition}.
	 * @param ctx the parse tree
	 */
	void exitPg_sub_partition(DmSqlParser.Pg_sub_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_type_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_option(DmSqlParser.Table_type_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_type_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_option(DmSqlParser.Table_type_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_temp_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_temp_option(DmSqlParser.Table_temp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_temp_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_temp_option(DmSqlParser.Table_temp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#objtab_elem_constraint}.
	 * @param ctx the parse tree
	 */
	void enterObjtab_elem_constraint(DmSqlParser.Objtab_elem_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#objtab_elem_constraint}.
	 * @param ctx the parse tree
	 */
	void exitObjtab_elem_constraint(DmSqlParser.Objtab_elem_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#objtab_element_cons_list}.
	 * @param ctx the parse tree
	 */
	void enterObjtab_element_cons_list(DmSqlParser.Objtab_element_cons_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#objtab_element_cons_list}.
	 * @param ctx the parse tree
	 */
	void exitObjtab_element_cons_list(DmSqlParser.Objtab_element_cons_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#objtab_element_cons}.
	 * @param ctx the parse tree
	 */
	void enterObjtab_element_cons(DmSqlParser.Objtab_element_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#objtab_element_cons}.
	 * @param ctx the parse tree
	 */
	void exitObjtab_element_cons(DmSqlParser.Objtab_element_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#objcol_constraint}.
	 * @param ctx the parse tree
	 */
	void enterObjcol_constraint(DmSqlParser.Objcol_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#objcol_constraint}.
	 * @param ctx the parse tree
	 */
	void exitObjcol_constraint(DmSqlParser.Objcol_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_element_list(DmSqlParser.Table_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_element_list(DmSqlParser.Table_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(DmSqlParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(DmSqlParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_constraint_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_def(DmSqlParser.Table_constraint_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_constraint_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_def(DmSqlParser.Table_constraint_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#on_commit_option}.
	 * @param ctx the parse tree
	 */
	void enterOn_commit_option(DmSqlParser.On_commit_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#on_commit_option}.
	 * @param ctx the parse tree
	 */
	void exitOn_commit_option(DmSqlParser.On_commit_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#on_commit_option_nn}.
	 * @param ctx the parse tree
	 */
	void enterOn_commit_option_nn(DmSqlParser.On_commit_option_nnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#on_commit_option_nn}.
	 * @param ctx the parse tree
	 */
	void exitOn_commit_option_nn(DmSqlParser.On_commit_option_nnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#logging_option}.
	 * @param ctx the parse tree
	 */
	void enterLogging_option(DmSqlParser.Logging_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#logging_option}.
	 * @param ctx the parse tree
	 */
	void exitLogging_option(DmSqlParser.Logging_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#logging_option_nn}.
	 * @param ctx the parse tree
	 */
	void enterLogging_option_nn(DmSqlParser.Logging_option_nnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#logging_option_nn}.
	 * @param ctx the parse tree
	 */
	void exitLogging_option_nn(DmSqlParser.Logging_option_nnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_clause(DmSqlParser.Partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_clause(DmSqlParser.Partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#partition_clause_nn}.
	 * @param ctx the parse tree
	 */
	void enterPartition_clause_nn(DmSqlParser.Partition_clause_nnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#partition_clause_nn}.
	 * @param ctx the parse tree
	 */
	void exitPartition_clause_nn(DmSqlParser.Partition_clause_nnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#horizon_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterHorizon_partition_clause(DmSqlParser.Horizon_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#horizon_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitHorizon_partition_clause(DmSqlParser.Horizon_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#compress_tag_hdr}.
	 * @param ctx the parse tree
	 */
	void enterCompress_tag_hdr(DmSqlParser.Compress_tag_hdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#compress_tag_hdr}.
	 * @param ctx the parse tree
	 */
	void exitCompress_tag_hdr(DmSqlParser.Compress_tag_hdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#compress_clause_opt}.
	 * @param ctx the parse tree
	 */
	void enterCompress_clause_opt(DmSqlParser.Compress_clause_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#compress_clause_opt}.
	 * @param ctx the parse tree
	 */
	void exitCompress_clause_opt(DmSqlParser.Compress_clause_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#compress_tag}.
	 * @param ctx the parse tree
	 */
	void enterCompress_tag(DmSqlParser.Compress_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#compress_tag}.
	 * @param ctx the parse tree
	 */
	void exitCompress_tag(DmSqlParser.Compress_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#compress_level}.
	 * @param ctx the parse tree
	 */
	void enterCompress_level(DmSqlParser.Compress_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#compress_level}.
	 * @param ctx the parse tree
	 */
	void exitCompress_level(DmSqlParser.Compress_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#compress_type}.
	 * @param ctx the parse tree
	 */
	void enterCompress_type(DmSqlParser.Compress_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#compress_type}.
	 * @param ctx the parse tree
	 */
	void exitCompress_type(DmSqlParser.Compress_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_partition}.
	 * @param ctx the parse tree
	 */
	void enterRange_partition(DmSqlParser.Range_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_partition}.
	 * @param ctx the parse tree
	 */
	void exitRange_partition(DmSqlParser.Range_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_partition_list}.
	 * @param ctx the parse tree
	 */
	void enterRange_partition_list(DmSqlParser.Range_partition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_partition_list}.
	 * @param ctx the parse tree
	 */
	void exitRange_partition_list(DmSqlParser.Range_partition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_partition}.
	 * @param ctx the parse tree
	 */
	void enterHash_partition(DmSqlParser.Hash_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_partition}.
	 * @param ctx the parse tree
	 */
	void exitHash_partition(DmSqlParser.Hash_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_partition_list}.
	 * @param ctx the parse tree
	 */
	void enterHash_partition_list(DmSqlParser.Hash_partition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_partition_list}.
	 * @param ctx the parse tree
	 */
	void exitHash_partition_list(DmSqlParser.Hash_partition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_partition}.
	 * @param ctx the parse tree
	 */
	void enterList_partition(DmSqlParser.List_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_partition}.
	 * @param ctx the parse tree
	 */
	void exitList_partition(DmSqlParser.List_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_partition_list}.
	 * @param ctx the parse tree
	 */
	void enterList_partition_list(DmSqlParser.List_partition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_partition_list}.
	 * @param ctx the parse tree
	 */
	void exitList_partition_list(DmSqlParser.List_partition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#split_partition_list}.
	 * @param ctx the parse tree
	 */
	void enterSplit_partition_list(DmSqlParser.Split_partition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#split_partition_list}.
	 * @param ctx the parse tree
	 */
	void exitSplit_partition_list(DmSqlParser.Split_partition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#partition_act}.
	 * @param ctx the parse tree
	 */
	void enterPartition_act(DmSqlParser.Partition_actContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#partition_act}.
	 * @param ctx the parse tree
	 */
	void exitPartition_act(DmSqlParser.Partition_actContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#vertical_partition_act}.
	 * @param ctx the parse tree
	 */
	void enterVertical_partition_act(DmSqlParser.Vertical_partition_actContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#vertical_partition_act}.
	 * @param ctx the parse tree
	 */
	void exitVertical_partition_act(DmSqlParser.Vertical_partition_actContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(DmSqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(DmSqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#horizon_partition_act_datatype}.
	 * @param ctx the parse tree
	 */
	void enterHorizon_partition_act_datatype(DmSqlParser.Horizon_partition_act_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#horizon_partition_act_datatype}.
	 * @param ctx the parse tree
	 */
	void exitHorizon_partition_act_datatype(DmSqlParser.Horizon_partition_act_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#horizon_partition_act}.
	 * @param ctx the parse tree
	 */
	void enterHorizon_partition_act(DmSqlParser.Horizon_partition_actContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#horizon_partition_act}.
	 * @param ctx the parse tree
	 */
	void exitHorizon_partition_act(DmSqlParser.Horizon_partition_actContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lock_partitions_clause}.
	 * @param ctx the parse tree
	 */
	void enterLock_partitions_clause(DmSqlParser.Lock_partitions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lock_partitions_clause}.
	 * @param ctx the parse tree
	 */
	void exitLock_partitions_clause(DmSqlParser.Lock_partitions_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartion_template_list_datatype_options}.
	 * @param ctx the parse tree
	 */
	void enterSubpartion_template_list_datatype_options(DmSqlParser.Subpartion_template_list_datatype_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartion_template_list_datatype_options}.
	 * @param ctx the parse tree
	 */
	void exitSubpartion_template_list_datatype_options(DmSqlParser.Subpartion_template_list_datatype_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartion_template_list_datatype}.
	 * @param ctx the parse tree
	 */
	void enterSubpartion_template_list_datatype(DmSqlParser.Subpartion_template_list_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartion_template_list_datatype}.
	 * @param ctx the parse tree
	 */
	void exitSubpartion_template_list_datatype(DmSqlParser.Subpartion_template_list_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartion_template_list_options}.
	 * @param ctx the parse tree
	 */
	void enterSubpartion_template_list_options(DmSqlParser.Subpartion_template_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartion_template_list_options}.
	 * @param ctx the parse tree
	 */
	void exitSubpartion_template_list_options(DmSqlParser.Subpartion_template_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartion_template_list}.
	 * @param ctx the parse tree
	 */
	void enterSubpartion_template_list(DmSqlParser.Subpartion_template_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartion_template_list}.
	 * @param ctx the parse tree
	 */
	void exitSubpartion_template_list(DmSqlParser.Subpartion_template_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void enterSubpartion_template_datatype(DmSqlParser.Subpartion_template_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void exitSubpartion_template_datatype(DmSqlParser.Subpartion_template_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void enterRange_subpartion_template_datatype(DmSqlParser.Range_subpartion_template_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void exitRange_subpartion_template_datatype(DmSqlParser.Range_subpartion_template_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartion_template_datatype(DmSqlParser.Hash_subpartion_template_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartion_template_datatype(DmSqlParser.Hash_subpartion_template_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_subpartions_template_datatype_option}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartions_template_datatype_option(DmSqlParser.Hash_subpartions_template_datatype_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_subpartions_template_datatype_option}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartions_template_datatype_option(DmSqlParser.Hash_subpartions_template_datatype_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void enterList_subpartion_template_datatype(DmSqlParser.List_subpartion_template_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_subpartion_template_datatype}.
	 * @param ctx the parse tree
	 */
	void exitList_subpartion_template_datatype(DmSqlParser.List_subpartion_template_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartion_template}.
	 * @param ctx the parse tree
	 */
	void enterSubpartion_template(DmSqlParser.Subpartion_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartion_template}.
	 * @param ctx the parse tree
	 */
	void exitSubpartion_template(DmSqlParser.Subpartion_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_subpartion_template}.
	 * @param ctx the parse tree
	 */
	void enterRange_subpartion_template(DmSqlParser.Range_subpartion_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_subpartion_template}.
	 * @param ctx the parse tree
	 */
	void exitRange_subpartion_template(DmSqlParser.Range_subpartion_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_subpartion_template}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartion_template(DmSqlParser.Hash_subpartion_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_subpartion_template}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartion_template(DmSqlParser.Hash_subpartion_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_subpartions_template_option}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartions_template_option(DmSqlParser.Hash_subpartions_template_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_subpartions_template_option}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartions_template_option(DmSqlParser.Hash_subpartions_template_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_subpartion_template}.
	 * @param ctx the parse tree
	 */
	void enterList_subpartion_template(DmSqlParser.List_subpartion_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_subpartion_template}.
	 * @param ctx the parse tree
	 */
	void exitList_subpartion_template(DmSqlParser.List_subpartion_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterRange_subpartition(DmSqlParser.Range_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitRange_subpartition(DmSqlParser.Range_subpartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartition(DmSqlParser.Hash_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartition(DmSqlParser.Hash_subpartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterList_subpartition(DmSqlParser.List_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitList_subpartition(DmSqlParser.List_subpartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_subpartition_list}.
	 * @param ctx the parse tree
	 */
	void enterRange_subpartition_list(DmSqlParser.Range_subpartition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_subpartition_list}.
	 * @param ctx the parse tree
	 */
	void exitRange_subpartition_list(DmSqlParser.Range_subpartition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_subpartition_list}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartition_list(DmSqlParser.Hash_subpartition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_subpartition_list}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartition_list(DmSqlParser.Hash_subpartition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#list_subpartition_list}.
	 * @param ctx the parse tree
	 */
	void enterList_subpartition_list(DmSqlParser.List_subpartition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#list_subpartition_list}.
	 * @param ctx the parse tree
	 */
	void exitList_subpartition_list(DmSqlParser.List_subpartition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_hash_desc}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_hash_desc(DmSqlParser.Subpartition_hash_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_hash_desc}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_hash_desc(DmSqlParser.Subpartition_hash_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_range_desc}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_range_desc(DmSqlParser.Subpartition_range_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_range_desc}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_range_desc(DmSqlParser.Subpartition_range_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_list_desc}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_list_desc(DmSqlParser.Subpartition_list_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_list_desc}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_list_desc(DmSqlParser.Subpartition_list_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_hash_desc_list}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_hash_desc_list(DmSqlParser.Subpartition_hash_desc_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_hash_desc_list}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_hash_desc_list(DmSqlParser.Subpartition_hash_desc_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_range_desc_list}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_range_desc_list(DmSqlParser.Subpartition_range_desc_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_range_desc_list}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_range_desc_list(DmSqlParser.Subpartition_range_desc_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_list_desc_list}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_list_desc_list(DmSqlParser.Subpartition_list_desc_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_list_desc_list}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_list_desc_list(DmSqlParser.Subpartition_list_desc_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_desc(DmSqlParser.Subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_desc(DmSqlParser.Subpartition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#subpartition_desc_option}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_desc_option(DmSqlParser.Subpartition_desc_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#subpartition_desc_option}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_desc_option(DmSqlParser.Subpartition_desc_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#add_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterAdd_subpartition_desc(DmSqlParser.Add_subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#add_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitAdd_subpartition_desc(DmSqlParser.Add_subpartition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#partition_no}.
	 * @param ctx the parse tree
	 */
	void enterPartition_no(DmSqlParser.Partition_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#partition_no}.
	 * @param ctx the parse tree
	 */
	void exitPartition_no(DmSqlParser.Partition_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#comment_clause}.
	 * @param ctx the parse tree
	 */
	void enterComment_clause(DmSqlParser.Comment_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#comment_clause}.
	 * @param ctx the parse tree
	 */
	void exitComment_clause(DmSqlParser.Comment_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#encrypt_clause_options}.
	 * @param ctx the parse tree
	 */
	void enterEncrypt_clause_options(DmSqlParser.Encrypt_clause_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#encrypt_clause_options}.
	 * @param ctx the parse tree
	 */
	void exitEncrypt_clause_options(DmSqlParser.Encrypt_clause_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#encrypt_clause}.
	 * @param ctx the parse tree
	 */
	void enterEncrypt_clause(DmSqlParser.Encrypt_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#encrypt_clause}.
	 * @param ctx the parse tree
	 */
	void exitEncrypt_clause(DmSqlParser.Encrypt_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#encrypt_cipher}.
	 * @param ctx the parse tree
	 */
	void enterEncrypt_cipher(DmSqlParser.Encrypt_cipherContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#encrypt_cipher}.
	 * @param ctx the parse tree
	 */
	void exitEncrypt_cipher(DmSqlParser.Encrypt_cipherContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#crypto_name}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_name(DmSqlParser.Crypto_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#crypto_name}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_name(DmSqlParser.Crypto_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cipher_name}.
	 * @param ctx the parse tree
	 */
	void enterCipher_name(DmSqlParser.Cipher_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cipher_name}.
	 * @param ctx the parse tree
	 */
	void exitCipher_name(DmSqlParser.Cipher_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_cipher_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_cipher_name(DmSqlParser.Full_cipher_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_cipher_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_cipher_name(DmSqlParser.Full_cipher_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#encrypt_type}.
	 * @param ctx the parse tree
	 */
	void enterEncrypt_type(DmSqlParser.Encrypt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#encrypt_type}.
	 * @param ctx the parse tree
	 */
	void exitEncrypt_type(DmSqlParser.Encrypt_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#manual_clause}.
	 * @param ctx the parse tree
	 */
	void enterManual_clause(DmSqlParser.Manual_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#manual_clause}.
	 * @param ctx the parse tree
	 */
	void exitManual_clause(DmSqlParser.Manual_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_clause_options}.
	 * @param ctx the parse tree
	 */
	void enterUser_clause_options(DmSqlParser.User_clause_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_clause_options}.
	 * @param ctx the parse tree
	 */
	void exitUser_clause_options(DmSqlParser.User_clause_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_clause(DmSqlParser.User_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_clause(DmSqlParser.User_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_list_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_list_option(DmSqlParser.User_list_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_list_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_list_option(DmSqlParser.User_list_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_list}.
	 * @param ctx the parse tree
	 */
	void enterUser_list(DmSqlParser.User_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_list}.
	 * @param ctx the parse tree
	 */
	void exitUser_list(DmSqlParser.User_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_cipher}.
	 * @param ctx the parse tree
	 */
	void enterHash_cipher(DmSqlParser.Hash_cipherContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_cipher}.
	 * @param ctx the parse tree
	 */
	void exitHash_cipher(DmSqlParser.Hash_cipherContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_type}.
	 * @param ctx the parse tree
	 */
	void enterHash_type(DmSqlParser.Hash_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_type}.
	 * @param ctx the parse tree
	 */
	void exitHash_type(DmSqlParser.Hash_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#space_limit}.
	 * @param ctx the parse tree
	 */
	void enterSpace_limit(DmSqlParser.Space_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#space_limit}.
	 * @param ctx the parse tree
	 */
	void exitSpace_limit(DmSqlParser.Space_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#space_limit_nn}.
	 * @param ctx the parse tree
	 */
	void enterSpace_limit_nn(DmSqlParser.Space_limit_nnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#space_limit_nn}.
	 * @param ctx the parse tree
	 */
	void exitSpace_limit_nn(DmSqlParser.Space_limit_nnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#space_limit_1}.
	 * @param ctx the parse tree
	 */
	void enterSpace_limit_1(DmSqlParser.Space_limit_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#space_limit_1}.
	 * @param ctx the parse tree
	 */
	void exitSpace_limit_1(DmSqlParser.Space_limit_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#space_limit2}.
	 * @param ctx the parse tree
	 */
	void enterSpace_limit2(DmSqlParser.Space_limit2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#space_limit2}.
	 * @param ctx the parse tree
	 */
	void exitSpace_limit2(DmSqlParser.Space_limit2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#del_res}.
	 * @param ctx the parse tree
	 */
	void enterDel_res(DmSqlParser.Del_resContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#del_res}.
	 * @param ctx the parse tree
	 */
	void exitDel_res(DmSqlParser.Del_resContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_enable}.
	 * @param ctx the parse tree
	 */
	void enterTrig_enable(DmSqlParser.Trig_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_enable}.
	 * @param ctx the parse tree
	 */
	void exitTrig_enable(DmSqlParser.Trig_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#at_raft}.
	 * @param ctx the parse tree
	 */
	void enterAt_raft(DmSqlParser.At_raftContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#at_raft}.
	 * @param ctx the parse tree
	 */
	void exitAt_raft(DmSqlParser.At_raftContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(DmSqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(DmSqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#before_after}.
	 * @param ctx the parse tree
	 */
	void enterBefore_after(DmSqlParser.Before_afterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#before_after}.
	 * @param ctx the parse tree
	 */
	void exitBefore_after(DmSqlParser.Before_afterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_del_ins_upd_list}.
	 * @param ctx the parse tree
	 */
	void enterTrig_del_ins_upd_list(DmSqlParser.Trig_del_ins_upd_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_del_ins_upd_list}.
	 * @param ctx the parse tree
	 */
	void exitTrig_del_ins_upd_list(DmSqlParser.Trig_del_ins_upd_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_del_ins_upd}.
	 * @param ctx the parse tree
	 */
	void enterTrig_del_ins_upd(DmSqlParser.Trig_del_ins_updContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_del_ins_upd}.
	 * @param ctx the parse tree
	 */
	void exitTrig_del_ins_upd(DmSqlParser.Trig_del_ins_updContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_of_option}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_of_option(DmSqlParser.Update_of_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_of_option}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_of_option(DmSqlParser.Update_of_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#nowait}.
	 * @param ctx the parse tree
	 */
	void enterNowait(DmSqlParser.NowaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#nowait}.
	 * @param ctx the parse tree
	 */
	void exitNowait(DmSqlParser.NowaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_event_list}.
	 * @param ctx the parse tree
	 */
	void enterTrig_event_list(DmSqlParser.Trig_event_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_event_list}.
	 * @param ctx the parse tree
	 */
	void exitTrig_event_list(DmSqlParser.Trig_event_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_event}.
	 * @param ctx the parse tree
	 */
	void enterTrig_event(DmSqlParser.Trig_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_event}.
	 * @param ctx the parse tree
	 */
	void exitTrig_event(DmSqlParser.Trig_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#event_object}.
	 * @param ctx the parse tree
	 */
	void enterEvent_object(DmSqlParser.Event_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#event_object}.
	 * @param ctx the parse tree
	 */
	void exitEvent_object(DmSqlParser.Event_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_referencing_def_options}.
	 * @param ctx the parse tree
	 */
	void enterTrig_referencing_def_options(DmSqlParser.Trig_referencing_def_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_referencing_def_options}.
	 * @param ctx the parse tree
	 */
	void exitTrig_referencing_def_options(DmSqlParser.Trig_referencing_def_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_referencing_def}.
	 * @param ctx the parse tree
	 */
	void enterTrig_referencing_def(DmSqlParser.Trig_referencing_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_referencing_def}.
	 * @param ctx the parse tree
	 */
	void exitTrig_referencing_def(DmSqlParser.Trig_referencing_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_referencing_list}.
	 * @param ctx the parse tree
	 */
	void enterTrig_referencing_list(DmSqlParser.Trig_referencing_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_referencing_list}.
	 * @param ctx the parse tree
	 */
	void exitTrig_referencing_list(DmSqlParser.Trig_referencing_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_referencing_old}.
	 * @param ctx the parse tree
	 */
	void enterTrig_referencing_old(DmSqlParser.Trig_referencing_oldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_referencing_old}.
	 * @param ctx the parse tree
	 */
	void exitTrig_referencing_old(DmSqlParser.Trig_referencing_oldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_referencing_new}.
	 * @param ctx the parse tree
	 */
	void enterTrig_referencing_new(DmSqlParser.Trig_referencing_newContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_referencing_new}.
	 * @param ctx the parse tree
	 */
	void exitTrig_referencing_new(DmSqlParser.Trig_referencing_newContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_for_each_option}.
	 * @param ctx the parse tree
	 */
	void enterTrig_for_each_option(DmSqlParser.Trig_for_each_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_for_each_option}.
	 * @param ctx the parse tree
	 */
	void exitTrig_for_each_option(DmSqlParser.Trig_for_each_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_timer_rate}.
	 * @param ctx the parse tree
	 */
	void enterTrig_timer_rate(DmSqlParser.Trig_timer_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_timer_rate}.
	 * @param ctx the parse tree
	 */
	void exitTrig_timer_rate(DmSqlParser.Trig_timer_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exec_ep_seqno}.
	 * @param ctx the parse tree
	 */
	void enterExec_ep_seqno(DmSqlParser.Exec_ep_seqnoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exec_ep_seqno}.
	 * @param ctx the parse tree
	 */
	void exitExec_ep_seqno(DmSqlParser.Exec_ep_seqnoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rate_over_day}.
	 * @param ctx the parse tree
	 */
	void enterRate_over_day(DmSqlParser.Rate_over_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rate_over_day}.
	 * @param ctx the parse tree
	 */
	void exitRate_over_day(DmSqlParser.Rate_over_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#month_rate}.
	 * @param ctx the parse tree
	 */
	void enterMonth_rate(DmSqlParser.Month_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#month_rate}.
	 * @param ctx the parse tree
	 */
	void exitMonth_rate(DmSqlParser.Month_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#day_in_month}.
	 * @param ctx the parse tree
	 */
	void enterDay_in_month(DmSqlParser.Day_in_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#day_in_month}.
	 * @param ctx the parse tree
	 */
	void exitDay_in_month(DmSqlParser.Day_in_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#day_in_month_week}.
	 * @param ctx the parse tree
	 */
	void enterDay_in_month_week(DmSqlParser.Day_in_month_weekContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#day_in_month_week}.
	 * @param ctx the parse tree
	 */
	void exitDay_in_month_week(DmSqlParser.Day_in_month_weekContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#week_rate}.
	 * @param ctx the parse tree
	 */
	void enterWeek_rate(DmSqlParser.Week_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#week_rate}.
	 * @param ctx the parse tree
	 */
	void exitWeek_rate(DmSqlParser.Week_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#day_of_week_list}.
	 * @param ctx the parse tree
	 */
	void enterDay_of_week_list(DmSqlParser.Day_of_week_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#day_of_week_list}.
	 * @param ctx the parse tree
	 */
	void exitDay_of_week_list(DmSqlParser.Day_of_week_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#day_rate}.
	 * @param ctx the parse tree
	 */
	void enterDay_rate(DmSqlParser.Day_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#day_rate}.
	 * @param ctx the parse tree
	 */
	void exitDay_rate(DmSqlParser.Day_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rate_in_day}.
	 * @param ctx the parse tree
	 */
	void enterRate_in_day(DmSqlParser.Rate_in_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rate_in_day}.
	 * @param ctx the parse tree
	 */
	void exitRate_in_day(DmSqlParser.Rate_in_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#once_in_day}.
	 * @param ctx the parse tree
	 */
	void enterOnce_in_day(DmSqlParser.Once_in_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#once_in_day}.
	 * @param ctx the parse tree
	 */
	void exitOnce_in_day(DmSqlParser.Once_in_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#times_in_day}.
	 * @param ctx the parse tree
	 */
	void enterTimes_in_day(DmSqlParser.Times_in_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#times_in_day}.
	 * @param ctx the parse tree
	 */
	void exitTimes_in_day(DmSqlParser.Times_in_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#duaring_time}.
	 * @param ctx the parse tree
	 */
	void enterDuaring_time(DmSqlParser.Duaring_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#duaring_time}.
	 * @param ctx the parse tree
	 */
	void exitDuaring_time(DmSqlParser.Duaring_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#duaring_date}.
	 * @param ctx the parse tree
	 */
	void enterDuaring_date(DmSqlParser.Duaring_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#duaring_date}.
	 * @param ctx the parse tree
	 */
	void exitDuaring_date(DmSqlParser.Duaring_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_when_option}.
	 * @param ctx the parse tree
	 */
	void enterTrig_when_option(DmSqlParser.Trig_when_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_when_option}.
	 * @param ctx the parse tree
	 */
	void exitTrig_when_option(DmSqlParser.Trig_when_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_when_condition}.
	 * @param ctx the parse tree
	 */
	void enterTrig_when_condition(DmSqlParser.Trig_when_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_when_condition}.
	 * @param ctx the parse tree
	 */
	void exitTrig_when_condition(DmSqlParser.Trig_when_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#repeat_interval_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_interval_stmt(DmSqlParser.Repeat_interval_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#repeat_interval_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_interval_stmt(DmSqlParser.Repeat_interval_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#max_run_duration}.
	 * @param ctx the parse tree
	 */
	void enterMax_run_duration(DmSqlParser.Max_run_durationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#max_run_duration}.
	 * @param ctx the parse tree
	 */
	void exitMax_run_duration(DmSqlParser.Max_run_durationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#repeat_interval}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_interval(DmSqlParser.Repeat_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#repeat_interval}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_interval(DmSqlParser.Repeat_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#frequency_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrequency_clause(DmSqlParser.Frequency_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#frequency_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrequency_clause(DmSqlParser.Frequency_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#frequency_define}.
	 * @param ctx the parse tree
	 */
	void enterFrequency_define(DmSqlParser.Frequency_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#frequency_define}.
	 * @param ctx the parse tree
	 */
	void exitFrequency_define(DmSqlParser.Frequency_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#predefined_frequency}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_frequency(DmSqlParser.Predefined_frequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#predefined_frequency}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_frequency(DmSqlParser.Predefined_frequencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_clause_option}.
	 * @param ctx the parse tree
	 */
	void enterInterval_clause_option(DmSqlParser.Interval_clause_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_clause_option}.
	 * @param ctx the parse tree
	 */
	void exitInterval_clause_option(DmSqlParser.Interval_clause_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterInterval_clause_list(DmSqlParser.Interval_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitInterval_clause_list(DmSqlParser.Interval_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_clause_single}.
	 * @param ctx the parse tree
	 */
	void enterInterval_clause_single(DmSqlParser.Interval_clause_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_clause_single}.
	 * @param ctx the parse tree
	 */
	void exitInterval_clause_single(DmSqlParser.Interval_clause_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_clause}.
	 * @param ctx the parse tree
	 */
	void enterInterval_clause(DmSqlParser.Interval_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_clause}.
	 * @param ctx the parse tree
	 */
	void exitInterval_clause(DmSqlParser.Interval_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#intervalnum}.
	 * @param ctx the parse tree
	 */
	void enterIntervalnum(DmSqlParser.IntervalnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#intervalnum}.
	 * @param ctx the parse tree
	 */
	void exitIntervalnum(DmSqlParser.IntervalnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bymonth_clause}.
	 * @param ctx the parse tree
	 */
	void enterBymonth_clause(DmSqlParser.Bymonth_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bymonth_clause}.
	 * @param ctx the parse tree
	 */
	void exitBymonth_clause(DmSqlParser.Bymonth_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#monthlist}.
	 * @param ctx the parse tree
	 */
	void enterMonthlist(DmSqlParser.MonthlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#monthlist}.
	 * @param ctx the parse tree
	 */
	void exitMonthlist(DmSqlParser.MonthlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(DmSqlParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(DmSqlParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#numeric_month}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_month(DmSqlParser.Numeric_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#numeric_month}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_month(DmSqlParser.Numeric_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#char_month}.
	 * @param ctx the parse tree
	 */
	void enterChar_month(DmSqlParser.Char_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#char_month}.
	 * @param ctx the parse tree
	 */
	void exitChar_month(DmSqlParser.Char_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byweekno_clause}.
	 * @param ctx the parse tree
	 */
	void enterByweekno_clause(DmSqlParser.Byweekno_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byweekno_clause}.
	 * @param ctx the parse tree
	 */
	void exitByweekno_clause(DmSqlParser.Byweekno_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#weekno_list}.
	 * @param ctx the parse tree
	 */
	void enterWeekno_list(DmSqlParser.Weekno_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#weekno_list}.
	 * @param ctx the parse tree
	 */
	void exitWeekno_list(DmSqlParser.Weekno_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#weekno}.
	 * @param ctx the parse tree
	 */
	void enterWeekno(DmSqlParser.WeeknoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#weekno}.
	 * @param ctx the parse tree
	 */
	void exitWeekno(DmSqlParser.WeeknoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byyearday_clause}.
	 * @param ctx the parse tree
	 */
	void enterByyearday_clause(DmSqlParser.Byyearday_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byyearday_clause}.
	 * @param ctx the parse tree
	 */
	void exitByyearday_clause(DmSqlParser.Byyearday_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#yearday_list}.
	 * @param ctx the parse tree
	 */
	void enterYearday_list(DmSqlParser.Yearday_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#yearday_list}.
	 * @param ctx the parse tree
	 */
	void exitYearday_list(DmSqlParser.Yearday_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#yearday}.
	 * @param ctx the parse tree
	 */
	void enterYearday(DmSqlParser.YeardayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#yearday}.
	 * @param ctx the parse tree
	 */
	void exitYearday(DmSqlParser.YeardayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bymonthday_clause}.
	 * @param ctx the parse tree
	 */
	void enterBymonthday_clause(DmSqlParser.Bymonthday_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bymonthday_clause}.
	 * @param ctx the parse tree
	 */
	void exitBymonthday_clause(DmSqlParser.Bymonthday_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#monthday_list}.
	 * @param ctx the parse tree
	 */
	void enterMonthday_list(DmSqlParser.Monthday_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#monthday_list}.
	 * @param ctx the parse tree
	 */
	void exitMonthday_list(DmSqlParser.Monthday_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#monthday}.
	 * @param ctx the parse tree
	 */
	void enterMonthday(DmSqlParser.MonthdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#monthday}.
	 * @param ctx the parse tree
	 */
	void exitMonthday(DmSqlParser.MonthdayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byday_clause}.
	 * @param ctx the parse tree
	 */
	void enterByday_clause(DmSqlParser.Byday_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byday_clause}.
	 * @param ctx the parse tree
	 */
	void exitByday_clause(DmSqlParser.Byday_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byday_list}.
	 * @param ctx the parse tree
	 */
	void enterByday_list(DmSqlParser.Byday_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byday_list}.
	 * @param ctx the parse tree
	 */
	void exitByday_list(DmSqlParser.Byday_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byday}.
	 * @param ctx the parse tree
	 */
	void enterByday(DmSqlParser.BydayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byday}.
	 * @param ctx the parse tree
	 */
	void exitByday(DmSqlParser.BydayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#weekdaynum_options}.
	 * @param ctx the parse tree
	 */
	void enterWeekdaynum_options(DmSqlParser.Weekdaynum_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#weekdaynum_options}.
	 * @param ctx the parse tree
	 */
	void exitWeekdaynum_options(DmSqlParser.Weekdaynum_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#weekdaynum}.
	 * @param ctx the parse tree
	 */
	void enterWeekdaynum(DmSqlParser.WeekdaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#weekdaynum}.
	 * @param ctx the parse tree
	 */
	void exitWeekdaynum(DmSqlParser.WeekdaynumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(DmSqlParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(DmSqlParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byhour_clause}.
	 * @param ctx the parse tree
	 */
	void enterByhour_clause(DmSqlParser.Byhour_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byhour_clause}.
	 * @param ctx the parse tree
	 */
	void exitByhour_clause(DmSqlParser.Byhour_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hour_list}.
	 * @param ctx the parse tree
	 */
	void enterHour_list(DmSqlParser.Hour_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hour_list}.
	 * @param ctx the parse tree
	 */
	void exitHour_list(DmSqlParser.Hour_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(DmSqlParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(DmSqlParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#byminute_clause}.
	 * @param ctx the parse tree
	 */
	void enterByminute_clause(DmSqlParser.Byminute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#byminute_clause}.
	 * @param ctx the parse tree
	 */
	void exitByminute_clause(DmSqlParser.Byminute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#minute_list}.
	 * @param ctx the parse tree
	 */
	void enterMinute_list(DmSqlParser.Minute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#minute_list}.
	 * @param ctx the parse tree
	 */
	void exitMinute_list(DmSqlParser.Minute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(DmSqlParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(DmSqlParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bysecond_clause}.
	 * @param ctx the parse tree
	 */
	void enterBysecond_clause(DmSqlParser.Bysecond_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bysecond_clause}.
	 * @param ctx the parse tree
	 */
	void exitBysecond_clause(DmSqlParser.Bysecond_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#second_list}.
	 * @param ctx the parse tree
	 */
	void enterSecond_list(DmSqlParser.Second_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#second_list}.
	 * @param ctx the parse tree
	 */
	void exitSecond_list(DmSqlParser.Second_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(DmSqlParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(DmSqlParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#query_rewrite}.
	 * @param ctx the parse tree
	 */
	void enterQuery_rewrite(DmSqlParser.Query_rewriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#query_rewrite}.
	 * @param ctx the parse tree
	 */
	void exitQuery_rewrite(DmSqlParser.Query_rewriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_clause(DmSqlParser.Build_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_clause(DmSqlParser.Build_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_refresh_option}.
	 * @param ctx the parse tree
	 */
	void enterMv_refresh_option(DmSqlParser.Mv_refresh_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_refresh_option}.
	 * @param ctx the parse tree
	 */
	void exitMv_refresh_option(DmSqlParser.Mv_refresh_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_refresh_option_list}.
	 * @param ctx the parse tree
	 */
	void enterMv_refresh_option_list(DmSqlParser.Mv_refresh_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_refresh_option_list}.
	 * @param ctx the parse tree
	 */
	void exitMv_refresh_option_list(DmSqlParser.Mv_refresh_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_refresh_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_refresh_clause(DmSqlParser.Mv_refresh_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_refresh_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_refresh_clause(DmSqlParser.Mv_refresh_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_log_purge_syn_asyn_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_purge_syn_asyn_clause(DmSqlParser.Mv_log_purge_syn_asyn_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_log_purge_syn_asyn_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_purge_syn_asyn_clause(DmSqlParser.Mv_log_purge_syn_asyn_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_purge_clause(DmSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_purge_clause(DmSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_log_with_syntax_item}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_with_syntax_item(DmSqlParser.Mv_log_with_syntax_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_log_with_syntax_item}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_with_syntax_item(DmSqlParser.Mv_log_with_syntax_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_log_with_syntax_item_list}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_with_syntax_item_list(DmSqlParser.Mv_log_with_syntax_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_log_with_syntax_item_list}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_with_syntax_item_list(DmSqlParser.Mv_log_with_syntax_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_log_including_new_values}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_including_new_values(DmSqlParser.Mv_log_including_new_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_log_including_new_values}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_including_new_values(DmSqlParser.Mv_log_including_new_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mv_log_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_with_clause(DmSqlParser.Mv_log_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mv_log_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_with_clause(DmSqlParser.Mv_log_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_materialized_view_log_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view_log_stmt(DmSqlParser.Create_materialized_view_log_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_materialized_view_log_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view_log_stmt(DmSqlParser.Create_materialized_view_log_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#prebuilt_table_clause_null}.
	 * @param ctx the parse tree
	 */
	void enterPrebuilt_table_clause_null(DmSqlParser.Prebuilt_table_clause_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#prebuilt_table_clause_null}.
	 * @param ctx the parse tree
	 */
	void exitPrebuilt_table_clause_null(DmSqlParser.Prebuilt_table_clause_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view_stmt(DmSqlParser.Create_materialized_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view_stmt(DmSqlParser.Create_materialized_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(DmSqlParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(DmSqlParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_view_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt_body(DmSqlParser.Create_view_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_view_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt_body(DmSqlParser.Create_view_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_list3_options}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list3_options(DmSqlParser.Column_list3_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_list3_options}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list3_options(DmSqlParser.Column_list3_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_list3}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list3(DmSqlParser.Column_list3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_list3}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list3(DmSqlParser.Column_list3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_column_constraint_def}.
	 * @param ctx the parse tree
	 */
	void enterView_column_constraint_def(DmSqlParser.View_column_constraint_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_column_constraint_def}.
	 * @param ctx the parse tree
	 */
	void exitView_column_constraint_def(DmSqlParser.View_column_constraint_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_column_constraints}.
	 * @param ctx the parse tree
	 */
	void enterView_column_constraints(DmSqlParser.View_column_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_column_constraints}.
	 * @param ctx the parse tree
	 */
	void exitView_column_constraints(DmSqlParser.View_column_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterView_column_constraint(DmSqlParser.View_column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitView_column_constraint(DmSqlParser.View_column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_column_constraint_action}.
	 * @param ctx the parse tree
	 */
	void enterView_column_constraint_action(DmSqlParser.View_column_constraint_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_column_constraint_action}.
	 * @param ctx the parse tree
	 */
	void exitView_column_constraint_action(DmSqlParser.View_column_constraint_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#view_constraint_def}.
	 * @param ctx the parse tree
	 */
	void enterView_constraint_def(DmSqlParser.View_constraint_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#view_constraint_def}.
	 * @param ctx the parse tree
	 */
	void exitView_constraint_def(DmSqlParser.View_constraint_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_schemabinding}.
	 * @param ctx the parse tree
	 */
	void enterWith_schemabinding(DmSqlParser.With_schemabindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_schemabinding}.
	 * @param ctx the parse tree
	 */
	void exitWith_schemabinding(DmSqlParser.With_schemabindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_list_options}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_options(DmSqlParser.Column_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_list_options}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_options(DmSqlParser.Column_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_check_or_readonly_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_check_or_readonly_option(DmSqlParser.With_check_or_readonly_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_check_or_readonly_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_check_or_readonly_option(DmSqlParser.With_check_or_readonly_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#check_level_option}.
	 * @param ctx the parse tree
	 */
	void enterCheck_level_option(DmSqlParser.Check_level_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#check_level_option}.
	 * @param ctx the parse tree
	 */
	void exitCheck_level_option(DmSqlParser.Check_level_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decl_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor(DmSqlParser.Decl_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decl_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor(DmSqlParser.Decl_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(DmSqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(DmSqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#delete_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_body(DmSqlParser.Delete_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#delete_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_body(DmSqlParser.Delete_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#delete_multi_tv_option}.
	 * @param ctx the parse tree
	 */
	void enterDelete_multi_tv_option(DmSqlParser.Delete_multi_tv_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#delete_multi_tv_option}.
	 * @param ctx the parse tree
	 */
	void exitDelete_multi_tv_option(DmSqlParser.Delete_multi_tv_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#check_limit_option}.
	 * @param ctx the parse tree
	 */
	void enterCheck_limit_option(DmSqlParser.Check_limit_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#check_limit_option}.
	 * @param ctx the parse tree
	 */
	void exitCheck_limit_option(DmSqlParser.Check_limit_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#where_current_option}.
	 * @param ctx the parse tree
	 */
	void enterWhere_current_option(DmSqlParser.Where_current_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#where_current_option}.
	 * @param ctx the parse tree
	 */
	void exitWhere_current_option(DmSqlParser.Where_current_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(DmSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(DmSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#start_with_clause_null}.
	 * @param ctx the parse tree
	 */
	void enterStart_with_clause_null(DmSqlParser.Start_with_clause_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#start_with_clause_null}.
	 * @param ctx the parse tree
	 */
	void exitStart_with_clause_null(DmSqlParser.Start_with_clause_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#connect_by_item}.
	 * @param ctx the parse tree
	 */
	void enterConnect_by_item(DmSqlParser.Connect_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#connect_by_item}.
	 * @param ctx the parse tree
	 */
	void exitConnect_by_item(DmSqlParser.Connect_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#connect_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterConnect_by_clause(DmSqlParser.Connect_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#connect_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitConnect_by_clause(DmSqlParser.Connect_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(DmSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(DmSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#nocycle_flag}.
	 * @param ctx the parse tree
	 */
	void enterNocycle_flag(DmSqlParser.Nocycle_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#nocycle_flag}.
	 * @param ctx the parse tree
	 */
	void exitNocycle_flag(DmSqlParser.Nocycle_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(DmSqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(DmSqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#disconnect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect_stmt(DmSqlParser.Disconnect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#disconnect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect_stmt(DmSqlParser.Disconnect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#disconnect_option}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect_option(DmSqlParser.Disconnect_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#disconnect_option}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect_option(DmSqlParser.Disconnect_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(DmSqlParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(DmSqlParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_stmt_body_1}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt_body_1(DmSqlParser.Drop_stmt_body_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_stmt_body_1}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt_body_1(DmSqlParser.Drop_stmt_body_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_stmt_2}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt_2(DmSqlParser.Drop_stmt_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_stmt_2}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt_2(DmSqlParser.Drop_stmt_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_id_db_object}.
	 * @param ctx the parse tree
	 */
	void enterDrop_id_db_object(DmSqlParser.Drop_id_db_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_id_db_object}.
	 * @param ctx the parse tree
	 */
	void exitDrop_id_db_object(DmSqlParser.Drop_id_db_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#id_db_object}.
	 * @param ctx the parse tree
	 */
	void enterId_db_object(DmSqlParser.Id_db_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#id_db_object}.
	 * @param ctx the parse tree
	 */
	void exitId_db_object(DmSqlParser.Id_db_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_db_object}.
	 * @param ctx the parse tree
	 */
	void enterDrop_db_object(DmSqlParser.Drop_db_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_db_object}.
	 * @param ctx the parse tree
	 */
	void exitDrop_db_object(DmSqlParser.Drop_db_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exist}.
	 * @param ctx the parse tree
	 */
	void enterExist(DmSqlParser.ExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exist}.
	 * @param ctx the parse tree
	 */
	void exitExist(DmSqlParser.ExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#not_exist}.
	 * @param ctx the parse tree
	 */
	void enterNot_exist(DmSqlParser.Not_existContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#not_exist}.
	 * @param ctx the parse tree
	 */
	void exitNot_exist(DmSqlParser.Not_existContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#db_object}.
	 * @param ctx the parse tree
	 */
	void enterDb_object(DmSqlParser.Db_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#db_object}.
	 * @param ctx the parse tree
	 */
	void exitDb_object(DmSqlParser.Db_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#is_detach}.
	 * @param ctx the parse tree
	 */
	void enterIs_detach(DmSqlParser.Is_detachContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#is_detach}.
	 * @param ctx the parse tree
	 */
	void exitIs_detach(DmSqlParser.Is_detachContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#purge_option}.
	 * @param ctx the parse tree
	 */
	void enterPurge_option(DmSqlParser.Purge_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#purge_option}.
	 * @param ctx the parse tree
	 */
	void exitPurge_option(DmSqlParser.Purge_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_stmt(DmSqlParser.Alter_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_stmt(DmSqlParser.Alter_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_system_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_system_action(DmSqlParser.Alter_system_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_system_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_system_action(DmSqlParser.Alter_system_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_database_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_action(DmSqlParser.Alter_database_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_database_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_action(DmSqlParser.Alter_database_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#force}.
	 * @param ctx the parse tree
	 */
	void enterForce(DmSqlParser.ForceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#force}.
	 * @param ctx the parse tree
	 */
	void exitForce(DmSqlParser.ForceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_name(DmSqlParser.Tablespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#tablespace_name}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_name(DmSqlParser.Tablespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#raft_name}.
	 * @param ctx the parse tree
	 */
	void enterRaft_name(DmSqlParser.Raft_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#raft_name}.
	 * @param ctx the parse tree
	 */
	void exitRaft_name(DmSqlParser.Raft_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_into}.
	 * @param ctx the parse tree
	 */
	void enterFetch_into(DmSqlParser.Fetch_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_into}.
	 * @param ctx the parse tree
	 */
	void exitFetch_into(DmSqlParser.Fetch_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bulk_or_single_into}.
	 * @param ctx the parse tree
	 */
	void enterBulk_or_single_into(DmSqlParser.Bulk_or_single_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bulk_or_single_into}.
	 * @param ctx the parse tree
	 */
	void exitBulk_or_single_into(DmSqlParser.Bulk_or_single_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(DmSqlParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(DmSqlParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(DmSqlParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(DmSqlParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_tail}.
	 * @param ctx the parse tree
	 */
	void enterFetch_tail(DmSqlParser.Fetch_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_tail}.
	 * @param ctx the parse tree
	 */
	void exitFetch_tail(DmSqlParser.Fetch_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_limit_option}.
	 * @param ctx the parse tree
	 */
	void enterFetch_limit_option(DmSqlParser.Fetch_limit_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_limit_option}.
	 * @param ctx the parse tree
	 */
	void exitFetch_limit_option(DmSqlParser.Fetch_limit_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_option}.
	 * @param ctx the parse tree
	 */
	void enterFetch_option(DmSqlParser.Fetch_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_option}.
	 * @param ctx the parse tree
	 */
	void exitFetch_option(DmSqlParser.Fetch_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fetch_direct_option}.
	 * @param ctx the parse tree
	 */
	void enterFetch_direct_option(DmSqlParser.Fetch_direct_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fetch_direct_option}.
	 * @param ctx the parse tree
	 */
	void exitFetch_direct_option(DmSqlParser.Fetch_direct_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#log_errors_into}.
	 * @param ctx the parse tree
	 */
	void enterLog_errors_into(DmSqlParser.Log_errors_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#log_errors_into}.
	 * @param ctx the parse tree
	 */
	void exitLog_errors_into(DmSqlParser.Log_errors_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#log_errors_expression}.
	 * @param ctx the parse tree
	 */
	void enterLog_errors_expression(DmSqlParser.Log_errors_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#log_errors_expression}.
	 * @param ctx the parse tree
	 */
	void exitLog_errors_expression(DmSqlParser.Log_errors_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#log_errors_unlimited}.
	 * @param ctx the parse tree
	 */
	void enterLog_errors_unlimited(DmSqlParser.Log_errors_unlimitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#log_errors_unlimited}.
	 * @param ctx the parse tree
	 */
	void exitLog_errors_unlimited(DmSqlParser.Log_errors_unlimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#log_errors}.
	 * @param ctx the parse tree
	 */
	void enterLog_errors(DmSqlParser.Log_errorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#log_errors}.
	 * @param ctx the parse tree
	 */
	void exitLog_errors(DmSqlParser.Log_errorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(DmSqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(DmSqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#insert_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_body(DmSqlParser.Insert_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#insert_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_body(DmSqlParser.Insert_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_column_list_options}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_list_options(DmSqlParser.Full_column_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_column_list_options}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_list_options(DmSqlParser.Full_column_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ins_value_options}.
	 * @param ctx the parse tree
	 */
	void enterIns_value_options(DmSqlParser.Ins_value_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ins_value_options}.
	 * @param ctx the parse tree
	 */
	void exitIns_value_options(DmSqlParser.Ins_value_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#insert_into_single}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_single(DmSqlParser.Insert_into_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#insert_into_single}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_single(DmSqlParser.Insert_into_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#multi_insert_into_list}.
	 * @param ctx the parse tree
	 */
	void enterMulti_insert_into_list(DmSqlParser.Multi_insert_into_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#multi_insert_into_list}.
	 * @param ctx the parse tree
	 */
	void exitMulti_insert_into_list(DmSqlParser.Multi_insert_into_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#multi_insert_tag}.
	 * @param ctx the parse tree
	 */
	void enterMulti_insert_tag(DmSqlParser.Multi_insert_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#multi_insert_tag}.
	 * @param ctx the parse tree
	 */
	void exitMulti_insert_tag(DmSqlParser.Multi_insert_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#insert_into_single_condition}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_single_condition(DmSqlParser.Insert_into_single_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#insert_into_single_condition}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_single_condition(DmSqlParser.Insert_into_single_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#multi_insert_into_condition_list}.
	 * @param ctx the parse tree
	 */
	void enterMulti_insert_into_condition_list(DmSqlParser.Multi_insert_into_condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#multi_insert_into_condition_list}.
	 * @param ctx the parse tree
	 */
	void exitMulti_insert_into_condition_list(DmSqlParser.Multi_insert_into_condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#multi_insert_into_else}.
	 * @param ctx the parse tree
	 */
	void enterMulti_insert_into_else(DmSqlParser.Multi_insert_into_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#multi_insert_into_else}.
	 * @param ctx the parse tree
	 */
	void exitMulti_insert_into_else(DmSqlParser.Multi_insert_into_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#multi_insert_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterMulti_insert_stmt_body(DmSqlParser.Multi_insert_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#multi_insert_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitMulti_insert_stmt_body(DmSqlParser.Multi_insert_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#insert_tail}.
	 * @param ctx the parse tree
	 */
	void enterInsert_tail(DmSqlParser.Insert_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#insert_tail}.
	 * @param ctx the parse tree
	 */
	void exitInsert_tail(DmSqlParser.Insert_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#insert_action}.
	 * @param ctx the parse tree
	 */
	void enterInsert_action(DmSqlParser.Insert_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#insert_action}.
	 * @param ctx the parse tree
	 */
	void exitInsert_action(DmSqlParser.Insert_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#record_var_values}.
	 * @param ctx the parse tree
	 */
	void enterRecord_var_values(DmSqlParser.Record_var_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#record_var_values}.
	 * @param ctx the parse tree
	 */
	void exitRecord_var_values(DmSqlParser.Record_var_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#record_var_value}.
	 * @param ctx the parse tree
	 */
	void enterRecord_var_value(DmSqlParser.Record_var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#record_var_value}.
	 * @param ctx the parse tree
	 */
	void exitRecord_var_value(DmSqlParser.Record_var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ins_value}.
	 * @param ctx the parse tree
	 */
	void enterIns_value(DmSqlParser.Ins_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ins_value}.
	 * @param ctx the parse tree
	 */
	void exitIns_value(DmSqlParser.Ins_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(DmSqlParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(DmSqlParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#open_tail}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tail(DmSqlParser.Open_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#open_tail}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tail(DmSqlParser.Open_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(DmSqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(DmSqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(DmSqlParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(DmSqlParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(DmSqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(DmSqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#to_savepoint}.
	 * @param ctx the parse tree
	 */
	void enterTo_savepoint(DmSqlParser.To_savepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#to_savepoint}.
	 * @param ctx the parse tree
	 */
	void exitTo_savepoint(DmSqlParser.To_savepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(DmSqlParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(DmSqlParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(DmSqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(DmSqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#all_distinct_option}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_option(DmSqlParser.All_distinct_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#all_distinct_option}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_option(DmSqlParser.All_distinct_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#corresponding_clause}.
	 * @param ctx the parse tree
	 */
	void enterCorresponding_clause(DmSqlParser.Corresponding_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#corresponding_clause}.
	 * @param ctx the parse tree
	 */
	void exitCorresponding_clause(DmSqlParser.Corresponding_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#top_option}.
	 * @param ctx the parse tree
	 */
	void enterTop_option(DmSqlParser.Top_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#top_option}.
	 * @param ctx the parse tree
	 */
	void exitTop_option(DmSqlParser.Top_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#limit_option}.
	 * @param ctx the parse tree
	 */
	void enterLimit_option(DmSqlParser.Limit_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#limit_option}.
	 * @param ctx the parse tree
	 */
	void exitLimit_option(DmSqlParser.Limit_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(DmSqlParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(DmSqlParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#limit_not_empty}.
	 * @param ctx the parse tree
	 */
	void enterLimit_not_empty(DmSqlParser.Limit_not_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#limit_not_empty}.
	 * @param ctx the parse tree
	 */
	void exitLimit_not_empty(DmSqlParser.Limit_not_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#row_limiting_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_limiting_clause(DmSqlParser.Row_limiting_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#row_limiting_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_limiting_clause(DmSqlParser.Row_limiting_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#row_num_desc}.
	 * @param ctx the parse tree
	 */
	void enterRow_num_desc(DmSqlParser.Row_num_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#row_num_desc}.
	 * @param ctx the parse tree
	 */
	void exitRow_num_desc(DmSqlParser.Row_num_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#first_next_desc}.
	 * @param ctx the parse tree
	 */
	void enterFirst_next_desc(DmSqlParser.First_next_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#first_next_desc}.
	 * @param ctx the parse tree
	 */
	void exitFirst_next_desc(DmSqlParser.First_next_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_item_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_item_list(DmSqlParser.Select_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_item_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_item_list(DmSqlParser.Select_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_item(DmSqlParser.Select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_item(DmSqlParser.Select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#as_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_alias(DmSqlParser.As_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#as_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_alias(DmSqlParser.As_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_tail}.
	 * @param ctx the parse tree
	 */
	void enterSelect_tail(DmSqlParser.Select_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_tail}.
	 * @param ctx the parse tree
	 */
	void exitSelect_tail(DmSqlParser.Select_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(DmSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(DmSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#from_tv_list}.
	 * @param ctx the parse tree
	 */
	void enterFrom_tv_list(DmSqlParser.From_tv_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#from_tv_list}.
	 * @param ctx the parse tree
	 */
	void exitFrom_tv_list(DmSqlParser.From_tv_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#from_tv}.
	 * @param ctx the parse tree
	 */
	void enterFrom_tv(DmSqlParser.From_tvContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#from_tv}.
	 * @param ctx the parse tree
	 */
	void exitFrom_tv(DmSqlParser.From_tvContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table(DmSqlParser.Joined_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table(DmSqlParser.Joined_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#joined_table1}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table1(DmSqlParser.Joined_table1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#joined_table1}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table1(DmSqlParser.Joined_table1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trxid}.
	 * @param ctx the parse tree
	 */
	void enterTrxid(DmSqlParser.TrxidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trxid}.
	 * @param ctx the parse tree
	 */
	void exitTrxid(DmSqlParser.TrxidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#flashback_query_low}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_low(DmSqlParser.Flashback_query_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#flashback_query_low}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_low(DmSqlParser.Flashback_query_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trxid_option}.
	 * @param ctx the parse tree
	 */
	void enterTrxid_option(DmSqlParser.Trxid_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trxid_option}.
	 * @param ctx the parse tree
	 */
	void exitTrxid_option(DmSqlParser.Trxid_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#range_from_to}.
	 * @param ctx the parse tree
	 */
	void enterRange_from_to(DmSqlParser.Range_from_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#range_from_to}.
	 * @param ctx the parse tree
	 */
	void exitRange_from_to(DmSqlParser.Range_from_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sample_exp}.
	 * @param ctx the parse tree
	 */
	void enterSample_exp(DmSqlParser.Sample_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sample_exp}.
	 * @param ctx the parse tree
	 */
	void exitSample_exp(DmSqlParser.Sample_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_sfun}.
	 * @param ctx the parse tree
	 */
	void enterPivot_sfun(DmSqlParser.Pivot_sfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_sfun}.
	 * @param ctx the parse tree
	 */
	void exitPivot_sfun(DmSqlParser.Pivot_sfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_sfun_lst}.
	 * @param ctx the parse tree
	 */
	void enterPivot_sfun_lst(DmSqlParser.Pivot_sfun_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_sfun_lst}.
	 * @param ctx the parse tree
	 */
	void exitPivot_sfun_lst(DmSqlParser.Pivot_sfun_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(DmSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(DmSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_in_clause1_expr}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause1_expr(DmSqlParser.Pivot_in_clause1_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_in_clause1_expr}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause1_expr(DmSqlParser.Pivot_in_clause1_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_in_clause_low_1}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_low_1(DmSqlParser.Pivot_in_clause_low_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_in_clause_low_1}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_low_1(DmSqlParser.Pivot_in_clause_low_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_in_clause_low_2}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_low_2(DmSqlParser.Pivot_in_clause_low_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_in_clause_low_2}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_low_2(DmSqlParser.Pivot_in_clause_low_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_in_clause_low}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_low(DmSqlParser.Pivot_in_clause_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_in_clause_low}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_low(DmSqlParser.Pivot_in_clause_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_xml}.
	 * @param ctx the parse tree
	 */
	void enterPivot_xml(DmSqlParser.Pivot_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_xml}.
	 * @param ctx the parse tree
	 */
	void exitPivot_xml(DmSqlParser.Pivot_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pivot_clause_low}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause_low(DmSqlParser.Pivot_clause_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pivot_clause_low}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause_low(DmSqlParser.Pivot_clause_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unpivot_val_col_lst}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_val_col_lst(DmSqlParser.Unpivot_val_col_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unpivot_val_col_lst}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_val_col_lst(DmSqlParser.Unpivot_val_col_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#include_clause}.
	 * @param ctx the parse tree
	 */
	void enterInclude_clause(DmSqlParser.Include_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#include_clause}.
	 * @param ctx the parse tree
	 */
	void exitInclude_clause(DmSqlParser.Include_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unpivot_in_clause_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause_expr(DmSqlParser.Unpivot_in_clause_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unpivot_in_clause_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause_expr(DmSqlParser.Unpivot_in_clause_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unpivot_in_clause_low}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause_low(DmSqlParser.Unpivot_in_clause_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unpivot_in_clause_low}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause_low(DmSqlParser.Unpivot_in_clause_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unpivot_clause_low}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause_low(DmSqlParser.Unpivot_clause_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unpivot_clause_low}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause_low(DmSqlParser.Unpivot_clause_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sample_clause_low}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause_low(DmSqlParser.Sample_clause_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sample_clause_low}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause_low(DmSqlParser.Sample_clause_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_name}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_name(DmSqlParser.Normal_tv_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_name}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_name(DmSqlParser.Normal_tv_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_tail}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_tail(DmSqlParser.Normal_tv_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_tail}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_tail(DmSqlParser.Normal_tv_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_tail_low}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_tail_low(DmSqlParser.Normal_tv_tail_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_tail_low}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_tail_low(DmSqlParser.Normal_tv_tail_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_alias}.
	 * @param ctx the parse tree
	 */
	void enterNormal_alias(DmSqlParser.Normal_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_alias}.
	 * @param ctx the parse tree
	 */
	void exitNormal_alias(DmSqlParser.Normal_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_tail_low2}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_tail_low2(DmSqlParser.Normal_tv_tail_low2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_tail_low2}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_tail_low2(DmSqlParser.Normal_tv_tail_low2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_tail_low3}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_tail_low3(DmSqlParser.Normal_tv_tail_low3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_tail_low3}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_tail_low3(DmSqlParser.Normal_tv_tail_low3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_derived_table_options}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_derived_table_options(DmSqlParser.Normal_tv_derived_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_derived_table_options}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_derived_table_options(DmSqlParser.Normal_tv_derived_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_derived_table_low}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_derived_table_low(DmSqlParser.Normal_tv_derived_table_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_derived_table_low}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_derived_table_low(DmSqlParser.Normal_tv_derived_table_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv_derived_table}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv_derived_table(DmSqlParser.Normal_tv_derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv_derived_table}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv_derived_table(DmSqlParser.Normal_tv_derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_with_paran_with_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_with_paran_with_alias(DmSqlParser.Select_with_paran_with_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_with_paran_with_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_with_paran_with_alias(DmSqlParser.Select_with_paran_with_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#from_table_exp}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_exp(DmSqlParser.From_table_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#from_table_exp}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_exp(DmSqlParser.From_table_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#from_table_select_with_paran}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_select_with_paran(DmSqlParser.From_table_select_with_paranContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#from_table_select_with_paran}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_select_with_paran(DmSqlParser.From_table_select_with_paranContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#normal_tv}.
	 * @param ctx the parse tree
	 */
	void enterNormal_tv(DmSqlParser.Normal_tvContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#normal_tv}.
	 * @param ctx the parse tree
	 */
	void exitNormal_tv(DmSqlParser.Normal_tvContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xml_passing}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing(DmSqlParser.Xml_passingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xml_passing}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing(DmSqlParser.Xml_passingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlcoldef_lst_options}.
	 * @param ctx the parse tree
	 */
	void enterXmlcoldef_lst_options(DmSqlParser.Xmlcoldef_lst_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlcoldef_lst_options}.
	 * @param ctx the parse tree
	 */
	void exitXmlcoldef_lst_options(DmSqlParser.Xmlcoldef_lst_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlcoldef_lst}.
	 * @param ctx the parse tree
	 */
	void enterXmlcoldef_lst(DmSqlParser.Xmlcoldef_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlcoldef_lst}.
	 * @param ctx the parse tree
	 */
	void exitXmlcoldef_lst(DmSqlParser.Xmlcoldef_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlcoldef}.
	 * @param ctx the parse tree
	 */
	void enterXmlcoldef(DmSqlParser.XmlcoldefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlcoldef}.
	 * @param ctx the parse tree
	 */
	void exitXmlcoldef(DmSqlParser.XmlcoldefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#on_error}.
	 * @param ctx the parse tree
	 */
	void enterOn_error(DmSqlParser.On_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#on_error}.
	 * @param ctx the parse tree
	 */
	void exitOn_error(DmSqlParser.On_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#jsoncol_lst}.
	 * @param ctx the parse tree
	 */
	void enterJsoncol_lst(DmSqlParser.Jsoncol_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#jsoncol_lst}.
	 * @param ctx the parse tree
	 */
	void exitJsoncol_lst(DmSqlParser.Jsoncol_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#jsoncoldef_lst}.
	 * @param ctx the parse tree
	 */
	void enterJsoncoldef_lst(DmSqlParser.Jsoncoldef_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#jsoncoldef_lst}.
	 * @param ctx the parse tree
	 */
	void exitJsoncoldef_lst(DmSqlParser.Jsoncoldef_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#jsoncoldef}.
	 * @param ctx the parse tree
	 */
	void enterJsoncoldef(DmSqlParser.JsoncoldefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#jsoncoldef}.
	 * @param ctx the parse tree
	 */
	void exitJsoncoldef(DmSqlParser.JsoncoldefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_exists_col}.
	 * @param ctx the parse tree
	 */
	void enterJson_exists_col(DmSqlParser.Json_exists_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_exists_col}.
	 * @param ctx the parse tree
	 */
	void exitJson_exists_col(DmSqlParser.Json_exists_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_qurey_col}.
	 * @param ctx the parse tree
	 */
	void enterJson_qurey_col(DmSqlParser.Json_qurey_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_qurey_col}.
	 * @param ctx the parse tree
	 */
	void exitJson_qurey_col(DmSqlParser.Json_qurey_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_value_col}.
	 * @param ctx the parse tree
	 */
	void enterJson_value_col(DmSqlParser.Json_value_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_value_col}.
	 * @param ctx the parse tree
	 */
	void exitJson_value_col(DmSqlParser.Json_value_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_nested_col}.
	 * @param ctx the parse tree
	 */
	void enterJson_nested_col(DmSqlParser.Json_nested_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_nested_col}.
	 * @param ctx the parse tree
	 */
	void exitJson_nested_col(DmSqlParser.Json_nested_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ordinality_col}.
	 * @param ctx the parse tree
	 */
	void enterOrdinality_col(DmSqlParser.Ordinality_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ordinality_col}.
	 * @param ctx the parse tree
	 */
	void exitOrdinality_col(DmSqlParser.Ordinality_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cross_outer_apply_clause}.
	 * @param ctx the parse tree
	 */
	void enterCross_outer_apply_clause(DmSqlParser.Cross_outer_apply_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cross_outer_apply_clause}.
	 * @param ctx the parse tree
	 */
	void exitCross_outer_apply_clause(DmSqlParser.Cross_outer_apply_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cross_outer_apply_join}.
	 * @param ctx the parse tree
	 */
	void enterCross_outer_apply_join(DmSqlParser.Cross_outer_apply_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cross_outer_apply_join}.
	 * @param ctx the parse tree
	 */
	void exitCross_outer_apply_join(DmSqlParser.Cross_outer_apply_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void enterCross_join(DmSqlParser.Cross_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void exitCross_join(DmSqlParser.Cross_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#partition_out_join}.
	 * @param ctx the parse tree
	 */
	void enterPartition_out_join(DmSqlParser.Partition_out_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#partition_out_join}.
	 * @param ctx the parse tree
	 */
	void exitPartition_out_join(DmSqlParser.Partition_out_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#qualified_join}.
	 * @param ctx the parse tree
	 */
	void enterQualified_join(DmSqlParser.Qualified_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#qualified_join}.
	 * @param ctx the parse tree
	 */
	void exitQualified_join(DmSqlParser.Qualified_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#qualified_joinspec}.
	 * @param ctx the parse tree
	 */
	void enterQualified_joinspec(DmSqlParser.Qualified_joinspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#qualified_joinspec}.
	 * @param ctx the parse tree
	 */
	void exitQualified_joinspec(DmSqlParser.Qualified_joinspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#named_columns_join}.
	 * @param ctx the parse tree
	 */
	void enterNamed_columns_join(DmSqlParser.Named_columns_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#named_columns_join}.
	 * @param ctx the parse tree
	 */
	void exitNamed_columns_join(DmSqlParser.Named_columns_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#join_hint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_hint(DmSqlParser.Join_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#join_hint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_hint(DmSqlParser.Join_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(DmSqlParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(DmSqlParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(DmSqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(DmSqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(DmSqlParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(DmSqlParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(DmSqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(DmSqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#group_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_item(DmSqlParser.Group_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#group_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_item(DmSqlParser.Group_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp_rollup_cube_item}.
	 * @param ctx the parse tree
	 */
	void enterExp_rollup_cube_item(DmSqlParser.Exp_rollup_cube_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp_rollup_cube_item}.
	 * @param ctx the parse tree
	 */
	void exitExp_rollup_cube_item(DmSqlParser.Exp_rollup_cube_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grouping_set_items}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set_items(DmSqlParser.Grouping_set_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grouping_set_items}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set_items(DmSqlParser.Grouping_set_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grouping_set_item}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set_item(DmSqlParser.Grouping_set_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grouping_set_item}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set_item(DmSqlParser.Grouping_set_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(DmSqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(DmSqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#without_into_select}.
	 * @param ctx the parse tree
	 */
	void enterWithout_into_select(DmSqlParser.Without_into_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#without_into_select}.
	 * @param ctx the parse tree
	 */
	void exitWithout_into_select(DmSqlParser.Without_into_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sel_clause_app}.
	 * @param ctx the parse tree
	 */
	void enterSel_clause_app(DmSqlParser.Sel_clause_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sel_clause_app}.
	 * @param ctx the parse tree
	 */
	void exitSel_clause_app(DmSqlParser.Sel_clause_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(DmSqlParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(DmSqlParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select(DmSqlParser.Simple_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select(DmSqlParser.Simple_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#select_with_paran}.
	 * @param ctx the parse tree
	 */
	void enterSelect_with_paran(DmSqlParser.Select_with_paranContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#select_with_paran}.
	 * @param ctx the parse tree
	 */
	void exitSelect_with_paran(DmSqlParser.Select_with_paranContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#query_exp}.
	 * @param ctx the parse tree
	 */
	void enterQuery_exp(DmSqlParser.Query_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#query_exp}.
	 * @param ctx the parse tree
	 */
	void exitQuery_exp(DmSqlParser.Query_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#for_xml_path}.
	 * @param ctx the parse tree
	 */
	void enterFor_xml_path(DmSqlParser.For_xml_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#for_xml_path}.
	 * @param ctx the parse tree
	 */
	void exitFor_xml_path(DmSqlParser.For_xml_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_tag}.
	 * @param ctx the parse tree
	 */
	void enterWith_tag(DmSqlParser.With_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_tag}.
	 * @param ctx the parse tree
	 */
	void exitWith_tag(DmSqlParser.With_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_option(DmSqlParser.With_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_option(DmSqlParser.With_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(DmSqlParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(DmSqlParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_function_list}.
	 * @param ctx the parse tree
	 */
	void enterWith_function_list(DmSqlParser.With_function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_function_list}.
	 * @param ctx the parse tree
	 */
	void exitWith_function_list(DmSqlParser.With_function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#func_def_inner}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def_inner(DmSqlParser.Func_def_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#func_def_inner}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def_inner(DmSqlParser.Func_def_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_function_list_element}.
	 * @param ctx the parse tree
	 */
	void enterWith_function_list_element(DmSqlParser.With_function_list_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_function_list_element}.
	 * @param ctx the parse tree
	 */
	void exitWith_function_list_element(DmSqlParser.With_function_list_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_view_list}.
	 * @param ctx the parse tree
	 */
	void enterWith_view_list(DmSqlParser.With_view_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_view_list}.
	 * @param ctx the parse tree
	 */
	void exitWith_view_list(DmSqlParser.With_view_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#depth_type_option}.
	 * @param ctx the parse tree
	 */
	void enterDepth_type_option(DmSqlParser.Depth_type_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#depth_type_option}.
	 * @param ctx the parse tree
	 */
	void exitDepth_type_option(DmSqlParser.Depth_type_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(DmSqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(DmSqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(DmSqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(DmSqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_view_list_element}.
	 * @param ctx the parse tree
	 */
	void enterWith_view_list_element(DmSqlParser.With_view_list_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_view_list_element}.
	 * @param ctx the parse tree
	 */
	void exitWith_view_list_element(DmSqlParser.With_view_list_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#assignment_obj_list}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_obj_list(DmSqlParser.Assignment_obj_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#assignment_obj_list}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_obj_list(DmSqlParser.Assignment_obj_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#assignment_obj}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_obj(DmSqlParser.Assignment_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#assignment_obj}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_obj(DmSqlParser.Assignment_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#order_by_options}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_options(DmSqlParser.Order_by_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#order_by_options}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_options(DmSqlParser.Order_by_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#order_by}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by(DmSqlParser.Order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#order_by}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by(DmSqlParser.Order_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#asc_desc_option}.
	 * @param ctx the parse tree
	 */
	void enterAsc_desc_option(DmSqlParser.Asc_desc_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#asc_desc_option}.
	 * @param ctx the parse tree
	 */
	void exitAsc_desc_option(DmSqlParser.Asc_desc_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#nulls_last_option}.
	 * @param ctx the parse tree
	 */
	void enterNulls_last_option(DmSqlParser.Nulls_last_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#nulls_last_option}.
	 * @param ctx the parse tree
	 */
	void exitNulls_last_option(DmSqlParser.Nulls_last_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#collate_option}.
	 * @param ctx the parse tree
	 */
	void enterCollate_option(DmSqlParser.Collate_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#collate_option}.
	 * @param ctx the parse tree
	 */
	void exitCollate_option(DmSqlParser.Collate_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_list(DmSqlParser.Order_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_list(DmSqlParser.Order_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#order_by_item}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_item(DmSqlParser.Order_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#order_by_item}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_item(DmSqlParser.Order_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(DmSqlParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(DmSqlParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(DmSqlParser.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(DmSqlParser.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_session_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_stmt(DmSqlParser.Set_session_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_session_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_stmt(DmSqlParser.Set_session_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_trans_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_trans_stmt(DmSqlParser.Set_trans_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_trans_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_trans_stmt(DmSqlParser.Set_trans_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trans_mode_lstl}.
	 * @param ctx the parse tree
	 */
	void enterTrans_mode_lstl(DmSqlParser.Trans_mode_lstlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trans_mode_lstl}.
	 * @param ctx the parse tree
	 */
	void exitTrans_mode_lstl(DmSqlParser.Trans_mode_lstlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trans_mode_lst}.
	 * @param ctx the parse tree
	 */
	void enterTrans_mode_lst(DmSqlParser.Trans_mode_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trans_mode_lst}.
	 * @param ctx the parse tree
	 */
	void exitTrans_mode_lst(DmSqlParser.Trans_mode_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trans_mode}.
	 * @param ctx the parse tree
	 */
	void enterTrans_mode(DmSqlParser.Trans_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trans_mode}.
	 * @param ctx the parse tree
	 */
	void exitTrans_mode(DmSqlParser.Trans_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#time_zone_exp_new}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_exp_new(DmSqlParser.Time_zone_exp_newContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#time_zone_exp_new}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_exp_new(DmSqlParser.Time_zone_exp_newContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trans_rw_option}.
	 * @param ctx the parse tree
	 */
	void enterTrans_rw_option(DmSqlParser.Trans_rw_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trans_rw_option}.
	 * @param ctx the parse tree
	 */
	void exitTrans_rw_option(DmSqlParser.Trans_rw_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trans_level_option}.
	 * @param ctx the parse tree
	 */
	void enterTrans_level_option(DmSqlParser.Trans_level_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trans_level_option}.
	 * @param ctx the parse tree
	 */
	void exitTrans_level_option(DmSqlParser.Trans_level_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lock_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_stmt(DmSqlParser.Lock_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lock_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_stmt(DmSqlParser.Lock_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lock_mode_option}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode_option(DmSqlParser.Lock_mode_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lock_mode_option}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode_option(DmSqlParser.Lock_mode_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_identins_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_identins_stmt(DmSqlParser.Set_identins_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_identins_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_identins_stmt(DmSqlParser.Set_identins_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_identins_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_identins_option(DmSqlParser.Set_identins_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_identins_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_identins_option(DmSqlParser.Set_identins_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trunc_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTrunc_table_stmt(DmSqlParser.Trunc_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trunc_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTrunc_table_stmt(DmSqlParser.Trunc_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(DmSqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(DmSqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_body(DmSqlParser.Update_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_body(DmSqlParser.Update_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_tv_list}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_tv_list(DmSqlParser.Update_tv_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_tv_list}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_tv_list(DmSqlParser.Update_tv_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#return_item}.
	 * @param ctx the parse tree
	 */
	void enterReturn_item(DmSqlParser.Return_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#return_item}.
	 * @param ctx the parse tree
	 */
	void exitReturn_item(DmSqlParser.Return_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#return_item_list}.
	 * @param ctx the parse tree
	 */
	void enterReturn_item_list(DmSqlParser.Return_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#return_item_list}.
	 * @param ctx the parse tree
	 */
	void exitReturn_item_list(DmSqlParser.Return_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#return_option}.
	 * @param ctx the parse tree
	 */
	void enterReturn_option(DmSqlParser.Return_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#return_option}.
	 * @param ctx the parse tree
	 */
	void exitReturn_option(DmSqlParser.Return_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#return_into_obj}.
	 * @param ctx the parse tree
	 */
	void enterReturn_into_obj(DmSqlParser.Return_into_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#return_into_obj}.
	 * @param ctx the parse tree
	 */
	void exitReturn_into_obj(DmSqlParser.Return_into_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#collect_into_rset}.
	 * @param ctx the parse tree
	 */
	void enterCollect_into_rset(DmSqlParser.Collect_into_rsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#collect_into_rset}.
	 * @param ctx the parse tree
	 */
	void exitCollect_into_rset(DmSqlParser.Collect_into_rsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alias_option}.
	 * @param ctx the parse tree
	 */
	void enterAlias_option(DmSqlParser.Alias_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alias_option}.
	 * @param ctx the parse tree
	 */
	void exitAlias_option(DmSqlParser.Alias_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_value_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_value_list(DmSqlParser.Set_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_value_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_value_list(DmSqlParser.Set_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_value_node}.
	 * @param ctx the parse tree
	 */
	void enterSet_value_node(DmSqlParser.Set_value_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_value_node}.
	 * @param ctx the parse tree
	 */
	void exitSet_value_node(DmSqlParser.Set_value_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#set_col_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_col_list(DmSqlParser.Set_col_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#set_col_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_col_list(DmSqlParser.Set_col_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#update_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_from_clause(DmSqlParser.Update_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#update_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_from_clause(DmSqlParser.Update_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#merge_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMerge_into_stmt(DmSqlParser.Merge_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#merge_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMerge_into_stmt(DmSqlParser.Merge_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#merge_into_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterMerge_into_stmt_body(DmSqlParser.Merge_into_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#merge_into_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitMerge_into_stmt_body(DmSqlParser.Merge_into_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#merge_into_sub_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_into_sub_clause(DmSqlParser.Merge_into_sub_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#merge_into_sub_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_into_sub_clause(DmSqlParser.Merge_into_sub_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(DmSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(DmSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(DmSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(DmSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_profile_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_profile_stmt(DmSqlParser.Create_profile_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_profile_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_profile_stmt(DmSqlParser.Create_profile_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_profile_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_profile_stmt(DmSqlParser.Alter_profile_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_profile_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_profile_stmt(DmSqlParser.Alter_profile_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_stmt(DmSqlParser.Create_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_stmt(DmSqlParser.Create_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_user_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_option(DmSqlParser.Create_user_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_user_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_option(DmSqlParser.Create_user_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_ts_name}.
	 * @param ctx the parse tree
	 */
	void enterDefault_ts_name(DmSqlParser.Default_ts_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_ts_name}.
	 * @param ctx the parse tree
	 */
	void exitDefault_ts_name(DmSqlParser.Default_ts_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_ts_name_lst}.
	 * @param ctx the parse tree
	 */
	void enterDefault_ts_name_lst(DmSqlParser.Default_ts_name_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_ts_name_lst}.
	 * @param ctx the parse tree
	 */
	void exitDefault_ts_name_lst(DmSqlParser.Default_ts_name_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_ts_name_node}.
	 * @param ctx the parse tree
	 */
	void enterDefault_ts_name_node(DmSqlParser.Default_ts_name_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_ts_name_node}.
	 * @param ctx the parse tree
	 */
	void exitDefault_ts_name_node(DmSqlParser.Default_ts_name_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_idx_ts_name}.
	 * @param ctx the parse tree
	 */
	void enterDefault_idx_ts_name(DmSqlParser.Default_idx_ts_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_idx_ts_name}.
	 * @param ctx the parse tree
	 */
	void exitDefault_idx_ts_name(DmSqlParser.Default_idx_ts_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_ts_name_low}.
	 * @param ctx the parse tree
	 */
	void enterDefault_ts_name_low(DmSqlParser.Default_ts_name_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_ts_name_low}.
	 * @param ctx the parse tree
	 */
	void exitDefault_ts_name_low(DmSqlParser.Default_ts_name_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#temp_ts_name}.
	 * @param ctx the parse tree
	 */
	void enterTemp_ts_name(DmSqlParser.Temp_ts_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#temp_ts_name}.
	 * @param ctx the parse tree
	 */
	void exitTemp_ts_name(DmSqlParser.Temp_ts_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#default_ts_group_name_low}.
	 * @param ctx the parse tree
	 */
	void enterDefault_ts_group_name_low(DmSqlParser.Default_ts_group_name_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#default_ts_group_name_low}.
	 * @param ctx the parse tree
	 */
	void exitDefault_ts_group_name_low(DmSqlParser.Default_ts_group_name_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#on_schema}.
	 * @param ctx the parse tree
	 */
	void enterOn_schema(DmSqlParser.On_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#on_schema}.
	 * @param ctx the parse tree
	 */
	void exitOn_schema(DmSqlParser.On_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#replace_old_pwd}.
	 * @param ctx the parse tree
	 */
	void enterReplace_old_pwd(DmSqlParser.Replace_old_pwdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#replace_old_pwd}.
	 * @param ctx the parse tree
	 */
	void exitReplace_old_pwd(DmSqlParser.Replace_old_pwdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_stmt(DmSqlParser.Alter_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_stmt(DmSqlParser.Alter_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_encrypt_options}.
	 * @param ctx the parse tree
	 */
	void enterUser_encrypt_options(DmSqlParser.User_encrypt_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_encrypt_options}.
	 * @param ctx the parse tree
	 */
	void exitUser_encrypt_options(DmSqlParser.User_encrypt_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_encrypt_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_encrypt_option(DmSqlParser.User_encrypt_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_encrypt_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_encrypt_option(DmSqlParser.User_encrypt_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#authent_type_options}.
	 * @param ctx the parse tree
	 */
	void enterAuthent_type_options(DmSqlParser.Authent_type_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#authent_type_options}.
	 * @param ctx the parse tree
	 */
	void exitAuthent_type_options(DmSqlParser.Authent_type_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#hash_cipher_option}.
	 * @param ctx the parse tree
	 */
	void enterHash_cipher_option(DmSqlParser.Hash_cipher_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#hash_cipher_option}.
	 * @param ctx the parse tree
	 */
	void exitHash_cipher_option(DmSqlParser.Hash_cipher_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#authent_type}.
	 * @param ctx the parse tree
	 */
	void enterAuthent_type(DmSqlParser.Authent_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#authent_type}.
	 * @param ctx the parse tree
	 */
	void exitAuthent_type(DmSqlParser.Authent_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#force_format}.
	 * @param ctx the parse tree
	 */
	void enterForce_format(DmSqlParser.Force_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#force_format}.
	 * @param ctx the parse tree
	 */
	void exitForce_format(DmSqlParser.Force_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(DmSqlParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(DmSqlParser.AsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pwd_policy}.
	 * @param ctx the parse tree
	 */
	void enterPwd_policy(DmSqlParser.Pwd_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pwd_policy}.
	 * @param ctx the parse tree
	 */
	void exitPwd_policy(DmSqlParser.Pwd_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#account_lock}.
	 * @param ctx the parse tree
	 */
	void enterAccount_lock(DmSqlParser.Account_lockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#account_lock}.
	 * @param ctx the parse tree
	 */
	void exitAccount_lock(DmSqlParser.Account_lockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#read_only_flag}.
	 * @param ctx the parse tree
	 */
	void enterRead_only_flag(DmSqlParser.Read_only_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#read_only_flag}.
	 * @param ctx the parse tree
	 */
	void exitRead_only_flag(DmSqlParser.Read_only_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#read_only_flag_not_null}.
	 * @param ctx the parse tree
	 */
	void enterRead_only_flag_not_null(DmSqlParser.Read_only_flag_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#read_only_flag_not_null}.
	 * @param ctx the parse tree
	 */
	void exitRead_only_flag_not_null(DmSqlParser.Read_only_flag_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(DmSqlParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(DmSqlParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#expire}.
	 * @param ctx the parse tree
	 */
	void enterExpire(DmSqlParser.ExpireContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#expire}.
	 * @param ctx the parse tree
	 */
	void exitExpire(DmSqlParser.ExpireContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit_options}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit_options(DmSqlParser.Resource_limit_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit_options}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit_options(DmSqlParser.Resource_limit_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit_list}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit_list(DmSqlParser.Resource_limit_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit_list}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit_list(DmSqlParser.Resource_limit_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit_list_with_comma}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit_list_with_comma(DmSqlParser.Resource_limit_list_with_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit_list_with_comma}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit_list_with_comma(DmSqlParser.Resource_limit_list_with_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit_list_with_empty}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit_list_with_empty(DmSqlParser.Resource_limit_list_with_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit_list_with_empty}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit_list_with_empty(DmSqlParser.Resource_limit_list_with_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit(DmSqlParser.Resource_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit(DmSqlParser.Resource_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit_option}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit_option(DmSqlParser.Resource_limit_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit_option}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit_option(DmSqlParser.Resource_limit_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#resource_limit_value}.
	 * @param ctx the parse tree
	 */
	void enterResource_limit_value(DmSqlParser.Resource_limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#resource_limit_value}.
	 * @param ctx the parse tree
	 */
	void exitResource_limit_value(DmSqlParser.Resource_limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_audit_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_audit_rule_stmt(DmSqlParser.Create_audit_rule_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_audit_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_audit_rule_stmt(DmSqlParser.Create_audit_rule_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rule_name}.
	 * @param ctx the parse tree
	 */
	void enterRule_name(DmSqlParser.Rule_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rule_name}.
	 * @param ctx the parse tree
	 */
	void exitRule_name(DmSqlParser.Rule_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#audit_rule_action}.
	 * @param ctx the parse tree
	 */
	void enterAudit_rule_action(DmSqlParser.Audit_rule_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#audit_rule_action}.
	 * @param ctx the parse tree
	 */
	void exitAudit_rule_action(DmSqlParser.Audit_rule_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#by_login_or_all}.
	 * @param ctx the parse tree
	 */
	void enterBy_login_or_all(DmSqlParser.By_login_or_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#by_login_or_all}.
	 * @param ctx the parse tree
	 */
	void exitBy_login_or_all(DmSqlParser.By_login_or_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#allow_ip_list}.
	 * @param ctx the parse tree
	 */
	void enterAllow_ip_list(DmSqlParser.Allow_ip_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#allow_ip_list}.
	 * @param ctx the parse tree
	 */
	void exitAllow_ip_list(DmSqlParser.Allow_ip_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#not_allow_ip_list}.
	 * @param ctx the parse tree
	 */
	void enterNot_allow_ip_list(DmSqlParser.Not_allow_ip_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#not_allow_ip_list}.
	 * @param ctx the parse tree
	 */
	void exitNot_allow_ip_list(DmSqlParser.Not_allow_ip_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ip_list}.
	 * @param ctx the parse tree
	 */
	void enterIp_list(DmSqlParser.Ip_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ip_list}.
	 * @param ctx the parse tree
	 */
	void exitIp_list(DmSqlParser.Ip_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#allow_dt_list}.
	 * @param ctx the parse tree
	 */
	void enterAllow_dt_list(DmSqlParser.Allow_dt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#allow_dt_list}.
	 * @param ctx the parse tree
	 */
	void exitAllow_dt_list(DmSqlParser.Allow_dt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#not_allow_dt_list}.
	 * @param ctx the parse tree
	 */
	void enterNot_allow_dt_list(DmSqlParser.Not_allow_dt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#not_allow_dt_list}.
	 * @param ctx the parse tree
	 */
	void exitNot_allow_dt_list(DmSqlParser.Not_allow_dt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dt_list}.
	 * @param ctx the parse tree
	 */
	void enterDt_list(DmSqlParser.Dt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dt_list}.
	 * @param ctx the parse tree
	 */
	void exitDt_list(DmSqlParser.Dt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dt}.
	 * @param ctx the parse tree
	 */
	void enterDt(DmSqlParser.DtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dt}.
	 * @param ctx the parse tree
	 */
	void exitDt(DmSqlParser.DtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#op_freq}.
	 * @param ctx the parse tree
	 */
	void enterOp_freq(DmSqlParser.Op_freqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#op_freq}.
	 * @param ctx the parse tree
	 */
	void exitOp_freq(DmSqlParser.Op_freqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#quota_val}.
	 * @param ctx the parse tree
	 */
	void enterQuota_val(DmSqlParser.Quota_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#quota_val}.
	 * @param ctx the parse tree
	 */
	void exitQuota_val(DmSqlParser.Quota_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#quota_ts_node}.
	 * @param ctx the parse tree
	 */
	void enterQuota_ts_node(DmSqlParser.Quota_ts_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#quota_ts_node}.
	 * @param ctx the parse tree
	 */
	void exitQuota_ts_node(DmSqlParser.Quota_ts_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#quota_ts_lst}.
	 * @param ctx the parse tree
	 */
	void enterQuota_ts_lst(DmSqlParser.Quota_ts_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#quota_ts_lst}.
	 * @param ctx the parse tree
	 */
	void exitQuota_ts_lst(DmSqlParser.Quota_ts_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#quota_ts}.
	 * @param ctx the parse tree
	 */
	void enterQuota_ts(DmSqlParser.Quota_tsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#quota_ts}.
	 * @param ctx the parse tree
	 */
	void exitQuota_ts(DmSqlParser.Quota_tsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_role_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_role_stmt(DmSqlParser.Create_role_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_role_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_role_stmt(DmSqlParser.Create_role_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_dblink_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_dblink_stmt(DmSqlParser.Create_dblink_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_dblink_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_dblink_stmt(DmSqlParser.Create_dblink_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#db_type_str}.
	 * @param ctx the parse tree
	 */
	void enterDb_type_str(DmSqlParser.Db_type_strContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#db_type_str}.
	 * @param ctx the parse tree
	 */
	void exitDb_type_str(DmSqlParser.Db_type_strContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dblink_option_lst_options}.
	 * @param ctx the parse tree
	 */
	void enterDblink_option_lst_options(DmSqlParser.Dblink_option_lst_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dblink_option_lst_options}.
	 * @param ctx the parse tree
	 */
	void exitDblink_option_lst_options(DmSqlParser.Dblink_option_lst_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dblink_option_lst}.
	 * @param ctx the parse tree
	 */
	void enterDblink_option_lst(DmSqlParser.Dblink_option_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dblink_option_lst}.
	 * @param ctx the parse tree
	 */
	void exitDblink_option_lst(DmSqlParser.Dblink_option_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dblink_option}.
	 * @param ctx the parse tree
	 */
	void enterDblink_option(DmSqlParser.Dblink_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dblink_option}.
	 * @param ctx the parse tree
	 */
	void exitDblink_option(DmSqlParser.Dblink_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_synonym_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym_stmt(DmSqlParser.Create_synonym_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_synonym_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym_stmt(DmSqlParser.Create_synonym_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_synonym_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_synonym_name(DmSqlParser.Full_synonym_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_synonym_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_synonym_name(DmSqlParser.Full_synonym_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_obj_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_obj_name(DmSqlParser.Full_obj_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_obj_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_obj_name(DmSqlParser.Full_obj_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_domain_stmt(DmSqlParser.Create_domain_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_domain_stmt(DmSqlParser.Create_domain_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_default_option}.
	 * @param ctx the parse tree
	 */
	void enterDomain_default_option(DmSqlParser.Domain_default_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_default_option}.
	 * @param ctx the parse tree
	 */
	void exitDomain_default_option(DmSqlParser.Domain_default_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraints_option}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraints_option(DmSqlParser.Domain_constraints_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraints_option}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraints_option(DmSqlParser.Domain_constraints_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraints_def}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraints_def(DmSqlParser.Domain_constraints_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraints_def}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraints_def(DmSqlParser.Domain_constraints_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraints}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraints(DmSqlParser.Domain_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraints}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraints(DmSqlParser.Domain_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint(DmSqlParser.Domain_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint(DmSqlParser.Domain_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraint_name_def_options}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint_name_def_options(DmSqlParser.Domain_constraint_name_def_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraint_name_def_options}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint_name_def_options(DmSqlParser.Domain_constraint_name_def_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraint_name_def}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint_name_def(DmSqlParser.Domain_constraint_name_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraint_name_def}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint_name_def(DmSqlParser.Domain_constraint_name_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#domain_constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint_name(DmSqlParser.Domain_constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#domain_constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint_name(DmSqlParser.Domain_constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_character_set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_character_set_stmt(DmSqlParser.Create_character_set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_character_set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_character_set_stmt(DmSqlParser.Create_character_set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#character_set_source}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_source(DmSqlParser.Character_set_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#character_set_source}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_source(DmSqlParser.Character_set_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#existing_character_set_name}.
	 * @param ctx the parse tree
	 */
	void enterExisting_character_set_name(DmSqlParser.Existing_character_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#existing_character_set_name}.
	 * @param ctx the parse tree
	 */
	void exitExisting_character_set_name(DmSqlParser.Existing_character_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#character_set_name}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set_name(DmSqlParser.Character_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#character_set_name}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set_name(DmSqlParser.Character_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#collate_clause_option}.
	 * @param ctx the parse tree
	 */
	void enterCollate_clause_option(DmSqlParser.Collate_clause_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#collate_clause_option}.
	 * @param ctx the parse tree
	 */
	void exitCollate_clause_option(DmSqlParser.Collate_clause_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(DmSqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(DmSqlParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_collation_stmt(DmSqlParser.Create_collation_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_collation_stmt(DmSqlParser.Create_collation_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#existing_collation_name}.
	 * @param ctx the parse tree
	 */
	void enterExisting_collation_name(DmSqlParser.Existing_collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#existing_collation_name}.
	 * @param ctx the parse tree
	 */
	void exitExisting_collation_name(DmSqlParser.Existing_collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pad_option}.
	 * @param ctx the parse tree
	 */
	void enterPad_option(DmSqlParser.Pad_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pad_option}.
	 * @param ctx the parse tree
	 */
	void exitPad_option(DmSqlParser.Pad_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence_stmt(DmSqlParser.Create_sequence_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence_stmt(DmSqlParser.Create_sequence_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sequence_option_list_options}.
	 * @param ctx the parse tree
	 */
	void enterSequence_option_list_options(DmSqlParser.Sequence_option_list_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sequence_option_list_options}.
	 * @param ctx the parse tree
	 */
	void exitSequence_option_list_options(DmSqlParser.Sequence_option_list_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sequence_option_list}.
	 * @param ctx the parse tree
	 */
	void enterSequence_option_list(DmSqlParser.Sequence_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sequence_option_list}.
	 * @param ctx the parse tree
	 */
	void exitSequence_option_list(DmSqlParser.Sequence_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sequence_option}.
	 * @param ctx the parse tree
	 */
	void enterSequence_option(DmSqlParser.Sequence_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sequence_option}.
	 * @param ctx the parse tree
	 */
	void exitSequence_option(DmSqlParser.Sequence_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(DmSqlParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(DmSqlParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#increment_option}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_option(DmSqlParser.Increment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#increment_option}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_option(DmSqlParser.Increment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#start_option}.
	 * @param ctx the parse tree
	 */
	void enterStart_option(DmSqlParser.Start_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#start_option}.
	 * @param ctx the parse tree
	 */
	void exitStart_option(DmSqlParser.Start_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#current_option}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_option(DmSqlParser.Current_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#current_option}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_option(DmSqlParser.Current_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#maxvalue_option}.
	 * @param ctx the parse tree
	 */
	void enterMaxvalue_option(DmSqlParser.Maxvalue_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#maxvalue_option}.
	 * @param ctx the parse tree
	 */
	void exitMaxvalue_option(DmSqlParser.Maxvalue_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#minvalue_option}.
	 * @param ctx the parse tree
	 */
	void enterMinvalue_option(DmSqlParser.Minvalue_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#minvalue_option}.
	 * @param ctx the parse tree
	 */
	void exitMinvalue_option(DmSqlParser.Minvalue_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cycle_option}.
	 * @param ctx the parse tree
	 */
	void enterCycle_option(DmSqlParser.Cycle_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cycle_option}.
	 * @param ctx the parse tree
	 */
	void exitCycle_option(DmSqlParser.Cycle_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cache_option}.
	 * @param ctx the parse tree
	 */
	void enterCache_option(DmSqlParser.Cache_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cache_option}.
	 * @param ctx the parse tree
	 */
	void exitCache_option(DmSqlParser.Cache_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#order_option}.
	 * @param ctx the parse tree
	 */
	void enterOrder_option(DmSqlParser.Order_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#order_option}.
	 * @param ctx the parse tree
	 */
	void exitOrder_option(DmSqlParser.Order_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#seq_local_option}.
	 * @param ctx the parse tree
	 */
	void enterSeq_local_option(DmSqlParser.Seq_local_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#seq_local_option}.
	 * @param ctx the parse tree
	 */
	void exitSeq_local_option(DmSqlParser.Seq_local_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#whenever_stmt_options}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_stmt_options(DmSqlParser.Whenever_stmt_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#whenever_stmt_options}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_stmt_options(DmSqlParser.Whenever_stmt_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#whenever_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_stmt(DmSqlParser.Whenever_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#whenever_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_stmt(DmSqlParser.Whenever_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(DmSqlParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(DmSqlParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt_body(DmSqlParser.Grant_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt_body(DmSqlParser.Grant_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#revoke_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_stmt(DmSqlParser.Revoke_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#revoke_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_stmt(DmSqlParser.Revoke_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#revoke_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_stmt_body(DmSqlParser.Revoke_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#revoke_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_stmt_body(DmSqlParser.Revoke_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_privs}.
	 * @param ctx the parse tree
	 */
	void enterGrant_privs(DmSqlParser.Grant_privsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_privs}.
	 * @param ctx the parse tree
	 */
	void exitGrant_privs(DmSqlParser.Grant_privsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_priv_list}.
	 * @param ctx the parse tree
	 */
	void enterGrant_priv_list(DmSqlParser.Grant_priv_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_priv_list}.
	 * @param ctx the parse tree
	 */
	void exitGrant_priv_list(DmSqlParser.Grant_priv_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_priv_off}.
	 * @param ctx the parse tree
	 */
	void enterGrant_priv_off(DmSqlParser.Grant_priv_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_priv_off}.
	 * @param ctx the parse tree
	 */
	void exitGrant_priv_off(DmSqlParser.Grant_priv_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_priv}.
	 * @param ctx the parse tree
	 */
	void enterGrant_priv(DmSqlParser.Grant_privContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_priv}.
	 * @param ctx the parse tree
	 */
	void exitGrant_priv(DmSqlParser.Grant_privContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#revoke_action}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_action(DmSqlParser.Revoke_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#revoke_action}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_action(DmSqlParser.Revoke_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#db_priv_list}.
	 * @param ctx the parse tree
	 */
	void enterDb_priv_list(DmSqlParser.Db_priv_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#db_priv_list}.
	 * @param ctx the parse tree
	 */
	void exitDb_priv_list(DmSqlParser.Db_priv_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#db_priv}.
	 * @param ctx the parse tree
	 */
	void enterDb_priv(DmSqlParser.Db_privContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#db_priv}.
	 * @param ctx the parse tree
	 */
	void exitDb_priv(DmSqlParser.Db_privContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#by_grantor}.
	 * @param ctx the parse tree
	 */
	void enterBy_grantor(DmSqlParser.By_grantorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#by_grantor}.
	 * @param ctx the parse tree
	 */
	void exitBy_grantor(DmSqlParser.By_grantorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grantees}.
	 * @param ctx the parse tree
	 */
	void enterGrantees(DmSqlParser.GranteesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grantees}.
	 * @param ctx the parse tree
	 */
	void exitGrantees(DmSqlParser.GranteesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_stmt(DmSqlParser.Create_schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_stmt(DmSqlParser.Create_schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oprt_arg}.
	 * @param ctx the parse tree
	 */
	void enterOprt_arg(DmSqlParser.Oprt_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oprt_arg}.
	 * @param ctx the parse tree
	 */
	void exitOprt_arg(DmSqlParser.Oprt_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#oprt_arg_lst}.
	 * @param ctx the parse tree
	 */
	void enterOprt_arg_lst(DmSqlParser.Oprt_arg_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#oprt_arg_lst}.
	 * @param ctx the parse tree
	 */
	void exitOprt_arg_lst(DmSqlParser.Oprt_arg_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_stmt(DmSqlParser.Create_operator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_stmt(DmSqlParser.Create_operator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_stmt(DmSqlParser.Drop_operator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_stmt(DmSqlParser.Drop_operator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#grant_and_ddl}.
	 * @param ctx the parse tree
	 */
	void enterGrant_and_ddl(DmSqlParser.Grant_and_ddlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#grant_and_ddl}.
	 * @param ctx the parse tree
	 */
	void exitGrant_and_ddl(DmSqlParser.Grant_and_ddlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#top_exp}.
	 * @param ctx the parse tree
	 */
	void enterTop_exp(DmSqlParser.Top_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#top_exp}.
	 * @param ctx the parse tree
	 */
	void exitTop_exp(DmSqlParser.Top_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#u_oprt}.
	 * @param ctx the parse tree
	 */
	void enterU_oprt(DmSqlParser.U_oprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#u_oprt}.
	 * @param ctx the parse tree
	 */
	void exitU_oprt(DmSqlParser.U_oprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#qualified_u_oprt}.
	 * @param ctx the parse tree
	 */
	void enterQualified_u_oprt(DmSqlParser.Qualified_u_oprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#qualified_u_oprt}.
	 * @param ctx the parse tree
	 */
	void exitQualified_u_oprt(DmSqlParser.Qualified_u_oprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp_u_oprt}.
	 * @param ctx the parse tree
	 */
	void enterExp_u_oprt(DmSqlParser.Exp_u_oprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp_u_oprt}.
	 * @param ctx the parse tree
	 */
	void exitExp_u_oprt(DmSqlParser.Exp_u_oprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#raw_exp}.
	 * @param ctx the parse tree
	 */
	void enterRaw_exp(DmSqlParser.Raw_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#raw_exp}.
	 * @param ctx the parse tree
	 */
	void exitRaw_exp(DmSqlParser.Raw_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(DmSqlParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(DmSqlParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(DmSqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(DmSqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp_pfx_option}.
	 * @param ctx the parse tree
	 */
	void enterExp_pfx_option(DmSqlParser.Exp_pfx_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp_pfx_option}.
	 * @param ctx the parse tree
	 */
	void exitExp_pfx_option(DmSqlParser.Exp_pfx_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#exp_invocation_option}.
	 * @param ctx the parse tree
	 */
	void enterExp_invocation_option(DmSqlParser.Exp_invocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#exp_invocation_option}.
	 * @param ctx the parse tree
	 */
	void exitExp_invocation_option(DmSqlParser.Exp_invocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#from_first_last_option}.
	 * @param ctx the parse tree
	 */
	void enterFrom_first_last_option(DmSqlParser.From_first_last_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#from_first_last_option}.
	 * @param ctx the parse tree
	 */
	void exitFrom_first_last_option(DmSqlParser.From_first_last_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#afun_arg_lst}.
	 * @param ctx the parse tree
	 */
	void enterAfun_arg_lst(DmSqlParser.Afun_arg_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#afun_arg_lst}.
	 * @param ctx the parse tree
	 */
	void exitAfun_arg_lst(DmSqlParser.Afun_arg_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#afun_arg_lst_low}.
	 * @param ctx the parse tree
	 */
	void enterAfun_arg_lst_low(DmSqlParser.Afun_arg_lst_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#afun_arg_lst_low}.
	 * @param ctx the parse tree
	 */
	void exitAfun_arg_lst_low(DmSqlParser.Afun_arg_lst_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#in_value_exp}.
	 * @param ctx the parse tree
	 */
	void enterIn_value_exp(DmSqlParser.In_value_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#in_value_exp}.
	 * @param ctx the parse tree
	 */
	void exitIn_value_exp(DmSqlParser.In_value_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#afun_partition_by}.
	 * @param ctx the parse tree
	 */
	void enterAfun_partition_by(DmSqlParser.Afun_partition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#afun_partition_by}.
	 * @param ctx the parse tree
	 */
	void exitAfun_partition_by(DmSqlParser.Afun_partition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#afun_windowing}.
	 * @param ctx the parse tree
	 */
	void enterAfun_windowing(DmSqlParser.Afun_windowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#afun_windowing}.
	 * @param ctx the parse tree
	 */
	void exitAfun_windowing(DmSqlParser.Afun_windowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#afun_windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterAfun_windowing_type(DmSqlParser.Afun_windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#afun_windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitAfun_windowing_type(DmSqlParser.Afun_windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#afun_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterAfun_range_clause(DmSqlParser.Afun_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#afun_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitAfun_range_clause(DmSqlParser.Afun_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterPexp(DmSqlParser.PexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitPexp(DmSqlParser.PexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_pfx}.
	 * @param ctx the parse tree
	 */
	void enterPexp_pfx(DmSqlParser.Pexp_pfxContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_pfx}.
	 * @param ctx the parse tree
	 */
	void exitPexp_pfx(DmSqlParser.Pexp_pfxContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_pfx_option}.
	 * @param ctx the parse tree
	 */
	void enterPexp_pfx_option(DmSqlParser.Pexp_pfx_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_pfx_option}.
	 * @param ctx the parse tree
	 */
	void exitPexp_pfx_option(DmSqlParser.Pexp_pfx_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_cast}.
	 * @param ctx the parse tree
	 */
	void enterPexp_cast(DmSqlParser.Pexp_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_cast}.
	 * @param ctx the parse tree
	 */
	void exitPexp_cast(DmSqlParser.Pexp_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_b}.
	 * @param ctx the parse tree
	 */
	void enterPexp_b(DmSqlParser.Pexp_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_b}.
	 * @param ctx the parse tree
	 */
	void exitPexp_b(DmSqlParser.Pexp_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_a}.
	 * @param ctx the parse tree
	 */
	void enterPexp_a(DmSqlParser.Pexp_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_a}.
	 * @param ctx the parse tree
	 */
	void exitPexp_a(DmSqlParser.Pexp_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_c}.
	 * @param ctx the parse tree
	 */
	void enterPexp_c(DmSqlParser.Pexp_cContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_c}.
	 * @param ctx the parse tree
	 */
	void exitPexp_c(DmSqlParser.Pexp_cContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_c_insert}.
	 * @param ctx the parse tree
	 */
	void enterPexp_c_insert(DmSqlParser.Pexp_c_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_c_insert}.
	 * @param ctx the parse tree
	 */
	void exitPexp_c_insert(DmSqlParser.Pexp_c_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_d}.
	 * @param ctx the parse tree
	 */
	void enterPexp_d(DmSqlParser.Pexp_dContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_d}.
	 * @param ctx the parse tree
	 */
	void exitPexp_d(DmSqlParser.Pexp_dContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_e}.
	 * @param ctx the parse tree
	 */
	void enterPexp_e(DmSqlParser.Pexp_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_e}.
	 * @param ctx the parse tree
	 */
	void exitPexp_e(DmSqlParser.Pexp_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_pfx2}.
	 * @param ctx the parse tree
	 */
	void enterPexp_pfx2(DmSqlParser.Pexp_pfx2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_pfx2}.
	 * @param ctx the parse tree
	 */
	void exitPexp_pfx2(DmSqlParser.Pexp_pfx2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_pfx2_option}.
	 * @param ctx the parse tree
	 */
	void enterPexp_pfx2_option(DmSqlParser.Pexp_pfx2_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_pfx2_option}.
	 * @param ctx the parse tree
	 */
	void exitPexp_pfx2_option(DmSqlParser.Pexp_pfx2_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#member2}.
	 * @param ctx the parse tree
	 */
	void enterMember2(DmSqlParser.Member2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#member2}.
	 * @param ctx the parse tree
	 */
	void exitMember2(DmSqlParser.Member2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pexp_c2_insert}.
	 * @param ctx the parse tree
	 */
	void enterPexp_c2_insert(DmSqlParser.Pexp_c2_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pexp_c2_insert}.
	 * @param ctx the parse tree
	 */
	void exitPexp_c2_insert(DmSqlParser.Pexp_c2_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#member_access2}.
	 * @param ctx the parse tree
	 */
	void enterMember_access2(DmSqlParser.Member_access2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#member_access2}.
	 * @param ctx the parse tree
	 */
	void exitMember_access2(DmSqlParser.Member_access2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#invocation_expression2}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_expression2(DmSqlParser.Invocation_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#invocation_expression2}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_expression2(DmSqlParser.Invocation_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(DmSqlParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(DmSqlParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(DmSqlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(DmSqlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(DmSqlParser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(DmSqlParser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#invocation_expression}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_expression(DmSqlParser.Invocation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#invocation_expression}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_expression(DmSqlParser.Invocation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#invocation_expression_low}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_expression_low(DmSqlParser.Invocation_expression_lowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#invocation_expression_low}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_expression_low(DmSqlParser.Invocation_expression_lowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlagg_inv_expression}.
	 * @param ctx the parse tree
	 */
	void enterXmlagg_inv_expression(DmSqlParser.Xmlagg_inv_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlagg_inv_expression}.
	 * @param ctx the parse tree
	 */
	void exitXmlagg_inv_expression(DmSqlParser.Xmlagg_inv_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlfun_inv_expression}.
	 * @param ctx the parse tree
	 */
	void enterXmlfun_inv_expression(DmSqlParser.Xmlfun_inv_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlfun_inv_expression}.
	 * @param ctx the parse tree
	 */
	void exitXmlfun_inv_expression(DmSqlParser.Xmlfun_inv_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlele_name}.
	 * @param ctx the parse tree
	 */
	void enterXmlele_name(DmSqlParser.Xmlele_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlele_name}.
	 * @param ctx the parse tree
	 */
	void exitXmlele_name(DmSqlParser.Xmlele_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlele_sub_lst}.
	 * @param ctx the parse tree
	 */
	void enterXmlele_sub_lst(DmSqlParser.Xmlele_sub_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlele_sub_lst}.
	 * @param ctx the parse tree
	 */
	void exitXmlele_sub_lst(DmSqlParser.Xmlele_sub_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlattr_lst}.
	 * @param ctx the parse tree
	 */
	void enterXmlattr_lst(DmSqlParser.Xmlattr_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlattr_lst}.
	 * @param ctx the parse tree
	 */
	void exitXmlattr_lst(DmSqlParser.Xmlattr_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlattr}.
	 * @param ctx the parse tree
	 */
	void enterXmlattr(DmSqlParser.XmlattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlattr}.
	 * @param ctx the parse tree
	 */
	void exitXmlattr(DmSqlParser.XmlattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#xmlval_lst}.
	 * @param ctx the parse tree
	 */
	void enterXmlval_lst(DmSqlParser.Xmlval_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#xmlval_lst}.
	 * @param ctx the parse tree
	 */
	void exitXmlval_lst(DmSqlParser.Xmlval_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(DmSqlParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(DmSqlParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#within_clause}.
	 * @param ctx the parse tree
	 */
	void enterWithin_clause(DmSqlParser.Within_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#within_clause}.
	 * @param ctx the parse tree
	 */
	void exitWithin_clause(DmSqlParser.Within_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_expression(DmSqlParser.Typeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_expression(DmSqlParser.Typeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#new_obj_expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_obj_expression(DmSqlParser.New_obj_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#new_obj_expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_obj_expression(DmSqlParser.New_obj_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#new_arr_expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_arr_expression(DmSqlParser.New_arr_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#new_arr_expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_arr_expression(DmSqlParser.New_arr_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_creation_expression(DmSqlParser.Array_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_creation_expression(DmSqlParser.Array_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#plsql_datatype_ex}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_datatype_ex(DmSqlParser.Plsql_datatype_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#plsql_datatype_ex}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_datatype_ex(DmSqlParser.Plsql_datatype_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#new_array_type}.
	 * @param ctx the parse tree
	 */
	void enterNew_array_type(DmSqlParser.New_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#new_array_type}.
	 * @param ctx the parse tree
	 */
	void exitNew_array_type(DmSqlParser.New_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opt_array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterOpt_array_initializer(DmSqlParser.Opt_array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opt_array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitOpt_array_initializer(DmSqlParser.Opt_array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(DmSqlParser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(DmSqlParser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer_list(DmSqlParser.Variable_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer_list(DmSqlParser.Variable_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(DmSqlParser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(DmSqlParser.Variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opt_comma}.
	 * @param ctx the parse tree
	 */
	void enterOpt_comma(DmSqlParser.Opt_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opt_comma}.
	 * @param ctx the parse tree
	 */
	void exitOpt_comma(DmSqlParser.Opt_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(DmSqlParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(DmSqlParser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#element_access}.
	 * @param ctx the parse tree
	 */
	void enterElement_access(DmSqlParser.Element_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#element_access}.
	 * @param ctx the parse tree
	 */
	void exitElement_access(DmSqlParser.Element_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#decode_case}.
	 * @param ctx the parse tree
	 */
	void enterDecode_case(DmSqlParser.Decode_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#decode_case}.
	 * @param ctx the parse tree
	 */
	void exitDecode_case(DmSqlParser.Decode_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#else_exp}.
	 * @param ctx the parse tree
	 */
	void enterElse_exp(DmSqlParser.Else_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#else_exp}.
	 * @param ctx the parse tree
	 */
	void exitElse_exp(DmSqlParser.Else_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#boolean_case}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_case(DmSqlParser.Boolean_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#boolean_case}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_case(DmSqlParser.Boolean_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#if_exp}.
	 * @param ctx the parse tree
	 */
	void enterIf_exp(DmSqlParser.If_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#if_exp}.
	 * @param ctx the parse tree
	 */
	void exitIf_exp(DmSqlParser.If_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bool_when_list}.
	 * @param ctx the parse tree
	 */
	void enterBool_when_list(DmSqlParser.Bool_when_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bool_when_list}.
	 * @param ctx the parse tree
	 */
	void exitBool_when_list(DmSqlParser.Bool_when_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(DmSqlParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(DmSqlParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(DmSqlParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(DmSqlParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#in_value_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_value_list(DmSqlParser.In_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#in_value_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_value_list(DmSqlParser.In_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#value_list_set}.
	 * @param ctx the parse tree
	 */
	void enterValue_list_set(DmSqlParser.Value_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#value_list_set}.
	 * @param ctx the parse tree
	 */
	void exitValue_list_set(DmSqlParser.Value_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#comma_list}.
	 * @param ctx the parse tree
	 */
	void enterComma_list(DmSqlParser.Comma_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#comma_list}.
	 * @param ctx the parse tree
	 */
	void exitComma_list(DmSqlParser.Comma_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ins_value_list}.
	 * @param ctx the parse tree
	 */
	void enterIns_value_list(DmSqlParser.Ins_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ins_value_list}.
	 * @param ctx the parse tree
	 */
	void exitIns_value_list(DmSqlParser.Ins_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#null_value}.
	 * @param ctx the parse tree
	 */
	void enterNull_value(DmSqlParser.Null_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#null_value}.
	 * @param ctx the parse tree
	 */
	void exitNull_value(DmSqlParser.Null_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#id_and_rsvd_word_others}.
	 * @param ctx the parse tree
	 */
	void enterId_and_rsvd_word_others(DmSqlParser.Id_and_rsvd_word_othersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#id_and_rsvd_word_others}.
	 * @param ctx the parse tree
	 */
	void exitId_and_rsvd_word_others(DmSqlParser.Id_and_rsvd_word_othersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#id_and_rsvd_word}.
	 * @param ctx the parse tree
	 */
	void enterId_and_rsvd_word(DmSqlParser.Id_and_rsvd_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#id_and_rsvd_word}.
	 * @param ctx the parse tree
	 */
	void exitId_and_rsvd_word(DmSqlParser.Id_and_rsvd_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#stm_param}.
	 * @param ctx the parse tree
	 */
	void enterStm_param(DmSqlParser.Stm_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#stm_param}.
	 * @param ctx the parse tree
	 */
	void exitStm_param(DmSqlParser.Stm_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#stm_param_normal}.
	 * @param ctx the parse tree
	 */
	void enterStm_param_normal(DmSqlParser.Stm_param_normalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#stm_param_normal}.
	 * @param ctx the parse tree
	 */
	void exitStm_param_normal(DmSqlParser.Stm_param_normalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#stm_param_name}.
	 * @param ctx the parse tree
	 */
	void enterStm_param_name(DmSqlParser.Stm_param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#stm_param_name}.
	 * @param ctx the parse tree
	 */
	void exitStm_param_name(DmSqlParser.Stm_param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_name_options}.
	 * @param ctx the parse tree
	 */
	void enterParam_name_options(DmSqlParser.Param_name_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_name_options}.
	 * @param ctx the parse tree
	 */
	void exitParam_name_options(DmSqlParser.Param_name_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#contains_query_exp}.
	 * @param ctx the parse tree
	 */
	void enterContains_query_exp(DmSqlParser.Contains_query_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#contains_query_exp}.
	 * @param ctx the parse tree
	 */
	void exitContains_query_exp(DmSqlParser.Contains_query_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#contains_query_exp_lst}.
	 * @param ctx the parse tree
	 */
	void enterContains_query_exp_lst(DmSqlParser.Contains_query_exp_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#contains_query_exp_lst}.
	 * @param ctx the parse tree
	 */
	void exitContains_query_exp_lst(DmSqlParser.Contains_query_exp_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#contains_exp}.
	 * @param ctx the parse tree
	 */
	void enterContains_exp(DmSqlParser.Contains_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#contains_exp}.
	 * @param ctx the parse tree
	 */
	void exitContains_exp(DmSqlParser.Contains_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#strict_option}.
	 * @param ctx the parse tree
	 */
	void enterStrict_option(DmSqlParser.Strict_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#strict_option}.
	 * @param ctx the parse tree
	 */
	void exitStrict_option(DmSqlParser.Strict_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_unique_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_unique_option(DmSqlParser.With_unique_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_unique_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_unique_option(DmSqlParser.With_unique_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#type_option}.
	 * @param ctx the parse tree
	 */
	void enterType_option(DmSqlParser.Type_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#type_option}.
	 * @param ctx the parse tree
	 */
	void exitType_option(DmSqlParser.Type_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#type_element}.
	 * @param ctx the parse tree
	 */
	void enterType_element(DmSqlParser.Type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#type_element}.
	 * @param ctx the parse tree
	 */
	void exitType_element(DmSqlParser.Type_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterType_element_list(DmSqlParser.Type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitType_element_list(DmSqlParser.Type_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBool_exp(DmSqlParser.Bool_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBool_exp(DmSqlParser.Bool_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bool_exp_compound_option}.
	 * @param ctx the parse tree
	 */
	void enterBool_exp_compound_option(DmSqlParser.Bool_exp_compound_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bool_exp_compound_option}.
	 * @param ctx the parse tree
	 */
	void exitBool_exp_compound_option(DmSqlParser.Bool_exp_compound_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#bool_exp_list_compound_option}.
	 * @param ctx the parse tree
	 */
	void enterBool_exp_list_compound_option(DmSqlParser.Bool_exp_list_compound_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#bool_exp_list_compound_option}.
	 * @param ctx the parse tree
	 */
	void exitBool_exp_list_compound_option(DmSqlParser.Bool_exp_list_compound_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#query_any_options}.
	 * @param ctx the parse tree
	 */
	void enterQuery_any_options(DmSqlParser.Query_any_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#query_any_options}.
	 * @param ctx the parse tree
	 */
	void exitQuery_any_options(DmSqlParser.Query_any_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#global_var}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_var(DmSqlParser.Global_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#global_var}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_var(DmSqlParser.Global_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sql_reserved_word}.
	 * @param ctx the parse tree
	 */
	void enterSql_reserved_word(DmSqlParser.Sql_reserved_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sql_reserved_word}.
	 * @param ctx the parse tree
	 */
	void exitSql_reserved_word(DmSqlParser.Sql_reserved_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#reserved_word}.
	 * @param ctx the parse tree
	 */
	void enterReserved_word(DmSqlParser.Reserved_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#reserved_word}.
	 * @param ctx the parse tree
	 */
	void exitReserved_word(DmSqlParser.Reserved_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#new_none_reserved_word}.
	 * @param ctx the parse tree
	 */
	void enterNew_none_reserved_word(DmSqlParser.New_none_reserved_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#new_none_reserved_word}.
	 * @param ctx the parse tree
	 */
	void exitNew_none_reserved_word(DmSqlParser.New_none_reserved_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_nresvd_word}.
	 * @param ctx the parse tree
	 */
	void enterInterval_nresvd_word(DmSqlParser.Interval_nresvd_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_nresvd_word}.
	 * @param ctx the parse tree
	 */
	void exitInterval_nresvd_word(DmSqlParser.Interval_nresvd_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#variable_resvd_word}.
	 * @param ctx the parse tree
	 */
	void enterVariable_resvd_word(DmSqlParser.Variable_resvd_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#variable_resvd_word}.
	 * @param ctx the parse tree
	 */
	void exitVariable_resvd_word(DmSqlParser.Variable_resvd_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alias_resvd_word}.
	 * @param ctx the parse tree
	 */
	void enterAlias_resvd_word(DmSqlParser.Alias_resvd_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alias_resvd_word}.
	 * @param ctx the parse tree
	 */
	void exitAlias_resvd_word(DmSqlParser.Alias_resvd_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#schname_resvd_word}.
	 * @param ctx the parse tree
	 */
	void enterSchname_resvd_word(DmSqlParser.Schname_resvd_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#schname_resvd_word}.
	 * @param ctx the parse tree
	 */
	void exitSchname_resvd_word(DmSqlParser.Schname_resvd_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#raw_id}.
	 * @param ctx the parse tree
	 */
	void enterRaw_id(DmSqlParser.Raw_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#raw_id}.
	 * @param ctx the parse tree
	 */
	void exitRaw_id(DmSqlParser.Raw_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DmSqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DmSqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(DmSqlParser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(DmSqlParser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#qualified_name2}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name2(DmSqlParser.Qualified_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#qualified_name2}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name2(DmSqlParser.Qualified_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(DmSqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(DmSqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#end_loop_label_null}.
	 * @param ctx the parse tree
	 */
	void enterEnd_loop_label_null(DmSqlParser.End_loop_label_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#end_loop_label_null}.
	 * @param ctx the parse tree
	 */
	void exitEnd_loop_label_null(DmSqlParser.End_loop_label_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label_name_options}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name_options(DmSqlParser.Label_name_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label_name_options}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name_options(DmSqlParser.Label_name_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(DmSqlParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(DmSqlParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(DmSqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(DmSqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#backup_name}.
	 * @param ctx the parse tree
	 */
	void enterBackup_name(DmSqlParser.Backup_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#backup_name}.
	 * @param ctx the parse tree
	 */
	void exitBackup_name(DmSqlParser.Backup_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_proc_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_proc_name(DmSqlParser.Full_proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_proc_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_proc_name(DmSqlParser.Full_proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_proc_name2}.
	 * @param ctx the parse tree
	 */
	void enterFull_proc_name2(DmSqlParser.Full_proc_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_proc_name2}.
	 * @param ctx the parse tree
	 */
	void exitFull_proc_name2(DmSqlParser.Full_proc_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_fun_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_fun_name(DmSqlParser.Full_fun_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_fun_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_fun_name(DmSqlParser.Full_fun_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(DmSqlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(DmSqlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_grp_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_grp_name(DmSqlParser.Full_grp_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_grp_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_grp_name(DmSqlParser.Full_grp_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_table_name2}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name2(DmSqlParser.Full_table_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_table_name2}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name2(DmSqlParser.Full_table_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_partition_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_partition_name(DmSqlParser.Full_partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_partition_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_partition_name(DmSqlParser.Full_partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_schema_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_schema_name(DmSqlParser.Full_schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_schema_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_schema_name(DmSqlParser.Full_schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(DmSqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(DmSqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(DmSqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(DmSqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(DmSqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(DmSqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_trigger_name(DmSqlParser.Full_trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_trigger_name(DmSqlParser.Full_trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_trigger_name2}.
	 * @param ctx the parse tree
	 */
	void enterFull_trigger_name2(DmSqlParser.Full_trigger_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_trigger_name2}.
	 * @param ctx the parse tree
	 */
	void exitFull_trigger_name2(DmSqlParser.Full_trigger_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_view_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_view_name(DmSqlParser.Full_view_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_view_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_view_name(DmSqlParser.Full_view_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_view_name2}.
	 * @param ctx the parse tree
	 */
	void enterFull_view_name2(DmSqlParser.Full_view_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_view_name2}.
	 * @param ctx the parse tree
	 */
	void exitFull_view_name2(DmSqlParser.Full_view_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(DmSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(DmSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(DmSqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(DmSqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#login_name}.
	 * @param ctx the parse tree
	 */
	void enterLogin_name(DmSqlParser.Login_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#login_name}.
	 * @param ctx the parse tree
	 */
	void exitLogin_name(DmSqlParser.Login_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#profile_name}.
	 * @param ctx the parse tree
	 */
	void enterProfile_name(DmSqlParser.Profile_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#profile_name}.
	 * @param ctx the parse tree
	 */
	void exitProfile_name(DmSqlParser.Profile_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(DmSqlParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(DmSqlParser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(DmSqlParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(DmSqlParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#user_role_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_role_name(DmSqlParser.User_role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#user_role_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_role_name(DmSqlParser.User_role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#role_name_list}.
	 * @param ctx the parse tree
	 */
	void enterRole_name_list(DmSqlParser.Role_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#role_name_list}.
	 * @param ctx the parse tree
	 */
	void exitRole_name_list(DmSqlParser.Role_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_func_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_func_name(DmSqlParser.Full_func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_func_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_func_name(DmSqlParser.Full_func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(DmSqlParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(DmSqlParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(DmSqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(DmSqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#index_name2}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name2(DmSqlParser.Index_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#index_name2}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name2(DmSqlParser.Index_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_old_name}.
	 * @param ctx the parse tree
	 */
	void enterTrig_old_name(DmSqlParser.Trig_old_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_old_name}.
	 * @param ctx the parse tree
	 */
	void exitTrig_old_name(DmSqlParser.Trig_old_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#trig_new_name}.
	 * @param ctx the parse tree
	 */
	void enterTrig_new_name(DmSqlParser.Trig_new_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#trig_new_name}.
	 * @param ctx the parse tree
	 */
	void exitTrig_new_name(DmSqlParser.Trig_new_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_tv_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_tv_name(DmSqlParser.Full_tv_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_tv_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_tv_name(DmSqlParser.Full_tv_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_object_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_object_name(DmSqlParser.Full_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_object_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_object_name(DmSqlParser.Full_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#orient_option}.
	 * @param ctx the parse tree
	 */
	void enterOrient_option(DmSqlParser.Orient_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#orient_option}.
	 * @param ctx the parse tree
	 */
	void exitOrient_option(DmSqlParser.Orient_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#datepart}.
	 * @param ctx the parse tree
	 */
	void enterDatepart(DmSqlParser.DatepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#datepart}.
	 * @param ctx the parse tree
	 */
	void exitDatepart(DmSqlParser.DatepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#datepart_op}.
	 * @param ctx the parse tree
	 */
	void enterDatepart_op(DmSqlParser.Datepart_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#datepart_op}.
	 * @param ctx the parse tree
	 */
	void exitDatepart_op(DmSqlParser.Datepart_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#datead_fun}.
	 * @param ctx the parse tree
	 */
	void enterDatead_fun(DmSqlParser.Datead_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#datead_fun}.
	 * @param ctx the parse tree
	 */
	void exitDatead_fun(DmSqlParser.Datead_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#returning}.
	 * @param ctx the parse tree
	 */
	void enterReturning(DmSqlParser.ReturningContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#returning}.
	 * @param ctx the parse tree
	 */
	void exitReturning(DmSqlParser.ReturningContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#pretty}.
	 * @param ctx the parse tree
	 */
	void enterPretty(DmSqlParser.PrettyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#pretty}.
	 * @param ctx the parse tree
	 */
	void exitPretty(DmSqlParser.PrettyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#wrapper_flag}.
	 * @param ctx the parse tree
	 */
	void enterWrapper_flag(DmSqlParser.Wrapper_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#wrapper_flag}.
	 * @param ctx the parse tree
	 */
	void exitWrapper_flag(DmSqlParser.Wrapper_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#array_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterArray_wrapper(DmSqlParser.Array_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#array_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitArray_wrapper(DmSqlParser.Array_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_tail_on_empty}.
	 * @param ctx the parse tree
	 */
	void enterJson_tail_on_empty(DmSqlParser.Json_tail_on_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_tail_on_empty}.
	 * @param ctx the parse tree
	 */
	void exitJson_tail_on_empty(DmSqlParser.Json_tail_on_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#empty_handle}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_handle(DmSqlParser.Empty_handleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#empty_handle}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_handle(DmSqlParser.Empty_handleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_tail_on_error}.
	 * @param ctx the parse tree
	 */
	void enterJson_tail_on_error(DmSqlParser.Json_tail_on_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_tail_on_error}.
	 * @param ctx the parse tree
	 */
	void exitJson_tail_on_error(DmSqlParser.Json_tail_on_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#error_handle}.
	 * @param ctx the parse tree
	 */
	void enterError_handle(DmSqlParser.Error_handleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#error_handle}.
	 * @param ctx the parse tree
	 */
	void exitError_handle(DmSqlParser.Error_handleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(DmSqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(DmSqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(DmSqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(DmSqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alias_2}.
	 * @param ctx the parse tree
	 */
	void enterAlias_2(DmSqlParser.Alias_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alias_2}.
	 * @param ctx the parse tree
	 */
	void exitAlias_2(DmSqlParser.Alias_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(DmSqlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(DmSqlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(DmSqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(DmSqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#unique_tag}.
	 * @param ctx the parse tree
	 */
	void enterUnique_tag(DmSqlParser.Unique_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#unique_tag}.
	 * @param ctx the parse tree
	 */
	void exitUnique_tag(DmSqlParser.Unique_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#partition_tag}.
	 * @param ctx the parse tree
	 */
	void enterPartition_tag(DmSqlParser.Partition_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#partition_tag}.
	 * @param ctx the parse tree
	 */
	void exitPartition_tag(DmSqlParser.Partition_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_grant_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_grant_option(DmSqlParser.With_grant_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_grant_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_grant_option(DmSqlParser.With_grant_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_admin_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_admin_option(DmSqlParser.With_admin_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_admin_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_admin_option(DmSqlParser.With_admin_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#time_zone_or_local}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_or_local(DmSqlParser.Time_zone_or_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#time_zone_or_local}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_or_local(DmSqlParser.Time_zone_or_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sub_plsql_datatype}.
	 * @param ctx the parse tree
	 */
	void enterSub_plsql_datatype(DmSqlParser.Sub_plsql_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sub_plsql_datatype}.
	 * @param ctx the parse tree
	 */
	void exitSub_plsql_datatype(DmSqlParser.Sub_plsql_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#datatype_list}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_list(DmSqlParser.Datatype_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#datatype_list}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_list(DmSqlParser.Datatype_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(DmSqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(DmSqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#datatype2}.
	 * @param ctx the parse tree
	 */
	void enterDatatype2(DmSqlParser.Datatype2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#datatype2}.
	 * @param ctx the parse tree
	 */
	void exitDatatype2(DmSqlParser.Datatype2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opr_dtype}.
	 * @param ctx the parse tree
	 */
	void enterOpr_dtype(DmSqlParser.Opr_dtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opr_dtype}.
	 * @param ctx the parse tree
	 */
	void exitOpr_dtype(DmSqlParser.Opr_dtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opr_datatype_lst}.
	 * @param ctx the parse tree
	 */
	void enterOpr_datatype_lst(DmSqlParser.Opr_datatype_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opr_datatype_lst}.
	 * @param ctx the parse tree
	 */
	void exitOpr_datatype_lst(DmSqlParser.Opr_datatype_lstContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#interval_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterval_qualifier(DmSqlParser.Interval_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#interval_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterval_qualifier(DmSqlParser.Interval_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(DmSqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(DmSqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dtype1}.
	 * @param ctx the parse tree
	 */
	void enterDtype1(DmSqlParser.Dtype1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dtype1}.
	 * @param ctx the parse tree
	 */
	void exitDtype1(DmSqlParser.Dtype1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dtype2}.
	 * @param ctx the parse tree
	 */
	void enterDtype2(DmSqlParser.Dtype2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dtype2}.
	 * @param ctx the parse tree
	 */
	void exitDtype2(DmSqlParser.Dtype2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#double_length_option}.
	 * @param ctx the parse tree
	 */
	void enterDouble_length_option(DmSqlParser.Double_length_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#double_length_option}.
	 * @param ctx the parse tree
	 */
	void exitDouble_length_option(DmSqlParser.Double_length_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#size_unit_caluse}.
	 * @param ctx the parse tree
	 */
	void enterSize_unit_caluse(DmSqlParser.Size_unit_caluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#size_unit_caluse}.
	 * @param ctx the parse tree
	 */
	void exitSize_unit_caluse(DmSqlParser.Size_unit_caluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lt_integer_negative}.
	 * @param ctx the parse tree
	 */
	void enterLt_integer_negative(DmSqlParser.Lt_integer_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lt_integer_negative}.
	 * @param ctx the parse tree
	 */
	void exitLt_integer_negative(DmSqlParser.Lt_integer_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lt_integer}.
	 * @param ctx the parse tree
	 */
	void enterLt_integer(DmSqlParser.Lt_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lt_integer}.
	 * @param ctx the parse tree
	 */
	void exitLt_integer(DmSqlParser.Lt_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lt_decimal}.
	 * @param ctx the parse tree
	 */
	void enterLt_decimal(DmSqlParser.Lt_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lt_decimal}.
	 * @param ctx the parse tree
	 */
	void exitLt_decimal(DmSqlParser.Lt_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(DmSqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(DmSqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#create_contextindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_contextindex_stmt(DmSqlParser.Create_contextindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#create_contextindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_contextindex_stmt(DmSqlParser.Create_contextindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lexer_name}.
	 * @param ctx the parse tree
	 */
	void enterLexer_name(DmSqlParser.Lexer_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lexer_name}.
	 * @param ctx the parse tree
	 */
	void exitLexer_name(DmSqlParser.Lexer_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#lexer_clause}.
	 * @param ctx the parse tree
	 */
	void enterLexer_clause(DmSqlParser.Lexer_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#lexer_clause}.
	 * @param ctx the parse tree
	 */
	void exitLexer_clause(DmSqlParser.Lexer_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sync}.
	 * @param ctx the parse tree
	 */
	void enterSync(DmSqlParser.SyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sync}.
	 * @param ctx the parse tree
	 */
	void exitSync(DmSqlParser.SyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#drop_contextindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_contextindex_stmt(DmSqlParser.Drop_contextindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#drop_contextindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_contextindex_stmt(DmSqlParser.Drop_contextindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#alter_contextindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_contextindex_stmt(DmSqlParser.Alter_contextindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#alter_contextindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_contextindex_stmt(DmSqlParser.Alter_contextindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cti_sync_option}.
	 * @param ctx the parse tree
	 */
	void enterCti_sync_option(DmSqlParser.Cti_sync_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cti_sync_option}.
	 * @param ctx the parse tree
	 */
	void exitCti_sync_option(DmSqlParser.Cti_sync_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(DmSqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(DmSqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sizeof_type}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_type(DmSqlParser.Sizeof_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sizeof_type}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_type(DmSqlParser.Sizeof_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(DmSqlParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(DmSqlParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#builtin_types}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_types(DmSqlParser.Builtin_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#builtin_types}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_types(DmSqlParser.Builtin_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(DmSqlParser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(DmSqlParser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#sql_builtin_types}.
	 * @param ctx the parse tree
	 */
	void enterSql_builtin_types(DmSqlParser.Sql_builtin_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#sql_builtin_types}.
	 * @param ctx the parse tree
	 */
	void exitSql_builtin_types(DmSqlParser.Sql_builtin_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(DmSqlParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(DmSqlParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_declaration_2}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration_2(DmSqlParser.Cursor_declaration_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_declaration_2}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration_2(DmSqlParser.Cursor_declaration_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_attrs_options}.
	 * @param ctx the parse tree
	 */
	void enterCursor_attrs_options(DmSqlParser.Cursor_attrs_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_attrs_options}.
	 * @param ctx the parse tree
	 */
	void exitCursor_attrs_options(DmSqlParser.Cursor_attrs_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_attrs}.
	 * @param ctx the parse tree
	 */
	void enterCursor_attrs(DmSqlParser.Cursor_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_attrs}.
	 * @param ctx the parse tree
	 */
	void exitCursor_attrs(DmSqlParser.Cursor_attrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_attr}.
	 * @param ctx the parse tree
	 */
	void enterCursor_attr(DmSqlParser.Cursor_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_attr}.
	 * @param ctx the parse tree
	 */
	void exitCursor_attr(DmSqlParser.Cursor_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opt_rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterOpt_rank_specifier(DmSqlParser.Opt_rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opt_rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitOpt_rank_specifier(DmSqlParser.Opt_rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifiers(DmSqlParser.Rank_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifiers(DmSqlParser.Rank_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(DmSqlParser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(DmSqlParser.Rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opt_dim_separators}.
	 * @param ctx the parse tree
	 */
	void enterOpt_dim_separators(DmSqlParser.Opt_dim_separatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opt_dim_separators}.
	 * @param ctx the parse tree
	 */
	void exitOpt_dim_separators(DmSqlParser.Opt_dim_separatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opt_rank_specifier2}.
	 * @param ctx the parse tree
	 */
	void enterOpt_rank_specifier2(DmSqlParser.Opt_rank_specifier2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opt_rank_specifier2}.
	 * @param ctx the parse tree
	 */
	void exitOpt_rank_specifier2(DmSqlParser.Opt_rank_specifier2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void enterDim_separators(DmSqlParser.Dim_separatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void exitDim_separators(DmSqlParser.Dim_separatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#opt_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_argument_list(DmSqlParser.Opt_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#opt_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_argument_list(DmSqlParser.Opt_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#json_fun_tail}.
	 * @param ctx the parse tree
	 */
	void enterJson_fun_tail(DmSqlParser.Json_fun_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#json_fun_tail}.
	 * @param ctx the parse tree
	 */
	void exitJson_fun_tail(DmSqlParser.Json_fun_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#ignore_nulls_clause}.
	 * @param ctx the parse tree
	 */
	void enterIgnore_nulls_clause(DmSqlParser.Ignore_nulls_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#ignore_nulls_clause}.
	 * @param ctx the parse tree
	 */
	void exitIgnore_nulls_clause(DmSqlParser.Ignore_nulls_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mixed_param_list}.
	 * @param ctx the parse tree
	 */
	void enterMixed_param_list(DmSqlParser.Mixed_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mixed_param_list}.
	 * @param ctx the parse tree
	 */
	void exitMixed_param_list(DmSqlParser.Mixed_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#mixed_param}.
	 * @param ctx the parse tree
	 */
	void enterMixed_param(DmSqlParser.Mixed_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#mixed_param}.
	 * @param ctx the parse tree
	 */
	void exitMixed_param(DmSqlParser.Mixed_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(DmSqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(DmSqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(DmSqlParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(DmSqlParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#without_into_select2}.
	 * @param ctx the parse tree
	 */
	void enterWithout_into_select2(DmSqlParser.Without_into_select2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#without_into_select2}.
	 * @param ctx the parse tree
	 */
	void exitWithout_into_select2(DmSqlParser.Without_into_select2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#cursor_option_2}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option_2(DmSqlParser.Cursor_option_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#cursor_option_2}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option_2(DmSqlParser.Cursor_option_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#region_size}.
	 * @param ctx the parse tree
	 */
	void enterRegion_size(DmSqlParser.Region_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#region_size}.
	 * @param ctx the parse tree
	 */
	void exitRegion_size(DmSqlParser.Region_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#copy_num}.
	 * @param ctx the parse tree
	 */
	void enterCopy_num(DmSqlParser.Copy_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#copy_num}.
	 * @param ctx the parse tree
	 */
	void exitCopy_num(DmSqlParser.Copy_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#redundancy_clause}.
	 * @param ctx the parse tree
	 */
	void enterRedundancy_clause(DmSqlParser.Redundancy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#redundancy_clause}.
	 * @param ctx the parse tree
	 */
	void exitRedundancy_clause(DmSqlParser.Redundancy_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#striping_clause}.
	 * @param ctx the parse tree
	 */
	void enterStriping_clause(DmSqlParser.Striping_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#striping_clause}.
	 * @param ctx the parse tree
	 */
	void exitStriping_clause(DmSqlParser.Striping_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#with_huge_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_huge_clause(DmSqlParser.With_huge_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#with_huge_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_huge_clause(DmSqlParser.With_huge_clauseContext ctx);
}