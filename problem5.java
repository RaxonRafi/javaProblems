package filehandaling;
import java.io.*;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			 File fileA = new File("D:/input.txt");
			 FileReader fileReader = new FileReader(fileA);
			 BufferedReader bufferReader = new BufferedReader(fileReader);
			 
			 File fileB = new File("D:/output.txt");
			 FileWriter fileWriter = new FileWriter(fileB);
			 BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			 
			 String line;
			 while((line=bufferReader.readLine()) != null) {
				 
				String[] words = line.split(" ");
				int wordcnt = words.length;
				int charcnt = line.replaceAll(" ","").length();
				
				if(wordcnt%charcnt == 0) {
					
					bufferWriter.write("wordcnt:"+wordcnt+"\n"+"charcnt:"+charcnt);
					
				}else {
					bufferWriter.write("null");
				}
				
			 }
				fileReader.close();
				fileWriter.close();
				bufferReader.close();
				bufferWriter.close();
					 
		}catch(IOException e) {
			
			System.out.println(e);
		}

	}

}
