package com.bendcap.enkel.compiler.domain.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/22  10:05.
 */
public class PrintStatement implements Statement {
    private Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}