package programs;

public class PrintEvenNum {
public static void main(String[] args) {
		
		int num = 20;
		for (int i =0; i<=num; i++) {
			
		  	//even no. cond -> (i%2 == 0) or (i%2 != 1)
			if(i%2 == 0) {
				System.out.println("Even No:"+i);
				
			}
		}
	}

}
