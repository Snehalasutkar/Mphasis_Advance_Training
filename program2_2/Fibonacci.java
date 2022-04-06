package program2_2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=13,firstTerm=1,secondTerm=3;
 System.out.println("Fibonacci Series till"+n+"terms:");
 
 for(int i=1;i<=n;i++) {
	 System.out.print(firstTerm+",");
	 
	 int nextTerm=firstTerm+secondTerm;
	 firstTerm=secondTerm;
	 secondTerm=nextTerm;
 }
 
	}

}
