package thurdylab;

public class Arr_common { //class
		public static void main(String[] args) {//main method
		//array declaration and initialization
		int arr1[]= {1,2,3};
		int arr2[]= {11,12,13,14,15,16};
		int arr3[]= {2,3,4,5};
		int x=0,y=0,z=0;
		System.out.println("common elements are:");
		while(x<arr1.length&&y<arr2.length&&z<arr3.length) {//loop to find common element
		if (arr1[x]==arr2[y] && arr2[y]==arr3[z]){//if the condition is true so print common element
		System.out.print(arr1[x]+" ");
		x++;
		y++;
		z++;
		}
		else if (arr1[x]<arr2[y])//to increment the value of x
		x++;
		else if (arr2[y]<arr3[z])//to increment the value of y
		y++;
		else//to increment the value of z
		z++;
		}}}
	
