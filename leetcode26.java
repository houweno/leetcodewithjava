package leetcode;

public class leetcode26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello","ll"));

	}
	public static int strStr(String haystack, String needle) {
		if(needle.equals("")){
			return -1;
		}
		if(haystack.equals("")){
			return -1;
		}
		for(int i=0;i<haystack.length()-needle.length();i++){
			String jiequ=haystack.substring(i, i+needle.length());
			if(jiequ.equals(needle))
				return i;
			
		}
		return -1;
        
    }
}
