package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (root == null) {
			return arr;
		}
		postorder(arr, root);
		return arr;
	}

	public static ArrayList<Integer> postorder(ArrayList<Integer> arr,
			TreeNode root) {
		if (root.left != null) {
			postorder(arr, root.left);
		}
		if (root.right != null) {
			postorder(arr, root.right);
		}
		if (root != null) {
			arr.add(root.val);
		}
		return arr;
	}

	public static ArrayList<Integer> postorderTraversal2(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pre = null;
		while (!stack.isEmpty() || root!=null) {
			while(root!=null){
				stack.push(root);
				root = root.left;
			}
			TreeNode t = stack.peek();
			if(t.right == null || t.right == pre){
				stack.pop();
				arr.add(t.val);
				pre = t;
			}else{
				root = t.right;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(postorderTraversal(tree));
	}

}
