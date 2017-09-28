package jplag.java18;

import jplag.java18.grammar.*;
import jplag.java18.grammar.Java.grammar.*;
import jplag.java18.grammar.Java8Parser.AnnotationContext;
import jplag.java18.grammar.Java8Parser.AnnotationTypeDeclarationContext;
import jplag.java18.grammar.Java8Parser.ArgumentsContext;
import jplag.java18.grammar.Java8Parser.ArrayCreatorRestContext;
import jplag.java18.grammar.Java8Parser.ArrayInitializerContext;
import jplag.java18.grammar.Java8Parser.AssertStmtContext;
import jplag.java18.grammar.Java8Parser.BlockContext;
import jplag.java18.grammar.Java8Parser.BlockStatementContext;
import jplag.java18.grammar.Java8Parser.BreakContext;
import jplag.java18.grammar.Java8Parser.CatchClauseContext;
import jplag.java18.grammar.Java8Parser.CbdBlockContext;
import jplag.java18.grammar.Java8Parser.ClassBodyContext;
import jplag.java18.grammar.Java8Parser.ClassCreatorRestContext;
import jplag.java18.grammar.Java8Parser.ClassDeclarationContext;
import jplag.java18.grammar.Java8Parser.ClassOrInterfaceTypeContext;
import jplag.java18.grammar.Java8Parser.CompilationUnitContext;
import jplag.java18.grammar.Java8Parser.ConstantDeclaratorContext;
import jplag.java18.grammar.Java8Parser.ConstructorDeclarationContext;
import jplag.java18.grammar.Java8Parser.ContinueStmtContext;
import jplag.java18.grammar.Java8Parser.CreatedNameContext;
import jplag.java18.grammar.Java8Parser.CreatorContext;
import jplag.java18.grammar.Java8Parser.DefaultValueContext;
import jplag.java18.grammar.Java8Parser.DoWhileStmtContext;
import jplag.java18.grammar.Java8Parser.ElementValueArrayInitializerContext;
import jplag.java18.grammar.Java8Parser.ElementValueContext;
import jplag.java18.grammar.Java8Parser.ElementValuePairContext;
import jplag.java18.grammar.Java8Parser.ElementValuePairsContext;
import jplag.java18.grammar.Java8Parser.EnhancedForControlContext;
import jplag.java18.grammar.Java8Parser.EnumConstantContext;
import jplag.java18.grammar.Java8Parser.EnumConstantsContext;
import jplag.java18.grammar.Java8Parser.EnumDeclarationContext;
import jplag.java18.grammar.Java8Parser.ExplicitConstructorInvocationContext;
import jplag.java18.grammar.Java8Parser.ExplicitGenericInvocationContext;
import jplag.java18.grammar.Java8Parser.ExprAssignmentContext;
import jplag.java18.grammar.Java8Parser.ExprConditionalExpressionContext;
import jplag.java18.grammar.Java8Parser.ExprMethodExpressionListContext;
import jplag.java18.grammar.Java8Parser.ExpressionListContext;
import jplag.java18.grammar.Java8Parser.FieldDeclarationContext;
import jplag.java18.grammar.Java8Parser.ForControlContext;
import jplag.java18.grammar.Java8Parser.ForInitContext;
import jplag.java18.grammar.Java8Parser.ForStmtContext;
import jplag.java18.grammar.Java8Parser.FormalParametersContext;
import jplag.java18.grammar.Java8Parser.IfStmtContext;
import jplag.java18.grammar.Java8Parser.ImportDeclarationContext;
import jplag.java18.grammar.Java8Parser.InnerCreatorContext;
import jplag.java18.grammar.Java8Parser.IntegerLiteralContext;
import jplag.java18.grammar.Java8Parser.InterfaceBodyContext;
import jplag.java18.grammar.Java8Parser.InterfaceDeclarationContext;
import jplag.java18.grammar.Java8Parser.LiteralContext;
import jplag.java18.grammar.Java8Parser.LocalVariableDeclarationContext;
import jplag.java18.grammar.Java8Parser.MethodBodyContext;
import jplag.java18.grammar.Java8Parser.MethodDeclarationContext;
import jplag.java18.grammar.Java8Parser.ModifierContext;
import jplag.java18.grammar.Java8Parser.NonWildcardTypeArgumentsContext;
import jplag.java18.grammar.Java8Parser.NormalClassDeclarationContext;
import jplag.java18.grammar.Java8Parser.NormalInterfaceDeclarationContext;
import jplag.java18.grammar.Java8Parser.PackageDeclarationContext;
import jplag.java18.grammar.Java8Parser.ParExpressionContext;
import jplag.java18.grammar.Java8Parser.PrimaryContext;
import jplag.java18.grammar.Java8Parser.PrimitiveTypeContext;
import jplag.java18.grammar.Java8Parser.ResourceContext;
import jplag.java18.grammar.Java8Parser.ResourcesContext;
import jplag.java18.grammar.Java8Parser.ReturnStmtContext;
import jplag.java18.grammar.Java8Parser.SwitchBlockStatementGroupContext;
import jplag.java18.grammar.Java8Parser.SwitchLabelContext;
import jplag.java18.grammar.Java8Parser.SwitchStmtContext;
import jplag.java18.grammar.Java8Parser.SynchronizedStmtContext;
import jplag.java18.grammar.Java8Parser.ThrowStmtContext;
import jplag.java18.grammar.Java8Parser.TryStatementContext;
import jplag.java18.grammar.Java8Parser.TypeArgumentContext;
import jplag.java18.grammar.Java8Parser.TypeArgumentsContext;
import jplag.java18.grammar.Java8Parser.TypeDeclarationContext;
import jplag.java18.grammar.Java8Parser.TypeListContext;
import jplag.java18.grammar.Java8Parser.TypeParameterContext;
import jplag.java18.grammar.Java8Parser.TypeParametersContext;
import jplag.java18.grammar.Java8Parser.VariableDeclaratorContext;
import jplag.java18.grammar.Java8Parser.VariableDeclaratorIdContext;
import jplag.java18.grammar.Java8Parser.VariableDeclaratorsContext;
import jplag.java18.grammar.Java8Parser.VariableInitializerContext;
import jplag.java18.grammar.Java8Parser.VariableModifierContext;
import jplag.java18.grammar.Java8Parser.WhileStmtContext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JplagJava8Listener implements Java8Listener, JavaTokenConstants {

	private jplag.java18.Parser jplagParser;

	public JplagJava8Listener(jplag.java18.Parser jplag) {
		jplagParser = jplag;
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {

	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		if (arg0.getText().equals("else")) {
			jplagParser.add(J_ELSE, arg0.getSymbol());
		}

	}

	@Override
	public void enterInnerCreator(InnerCreatorContext ctx) {

	}

	@Override
	public void exitInnerCreator(InnerCreatorContext ctx) {

	}

	@Override
	public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		jplagParser.add(J_ANNO_T_BEGIN, ctx.getStart());
	}

	@Override
	public void exitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		jplagParser.add(J_ANNO_T_END, ctx.getStop());
	}

	@Override
	public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
		jplagParser.add(J_VARDEF, ctx.getStart());
	}

	@Override
	public void exitVariableDeclarator(VariableDeclaratorContext ctx) {

	}

	@Override
	public void enterResources(ResourcesContext ctx) {

	}

	@Override
	public void exitResources(ResourcesContext ctx) {

	}

	@Override
	public void enterExpressionList(ExpressionListContext ctx) {

	}

	@Override
	public void exitExpressionList(ExpressionListContext ctx) {

	}

	@Override
	public void enterTypeDeclaration(TypeDeclarationContext ctx) {

	}

	@Override
	public void exitTypeDeclaration(TypeDeclarationContext ctx) {

	}

	@Override
	public void enterElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {

	}

	@Override
	public void exitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {

	}

	@Override
	public void enterAnnotation(AnnotationContext ctx) {
		jplagParser.add(J_ANNO, ctx.getStart());
	}

	@Override
	public void exitAnnotation(AnnotationContext ctx) {

	}

	@Override
	public void enterEnumConstant(EnumConstantContext ctx) {

	}

	@Override
	public void exitEnumConstant(EnumConstantContext ctx) {

	}

	@Override
	public void enterEnhancedForControl(EnhancedForControlContext ctx) {

	}

	@Override
	public void exitEnhancedForControl(EnhancedForControlContext ctx) {

	}

	@Override
	public void enterPrimary(PrimaryContext ctx) {

	}

	@Override
	public void exitPrimary(PrimaryContext ctx) {

	}

	@Override
	public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		jplagParser.add(J_CLASS_BEGIN, ctx.getStart());
	}

	@Override
	public void exitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		jplagParser.add(J_CLASS_END, ctx.getStop());

	}

	@Override
	public void enterClassBody(ClassBodyContext ctx) {

	}

	@Override
	public void exitClassBody(ClassBodyContext ctx) {

	}

	@Override
	public void enterDefaultValue(DefaultValueContext ctx) {

	}

	@Override
	public void exitDefaultValue(DefaultValueContext ctx) {

	}

	@Override
	public void enterImportDeclaration(ImportDeclarationContext ctx) {
		jplagParser.add(J_IMPORT, ctx.getStart());
	}

	@Override
	public void exitImportDeclaration(ImportDeclarationContext ctx) {

	}

	@Override
	public void enterVariableModifier(VariableModifierContext ctx) {

	}

	@Override
	public void exitVariableModifier(VariableModifierContext ctx) {

	}

	@Override
	public void enterCreatedName(CreatedNameContext ctx) {
	}

	@Override
	public void exitCreatedName(CreatedNameContext ctx) {

	}

	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
	}

	@Override
	public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
	}

	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		if (!ctx.annotation().isEmpty()) {
			// if we have an annoation, we have an package-info.java and suppress the package token
		} else {
			jplagParser.add(J_PACKAGE, ctx.getStart());
		}
	}

	@Override
	public void exitPackageDeclaration(PackageDeclarationContext ctx) {
	}

	@Override
	public void enterConstantDeclarator(ConstantDeclaratorContext ctx) {
		jplagParser.add(J_VARDEF, ctx.getStart());
	}

	@Override
	public void exitConstantDeclarator(ConstantDeclaratorContext ctx) {

	}

	@Override
	public void enterElementValuePairs(ElementValuePairsContext ctx) {

	}

	@Override
	public void exitElementValuePairs(ElementValuePairsContext ctx) {

	}

	@Override
	public void enterVariableDeclarators(VariableDeclaratorsContext ctx) {

	}

	@Override
	public void exitVariableDeclarators(VariableDeclaratorsContext ctx) {

	}

	@Override
	public void enterTypeArguments(TypeArgumentsContext ctx) {

	}

	@Override
	public void exitTypeArguments(TypeArgumentsContext ctx) {

	}

	@Override
	public void enterClassCreatorRest(ClassCreatorRestContext ctx) {
		if (ctx.classBody() != null) {
			jplagParser.add(J_IN_CLASS_BEGIN, ctx.getStart());
		}
	}

	@Override
	public void exitClassCreatorRest(ClassCreatorRestContext ctx) {
		if (ctx.classBody() != null) {
			jplagParser.add(J_IN_CLASS_END, ctx.getStop());
		}
	}
	
	@Override
	public void enterModifier(ModifierContext ctx) {

	}

	@Override
	public void exitModifier(ModifierContext ctx) {

	}

	@Override
	public void enterCatchClause(CatchClauseContext ctx) {
		jplagParser.add(J_CATCH_BEGIN, ctx.getStart());
	}

	@Override
	public void exitCatchClause(CatchClauseContext ctx) {
		jplagParser.add(J_CATCH_END, ctx.getStop());
	}


	@Override
	public void enterEnumConstants(EnumConstantsContext ctx) {
		jplagParser.add(J_ENUM_CLASS_BEGIN, ctx.getStop());
	}

	@Override
	public void exitEnumConstants(EnumConstantsContext ctx) {

	}

	@Override
	public void enterInterfaceBody(InterfaceBodyContext ctx) {

	}

	@Override
	public void exitInterfaceBody(InterfaceBodyContext ctx) {

	}

	@Override
	public void enterForControl(ForControlContext ctx) {
	}

	@Override
	public void exitForControl(ForControlContext ctx) {
	}

	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		jplagParser.add(J_ENUM_BEGIN, ctx.getStart());
	}

	@Override
	public void exitEnumDeclaration(EnumDeclarationContext ctx) {
		jplagParser.add(J_ENUM_END, ctx.getStop());
	}

	@Override
	public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
	}

	@Override
	public void exitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
	}

	@Override
	public void enterTypeList(TypeListContext ctx) {
	}

	@Override
	public void exitTypeList(TypeListContext ctx) {

	}

	@Override
	public void enterTypeParameter(TypeParameterContext ctx) {

	}

	@Override
	public void exitTypeParameter(TypeParameterContext ctx) {

	}

	@Override
	public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {

	}

	@Override
	public void exitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {

	}

	@Override
	public void enterExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {
		jplagParser.add(J_APPLY, ctx.start);
	}

	@Override
	public void enterElementValue(ElementValueContext ctx) {

	}

	@Override
	public void exitElementValue(ElementValueContext ctx) {

	}

	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {

	}

	@Override
	public void exitCompilationUnit(CompilationUnitContext ctx) {

	}

	@Override
	public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {

	}

	@Override
	public void exitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {

	}

	@Override
	public void enterBlock(BlockContext ctx) {

	}

	@Override
	public void exitBlock(BlockContext ctx) {

	}

	@Override
	public void enterVariableInitializer(VariableInitializerContext ctx) {
		if (ctx.parent instanceof ArrayInitializerContext) {
			// dont print assignment, as this is part of an array initialization
		} else {
			jplagParser.add(J_ASSIGN, ctx.getStart());
		}
	}

	@Override
	public void exitVariableInitializer(VariableInitializerContext ctx) {

	}

	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {

	}

	@Override
	public void exitBlockStatement(BlockStatementContext ctx) {

	}

	@Override
	public void enterIntegerLiteral(IntegerLiteralContext ctx) {

	}

	@Override
	public void exitIntegerLiteral(IntegerLiteralContext ctx) {

	}

	@Override
	public void enterCreator(CreatorContext ctx) {
		if (ctx.classCreatorRest() != null) {
			if (// @formatter:off
				// "normal" generic
				ctx.createdName().typeArguments().size() > 0 
				// allow diamond operator 
				|| ctx.createdName().children.size() > 1 && (ctx.createdName().getChild(1).getText().equals("<") && ctx.createdName().getChild(2).getText().equals(">"))
				|| ctx.createdName().children.size() > 3 && (ctx.createdName().getChild(3).getText().equals("<") && ctx.createdName().getChild(4).getText().equals(">"))) {
			    // @formatter: on
				jplagParser.add(J_GENERIC, ctx.start);
			}
			jplagParser.add(J_NEWCLASS, ctx.start);
		} else if (ctx.arrayCreatorRest() != null) {
			jplagParser.add(J_NEWARRAY, ctx.start);

		}

	}

	@Override
	public void exitCreator(CreatorContext ctx) {

	}
	@Override
	public void enterTryStatement(TryStatementContext ctx) {
		jplagParser.add(J_TRY_BEGIN, ctx.getStart());
	}

	@Override
	public void exitTryStatement(TryStatementContext ctx) {
		if (hasFinally(ctx)) {
			jplagParser.add(J_FINALLY, ctx.start);
		}
	}

	private boolean hasFinally(TryStatementContext ctx) {
		for (ParseTree pt : ctx.children) {
			if (pt instanceof TerminalNode) {
				if (((TerminalNode) pt).getText().equals("finally")) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {

	}

	@Override
	public void exitFieldDeclaration(FieldDeclarationContext ctx) {

	}

	@Override
	public void enterNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
		jplagParser.add(J_INTERFACE_BEGIN, ctx.start);
	}

	@Override
	public void exitNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
		jplagParser.add(J_INTERFACE_END, ctx.start);
	}

	@Override
	public void enterExplicitGenericInvocation(ExplicitGenericInvocationContext ctx) {
		jplagParser.add(J_APPLY, ctx.start);
	}

	@Override
	public void exitExplicitGenericInvocation(ExplicitGenericInvocationContext ctx) {

	}

	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		if (ctx.start.getText().equals("void")) {
			jplagParser.add(J_VOID, ctx.start);
		}
		jplagParser.add(J_METHOD_BEGIN, ctx.start);
	}

	@Override
	public void exitMethodDeclaration(MethodDeclarationContext ctx) {
		jplagParser.add(J_METHOD_END, ctx.getStop());
	}

	@Override
	public void enterParExpression(ParExpressionContext ctx) {

	}

	@Override
	public void exitParExpression(ParExpressionContext ctx) {

	}

	@Override
	public void enterSwitchLabel(SwitchLabelContext ctx) {

	}

	@Override
	public void exitSwitchLabel(SwitchLabelContext ctx) {
		jplagParser.add(J_CASE, ctx.getStop());
	}

	@Override
	public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
		jplagParser.add(J_CONSTR_BEGIN, ctx.getStart());
	}

	@Override
	public void exitConstructorDeclaration(ConstructorDeclarationContext ctx) {
		jplagParser.add(J_CONSTR_END, ctx.getStop());
	}

	@Override
	public void enterTypeParameters(TypeParametersContext ctx) {

	}

	@Override
	public void exitTypeParameters(TypeParametersContext ctx) {

	}

	@Override
	public void enterResource(ResourceContext ctx) {
		jplagParser.add(J_TRY_WITH_RESOURCE, ctx.getStart());
	}

	@Override
	public void exitResource(ResourceContext ctx) {

	}

	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
	}

	@Override
	public void exitClassDeclaration(ClassDeclarationContext ctx) {
	}

	@Override
	public void enterElementValuePair(ElementValuePairContext ctx) {

	}

	@Override
	public void exitElementValuePair(ElementValuePairContext ctx) {

	}

	@Override
	public void enterArguments(ArgumentsContext ctx) {
	}

	@Override
	public void exitArguments(ArgumentsContext ctx) {

	}

	@Override
	public void enterMethodBody(MethodBodyContext ctx) {

	}

	@Override
	public void exitMethodBody(MethodBodyContext ctx) {

	}

	@Override
	public void enterArrayInitializer(ArrayInitializerContext ctx) {
		jplagParser.add(J_ARRAY_INIT_BEGIN, ctx.getStart());
	}

	@Override
	public void exitArrayInitializer(ArrayInitializerContext ctx) {
		jplagParser.add(J_ARRAY_INIT_END, ctx.getStop());
	}

	@Override
	public void enterFormalParameters(FormalParametersContext ctx) {

	}

	@Override
	public void exitFormalParameters(FormalParametersContext ctx) {

	}

	@Override
	public void enterPrimitiveType(PrimitiveTypeContext ctx) {

	}

	@Override
	public void exitPrimitiveType(PrimitiveTypeContext ctx) {

	}

	@Override
	public void enterNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {

	}

	@Override
	public void exitNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {

	}

	@Override
	public void enterTypeArgument(TypeArgumentContext ctx) {
		if ( ctx.parent.parent instanceof CreatedNameContext) {	
			// the generic token has already been emitted by the class emitter
		} else {
			jplagParser.add(J_GENERIC, ctx.getStart());
		}
	}

	@Override
	public void exitTypeArgument(TypeArgumentContext ctx) {

	}

	@Override
	public void enterForInit(ForInitContext ctx) {

	}

	@Override
	public void exitForInit(ForInitContext ctx) {

	}

	@Override
	public void enterArrayCreatorRest(ArrayCreatorRestContext ctx) {

	}

	@Override
	public void exitArrayCreatorRest(ArrayCreatorRestContext ctx) {

	}

	@Override
	public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {

	}

	@Override
	public void exitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {

	}

	@Override
	public void enterLiteral(LiteralContext ctx) {

	}

	@Override
	public void exitLiteral(LiteralContext ctx) {

	}

	@Override
	public void enterDoWhileStmt(DoWhileStmtContext ctx) {
		jplagParser.add(J_DO_BEGIN, ctx.getStart());
	}

	@Override
	public void exitDoWhileStmt(DoWhileStmtContext ctx) {
		jplagParser.add(J_DO_END, ctx.getStop());
	}

	@Override
	public void enterBreak(BreakContext ctx) {
		jplagParser.add(J_BREAK, ctx.getStart());
	}

	@Override
	public void enterIfStmt(IfStmtContext ctx) {
		jplagParser.add(J_IF_BEGIN, ctx.getStart());
	}

	@Override
	public void exitIfStmt(IfStmtContext ctx) {
		jplagParser.add(J_IF_END, ctx.getStop());
	}

	@Override
	public void enterThrowStmt(ThrowStmtContext ctx) {
		jplagParser.add(J_THROW, ctx.getStart());
	}

	@Override
	public void enterSynchronizedStmt(SynchronizedStmtContext ctx) {
		jplagParser.add(J_SYNC_BEGIN, ctx.getStart());
	}

	@Override
	public void exitSynchronizedStmt(SynchronizedStmtContext ctx) {
		jplagParser.add(J_SYNC_END, ctx.getStop());
	}

	@Override
	public void enterReturnStmt(ReturnStmtContext ctx) {
		jplagParser.add(J_RETURN, ctx.getStart());
	}

	@Override
	public void enterContinueStmt(ContinueStmtContext ctx) {
		jplagParser.add(J_CONTINUE, ctx.getStart());
	}

	@Override
	public void enterAssertStmt(AssertStmtContext ctx) {
		jplagParser.add(J_ASSERT, ctx.getStart());
	}

	@Override
	public void enterSwitchStmt(SwitchStmtContext ctx) {
		jplagParser.add(J_SWITCH_BEGIN, ctx.getStart());
	}

	@Override
	public void exitSwitchStmt(SwitchStmtContext ctx) {
		jplagParser.add(J_SWITCH_END, ctx.getStop());
	}

	@Override
	public void enterForStmt(ForStmtContext ctx) {
		jplagParser.add(J_FOR_BEGIN, ctx.getStart());
	}

	@Override
	public void exitForStmt(ForStmtContext ctx) {
		jplagParser.add(J_FOR_END, ctx.getStop());
	}

	@Override
	public void enterWhileStmt(WhileStmtContext ctx) {
		jplagParser.add(J_WHILE_BEGIN, ctx.getStart());
	}

	@Override
	public void exitWhileStmt(WhileStmtContext ctx) {
		jplagParser.add(J_WHILE_END, ctx.getStop());
	}

	@Override
	public void enterExprAssignment(ExprAssignmentContext ctx) {
		jplagParser.add(J_ASSIGN, ctx.getStart());
	}

	@Override
	public void enterExprMethodExpressionList(ExprMethodExpressionListContext ctx) {
		jplagParser.add(J_APPLY, ctx.getStart());
	}

	@Override
	public void enterCbdBlock(CbdBlockContext ctx) {
		jplagParser.add(J_INIT_BEGIN, ctx.getStart());
	}

	@Override
	public void exitCbdBlock(CbdBlockContext ctx) {
		jplagParser.add(J_INIT_END, ctx.getStop());
	}

	@Override
	public void enterExprConditionalExpression(ExprConditionalExpressionContext ctx) {
		jplagParser.add(J_COND, ctx.getStart());
	}


	@Override
	public void enterMemberDeclaration(Java8Parser.MemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitMemberDeclaration(Java8Parser.MemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterLambdaBody(Java8Parser.LambdaBodyContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitLambdaBody(Java8Parser.LambdaBodyContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterGenericInterfaceMethodDeclaration(Java8Parser.GenericInterfaceMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitGenericInterfaceMethodDeclaration(Java8Parser.GenericInterfaceMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterTypeType(Java8Parser.TypeTypeContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitTypeType(Java8Parser.TypeTypeContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterAnnotationConstantRest(Java8Parser.AnnotationConstantRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitAnnotationConstantRest(Java8Parser.AnnotationConstantRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterNonWildcardTypeArgumentsOrDiamond(Java8Parser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitNonWildcardTypeArgumentsOrDiamond(Java8Parser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterAnnotationTypeElementRest(Java8Parser.AnnotationTypeElementRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitAnnotationTypeElementRest(Java8Parser.AnnotationTypeElementRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterTypeBound(Java8Parser.TypeBoundContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitTypeBound(Java8Parser.TypeBoundContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterInterfaceBodyDeclaration(Java8Parser.InterfaceBodyDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitInterfaceBodyDeclaration(Java8Parser.InterfaceBodyDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterFinallyBlock(Java8Parser.FinallyBlockContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitFinallyBlock(Java8Parser.FinallyBlockContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterLastFormalParameter(Java8Parser.LastFormalParameterContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitLastFormalParameter(Java8Parser.LastFormalParameterContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterAnnotationMethodOrConstantRest(Java8Parser.AnnotationMethodOrConstantRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitAnnotationMethodOrConstantRest(Java8Parser.AnnotationMethodOrConstantRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterFormalParameter(Java8Parser.FormalParameterContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterExpression(Java8Parser.ExpressionContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitExpression(Java8Parser.ExpressionContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterQualifiedNameList(Java8Parser.QualifiedNameListContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitQualifiedNameList(Java8Parser.QualifiedNameListContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterSuperSuffix(Java8Parser.SuperSuffixContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitSuperSuffix(Java8Parser.SuperSuffixContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterCatchType(Java8Parser.CatchTypeContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitCatchType(Java8Parser.CatchTypeContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterClassOrInterfaceModifier(Java8Parser.ClassOrInterfaceModifierContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitClassOrInterfaceModifier(Java8Parser.ClassOrInterfaceModifierContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterExplicitGenericInvocationSuffix(Java8Parser.ExplicitGenericInvocationSuffixContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitExplicitGenericInvocationSuffix(Java8Parser.ExplicitGenericInvocationSuffixContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterTypeTypeOrVoid(Java8Parser.TypeTypeOrVoidContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitTypeTypeOrVoid(Java8Parser.TypeTypeOrVoidContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterConstDeclaration(Java8Parser.ConstDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitConstDeclaration(Java8Parser.ConstDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterQualifiedName(Java8Parser.QualifiedNameContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitQualifiedName(Java8Parser.QualifiedNameContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterResourceSpecification(Java8Parser.ResourceSpecificationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitResourceSpecification(Java8Parser.ResourceSpecificationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterAnnotationMethodRest(Java8Parser.AnnotationMethodRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitAnnotationMethodRest(Java8Parser.AnnotationMethodRestContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterClassType(Java8Parser.ClassTypeContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitClassType(Java8Parser.ClassTypeContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterLocalTypeDeclaration(Java8Parser.LocalTypeDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitLocalTypeDeclaration(Java8Parser.LocalTypeDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterGenericConstructorDeclaration(Java8Parser.GenericConstructorDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitGenericConstructorDeclaration(Java8Parser.GenericConstructorDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterStatement(Java8Parser.StatementContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitStatement(Java8Parser.StatementContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterMethodReference(Java8Parser.MethodReferenceContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitMethodReference(Java8Parser.MethodReferenceContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterGenericMethodDeclaration(Java8Parser.GenericMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitGenericMethodDeclaration(Java8Parser.GenericMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void enterTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void exitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
