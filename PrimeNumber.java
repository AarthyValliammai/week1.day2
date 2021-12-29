package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		for(int i=2;i<input;i++) {
			int div=input/i;
			if(div==1) {
				flag=true;
				break;
			}
			if(flag=true) {
				System.out.println("prime number");}
			else {
				System.out.println("not prime number");
			}
			}
	}
}
