package inheritance.stack;

import java.util.Stack;

public class ExtendedStack extends Stack<Integer> {
    @Override
    public Integer push(Integer item) {
        System.out.println("pushed item: " + item);
        return super.push(item);
    }

    @Override
    public Integer pop() {
        Integer popped = super.pop();
        System.out.println("popped: " + popped);
        return popped;
    }
    public void pushAll(Integer... numbers) {
        for (Integer number : numbers) {
            push(number);
        }
    }
}
