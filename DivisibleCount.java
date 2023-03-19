package payilagam;
import java.util.Scanner;
public class DivisibleCount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number you want to Check:");
		int count;
		int num=sc.nextInt();
		int divider=num/2;
		int n = 2;
		while (divider>=n){
			if(num%n==0){
				System.out.println("the number "+n+"  can divide "+num);
				count++;
			}
			n++;
			
		}
		System.out.println("Totally the given number can divided by "+count+" numbers");
		

	}

}
