package com.dong;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> main = null;
	Stack<Integer> min = null;
	
    public MinStack() {
    	main = new Stack<Integer>(); 
    	min = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(main.empty()){
        	main.push(x);
        	min.push(x);
        }else{
        	if(min.peek() > x) {
        		main.push(x);
        		min.push(x);
        	}else{
        		main.push(x);
        		min.push(min.peek());
        	}
        }
    }
    
    public void pop() {
        if(!main.empty()) {
        	main.pop();
        	min.pop();
        }
    }
    
    public int top() {
        if(!main.empty()) {
        	return main.peek();
        }
        return 0;
    }
    
    //only peek
    public int getMin() {
        return min.peek();
    }
}
