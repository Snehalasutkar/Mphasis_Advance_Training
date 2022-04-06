package MphasisAssignment;

import java.util.Scanner;

public class Rectangle1 {
	float area;
	float perimeter;
	public Rectangle1(float length,float breadth) {
		area=length*breadth;
		perimeter=2*(length+breadth);
		System.out.println("");
		 System.out.println("Rectangle Info is :");    
		    System.out.println("Length :" +length);
		    System.out.println("Breadth :" +breadth);
		    System.out.println("area of the rectangle is : "+area);
		    System.out.println("perimeter of the rectangle is:"+perimeter);
			}
		    public static class TestRectangle 
		    {
		    	public static void main(String[] args)
		    	{
		    		Scanner sc = new Scanner(System.in);
		    		float []length=new float[5];
		    	    float []width=new float[5];
		    		System.out.println("Enter Lengths of 5 Rectangles:");
		    		for(int i = 0; i < 5; i++)
		    		{
		    			length[i] = sc.nextFloat();
		    		}
		    		System.out.println("Enter Widths of 5 Rectangles:");
		    		for(int i = 0; i < 5; i++) 
		    		{
		    			width[i] = sc.nextFloat();
		    		}
		    		sc.close();
		    		Rectangle1 obj1=new Rectangle1(length[0], width[0]);
		    		Rectangle1 obj2=new Rectangle1(length[1], width[1]);
		    		Rectangle1 obj3=new Rectangle1(length[2], width[2]);
		    	    Rectangle1 obj4=new Rectangle1(length[3], width[3]);
		    		Rectangle1 obj5=new Rectangle1(length[4], width[4]);
		    	}
		    
	}
}