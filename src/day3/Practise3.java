package day3;
import java.util.*;
public class Practise3 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  int a = in.nextInt();
		  int b = in.nextInt();
		  int c = in.nextInt();
		  int max = (a>b?a:b)>c?(a>b?a:b):c;
		  int min = (a<b?a:b)<c?(a<b?a:b):c;
		  if(a>min && a<max){
		   b = a;
		  }else if(c>min && c<max){
		   b = c;
		  }
		  a = min;
		  c = max;
		  System.out.println(a + "-" + b + "-" + c);
		 }
}
