package ex.Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
				method1();
				System.out.println("end for Program");
		
		
	}
	
	public static void method1() {
		System.out.println("Method 1 start");
		method2();
		System.out.println("Method 1 end");
	}
	
	public static void method2() {
		System.out.println("Method 2 start");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid Position");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Value");
		}

		sc.close();
		
		System.out.println("Method 2 end");

	}

}
