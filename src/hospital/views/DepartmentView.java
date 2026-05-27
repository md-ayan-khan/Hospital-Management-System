package hospital.views;

import java.util.Scanner;

public class DepartmentView {
	
	  private Scanner sc = new Scanner(System.in);

	    // MENU
	    public int showMenu() {

	        System.out.println("----- DEPARTMENT MENU-----");

	        System.out.println("1. Create Department");
	        System.out.println("2. Read Department");
	        System.out.println("3. Update Department");
	        System.out.println("4. Delete Department");
	        System.out.println("5. Exit");

	        System.out.println("------------------------");

	        return sc.nextInt();
	    }

	    // DEPARTMENT ID
	    public int getDepartmentId() {

	        System.out.print("Enter Department ID: ");
	        return sc.nextInt();
	    }

	    // DEPARTMENT NAME
	    public String getDepartmentName() {

	        sc.nextLine();

	        System.out.print("Enter Department Name: ");
	        return sc.nextLine();
	    }

	    // LOCATION
	    public String getLocation() {

	        System.out.print("Enter Department Location: ");
	        return sc.nextLine();
	    }

}
