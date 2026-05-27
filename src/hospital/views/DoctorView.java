package hospital.views;

import java.util.Scanner;

public class DoctorView {
	
	    private Scanner sc = new Scanner(System.in);

	    public int showMenu() {

	        System.out.println("----- DOCTOR MENU-----");

	        System.out.println("1. Insert Doctor");
	        System.out.println("2. Update Doctor");
	        System.out.println("3. Delete Doctor");
	        System.out.println("4. View Doctor by ID");
	        System.out.println("5. Doctor workload report");
	        System.out.println("6. Exit");

	        System.out.println("------------------------");

	        return sc.nextInt();
	    }

	    public int getDoctorId() {

	        System.out.print("Enter Doctor ID: ");
	        return sc.nextInt();
	    }

	    public String getDoctorName() {

	        sc.nextLine();
	        System.out.print("Enter Doctor Name: ");
	        return sc.nextLine();
	    }

	    public String getSpecialization() {

	        System.out.print("Enter Specialization: ");
	        return sc.next();
	    }

	    public int getExperience() {

	        System.out.print("Enter Experience (years): ");
	        return sc.nextInt();
	    }

	    public String getPhone() {

	        System.out.print("Enter Phone: ");
	        return sc.next();
	    }
	    
	    public String getEmail() {

	        System.out.print("Enter Email: ");
	        return sc.next();
	    }
	    
	    public int getDepartment() {

	        System.out.print("Enter Department ID: "); 
	        return sc.nextInt();
	    }

	    
	    
	}
