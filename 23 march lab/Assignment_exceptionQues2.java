package thurdylab;

public class Assignment_exceptionQues2 {
	public void display(int x,int y)throws Exception{
		if(-20<=x && y<=20) {
			throw new Exception("Throw Exception");
		}
		else {
			System.out.println("The product of x and y: "+x*y);
		}
		}
		public static void main(String[] args)throws Exception {//main method
			Assignment_exceptionQues2 e1= new Assignment_exceptionQues2();
			e1.display(-10, -30);
		}
		}