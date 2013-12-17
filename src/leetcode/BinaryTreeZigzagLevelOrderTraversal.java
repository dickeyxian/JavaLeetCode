package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		Stack<TreeNode> cur = new Stack<TreeNode>();
		Stack<TreeNode> next = new Stack<TreeNode>();
		cur.push(root);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean rightToLeft = true;
		while (!cur.isEmpty()) {
			TreeNode tree = cur.peek();
			cur.pop();
			arr.add(tree.val);
			if (rightToLeft) {
				if (tree.left != null) {
					next.push(tree.left);
				}
				if (tree.right != null) {
					next.push(tree.right);
				}
			} else {
				if (tree.right != null) {
					next.push(tree.right);
				}
				if (tree.left != null) {
					next.push(tree.left);
				}
			}
			if(cur.isEmpty()){
				result.add(arr);
				arr = new ArrayList<Integer>();
				rightToLeft = !rightToLeft;
				cur = next;
				next = new Stack<TreeNode>(); 
			}
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(zigzagLevelOrder(tree));
	}

}
