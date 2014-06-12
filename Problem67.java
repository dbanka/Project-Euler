import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Problem67 {

	public static void main(String[] args) {
		
		File file = new File("triangle.txt");
		
		int [][] triangle = new int [100][100];
		Scanner scanner;
		try {
			 scanner = new Scanner(file);
			 
			for(int i=0;i<100;i++)
			   for(int j=0;j<=i;j++)
			     { triangle[i][j] = scanner.nextInt();}
			
		 }
		catch (FileNotFoundException e) 
		    {
			// TODO Auto-generated catch block
			System.out.println("file not found" + file.toString());
		    }
		
		for(int i=98;i>=0;i--)
		   { 
			 for(int j=0;j<=i;j++)
			 {
				 triangle[i][j] += Math.max(triangle[i+1][j],triangle[i+1][j+1]);
			 }
		   
		    }
		
		System.out.println("The largest sum is " + triangle[0][0]);
		 
	}}
