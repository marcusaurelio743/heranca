package Ativ2.Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Ativ2.entities.Retangle;
import Ativ2.entities.Shape;
import Ativ2.entities.circle;
import Ativ2.entities.enums.Color;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		System.out.println("Enter the number of shapes:");
		int n = sc.nextInt();
		
		for(int i=0; i< n; i++) {
			System.out.println("Shape #"+(i+1)+" data:");
			System.out.println("Rectangle or Circle (r/c)?");
			String ch = sc.next();
			System.out.println("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			
			if(ch.equalsIgnoreCase("r") || ch.equalsIgnoreCase("R")) {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Retangle(color, width, height));
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new circle(color, radius));
			}
			
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
