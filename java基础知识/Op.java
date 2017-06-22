package com.java03;

public class Op {
	public static void main(String[] args){
		//重点1：如果一个数字能整除，直接为0
		System.out.println(1000%2);//0;
		//重点2：如果 分母 比 分子 大就选择分子
		//			（左小右大就选左）
		System.out.println(2%1000);//2
		//重点3：如果分子是是负数 结果就是负数，
		//			如果分母是负数结果就是正数
		System.out.println(-9%7);//-2
		System.out.println(9%-7);//2
		System.out.println(-9%-7);//-2
	}
}
