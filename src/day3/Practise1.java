package day3;

//import java.util.*;

public class Practise1 {

	// {"青", "123"}
	public static void main(String[] args) {
		// 判断姓名和密码
		System.out.println("请输入名字：");
		String name = args[0];
		String pwd = args[1];

		if (name.equals("青") && pwd.equals("123")) {
			System.out.println("欢迎你，青");
		}
		else
			System.out.println("对不起，你不是青");
		
		char arr1[] = name.toCharArray();
		char nn = arr1[0];
		if (nn == '青') {
			System.out.println("欢 迎 你，青");

		}
		else
			System.out.println("对 不 起 ， 你 不 是 青 ！");

		
	}
}
		 /* package day3;

import java.util.Scanner;


 @author Administrator


public class Qing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char NAME = '青';
		int PASSWORD = 123;
		
		Scanner s = new Scanner(System.in);
		String d = s.next();
		char dd = d.charAt(0);
		int num = s.nextInt();
		
		if(dd == NAME&&num == PASSWORD) {
			System.out.println("欢迎你，青");
		}else {
			System.out.println("对不起，你不是青");
		}

	}

}

		 */

	

	