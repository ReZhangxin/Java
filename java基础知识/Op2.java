package com.java03;

public class Op2 {
	public static void main(String[] args){
		//++ --范围只是+1 -1----步长为1 
		int a = 1;
		a++;
		++a;		//独占一行是等价的
		System.out.println(a);//3
		
		int b = 1;
		//在运算中或者逻辑判断中或者方法的传参中就存在差异了
		int c = b++ +6;//运算优先级 + > ++
		System.out.println("===="+c);//7
		System.out.println("===="+b);//2
		System.out.println(b++);
		
		int d = 5;
		if(d++ ==6){//先运算再++
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		if(++d==6){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		int k =0;
		int res = ++k + k++ + ++k + k;
		System.out.println(res);
		int j = 1;
		System.out.println(j+=1);
		
		
	}
}
