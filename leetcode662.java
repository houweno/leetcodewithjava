package leetcode;

public class leetcode662 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int widthOfBinaryTree(TreeNode root) {
		TreeNode a=root;
		if(a.left==null&&a.right==null){
			return 1;
		}else if(a.left==null&&a.right!=null){
			return widthOfBinaryTree(a.right);
		}else if(a.left!=null&&a.right==null){
			return widthOfBinaryTree(a.left);
		}else{
			
		}
		
		return 0;
        
    }
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
    }
}
