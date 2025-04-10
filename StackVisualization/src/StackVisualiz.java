import java.util.Stack;

public class StackVisualiz {

    // Stack dùng để mô phỏng call stack
    static Stack<String> callStack = new Stack<>();

    // Hàm A gọi hàm B
    static void functionA() {
        callStack.push("functionA");  // Đẩy functionA vào stack
        System.out.println(">> Entering functionA");
        functionB();                  // Gọi functionB
        System.out.println("<< Exiting functionA");
        callStack.pop();             // Rời khỏi functionA
    }

    // Hàm B gọi hàm C
    static void functionB() {
        callStack.push("functionB");
        System.out.println(">> Entering functionB");
        functionC();                 // Gọi functionC
        System.out.println("<< Exiting functionB");
        callStack.pop();
    }

    // Hàm C chỉ in ra call stack hiện tại
    static void functionC() {
        callStack.push("functionC");
        System.out.println(">> Entering functionC");
        printStack();                // In ra call stack hiện tại
        System.out.println("<< Exiting functionC");
        callStack.pop();
    }

    // In trạng thái hiện tại của call stack
    static void printStack() {
        System.out.println("Current Call Stack: " + callStack);
    }

    // Hàm main bắt đầu thực thi chương trình
    public static void main(String[] args) {
        System.out.println("=== Program Start ===");
        functionA();
        System.out.println("=== Program End ===");
    }
}
