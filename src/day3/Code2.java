package day3;

import java.util.Random;

public class Code2 {

	public static void main(String[] args) {
		
		//1、定义一个int类型的一位数组，包含10个元素
		int arr[] = new int[10];
		
		//2、分别赋一个随机整数：方法一，使用java.lang.Math数学类
		for(int i = 0;i<10;i++){
			double d = Math.random(); //生成0.0-1.0之间的数字
			System.out.println(d);
			int num = (int)(d*100);
			arr[i] = num;
			System.out.println(num);//右移两位，强制转换为整数
			System.out.println("-------------");
		}
	//方法二，使用java.util.Random
	//种子只是随机算法起源数字，与生成的随机数的区间没有关系
		Random r = new Random();
		for (int i = 0;i<10;i++){
			//int num = r.nextInt();//生成-2（31）-+2（32）
			int num = r.nextInt(100);//生成[0,100)
			System.out.println(num);
		}
		
		//3、求出所有元素的最大值，边界判断
		//arr.length 得到数组的长度，边界10
		//如果越界，arrayindexoutofboundsexception
		int sum=0;
		for (int i = 0; i < arr.length; i++){
			sum +=arr[i];
		}
		System.out.println("数组元素和："+sum);
	}

}
