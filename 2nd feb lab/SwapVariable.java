package LAB;

public class SwapVariable {//create a class
	public static void main(String[] args) {//main method
		int a=10,b=5,temp;//declare the local variable
		System.out.println(" before swapping value of a is:"+a);
		System.out.println(" before swapping value of b is:"+b);
		//logic of swapping using temp variable
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping value of a is:"+a);
		System.out.println("after swapping value of b is:"+b);
	}

}
