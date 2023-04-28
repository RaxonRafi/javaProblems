package filehandaling;

public class problem6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[]={5,10};
		int b=5;
		try{
			int x=a[2]/b-a[1];
		}
		catch(ArithmeticException e){
			System.out.println("Division by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(ArrayStoreException e){
			System.out.println("Wrong data type");
		}
		finally{
			int y=a[1]/a[0];
			System.out.println("The Value of y= "+y);
		}

	}

}
