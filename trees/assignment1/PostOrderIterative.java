package dsa.trees.assignment1;

//Simple Java program to print PostOrder Traversal(Iterative)
import java.util.Stack;

//A binary tree node
class Node
{
	int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right;
	}
}

//create a postorder class
public class PostOrderIterative
{
	Node root;
	
	// An iterative function to do postorder traversal
	// of a given binary tree
	private void postOrderIterative(Node root) {
		Stack<Node> stack = new Stack<>();
		while(true) {
			while(root != null) {
				stack.push(root);
				stack.push(root);
				root = root.left;
			}
			
			// Check for empty stack
			if(stack.empty()) return;
			root = stack.pop();
			
			if(!stack.empty() && stack.peek() == root) root = root.right;
			
			else {
				
				System.out.print(root.data + " "); root = null;
			}
		}
	}
	
	// Driver program to test above functions
	public static void main(String args[])
	{
		PostOrderIterative tree = new PostOrderIterative();
		
		// Let us create trees shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("Post order traversal of binary tree is :");
		tree.postOrderIterative(tree.root);
	}
}
