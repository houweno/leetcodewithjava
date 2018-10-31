package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode22 {

	public static void main(String[] args) {
		System.out.println(hefa("((()))"));
		// TODO Auto-generated method stub
		List<String> a=generateParenthesis3(3);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}	
		

	}
	public static List<String> generateParenthesis3(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

	public static void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
 
        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }

	/**
	 * 动态规划做法
	 * @param n
	 * @return
	 */
	public static List<String> generateParenthesis2(int n) {
		List<String> jieguo=new ArrayList<String>();
		if(n==0){
			return jieguo;
		}
		else if(n==1){
			jieguo.add("()");
			return jieguo;
		}else{
			jieguo=generateParenthesis2(n-1);
			for(int i=0;i<jieguo.size();i++){
				StringBuffer zan=new StringBuffer(jieguo.get(i));
				for(int k=0;k<zan.length();k++){
					zan.insert(k,"(");
					for(int z=k+1;z<zan.length();z++){
						zan.insert(z, ")");
						if(hefa(zan.toString())){
							jieguo.add(zan.toString());
						}
						//删除了
						zan.delete(z, z+1);
					}
					zan.delete(k, k+1);
				}
			
			}
			return jieguo;
		}
		
		
	}
	public static List<String> generateParenthesis(int n) {
		List<String> jieguo=new ArrayList<String>();
		if(n==0||n==1){
			return jieguo;
		}else{
			jieguo=make(n);
			for(int i=0;i<jieguo.size();i++){
				if(!hefa(jieguo.get(i))){
					jieguo.remove(i);
					i--;
				}
			}
		}


		return jieguo;
        
    }
	public static List<String> make(int n){
		List<String> result=new ArrayList<String>();
		for(int i=0;i<Math.pow(2, 2*n);i++){
			//StringBuffer a=new StringBuffer();
			String jieguo="";
			String erjinzhi=Integer.toBinaryString(i);
			for(int k=0;k<erjinzhi.length();k++){
				if(erjinzhi.charAt(k)=='0'){
					jieguo=jieguo+"(";
				}
				else{
					 jieguo=jieguo+")";
				}
			}
			if(jieguo.length()<2*n){
				StringBuffer bu=new StringBuffer();
				for(int z=0;z<2*n-jieguo.length();z++){
					bu.append("(");
				}
				jieguo=bu.toString()+jieguo;
			}
			result.add(jieguo);
		}
		return result;
	}
	public static boolean hefa(String zifu){
		System.out.println("检查的字符串"+zifu);
		if(zifu.charAt(0)==')'){
			return false;
		}else{
			Stack<Character> st = new Stack<Character>();
			st.push(zifu.charAt(0));
			int index=1;
			while(index<zifu.length()){
				if(st.empty()){
					st.push(zifu.charAt(index));
					index++;
				}else{
					if(st.peek()=='('&&zifu.charAt(index)==')'){
						st.pop();
						index++;
					}else{
						st.push(zifu.charAt(index));
						index++;
					}
				}
			}
			if(st.empty()){
				System.out.println("合法");
				return true;
			}else{
				System.out.println("不合法");
				return false;
			}
		}
		
	}
}
