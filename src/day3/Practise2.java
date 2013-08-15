package day3;

import java.util.*;

public class Practise2 {

	public static void main(String[] args) {
		// 判断搬桌子
		Scanner input = new Scanner(System.in);

		System.out.println("请输入年龄：");

		int age = input.nextInt();

		String sex = input.next();

		if (age >= 7 || (age >= 5 && sex.equals("男"))) {

			System.out.println("可以搬动桌子");

		} else {
			System.out.println("请输入性别：");

			String sex1 = input.next();
			if(sex1.equals("女")||(sex1.equals("男"))){

			System.out.println("不可以搬动桌子");
			}
		}
	}
}

/*
 * String n = args[0];
 * int a = Integer.parseInt(n1);
 * String xb = args[1];
 * char b[]=xb.toCharArray();
 * 		if (age >= 7 || (age >= 5 && b[]==("男"))) {

			System.out.println("可以搬动桌子");

		} else {

			System.out.println("不可以搬动桌子");
		}
 */





