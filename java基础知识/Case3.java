/**
 * 
 * Case
 * 创建人:zhangss
 * QQ:1307881527
 * 时间：2017年6月13日-下午9:50:53 
 * @version 1.0.0
 * 
 */
package com.java03;

/**
 * 
 * Case
 * 创建人:zhangss
 * QQ:1307881527
 * 时间：2017年6月13日-下午9:50:53 
 * @version 1.0.0
 * 
 */
public class Case3 {
	public static void main(String[] args){
		
		// char 0 ==48  A ==65  a==97
		// char 9 ==57  Z ==90  z==122		

		//System.out.println((int)'Z');
		//System.out.println((int)'z');
		
		String string = "123456abcABCd#我爱你";
		for (int i = 0; i <string.length();i++){
			char aa =string.charAt(i);
			boolean f = (48 <= aa && aa<=57);
			if(f){
				System.out.println("数字==="+aa);
			}else if(65 <= aa && aa<=90){
				System.out.println("大写字母==="+aa);
			}else if(97 <= aa && aa<=122){
				System.out.println("小写字母==="+aa);
			}else{
				System.out.println("其他==="+aa);
			}
		}
	}
}
