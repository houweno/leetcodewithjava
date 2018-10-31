package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.leetcode94_zhongxubianli.TreeNode;

public class leetcode95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<TreeNode> makelist(int n){
		int[] a=new int[n];
		List<TreeNode> jieguo=new ArrayList<TreeNode>();
		for(int i=0;i<n;i++){
			a[i]=i+1;
		}
		for(int i=0;i<n;i++){
			TreeNode root=new TreeNode(i+1);
			TreeNode k=buildTree(root,a,0,n-1);
			jieguo.add(k);
		}
		return jieguo;
	}
	private TreeNode buildTree(TreeNode root,int[] a,int start,int end){
			if(start>end){
				return null;//数组索引交叉，说明已经反问完该数组，退出递归
			}else{
				int m=(start+end)/2;
				root=new TreeNode(a[m]);
				root.left=buildTree(root.left,a,start,m-1);
				root.right=buildTree(root.right,a,m+1,end);
			}
			return root;
	}
	
	
	/**
	 * 判断输入的数列是否是二叉搜索树
	 * @param a
	 * @return
	 */
	public boolean isbinaryseracch(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
	    //设置前驱节点
	    TreeNode pre = null;
	    while(root != null || !stack.isEmpty()){
	        while (root != null) { // 将当前节点，以及左子树一直入栈，循环结束时，root==null
	            stack.push(root);
	            root = root.left;
	        }
	        root = stack.pop();
	        //比较并更新前驱，与普通遍历的区别就在下面四行
	        if(pre != null && root.val <= pre.val){
	            return false;
	        }
	        pre = root;
	        root = root.right;  //访问右子树
	    }
	    return true;
	
	}
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
