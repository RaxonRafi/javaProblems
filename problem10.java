package FinalExam;
import java.util.Scanner;



public class Problem1 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = myInput.nextInt();
		
		int i,j=0,temp=0,sum=0;
		
		for(i=1;i<=n;i++) {
			
			 temp = temp*10+9;
			 sum +=temp;
		}
		System.out.println("Sum: "+sum);
		
	}
	

}
