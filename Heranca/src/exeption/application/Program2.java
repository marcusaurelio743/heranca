package exeption.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exeption.entities.Reservation;

public class Program2 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number");
		int number = sc.nextInt();
		System.out.println("Check-in date(dd/mm/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date(dd/mm/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+reservation);
			
			
			System.out.println("Check-in date(dd/mm/yyyy)");
			 checkIn = sdf.parse(sc.next());
			System.out.println("Check-Out date(dd/mm/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			
		
				String erro = reservation.updateDates(checkIn, checkOut);
				
				if(erro != null) {
					System.out.println("Reservation error: "+erro);
				}else {
				
					System.out.println("Reservation: "+reservation);
				}
			
		}
		
		
		
		sc.close();

	}

}
