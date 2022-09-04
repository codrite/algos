package com.codrite;

import java.util.Stack;

public class LongPressProblem {

    public static void main(String[] args) {
        String[][] input = {
                                {"alex","aalleex"},
                                {"A", "B"},
                                {"kric", "cric"},
                                {"alex", "llxa"},
                                {"saeed", "ssaaeedd"},
                                {"xnhtq", "xhhttqq"},
                                {"dfuyalc","fuuyallc"},
                                {"zlexya","aazlllllllllllllleexxxxxxxxxxxxxxxya"}
                            };
        for(String[] each : input) {
            System.out.println("For [" + each[0] + ", " + each[1] + "] > " + new LongPressProblem().isLongPressedName(each[0], each[1]));
        }
    }

    public boolean isLongPressedName(String name, String typed){

        Stack<Entry> sna = create(name);
        Stack<Entry> sty = create(typed);

        if(sna.size() != sty.size())
            return false;

        while(sna.size() > 0){
            if(sna.peek().v == sty.peek().v && sna.peek().c <= sty.peek().c){
                    sna.pop();
                    sty.pop();
            } else {
                return false;
            }
        }

        return sna.empty();

    }

    public Stack<Entry> create(String input){
        Stack<Entry> entryStack = new Stack<>();
        int len = input.length();

        int i = 0;
        while(i < len){
            if(entryStack.size() == 0)
                entryStack.push(new Entry(input.charAt(i), 1));
            else {
                if(entryStack.peek().v == input.charAt(i)) {
                    Entry value = entryStack.pop();
                    entryStack.push(new Entry(value.v, value.c+1));
                } else {
                    entryStack.push(new Entry(input.charAt(i), 1));
                }
            }
            i++;
        }

        return entryStack;
    }

    class Entry {
        public char v;
        public int c;

        public Entry(char v, int c){
            this.v = v;
            this.c = c;
        }

        @Override
        public String toString() {
            return "{v="+v+";c="+c+"}";
        }
    }

}
