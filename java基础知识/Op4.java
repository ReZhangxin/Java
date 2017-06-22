package com.java03;

public class Op4 {
	public static void main(String[] asrgs){
		//位运算符7个
		// >>
		// >>>
		// &	按位& 如果两个位置同时为1返回就是1 ，其它都是0
		// |	按位| 如果有一位是1 那么就是1，其它都是0
		// ~	按位非  对补码进行取反包括符号 ~-n = ~(n+1); ~n = -(n+1);
		// ^	按位异或， 两个相同时是0 不同返回1
		//千万不要他把们看做十进制 都是二进制
		//把他们转成二进制再进行比较
		// >> 右移动
		// << 左移动  5<<2 二进制整体往左移动两位 空白位用0填充
		// >>>无符号右移
		// 反码就是对源码 1>0 0>1 符号位不动（首位）
		// 补码就是对反码末尾加1     ~-5 对补码全部取反包括符号位
		System.out.println(5 & 9);//位运算符 快速计算一个数字想要得到的结果，
											 // 最终以二进制的方式进行计算
		System.out.println(0101 & 1001);
		System.out.println(true & false);
		System.out.println(15 & 9);//9
		System.out.println(15 | 9);//15
		System.out.println(15 ^ 9);//6
		System.out.println(~ 9);//-10
		
	}
}
