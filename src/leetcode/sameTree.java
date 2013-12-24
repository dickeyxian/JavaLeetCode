package leetcode;

import java.util.Stack;

public class sameTree {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(p);
		stack.push(q);
		while(!stack.isEmpty()){
			TreeNode tq = stack.pop();
			TreeNode tp = stack.pop();
			if(tq == null && tp == null) {
				continue;
			}
			if(tq == null || tp == null) {
				return false;
			}
			if(tq.val != tp.val) {
				return false;
			}
			stack.push(tq.left);
			stack.push(tp.left);
			stack.push(tq.right);
			stack.push(tp.right);
		}
		return true;
	}

	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		System.out.println(isSameTree(p, q));
	}

}
