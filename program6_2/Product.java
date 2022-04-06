package program6_2;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Product {
String ProductId;
String ProductName;
public Product(String ProductId,String ProductName) {
	this.ProductId=ProductId;
	this.ProductName=ProductName;
	
}

	public static void main(String[]args) {
		HashSet<Product> set=new HashSet<Product>();
		Product p1=new Product("P001","Maruti800");
		Product p2=new Product("P002","MarutiZen");
		Product p3=new Product("P003","MarutiDezire");
		Product p4=new Product("P004","MarutiAlto");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		
		set.remove(p1);
		for(Product p:set) {
			System.out.println(p.ProductId+"    "+p.ProductName);
		}
}
}
