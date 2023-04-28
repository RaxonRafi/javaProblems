package filehandaling;
import java.io.*;
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File inFile =new File("D:/input.dat");
		File outFile =new File("D:/output.dat");
		
		FileReader ins = null;
		FileWriter outs = null;
		
		try {
			
			ins = new FileReader(inFile);
			outs = new FileWriter(outFile);
			
			int ch;
			while( (ch=ins.read()) != -1) {
				outs.write(ch);
			}
		}catch(IOException e) {
			System.out.println(e);
			System.exit(-1);
		}
		finally {
			
			try {
				ins.close();
				outs.close();
			}catch(IOException e) {
				
				System.out.println(e);

			}
			
		}
		

	}

}
