package leetcode;

import java.util.List;

public class leetcode30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> findSubstring(String s, String[] words) {
		int changdu=words[0].length();
		
		return null;
        
    }
	public int strStr(String haystack, String needle) {
        if(haystack.equals("")&&needle.equals("")){
			return 0;
		}
		if(needle.equals("")){
			return 0;
		}
		if(haystack.equals("")){
			return -1;
		}
        
		for(int i=0;i<haystack.length()-needle.length()+1;i++){
			String jiequ=haystack.substring(i, i+needle.length());
			if(jiequ.equals(needle))
				return i;
			
		}
		return -1;
        
    
    }
}
