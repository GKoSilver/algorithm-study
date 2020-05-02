package 力扣题;

import java.util.LinkedList;
import java.util.Queue;

public class 题0225 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
class MyStack {
	Queue<Integer> stack=new LinkedList<>();
	int top;
    /** Initialize your data structure here. */
    public MyStack() {
    	
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	stack.add(x);
    	top++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	
    	stack.remove(top);
		return 0;

    }
    
    /** Get the top element. */
    public int top() {
		return 0;

    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	if(stack.size()==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
		

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */