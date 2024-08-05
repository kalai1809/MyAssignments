package programs;

public class CheckNumberIsPrime {
	public static void main(String[] args) {
		
		int num = 19;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				System.out.println("Not a Prime Number: "+num);
				break;
			}
			else {
				System.out.println("Prime Number: "+num);
				break;
			}
		}
		
	}

}
