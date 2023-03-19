package Payilagam;
import java.util.Scanner;
public class AddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		int number = sc.nextInt();
		if((number%5)==0){
			System.out.println("The number you have entered is can devide by 5");
		}else{
			System.out.println("The number you have entered cannot devide by 5");
		}
		
	}

}
