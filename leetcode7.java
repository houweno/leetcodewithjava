package leetcode;

public class leetcode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(4645745));

	}
	 public static int reverse(int x) {
		 String a=String.valueOf(x);
		 String after=null;
		 if(a.charAt(0)=='-'){
			 String fanzhuan=fanzhuan(a);
			 String temp=fanzhuan.substring(0,fanzhuan.length()-1);
			 after="-"+temp;
		 }else{
			 String fanzhuan=fanzhuan(a);
			 if(fanzhuan.charAt(0)=='0'){
				 after=fanzhuan.substring(1, fanzhuan.length());
			 }else{
				 after=fanzhuan;
			 }
		 }
		 if(after==null||after.equals("")){
			 return 0;
		 }
		return Integer.parseInt(after);
	        
	 }
	 public static String fanzhuan(String s){
		 StringBuffer a=new StringBuffer();
		 for(int i=s.length()-1;;i--){
			 a.append(s.charAt(i));
			 if(i==0){
				 break;
			 }
		 }
		 return a.toString();
	 }
}
