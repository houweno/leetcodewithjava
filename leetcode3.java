package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("fhsfjojweifhasfj"));
	}
	public static int lengthOfLongestSubstring(String s) {
		
		int i=0;
		int k=0;
		int changdu=1;
		while(i<s.length()){
			String sub=s.substring(i, k);
				if(k+1!=s.length()){
					if(sub.indexOf(s.charAt(k+1))==-1){//下一个字符不是重复的，	
						if(k==s.length()-1){
							int temp=k-i;
							if(temp>changdu){
								changdu=temp;
							}
						}
					}
				
				else{//下一个字符是重复的，从重复的地方开始查找
					int temp=k-i;
					if(temp>changdu){
						changdu=temp;
					}
					i=i+sub.indexOf(s.charAt(k+1));
							
				}
				k++;
			}
		}
		
		return changdu;
        
    }
	
}
