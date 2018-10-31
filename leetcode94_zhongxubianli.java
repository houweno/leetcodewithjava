package leetcode;

import java.util.ArrayList;
import java.util.List;



public class leetcode94_zhongxubianli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> jieguo=new ArrayList<Integer>();
		if(root.left!=null){
			List<Integer> k=inorderTraversal(root.left);
			jieguo.addAll(k);
		}
		jieguo.add(root.val);
		if(root.right!=null){
			List<Integer> k=inorderTraversal(root.right);
			jieguo.addAll(k);
		}
		return jieguo;
        
    }
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
