package thurdylab;

import java.util.Scanner;

public class Assignment_ExcepQues1 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner (System.in)) {
			System.out.println("Sample Input 0");
			try {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("Sample output 0:" + x/y);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Sample Input 1");
			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Sample output1:" + a/b);
			}
			catch (Exception e) {
				System.out.println(e);
		}
			System.out.println("Sample Input 2");
			try {
				int m = sc.nextInt();
				int n = sc.nextInt();
				System.out.println("Sample output:" + m/n );
			}
			catch (Exception e) {
				System.out.println(e);
		}
			System.out.println("Sample Input 3:");
			try {
				int c = sc.nextInt();
				int d = sc.nextInt();
				System.out.println("Sample Output 3:"+ c/d);
			}
			catch(Exception f) {
				System.out.println(f);
			}
	}
	}}
