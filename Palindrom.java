package Payilagam;
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrom or not:");
		long inputnum=sc.nextLong();
		long copy=inputnum;
	    long outputnum=0;
	    while (copy>0){
	    	outputnum=(outputnum*10)+(copy%10);
	    	copy=copy/10;
	    	
	    }
	    System.out.println(outputnum);
	   if (inputnum!=outputnum){
        System.out.println("Given number is not palindrom number");
	}else{
		System.out.println("Given number is palindrom");
		
	     }
			
		
		
	}

}
