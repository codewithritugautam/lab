// program to find the smallest number among three number
package thurdylab;

import java.util.Scanner;
public class smallestnumber { //main class
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number1");
		int num1=sc.nextInt();
		System.out.println("enter a number");
		int num2=sc.nextInt();
		System.out.println("enter a number");
		int  num3=sc.nextInt();
		findsmallest(num1,num2,num3); //create a method
	}
	public static void findsmallest(int num1,int num2,int num3) {
		if (num2<num2 && num1<num3) { //comparing by using AND operator
			System.out.println("number is smallest:" +num1); //printing the value of"a"if true
		}
		else if(num2<num1 && num2<num3) //comparing by using AND Operator
		{
			System.out.println("number is smallest:"+num2);
		}
		else
		{
			System.out.println("number is smallest:"+num3);
		}
		
	}

}
