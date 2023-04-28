package filehandaling;
import java.io.*;
import java.util.Arrays;
public class issue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File  fileA = new File("D:/A.txt");
			FileReader  fileReader = new FileReader(fileA);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			File  fileB = new File("D:/B.txt");
			FileWriter fileWriter = new FileWriter(fileB);
			BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter);
			
			int lineCnt=0;
            int totalWordCount = 0;

			String line;
			while((line = bufferedReader.readLine()) != null) {
				
				  
				
				String[] words = line.split(" ");
				
                int wordCnt = 0;

				wordCnt = words.length;
				//System.out.println(wordCnt);
				
				for(int i = 0 ; i< words.length;i++) {
					String word = words[i];
					
				   if (word.length() == 3) {
			
					   wordCnt++;
					   
				    
				    }
					 if(wordCnt%2 == 0 && wordCnt%4 == 0) {
					       
						    bufferedWriter.write(line);
		                
				            bufferedWriter.write(""+"\n");
					                                                         
					 }
					
				}

				 totalWordCount += wordCnt;
		
				
				 lineCnt++;
			    
			}
			//System.out.println(wordCnt);
			
			
		    double avg =(double) totalWordCount / lineCnt;
//		    System.out.println(wordcnt);
//		    System.out.println(lineCnt);
//		    System.out.println(avg);
		    bufferedWriter.write("Average: "+avg);
			
			bufferedReader.close();
			bufferedWriter.close();
			fileReader.close();
			fileWriter.close();
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
