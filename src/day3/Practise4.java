package day3;
import java.util.*;
public class Practise4 {

	public static void main(String[] args) {
		// 能否被3和5整除
		System.out.println("请输入一个数");
		Scanner a = new Scanner(System.in);
		double b = a.nextDouble();
		if((b%3==0)||(b%5==0)){
			System.out.println("能被3或5整除");
		}else
			System.out.println("不能被3或5整除");
		

	}

}
