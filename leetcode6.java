package leetcode;

import java.util.*;
public class leetcode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING",4));
	}
	/**
	 * 字母行数和下标关系
	 * @param s
	 * @param numRows
	 * @return
	 */
	public static String convert(String s, int numRows) {
        List<List<Character>> a=new ArrayList<List<Character>>();
        for(int i=0;i<numRows;i++){
        	List<Character> ab=new ArrayList<Character>();
        	for(int k=0;;k++){
        		if((numRows-1)*2*k>s.length()-1){
        			break;
        		}
        		if(i==0||i==numRows-1){
        			if(i+(numRows-1)*2*k<s.length())
        			ab.add(s.charAt(i+(numRows-1)*2*k));
        		}else{
        			if(i+(numRows-1)*2*k<s.length())
        			ab.add(s.charAt(i+(numRows-1)*2*k));
        			if(((numRows-1)*2-i)+(numRows-1)*2*k<s.length())
        			ab.add(s.charAt(((numRows-1)*2-i)+(numRows-1)*2*k));
        		}
        		System.out.print(s.charAt(i+(numRows-1-i)*2*k));
        	}
        	System.out.println("*********");
        	a.add(ab);
        }
        StringBuffer kk=new StringBuffer();
        for(int i=0;i<a.size();i++){
        	for(int k=0;k<a.get(i).size();k++){
        		kk.append(a.get(i).get(k));
        	}
        }
		return kk.toString();
    }

}
