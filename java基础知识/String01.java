/**
 * 
 * String01
 * 创建人:zhangss
 * QQ:1307881527
 * 时间：2017年6月13日-下午8:54:35 
 * @version 1.0.0
 * 
 */
package com.java03;

/**
 * 
 * String01
 * 创建人:zhangss
 * QQ:1307881527
 * 时间：2017年6月13日-下午8:54:35 
 * @version 1.0.0
 * 
 */
public class String01 {
	public static void main (String[] args){
		//char 有一些专门字符提供换行 回车 单引号
		//char中的转义符 \  来处理字符串中特殊符号	
		//\r : return 到当前行最左边   	(回车光标置前) 
		//\n : newline 向下移动一行 并不移动左右	(换行光标置后)
		//\t : table Tab键 制表符 程序代码中是2个字节
		//\' : 打印 ‘
		//\" : 打印 " ===json转换的时候就用它
		String string1 = "你若不离，\"嘿嘿\"，我必\n\r不弃";
		System.out.println(string1);
		
		String string2 = "你若不离，\"嘿嘿\"，我必\r\n不弃";
		System.out.println(string2);
		
		
		String string = "123456789aq";
		
		System.out.println(string.length());	//	11
		
		System.out.println(string.charAt(0));	//	1
		
		System.out.println(string.charAt(string.length()-1));	//	q
		
		for (int i = 0; i < string.length(); i++) {
			
			System.out.print(string.charAt(i));	//	123456789aq
			
		}
	}
}
