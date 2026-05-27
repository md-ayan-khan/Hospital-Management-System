package controller;

import java.util.List;

import entity.doctors;
import hospital.views.DoctorView;
import modelsDAO.doctorDAO;

public class DoctorController {
		
	private DoctorView view;
	private doctorDAO dao;
	public DoctorController(DoctorView view, doctorDAO dao) {
		super();
		this.view = view;
		this.dao = dao;
	}
	
	public void run() {
		while(true) {
			int choice = view.showMenu();
			
			switch(choice) {
			case 1: {
				String name = view.getDoctorName();
				String speci = view.getSpecialization();
				String phone = view.getPhone();
				String email = view.getEmail();
				int depart = view.getDepartment();
				
				doctors dr = new doctors(name, speci, phone, email, depart);
				
				int i = dao.insert(dr);
				System.out.println(i != 0 ? "success.." : "something went wrong");	
			}
			break;
			case 2: {
				String name = view.getDoctorName();
				String speci = view.getSpecialization();
				String phone = view.getPhone();
				String email = view.getEmail();
				int depart = view.getDepartment();			
				int id = view.getDoctorId();
				
				doctors dr = new doctors(id, name, speci, phone, email, depart);
				
				int i = dao.update(dr);
				System.out.println(i != 0 ? "success.." : "something went wrong");	
			}
			break;
			
			case 3: {
				int id = view.getDoctorId();
				
				int i = dao.delete(id);
				System.out.println(i != 0 ? "success.." : "something went wrong");	
			}
			break;
			
			case 4: {
				
				List<doctors> dr = dao.read();
				for(doctors d : dr) {
					System.out.println(d);
				}
			}
			break;
			
			case 5: 
					dao.doctorworkloadreport();
			
			break;
			
			case 6: return;
			
			default:
				System.out.println("invalid choice");
		}
		}
}
}	