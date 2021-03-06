package com.bendcap.enkel.compiler.parsing.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.ClassDeclaration;
import com.bendcap.enkel.compiler.domain.CompilationUnit;

/**
 * Created by KevinOfNeu on 2018/8/21  09:20.
 */
public class CompilationUnitVisitor extends EnkelBaseVisitor<CompilationUnit> {
    @Override
    public CompilationUnit visitCompilationUnit(EnkelParser.CompilationUnitContext ctx) {
        ClassVisitor classVisitor = new ClassVisitor();
        EnkelParser.ClassDeclarationContext classDeclarationContext = ctx.classDeclaration();
        ClassDeclaration classDeclaration = classDeclarationContext.accept(classVisitor);
        return new CompilationUnit(classDeclaration);
    }
}
