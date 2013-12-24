package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<TreeNode> queue = null;
		q.add(root);
		ArrayList<Integer> arr = null;
		while (!q.isEmpty()) {
			queue = new LinkedList<TreeNode>();
			arr = new ArrayList<Integer>();
			while (!q.isEmpty()) {
				TreeNode t = q.peek();
				arr.add(t.val);
				q.poll();
				if (t.left != null) {
					queue.add(t.left);
				}
				if (t.right != null) {
					queue.add(t.right);
				}
			}
			result.add(arr);
			q = queue;
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(levelOrder(tree));

	}

}
