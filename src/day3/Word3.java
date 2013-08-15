package day3;

public class Word3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
	    int arr[]=new int[40];
	    int sum=0;
	    for(i=0;i<40;i++){
	    	arr[i]=(int)(Math.random()*100);
	    	System.out.println(arr[i]);
	    	sum=sum+arr[i];
	    }
	    
	    int num=0;
	    for(i=0;i<40;i++){
	    	if(arr[i]<sum/40){
	    		num++;
	    	}
	    	
	    }
	    System.out.println(num);
	}

}
