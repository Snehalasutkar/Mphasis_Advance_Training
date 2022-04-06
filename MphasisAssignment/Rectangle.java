package MphasisAssignment;

import java.util.Scanner;

public class Rectangle {
int length;
int breadth;
int area;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
public int getArea() {
	return area;
}
public void setArea(int area) {
	this.area = area;
}
public int getPerimeter() {
	return perimeter;
}
public void setPerimeter(int perimeter) {
	this.perimeter = perimeter;
}
int perimeter;

Rectangle (){
	System.out.println("Properties of rectangle");
}
void input() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the length of rectangle: ");
	length=sc.nextInt();
	System.out.println("Enter the breadth of rectangle: ");
	breadth=sc.nextInt();
}
void calculate() {
	area=length*breadth;
	perimeter=2*(length+breadth);
}
void display() {
	System.out.println("Area of Rectangle=" +area);
	System.out.println("Perimeter of Rectangle="+perimeter);
}
public static void main(String[] args) {
	Rectangle rect=new Rectangle();
	rect.input();
	rect.calculate();
	rect.display();
}
}