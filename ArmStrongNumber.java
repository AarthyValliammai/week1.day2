package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int input=153;
		int num=input;
		int calc=0;
		while(input>0) {
			int rem=input%10;
			calc=calc+(rem*rem*rem);
			input=input/10;
		}
         if(calc==num) {
		System.out.println("armstrong number");
	}
	}
}
