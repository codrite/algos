package com.codrite;

import java.util.Stack;

public class RomanToInt {

    public static void main(String[] args) {
//        System.out.println(romanToInt("IV"));
//        System.out.println(romanToInt("V"));
        assert 12 == romanToInt("XII");
    }

    static void testSync() {
        Integer i = 0;
        synchronized (i){

        }
    }

    public static int romanToInt(String s) {

        Stack<Integer> istack = new Stack<>();
        Stack<Character> cstack = new Stack<>();

        char[] c = s.toCharArray();
        for(int i = c.length-1 ; i > -1; i--){
            switch(c[i]) {

                case 'M' : istack.push(1000); cstack.push(c[i]); break;
                case 'D' : istack.push(500); cstack.push(c[i]); break;
                case 'C' : if( !cstack.empty() && (cstack.peek() == 'D' || cstack.peek() == 'M') && (i > 0)  && (c[i-1] != 'D' || c[i-1] != 'M') )
                             istack.push(-100);
                           else if( !cstack.empty() && (cstack.peek() == 'D' || cstack.peek() == 'M') && (i == 0) )
                             istack.push(-100);
                           else {
                             cstack.push(c[i]);
                             istack.push(100);
                           }
                           break;
                case 'L' : istack.push(50); cstack.push(c[i]); break;
                case 'X' : if( !cstack.empty() && (cstack.peek() == 'L' || cstack.peek() == 'C') && (i > 0)  && (c[i-1] != 'L' || c[i-1] != 'C') )
                              istack.push(-10);
                           else if( !cstack.empty() && (cstack.peek() == 'L' || cstack.peek() == 'C') && (i == 0) )
                              istack.push(-10);
                           else {
                               if(i > 0 && (c[i-1] != 'L' || c[i-1] != 'C'))
                                 cstack.push(c[i]);
                               istack.push(10);
                           }
                    break;
                case 'V' : istack.push(5); cstack.push(c[i]); break;
                case 'I' : if( !cstack.empty() && (cstack.peek() == 'X' || cstack.peek() == 'V') )
                             istack.push(-1);
                            else {
                                cstack.push(c[i]);
                                istack.push(1);
                            }
                    break;
                default:

            }
        }

        int sum = 0;
        for(Integer e : istack)
            sum += e;

        return sum;

    }

}
