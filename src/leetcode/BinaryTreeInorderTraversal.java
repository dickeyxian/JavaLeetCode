package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public static ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		inorder(result, root);
		return result;

	}

	public static ArrayList<Integer> inorder(ArrayList<Integer> res,
			TreeNode root) {
		if (root.left != null) {
			inorder(res, root.left);
		}
		if (root != null) {
			res.add(root.val);
		}
		if (root.right != null) {
			inorder(res, root.right);
		}
		return res;
	}

	public static ArrayList<Integer> inorderTraversal2(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				TreeNode t = stack.peek();
				result.add(t.val);
				stack.pop();
				root = t.right;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(inorderTraversal2(tree));
	}

}
