import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack < String > myStack = new Stack <String> ();
		
		System.out.println("myStack.empty()-->"+ myStack.empty());
		System.out.println();
		
		myStack.push("1st"); System.out.println(myStack);
		myStack.push("2nd"); System.out.println(myStack);
		myStack.push("3rd"); System.out.println(myStack);
		myStack.push("4th"); System.out.println(myStack);
		// 스택의 오른쪽에 출력될수록 top
		System.out.println();
		
	
	}

}
