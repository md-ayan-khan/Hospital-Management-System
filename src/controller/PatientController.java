package controller;

import java.util.List;

import entity.patients;
import hospital.views.PatientView;
import modelsDAO.patientDAO;

public class PatientController {
	
		private PatientView view;
		private patientDAO dao;
		
		public PatientController(PatientView view, patientDAO dao) {//constructor
			super();
			this.view = view;
			this.dao = dao;
		}
		
		public void run() {
			while(true) {
				int choice = view.showMenu();
				
				switch(choice){
				case 1: {
					String name = view.getPatientName();
					String gender = view.getGender();
					int age = view.getAge();
					String phone = view.getPhone();
					String address = view.getAddress();
					String blood = view.getBloodGroup();
					
					patients pt = new patients(name, gender, age, phone, address, blood);
					
					int i = dao.insert(pt);
					System.out.println(i != 0 ? "success.." : "something went wrong");	
				}
				break;
				
				case 2: {
					String name = view.getPatientName();
					String gender = view.getGender();
					int age = view.getAge();
					String phone = view.getPhone();
					String address = view.getAddress();
					String blood = view.getBloodGroup();
					int id = view.getPatientId();
					patients pt = new patients(id, name, gender, age, phone, address, blood);
					
					int i = dao.update(pt);
					System.out.println(i != 0 ? "success.." : "something went wrong");	
				}
				break;
				
				case 3: {
					int id = view.getPatientId();
					
					int i = dao.delete(id);
					System.out.println(i != 0 ? "success.." : "something went wrong");	
				}
				break;
				
				case 4: {
					
					List<patients> lt = dao.read();
					for(patients p : lt) {
						System.out.println(p);
					}
				}
				break;
				
				case 5: return;
				
				default:
					System.out.println("invalid choice");
					
				}
				
			}
		}
}


