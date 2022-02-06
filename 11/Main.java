public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5, Integer[].class);
        try{
            stack.push(2);
            stack.push(5);
            stack.push(3);
            stack.push(4);
            stack.push(6);
            //stack.push(1);    //Stackoverflow
            stack.pop();

            System.out.println(stack);

            Stack<Integer> stackTest = new Stack<>(5, Integer[].class);
            stackTest.push(2);
            stackTest.push(5);
            stackTest.push(3);
            stackTest.push(4);
            stackTest.push(6);
            stackTest.pop();
           // stackTest.pop();
            System.out.println(stackTest);
            //System.out.println(stackTest.pop());

            System.out.println(StackUtils.compare(stack, stackTest)); //true

            Stack<String> stackStr1 = new Stack<>(5, String[].class);
            Stack<String> stackStr2 = new Stack<>(5, String[].class);
            stackStr1.push("a"); stackStr1.push("b"); stackStr1.push("c");
            stackStr2.push("a"); stackStr2.push("cb"); stackStr2.push("c");
            System.out.println(StackUtils.compare(stackStr1, stackStr2)); //false

            StackUtils.swap(stackStr1,1,2);
            System.out.println(stackStr1); // a c b

        }catch(StackOverflowException | StackUnderflowException e){
            System.out.println(e);
        }
        

    }
}
