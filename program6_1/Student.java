package program6_1;

import java.util.ArrayList;

public class Student {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Snehal");
	list.add("Aditya");
	list.add("Rakhi");
	list.add("Sumit");
	list.add("Rewa");
	list.add("Prem");
	System.out.println("Content of ArrayList:");
	for(String element :list) {
		if (element.contains("Aditya")) {
			System.out.println(element);
		}
	}
	}
}