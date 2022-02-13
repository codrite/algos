package com.codrite;

import java.util.Stack;


public class MinStackExample {

    public static void main(String[] args){
        // 3,5,1,2
        MinStack minStack = new MinStack();
        minStack.push(2);
//        minStack.push(1);

        while(!minStack.stack.empty()){
            System.out.print(minStack.pop() + " ");
        }

    }

    static class MinStack {

        Stack<Integer> stack = new Stack<>();

        Integer pop(){
            if(!stack.empty())
                return stack.pop();
            return -1;
        }

        void push(int e){
            if(stack.empty()) {
                stack.push(e);
                return;
            }

            Stack<Integer> temp = new Stack<>();
            while(!stack.empty() && stack.peek() < e){
                Integer p = stack.pop();
                temp.push(p);
            }

            stack.push(e);
            while(!temp.empty())
                stack.push(temp.pop());
        }

        Integer min(){
            if(!stack.empty())
                return stack.pop();
            return -1;
        }

    }


}


