package LAB;

public class AverageNumber { //create a class
public static void main(String[] args) {   //main method
	int a=10,b=20,c=30,d=40,e=50,sum,average;//declare  local variable
	System.out.println("Input first number:"+a);
	System.out.println("Input first number:"+b);
	System.out.println("Input first number:"+c);
	System.out.println("Input first number:"+d);
	System.out.println("Input first number:"+e);
	sum=a+b+c+d+e;//calculate sum
	System.out.println("the sum is"+sum);//print the value of sum
	average=sum/5;//calculate average
	System.out.println("average of five number is:"+average);//print the average
}
}
