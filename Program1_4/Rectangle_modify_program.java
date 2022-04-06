package Program1_4;

import java.util.Scanner;

public class Rectangle_modify_program {
int length;
int width;
int area;
int perimeter;

public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}

public Rectangle_modify_program()
{
	length=1;
	width=1;
	
}
void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of Rectangle:");
	length=sc.nextInt();
	System.out.println("Enter the width of Rectangle:");
	width=sc.nextInt();
	
}
void areaOfRectangle() {
	area=length*width;
}
void perimeterOfRectangle() {
	perimeter=2*(length+width);
}
void display() {
	if(length>0 && length <20  )
	
	if(width>0 && width <20  )
	{
	System.out.println("Area of Rectangle="+area);
	System.out.println("Perimeter of Rectangle="+perimeter);
	}
}
public static void main(String[] args) {
	Rectangle_modify_program r1=new Rectangle_modify_program();
	r1.input();
	r1.areaOfRectangle();
	r1.perimeterOfRectangle();
	r1.display();
	System.out.println("****************************");
	Rectangle_modify_program r2=new Rectangle_modify_program();
	r2.input();
	r2.areaOfRectangle();
	r2.perimeterOfRectangle();
	r2.display();
	System.out.println("*****************************");
	Rectangle_modify_program r3=new Rectangle_modify_program();
	r3.input();
	r3.areaOfRectangle();
	r3.perimeterOfRectangle();
	r3.display();
	System.out.println("*****************************");
	Rectangle_modify_program r4=new Rectangle_modify_program();
	r4.input();
	r4.areaOfRectangle();
	r4.perimeterOfRectangle();
	r4.display();
	System.out.println("*****************************");
	Rectangle_modify_program r5=new Rectangle_modify_program();
	r5.input();
	r5.areaOfRectangle();
	r5.perimeterOfRectangle();
	r5.display();
}

}
