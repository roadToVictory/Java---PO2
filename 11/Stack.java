import java.lang.reflect.*;
import java.util.Arrays;

public class Stack<T> {
    private final T[] stack;
    private int size=0;
    private final int maxSize;

    public Stack(int max, Class<T[]> classT) {
        this.stack = classT.cast(Array.newInstance(classT.getComponentType(), max));
        this.maxSize = max;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==maxSize;
    }

    public void push(T x) throws StackOverflowException{
        if(isFull())
            throw new StackOverflowException("Stos przepelniony");
        else{
            stack[size] = x;
            size++;
        }
    }

    public T pop() throws StackUnderflowException{
        if(isEmpty()) throw new StackUnderflowException("Stos pusty");
        else{
            T tmp = stack[size-1];
            stack[size-1]= null;
            size--;
            return tmp;
        }
    }

    public int getCurrentSize(){
        return size;
    }

    public int getMaxSize(){
        return maxSize;
    }

    @Override
    public String toString(){
        int i=0; 
        StringBuilder str = new StringBuilder();

        while(stack[i]!=null){
            str.append(stack[i]).append(" ");
            i++;
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj==this) return true;
        if(!obj.getClass().equals(this.getClass())) return false;

        Stack s = (Stack) obj;

        return this.size == s.size && this.maxSize == s.maxSize && Arrays.equals(this.stack, s.stack);
    }

    public T getElement(int ind){
        return stack[ind];
    }

    public void setElement(int ind, T x){
        stack[ind] = x;
    }

}
