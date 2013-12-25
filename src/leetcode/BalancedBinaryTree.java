package leetcode;

public class BalancedBinaryTree {
	public static boolean isBalanced(TreeNode root) {
		return GetDepth(root) >= 0;
	}

	public static int GetDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = GetDepth(root.left);
		int right = GetDepth(root.right);
		if (left < 0 || right < 0 || Math.abs(left - right) > 1) {
			return -1;
		}
		return (left > right ? left : right) + 1;
	}


	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(isBalanced(tree));
	}

}
