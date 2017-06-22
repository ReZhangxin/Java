package com.java03;

public class Op3 {
	static int ac;
	static boolean cc;
	public static void main(String[] args){
		//等号 =  只要赋值了就修改内存的控制的二进制
		int a = 0;
		     a = 10;//修改二进制为1010; 
		     		   //int a = 10; 则为重新创造
		int c = a, b =a, e =a;
		System.out.println(c);//Alt + 向上键 这行代码向上移动
		System.out.println(b);
		System.out.println(e);
		
		//技术数据类型的默认值
		//byte short int long  0
		//float double			0.0
		//boolean					false
		//char						\u0000 空格
		
		System.out.println(ac);
		System.out.println(cc);
		
		// 短路 :	|| 	 && 	!
		//不短路：| & ^ 不推荐使用
//		if(1>2 && 1>3){
//			System.out.println("yes");
//		}else{
//			System.out.println("no");	     
//		}
//		if(1>2 & 1>3){
//			System.out.println("yes");
//		}else{
//			System.out.println("no");	     
//		}
	}	
}
