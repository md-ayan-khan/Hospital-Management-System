package hospital.views;

import java.sql.Date;
import java.util.Scanner;

public class BillView {
	
	private Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
	System.out.println("----- BILL MENU-----");

    System.out.println("1. Create Bill");
    System.out.println("2. Read Bill");
    System.out.println("3. Update Bill");
    System.out.println("4. Delete Bill");
    System.out.println("5. Exit");

    System.out.println("------------------------");

    return sc.nextInt();
	}
	
	  public int getBillId() {

	        System.out.print("Enter Bill ID: ");
	        return sc.nextInt();
	    }
	  public int PatientId() {
		  
		  System.out.print("Enter Patient ID: ");
		  return sc.nextInt();
	  }
	  public int getappointmentId() {
		  
		  System.out.print("Enter Appointment ID: ");
		  return sc.nextInt();
	  }
	  
	  public Double gettotalAmount() {
		  
		  System.out.println("Enter Total Amount");
		  return sc.nextDouble();
	  }
	
	   public String getPaymentStatus() {
		   sc.nextLine();
	        System.out.print("Enter Payment Status ");
	        return sc.nextLine();
	    }
	   
	   public Date getAppointmentDate() {
	        
	        System.out.print("Enter Bill Date (YYYY-MM-DD): ");
			return Date.valueOf(sc.nextLine());
	    }
	
}
