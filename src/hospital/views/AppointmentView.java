package hospital.views;

import java.sql.Date;
import java.util.Scanner;

public class AppointmentView {

	    private Scanner sc = new Scanner(System.in);

	    public int showMenu() {

	        System.out.println("----- APPOINTMENT MENU-----");

	        System.out.println("1. Book Appointment");
	        System.out.println("2. Update Appointment");
	        System.out.println("3. Cancel Appointment");
	        System.out.println("4. View Appointment by ID");
	        System.out.println("5. patients visit history");
	        System.out.println("6. Exit");

	        System.out.println("------------------------");

	        return sc.nextInt();
	    }

	    public int getAppointmentId() {

	        System.out.print("Enter Appointment ID: ");
	        return sc.nextInt();
	    }

	    public int getPatientId() {

	        System.out.print("Enter Patient ID: ");
	        return sc.nextInt();
	    }

	    public int getDoctorId() {

	        System.out.print("Enter Doctor ID: ");
	        return sc.nextInt();
	    }

	    public Date getAppointmentDate() {
	    	sc.nextLine();
	        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
			return Date.valueOf(sc.nextLine());
	   
	    }
	    
	    public String getAppointmentTime() {

	    	
	        System.out.print("Enter Appointment Time (HH:MM): ");
	        return sc.nextLine();
	    }

	    public String getStatus() {

	        System.out.print("Enter Status (Booked/Cancelled): ");
	        return sc.nextLine();
	    }
	    
	    public String getReason() {

	        System.out.print("Enter Reason : ");
	        return sc.nextLine();
	    }
	}

