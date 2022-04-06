package MphasisAssignment;

import java.util.Scanner;

public class EvenNoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
        int j;
		Scanner sc=new Scanner (System.in);
		System.out.print(" Please Enter the number of your choice: ");
        number=sc.nextInt();
         
        
        for (j=1;j<=number;j++)
        {
        	if(j%2==0)
        	{
        		
        		System.out.print(j+"\t");
        		//System.out.print("Is A Even number");
	
	}
        }
	

	}

}
