package leetcode;

public class leetcode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));

	}
	/**
	 * 递归求s-1
	 * @param s
	 * @return
	 */
	public static String longestPalindrome(String s) {
		if(s.length()==0){
            return s;
        }
		if(s.length()==1){
			return s;
		}else{//以末尾字母为结束，向前逐渐查找回文串
			String jianyi=s.substring(0, s.length()-1);
			String jianyihuiwen=longestPalindrome(jianyi);
			String huiwen="";
			for(int i=0;i<s.length()-1;i++){
				String jiequ=s.substring(i,s.length());
				if(huiwen(jiequ)){
					huiwen=jiequ;
					break;
				}
			}
			if(huiwen.length()>jianyihuiwen.length()){
				return huiwen;
			}else{
				return jianyihuiwen;
			}
			
		}
		
	        
	}
	/**
	 * 判断一个字符串是否是会问字符串
	 * @param s
	 * @return
	 */
	public static boolean huiwen(String s){
		StringBuffer a=new StringBuffer();
		for(int i=s.length();i>0;i--){
			a.append(s.charAt(i-1));
		}
		String daoxu=a.toString();
		if(daoxu.equals(s)){
			return true;
		}else{
			return false;
		}
	}

}
