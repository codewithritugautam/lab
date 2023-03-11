package thurdylab;

public class Student {
		Student()
		{ 
			//default constructor
			System.out.println("Default");
		}
			int sum;
		    Student(int a, int b){ 
		    	//parameterized constructor
		    sum=a+b;
		    }
		  void show(){
	      System.out.println("sum : "+sum);
		  } 
		  public static void main(String args[]) {
			  Student obj = new Student();
		      Student obj1 = new Student(70,10);
		      obj1.show();
		  }
		}

