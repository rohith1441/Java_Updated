package abdul_bari_java.exceptionhandling;
class stackOverFlowException extends Exception{
    @Override
    public String toString() {
        return "Stack is Full";
    }
}
class stackUnderFlowException extends Exception{
    @Override
    public String toString() {
        return "Stack is Empty";
    }
}
class Stack{
    private int sized;
    private int top= -1;
    private int[] st;
    public Stack(int sz){
        sized = sz;
        st = new int[sized];
    }
    public void push(int num) throws stackOverFlowException{
        if(top==sized-1){
            throw new stackOverFlowException();
        }
        top = top+1;
        st[top]=num;

    }
    public int pop() throws stackUnderFlowException{
        int num1= 0;
        if(top==-1){
            throw new stackUnderFlowException();
        }
        num1 = st[top];
        top--;
        return num1;
    }
    public void show(){
        for(int i:st){
            System.out.print(i+" ");
        }
    }
}
public class challenge_exceptions {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        //stack.sized = 5;
        try{
            stack.push(5);
            stack.push(5);
            stack.push(5);
            stack.push(5);
            //stack.push(5);
           // stack.push(5);
        }catch (stackOverFlowException so){
            System.out.println(so);
        }
        try{
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();

        }catch (stackUnderFlowException su){
            System.out.println(su);
        }
        stack.show();
    }
}

