package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeLevelOrderTraversalII {
	public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		levelOrder(root, 1, result);
		Collections.reverse(result);
		return result;
	}

	public static void levelOrder(TreeNode root, int level,
			ArrayList<ArrayList<Integer>> result) {
		if (root == null) {
			return;
		}
		if (level > result.size()) {
			result.add(new ArrayList<Integer>());
		}
		result.get(level - 1).add(root.val);
		levelOrder(root.left, level + 1, result);
		levelOrder(root.right, level + 1, result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(levelOrderBottom(tree));
	}

}
