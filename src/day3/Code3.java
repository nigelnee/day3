package day3;
import java.util.*;
public class Code3 {
	
	public static void main(String[] args) {
		//1 定义长度为10的数组
		byte arr0[] = new byte[]{20,23,13,50,(byte) 43,127};
		byte arr1[] = new byte[10];
		
		//2 生成随机数，并赋值给数组
		Random r=new Random();
		for (int i = 0;i < arr1.length; i++){
			byte bt = (byte)r.nextInt(100);
			arr1[i] = bt;
		}
	
		//3搜索数组中的值
		//搜索固定的值
		int b1 = Arrays.binarySearch(arr0, (byte)50);
		
		//判断
		if (b1<0){
			System.out.println("不在数组中");
			
		}else{
		
		System.out.println("结果是"+b1);
		}
		
		//4 复制数组
		int copyArr[] = new int[5];
		//copyArr = Arrays.copyOf(arr1,5);
		for (int i =0;i < copyArr.length; i++){
			System.out.println("copyArr["+i+"]");
		}
		
	}

}
