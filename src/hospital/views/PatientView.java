package hospital.views;

import java.util.Scanner;

public class PatientView {
	
	private Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
		
		System.out.println("-----PATIENT MENU-----");
		
		System.out.println("Enter 1 for Insert :  ");
		System.out.println("Enter 2 for Update :  ");
		System.out.println("Enter 3 for Delete :  ");
		System.out.println("Enter 4 for Read :  ");
		System.out.println("Enter 5 for Exit :  ");
		
		System.out.println("-------------------------------");
		return sc.nextInt();
	}
	
	  public int getPatientId() {

	        System.out.print("Enter Patient ID: ");
	        return sc.nextInt();
	    }

	    public String getPatientName() {

	        sc.nextLine();
	        System.out.print("Enter Patient Name: ");
	        return sc.nextLine();
	    }
	    
	    public String getGender() {

	        System.out.print("Enter Gender: ");
	        return sc.next();
	    }

	    public int getAge() {

	        System.out.print("Enter Age: ");
	        return sc.nextInt();
	    }

	    public String getPhone() {

	        System.out.print("Enter Phone: ");
	        return sc.next();
	    }
	    
	    public String getAddress() {

	        sc.nextLine();
	        System.out.print("Enter Address: ");
	        return sc.nextLine();
	    }

	    public String getBloodGroup() {

	        System.out.print("Enter Blood Group: ");
	        return sc.next();
	    }

}
