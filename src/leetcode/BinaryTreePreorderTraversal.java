package leetcode;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreePreorderTraversal {
	public static ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(root == null){
			return arr;
		}
		preorder(arr, root);
		return arr;
	}

	public static ArrayList<Integer> preorder(ArrayList<Integer> arr,
			TreeNode root) {
		if (root != null) {
			arr.add(root.val);
		}
		if (root.left != null) {
			preorder(arr, root.left);
		}
		if (root.right != null) {
			preorder(arr, root.right);
		}
		return arr;
	}

	public static ArrayList<Integer> preorderTraversal2(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (root == null) {
			return arr;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode t = stack.peek();
			stack.pop();
			arr.add(t.val);
			if (t.right != null) {
				stack.push(t.right);
			}
			if (t.left != null) {
				stack.push(t.left);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(preorderTraversal2(tree));
	}

}
