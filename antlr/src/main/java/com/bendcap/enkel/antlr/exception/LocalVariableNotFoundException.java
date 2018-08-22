package com.bendcap.enkel.antlr.exception;

import com.bendcap.enkel.antlr.domain.scope.Scope;

/**
 * Created by KevinOfNeu on 2018/8/22  09:51.
 */
public class LocalVariableNotFoundException extends RuntimeException {
    public LocalVariableNotFoundException(Scope scope, String variableName) {
        super("No local varaible found for name " + variableName + "found in scope" + scope);
    }
}
