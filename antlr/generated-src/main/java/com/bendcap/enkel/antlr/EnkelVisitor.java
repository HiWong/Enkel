// Generated from com/bendcap/enkel/antlr/Enkel.g4 by ANTLR 4.3

package com.bendcap.enkel.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnkelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnkelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnkelParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull EnkelParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull EnkelParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull EnkelParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull EnkelParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull EnkelParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#superClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClassName(@NotNull EnkelParser.SuperClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull EnkelParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull EnkelParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#varReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(@NotNull EnkelParser.VarReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionParamdefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParamdefaultValue(@NotNull EnkelParser.FunctionParamdefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull EnkelParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull EnkelParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull EnkelParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(@NotNull EnkelParser.FunctionArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull EnkelParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull EnkelParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull EnkelParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull EnkelParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull EnkelParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull EnkelParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull EnkelParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link EnkelParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull EnkelParser.ClassTypeContext ctx);
}