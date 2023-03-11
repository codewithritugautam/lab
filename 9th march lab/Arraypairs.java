package thurdylab;

public class Arraypairs { //class
public static void main(String[] args) {
//create matrix
int arr[]= {1,2,3,4,5,6,7,8}; //declaration and instantiation
int sum=8;
for(int i=0;i<=arr.length;i++) { //printing row
for(int j=0;j<=arr.length;j++) { //printing column
if(sum==arr[i]+arr[j]) {
System.out.println(arr[i]+" " +arr[j]);
}}
System.out.println(" ");
}}}
