package thurdylab;

public class oddposition { //class
public static void main(String[] args) {
	//create matrix
int[] a= new int[] {2,3,4,5,6};
System.out.println("odd possition elements:");
for(int i=0;i<a.length;i=i+2) { //printing row
	System.out.println(a[i]);
	}
}
}


