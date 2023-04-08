package thurdylab;
	import java.io.*;
	public class program2 {  //main class
		public static void main(String[] args)  { //main method
			byte arr[]= {65,34,23,56,78,34,98,47,23,87};  //byte array--only
			//byte array is used to read the number
			ByteArrayInputStream bin=new ByteArrayInputStream(arr);
			int i;
			while((i=bin.read())!=-1) {   //to print the whole value
				char ch=(char)i;  //converting into character
				System.out.println("ASCII character:"+i+"value is"+ch);
			}}}

