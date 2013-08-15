package day3;

import java.util.Random;

public class Word1 {

	public static void main(String[] args) {
		// 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
		int arr[] = new int[10];
		double sum = 0, ave = 0;

		int max = arr[0];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 100);
			sum = sum + arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 0; i < 10; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		ave = sum / 10;
		System.out.println(" " + arr[0]);
		System.out.println(" " + arr[1]);
		System.out.println(" " + arr[2]);
		System.out.println(" " + arr[3]);
		System.out.println(" " + arr[4]);
		System.out.println(" " + arr[5]);
		System.out.println(" " + arr[6]);
		System.out.println(" " + arr[7]);
		System.out.println(" " + arr[8]);
		System.out.println(" " + arr[9]);

		System.out.println("最大值为" + max);
		System.out.println("最小值为" + min);
		System.out.println("十个随机数的和为" + sum);
		System.out.println("十个随机数的平均值为" + ave);

	}
}
