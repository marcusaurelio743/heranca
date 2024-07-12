package ex.Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid Position");
			}
			catch(InputMismatchException e){
				System.out.println("Invalid Value");
			}
			
			System.out.println("end for Program");
		
		sc.close();
	}

}
