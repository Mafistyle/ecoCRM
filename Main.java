package ErfassenVonDaten;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scr = new Scanner(System.in);

			System.out.println("Eingabe Vornamen: ");
			String fname = scr.nextLine();
			System.out.println("Eingabe Nachnamen: ");
			String sname = scr.nextLine();
			System.out.println("Eingabe Addresse: ");
			String address = scr.nextLine();
			System.out.println("Eingabe Telefonnummer: ");
			int tel = scr.nextInt();
			System.out.println("Eingabe E-Mail: ");
			String mail = scr.nextLine();
			System.out.println("Vielen Dank für die Eingabe");
			Person person1 = new Person(fname,sname, address, mail, tel); //Objekt Person initialisiert
			System.out.println(person1.getSname());
	
	}
}
