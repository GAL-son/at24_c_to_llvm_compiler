package com.at24.codeBuilding.codeFeatures;

import com.at24.codeBuilding.codeFeatures.functions.Function;
import com.at24.codeBuilding.codeFeatures.variables.Variable;

public interface CodeContext {
    public void emit(String code);
    public void emit(String code, String preLine);
    public void emitOnTop(String code);
    public Variable searchVariable(String variableName);
    public Function searchFunction(String functionName);
    public boolean isGlobal();
    public String getRegisterName(Expression expression);
    public String borrowRegister();
    public String assignRegister(Expression expression);
    public boolean isVariableFunctionArg(String varName);
    
} 