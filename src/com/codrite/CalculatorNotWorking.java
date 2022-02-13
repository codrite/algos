package com.codrite;


import java.util.HashMap;
import java.util.Map;

public class CalculatorNotWorking {

    public static void main(String[] args){
        String expr = "2+2/2/2";
        System.out.println(calculate(expr));
    }

    static Double calculate(String expr){
        if(!expr.contains("/") && !expr.contains("+") && !expr.contains("-") && !expr.contains("*"))
            return Double.parseDouble(expr);

        while(expr.contains("/"))
            expr = applyDivision(expr);
        while(expr.contains("*"))
            expr = applyMultiplication(expr);
        while(expr.contains("+"))
            expr = applyAddition(expr);
        while(expr.contains("-"))
            expr = applySubtraction(expr);
        return Double.parseDouble(expr);
    }

    static String applyDivision(String expr){
        if(!expr.contains("/"))
            return expr;

        String[] operands = expr.split("/");
        String[] left = leftSplit(operands[0]);
        String[] right = rightSplit(operands[1]);

        if(left == null && right == null){
            return String.valueOf(Double.parseDouble(operands[0]) / Double.parseDouble(operands[1]));
        }

        if(left == null && right.length == 2){
            return Double.parseDouble(operands[0]) / Double.parseDouble(right[0]) + right[1];
        }

        if(left.length == 2 && right == null){
            return left[0] + (Double.parseDouble(left[1]) / Double.parseDouble(operands[1]));
        }

        return left[0] + (Double.parseDouble(left[1]) / Double.parseDouble(right[0])) + right[1];
    }

    static String applyMultiplication(String expr){
        if(!expr.contains("*"))
            return expr;

        String[] operands = expr.split("\\*");
        String[] left = leftSplit(operands[0]);
        String[] right = rightSplit(operands[1]);

        if(left == null && right == null){
            return String.valueOf(Double.parseDouble(operands[0]) * Double.parseDouble(operands[1]));
        }

        if(left == null && right.length == 2){
            return Double.parseDouble(operands[0]) * Double.parseDouble(right[0]) + right[1];
        }

        if(left.length == 2 && right == null){
            return left[0] + (Double.parseDouble(left[1]) * Double.parseDouble(operands[1]));
        }

        return left[0] + (Double.parseDouble(left[1]) * Double.parseDouble(right[0])) + right[1];
    }

    static String applyAddition(String expr){
        if(!expr.contains("+"))
            return expr;

        String[] operands = expr.split("\\+");
        return String.valueOf(Double.parseDouble(operands[0]) + Double.parseDouble(operands[1]));
    }

    static String applySubtraction(String expr){
        if(!expr.contains("-"))
            return expr;

        String[] operands = expr.split("-");
        return String.valueOf(Double.parseDouble(operands[0]) - Double.parseDouble(operands[1]));
    }

    static String[] leftSplit(String s){
        Map<String, String> map = new HashMap<>();
        map.put("+", "\\+");
        map.put("-", "-");
        map.put("/", "/");
        map.put("*", "\\*");

        char[] c = s.toCharArray();
        String e = "";
        for(int i = c.length-1; i > 0; i--){
            if(c[i] == '+' || c[i] == '-' || c[i] == '/' || c[i] == '*'){
                e += c[i];
                break;
            }
        }
        if(e.isBlank())
            return null;
        String[] split = s.split(map.get(e));
        split[0] += e;
        return split;
    }

    static String[] rightSplit(String s){
        Map<String, String> map = new HashMap<>();
        map.put("+", "\\+");
        map.put("-", "-");
        map.put("/", "/");
        map.put("*", "\\*");

        char[] c = s.toCharArray();
        String e = "";
        for(int i = 0; i < c.length; i++){
            if(c[i] == '+' || c[i] == '-' || c[i] == '/' || c[i] == '*'){
                e += c[i];
                break;
            }
        }
        if(e.isBlank())
            return null;
        String[] split = s.split(map.get(e));
        split[0] += e;
        return split;
    }

}

