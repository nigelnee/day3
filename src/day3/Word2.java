package day3;

public class Word2 {
	
		public static void main(String[] args) {
			int []a ={1,2,3,4,5,6,7,8,9,10};
			int temp=a[0];
			for(int i=0;i<9;i++)
			{
			a[i]=a[i+1];
			a[9]=temp;
			System.out.println(a[i]);
			}
		}

	}

