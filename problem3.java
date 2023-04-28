package filehandaling;
import java.io.*;
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          FileInputStream inFile = null;
          FileOutputStream outFile = null;
          byte byteread;
          
          try {
        	  inFile = new FileInputStream("D:/a_file.dat");
        	  outFile = new FileOutputStream("D:/b_file.dat");
        	  
        	  do {
        		  byteread = (byte) inFile.read();
        		  outFile.write(byteread);
        	  }while(byteread != -1);
        	  
          }catch(FileNotFoundException e) {
        	  System.out.println(e);
        	  
          }
          catch(IOException e){
        	  
        	  System.out.println(e.getMessage());
          }
          
          finally {
        	  
        	  try {
        		  inFile.close();
        		  outFile.close();
        	  }catch(IOException e){
        		  
        		  System.out.println(e);
        		  
        	  }
          }
	}

}
