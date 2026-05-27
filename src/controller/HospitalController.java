package controller;

import hospital.views.AppointmentView;
import hospital.views.BillView;
import hospital.views.DepartmentView;
import hospital.views.DoctorView;
import hospital.views.HospitalView;
import hospital.views.PatientView;
import modelsDAO.appointmentDAO;
import modelsDAO.billsDAO;
import modelsDAO.departmentDAO;
import modelsDAO.doctorDAO;
import modelsDAO.patientDAO;

public class HospitalController {

	private HospitalView view;

	private PatientController patientController;
	private DoctorController doctorController;
	private appointmentController appointmentController;
	private billController billController;
	private DepartmentController departmentController;
	
	
	public HospitalController() {
		view = new HospitalView();
		patientController = new PatientController(new PatientView(), new patientDAO());
		doctorController = new DoctorController(new DoctorView(), new doctorDAO());
		appointmentController = new appointmentController(new AppointmentView(), new appointmentDAO());
		billController = new billController(new BillView(), new billsDAO());
		departmentController = new DepartmentController(new DepartmentView(), new departmentDAO());
	}

	public void start() {

		while (true) {

			int choice = view.mainMenu();

			switch (choice) {

			case 1:
				patientController.run();
				break;

			case 2:
				doctorController.run();
				break;

			case 3:
				appointmentController.run();
				break;

			case 4:
				 billController.run();
				break;
				
			case 5:
				 departmentController.run();
				break;
				
			case 6:
                System.out.println("Exited...");
                return;
				

			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
}