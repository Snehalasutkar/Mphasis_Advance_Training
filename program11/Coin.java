package program11;
import java.util.Vector;

public class Coin {
	// All denominations of Indian Currency 
    static int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    static int n = deno.length;
  
    static void findMin(int V)
    {
    	int count=0;
        // Initialize result 
        Vector<Integer> ans = new Vector<>();
  
        // Traverse through all denomination 
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations 
            while (V >= deno[i]) 
            {
                V -= deno[i];
                ans.add(deno[i]);
                count++;
            }
        }
  
        // Print result 
        
        {
            System.out.print(count+"BreakDown-");
            for(int i=0;i<ans.size();i++)
            {
            System.out.print(" Rs." + ans.elementAt(i)+"*1");
            if(i<1) {
            	System.out.print("+");
            }
            }
        }
        
    }
    public static void main(String[] args) 
    {
        int n = 70;
        
        findMin(n);
    }


}
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        