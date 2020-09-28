import java.util.Scanner;

public class Stack {
	//creating object
	static StackCalcu obj = new StackCalcu();
    static {System.out.println("######### Stack Using LinkedList #########");}
	public static void main(String args[]) {
		
		//console user interface
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("Enter the operation you want to perform" + "\n 1. Push" + "\n 2. Pop" + "\n 3. Peek"
				+ "\n 4. Display");
		System.out.println("==========================================");
		int val1 = sc.nextInt();
		switch (val1) {
		case 1:
			System.out.println("Enter the element");
			int val2 = sc.nextInt();
			System.out.println("-----Element pushed successfully-----");
			obj.push(val2);
			break;
		case 2:
			System.out.println("-----Element poped successfully-----");
			obj.pop();
			break;
		case 3:
			obj.peek();
			break;
		case 4:
			obj.display();
			break;
		case 5:
			System.out.println("||| Thank You |||");
			break;
		default:
			System.out.println("-----Please Enter valid input-----");
			break;
		}

	}
}

class StackCalcu extends Stack {

	private class Node {
		int data;
		Node next;
	}

	Node top;

	StackCalcu() {
		this.top = null;
	}

	
	public void push(int value) {
		Node temp = new Node();

		temp.data = value;
		temp.next = top;
		top = temp;
		main(null);//To continue the cycle.
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			main(null);
		} else {
			top = top.next;
			main(null);
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			main(null);
		} else {
			System.out.println("Peek value is: " + top.data);
			main(null);
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			main(null);
		} else {
			System.out.println("<<< Elements in stack are: >>>");
			Node temp1 = top;
			while (temp1 != null) {
				System.out.println(temp1.data);
				temp1 = temp1.next;
			}
			main(null);
		}
	}

}