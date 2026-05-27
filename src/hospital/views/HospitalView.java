package hospital.views;

import java.util.Scanner;

public class HospitalView {

	    private Scanner sc = new Scanner(System.in);

	    // ================= MAIN MENU ONLY =================
	    public int mainMenu() {

	        System.out.println("====================================");
	        System.out.println("   HOSPITAL MANAGEMENT SYSTEM");
	        System.out.println("====================================");

	        System.out.println("1. Patient Module");
	        System.out.println("2. Doctor Module");
	        System.out.println("3. Appointment Module");
	        System.out.println("4. Bills Module");
	        System.out.println("5. Department Module");
	        System.out.println("6. Exit");

	        System.out.println("------------------------------------");

	        System.out.print("Enter your choice: ");
	        return sc.nextInt();
	    }
	}

