package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class leetcode84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
				22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40
				,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,
				59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,
				78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,
				97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,
				112,113,114,115,116,117,118,119,120,121,122,123,124,125};
		int[] b=new int[]{0,9};
		System.out.println(largestRectangleArea(a));
		System.out.println(mowei(b));
	}
	public static int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        
		if(heights.length==1){
			return heights[0];
		}else{
			int mowei=mowei(heights);
			int[] temp=Arrays.copyOfRange(heights,0,heights.length-1);
			
			int shaoyi=largestRectangleArea(Arrays.copyOfRange(heights,0,heights.length-1));
			
			return mowei>shaoyi?mowei:shaoyi;
		}
		
	        
    
    }
    public static int mowei(int[] heights){
		int mianji=0;
		
		
			for(int i=0;i<heights.length;i++){
				 int[] temp=Arrays.copyOfRange(heights,i,heights.length);
				 int min =zuixiao(temp);
				 int tempmianji=(heights.length-i)*min;
				 if(mianji<tempmianji)
					 mianji=tempmianji;
			}
		
		return mianji;
	}
	public static int zuixiao(int[] A){
		int min=A[0];
		for(int i=0;i<A.length;i++)
		{
		  if(A[i]<min)   // 判断最小值
		  min=A[i];
		}
		//System.out.println(min);
		return min;
	}
	

}
