package leetcode;

import java.util.Scanner;

public class leetcode8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println(myAtoi(str2));
        }
		//System.out.println(myAtoi);
	}
	public static int myAtoi(String str) {
		if(str==null||str.equals("")){
			return 0;
		}
		if(str.equals("-")||str.equals("+")){
			return 0;
		}
		final String number = "0123456789";
		//先去除字符串之前的空格符
		String shouweikongge=str.trim();
		if(shouweikongge.equals("")){
			return 0;
		}
		//如果第一个字符不是数字或者不是+-
		StringBuffer qushuzi=new StringBuffer();
		if(shuzi(shouweikongge.charAt(0))){
			qushuzi.append(shouweikongge.charAt(0));
			for(int i=1;i<shouweikongge.length();i++){
				if(shuzi1(shouweikongge.charAt(i))){
					qushuzi.append(shouweikongge.charAt(i));
				}else{
					break;
					
				}
			}
		if(qushuzi.toString().length()==1&&!shuzi1(qushuzi.toString().charAt(0))){
			return 0;
		}
		double dashu=Double.parseDouble(qushuzi.toString());
        if(dashu>Math.pow(2,31)-1||dashu<0-Math.pow(2,31)+1 ){
        	return (int) (0-Math.pow(2,31)+1);
        }else{
        	return Integer.parseInt(qushuzi.toString());
        }
			
		}else{
			return 0;
		}       
    }
	public static boolean shuzi(char a){
		final String number = "0123456789";
		if(a=='-'||a=='+'||number.indexOf(a)!=-1){
			return true;
		}else{
			return false;
		}
	}
	public static boolean shuzi1(char a){
		final String number = "0123456789";
		if(number.indexOf(a)!=-1){
			return true;
		}else{
			return false;
		}
	}

}
