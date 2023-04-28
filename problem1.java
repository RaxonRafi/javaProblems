package filehandaling;
import java.io.*;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D:/test.txt");
		DataOutputStream out = new DataOutputStream(fout);
		
		out.writeDouble(3.14146);
		out.writeInt(10);
		out.writeBoolean(true);
		out.close();
		
		FileInputStream fin = new FileInputStream("D:/test.txt");
		DataInputStream in = new DataInputStream(fin);
		
		double d = in.readDouble();
		int i = in.readInt();
		boolean b = in.readBoolean();

		System.out.println("Here are some values: "+d+" "+i+" "+b);
		in.close();

	}

}
