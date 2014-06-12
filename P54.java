import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P54 {


	public static void main(String[] args) throws FileNotFoundException {
		
		int rank=0;
		  File file = new File("poker.txt");
		  Scanner in = new Scanner(file);
		  
		  for(int i=0;i<1000;i++)
	       { String line= in.nextLine();
			 line = line.replaceAll(" ", "");
			 Hand player1= new Hand(line.substring(0,10));
			 Hand player2= new Hand(line.substring(10,20));
			 if(player1.getScore()>player2.getScore())
				 rank++;
	       }
		  in.close();
		  System.out.println(rank);
		  
	}		 

}
