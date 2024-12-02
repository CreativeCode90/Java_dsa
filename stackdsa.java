class Stack {
    int stackSize = 10; //default size 10
    int[] stackArray = new int[stackSize];
    int topindex = -1;

    public void size(int size) {
        this.stackSize = size;

        if (this.stackSize < 0) {
            System.out.println("Please enter a larger number");
        }else{
            stackArray = new int[stackSize];
        }
    }

    public void puch(int x) {
        stackArray[++topindex] = x;
    }

    public int pop() {
        if (topindex >= 0) {
            return stackArray[topindex--];
        }
        return -1;
    }

    public void remove(int index) {
        if (topindex >= 0) {
            stackArray[index] = 0;
        } else {
            System.out.println("Stack underflow");
        }
    }

    public void getStack() {
        for (int i = topindex; i >= 0; i--) {
            System.out.println("> : " + stackArray[i]);
        }
    }

}

public class stackdsa {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.size(2);
        stack.puch(3);
        stack.puch(4);
        stack.getStack();

    }
}
