package controller;

import java.sql.Date;
import java.util.List;

import entity.appointments;
import hospital.views.AppointmentView;
import modelsDAO.appointmentDAO;

public class appointmentController {
 

	    private AppointmentView view;
	    private appointmentDAO dao;

	   
	    public appointmentController(AppointmentView view, appointmentDAO dao) {
			super();
			this.view = view;
			this.dao = dao;
		}

		public void run() {

	      while (true) {

	        int choice = view.showMenu();

	         switch (choice) {

	              case 1:{
	                	int patientID = view.getPatientId();
	                	int doctodID = view.getDoctorId();
	    				Date appoinmentDate = view.getAppointmentDate();
	    				String appointmentTime = view.getAppointmentTime();
	    				String status = view.getStatus();
	    				String reason = view.getReason();
	    				
	    				appointments ap = new appointments(patientID, doctodID, appoinmentDate, appointmentTime, status, reason);
	    			
	    				int i = dao.insert(ap);
	    				System.out.println(i != 0 ? "success.." : "something went wrong");	
	         		}
	    			break;
	                  
	                case 2:{
	                	int patientID = view.getPatientId();
	                	int doctodID = view.getDoctorId();
	    				Date appoinmentDate = view.getAppointmentDate();
	    				String appointmentTime = view.getAppointmentTime();
	    				String status = view.getStatus();
	    				String reason = view.getReason();
						int appointmentid = view.getAppointmentId();
						
						appointments ap = new appointments(appointmentid, patientID, doctodID, appoinmentDate, appointmentTime, status, reason);
						
						int i = dao.update(ap);
						System.out.println(i != 0 ? "success.." : "something went wrong");	
					}
					break;
	                
	                case 3: {
						int appointmentid = view.getAppointmentId();
						
						int i = dao.delete(appointmentid);
						System.out.println(i != 0 ? "success.." : "something went wrong");	
					}
					break;
	              
	                case 4:{
						
						List<appointments> lt = dao.read();
						for(appointments p : lt) {
							System.out.println(p);
						}
					}
	                
	                case 5:{
	      			  dao.patientVisitHistory();
	      		  }
	               

	                case 6:
	                    System.out.println("Exited...");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	         }
	            }
	        }
	    }


