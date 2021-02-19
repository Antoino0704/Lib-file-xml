package test;

import xmllib.ReadXml;

public class Example {
	public static void main(String[] args) {
		ReadXml read = new ReadXml("xmlTest.xml"); //create object
		String text1;
		int i;
		for(i=0; i<read.getLenght("person"); i++) {		//read.getLenght return all number nodeList 
			text1 = read.getTag("name", i);		//read.getTag return String inside the tag, the i represents the location of the nodelist where it should look for the tag
			System.out.println("name: " + text1);
		}
		
		for(i=0; i<1; i++) {
			text1 = read.getTag("person", "name", 0); //if you do not declare the "getLength" function  first you must pass the nodelist as the first parameter of the "getTag" function
			System.out.println("test2");
			System.out.println("name: " + text1);
		}
	}

}
