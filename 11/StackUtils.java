public class StackUtils {

    public static<T> String toString(Stack<T> stack){
        return stack.toString();
    }

    public static<T> boolean compare(Stack<T> stack1, Stack<T> stack2) throws StackUnderflowException{
        return stack1.equals(stack2);
    }

    public static<T> void swap(Stack<T> stack, int ind1, int ind2){
       if(ind1 >= stack.getCurrentSize() || ind2>=stack.getCurrentSize() || ind1*ind2<0  )
            System.out.println("Niepoprawny numer elementu");
         else{
             T tmp = stack.getElement(ind1);
             T tmp2 = stack.getElement(ind2);
             stack.setElement(ind1,tmp2);
             stack.setElement(ind2,tmp);
         }
    }

}
