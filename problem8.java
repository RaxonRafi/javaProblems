package filehandaling;

import java.io.*;

public class issue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			   File fileA = new File("D:/A.txt");
			   FileReader fileReader = new FileReader(fileA);
			   BufferedReader bufferedReader = new BufferedReader(fileReader);
			   
			   File fileB = new File("D:/B.txt");
			   FileWriter fileWriter = new FileWriter(fileB);
			   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			   
			   int lineCnt=0,count=0;
			   int wordcnt =0;
			   String line;
			   while((line = bufferedReader.readLine()) != null) {
			    
			    String[] words = line.split(" ");
			     wordcnt = words.length;
			     
			    for(int i = 0 ; i< words.length;i++) {
			     //System.out.println(wordcnt);
			     String word = words[i];
			     
			       if (word.length() == 3) {
                                   
                                   count++;
                               }
			        
			      if(count%2 == 0 && count/4 == 0) {
			       
			        //bufferedWriter.write(word+" ");
			                                                         
			      }
			            bufferedWriter.write(word+" ");
			            bufferedWriter.write(""+"\n");
			                                        
			        
			        } 
			      lineCnt++;
			      
			    }
			    
			  
			    
			     
			   }
			   
//			   System.out.println(count);
			   //System.out.println(wordcnt);
			   
			    System.out.println("line Number:"+lineCnt);
			    System.out.println("word Count"+count);
			    
			   
			  
			    double avg = (float)count/(float)lineCnt;
			    System.out.println(count);
			    //System.out.println(lineCnt);
			    
			// System.out.println(wordcnt);
			// System.out.println(lineCnt);
			// System.out.println(avg);
			      bufferedWriter.write("Average"+avg);
			   
			   bufferedReader.close();
			   bufferedWriter.close();
			   fileReader.close();
			   fileWriter.close();
			  }catch(IOException e) {
			   System.out.println(e);
			  }


	}

}
}
