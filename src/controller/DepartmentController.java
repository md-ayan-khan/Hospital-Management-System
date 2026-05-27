package controller;

import java.util.List;

import entity.departments;
import hospital.views.DepartmentView;
import modelsDAO.departmentDAO;

public class DepartmentController {
	
    private DepartmentView view;
    private departmentDAO dao;

   
	public DepartmentController(DepartmentView view, departmentDAO dao) {
		super();
		this.view = view;
		this.dao = dao;
	}

	public void run() {

        while (true) {

            int choice = view.showMenu();

            switch (choice) {
            
            case 1:{
            	String name = view.getDepartmentName();
            	String location = view.getLocation();

            	departments d = new departments(name, location);

            	int i = dao.insert(d);
            	System.out.println(i != 0 ? "Department Inserted" : "Insert Failed");
			}
			break;
			
			case 2:{
				List<departments> dep = dao.read();
				for(departments d : dep) {
					System.out.println(d);
				}
			}
			break;
			
			case 3:{

                int id = view.getDepartmentId();
                String name = view.getDepartmentName();
                String location = view.getLocation();

                departments d = new departments(id, name, location);

                int i = dao.update(d);

                System.out.println(i != 0 ? "Department Updated" : "Update Failed");
  
			}
			break;
			case 4:{
				 int id = view.getDepartmentId();

                 int i = dao.delete(id);

                 System.out.println(i != 0 ? "Department Deleted" : "Delete Failed");
			}
			break;
			case 5:
                System.out.println("Exited...");
                return;
              
			default:
                System.out.println("Invalid choice!");
            
            

               
    }
   }
}
}
