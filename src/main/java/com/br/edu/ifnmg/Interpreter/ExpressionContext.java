package com.br.edu.ifnmg.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class ExpressionContext {
    private Map<String, Integer> variables = new HashMap<>();

    public int getVariable(String variableName) {
        return variables.getOrDefault(variableName, 0);
    }

    public void setVariable(String variableName, int value) {
        variables.put(variableName, value);
    }
}
