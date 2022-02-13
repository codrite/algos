package com.codrite;

public class Calculator {

    public static void main(String[] args) {
        String expr = "2*3*5";
        Long value = eval(expr);
        System.out.println(value);
    }

    private static Long eval(String expr) {
        Long value = 0L;
        char[] c = expr.toCharArray();

        int start = 0, end = 0;
        String remain = "";
        for(int i = 0; i < c.length; i++){
            while(c[i] >= '0' && c[i] <= '9') i++;
            if(c[i] == '*' || c[i] == '/'){
                String oper = (c[i] == '*' ? "\\*" : "/");
                String left = expr.substring(start, i);
                start = ++i;
                while(i < c.length && c[i] >= '0' && c[i] <= '9') i++;
                String right = expr.substring(start, i);
                remain = expr.substring(i);
                switch(oper){
                    case "\\*" : value = Long.parseLong(left)*Long.parseLong(right);
                                 break;
                    case "/" : value = Long.parseLong(left)/Long.parseLong(right);
                               break;
                }
                if(remain.isBlank())
                    return value;
                else
                    value = eval(value + remain);
            }
        }

        return value;
    }

}
