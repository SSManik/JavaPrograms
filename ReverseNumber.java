package Payilagam;

public class ReverseNumber {
	public static void main(String[] args) {
		long givenNumber = 6380656924l;
		long reversNumber = 0;
		while(givenNumber>0){
			reversNumber=(reversNumber*10)+givenNumber%10;
			System.out.println(reversNumber);
			givenNumber=givenNumber/10;
		}
		
		System.out.println(reversNumber);
	
	}

}
