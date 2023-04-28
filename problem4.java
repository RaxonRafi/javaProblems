package filehandaling;
import java.io.*;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File  fileA = new File("D:/A.txt");
			FileReader  fileReader = new FileReader(fileA);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			File  fileB = new File("D:/B.txt");
			FileWriter fileWriter = new FileWriter(fileB);
			BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				
				String[] words = line.split(" ");
				int wordcnt  = words.length;
				int charcnt = line.replaceAll(" ","").length();
				
				System.out.println(charcnt);
				if(wordcnt%charcnt == 0) {
					bufferedWriter.write("charcnt: "+charcnt+"\n"+"wordcnt"+wordcnt);
				}else {
					bufferedWriter.write("Null");
				}
			}
			
			bufferedReader.close();
			bufferedWriter.close();
			fileReader.close();
			fileWriter.close();
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
