package controller;

import java.sql.Date;
import java.util.List;

import entity.bills;
import hospital.views.BillView;
import modelsDAO.billsDAO;

public class billController {
	
	private BillView view;
	private billsDAO dao;
	
	public billController(BillView view, billsDAO dao) {
	
		this.view = view;
		this.dao = dao;
	}
	
	public void run() {
		
		while (true) {
			
			int choice = view.showMenu();
			
			switch(choice) {
			
				case 1:{
					int patientID = view.PatientId();
					int appointmentID = view.getappointmentId();
					double TotalAmount = view.gettotalAmount();
					String PaymentStatus = view.getPaymentStatus();
					Date AppointmentData = view.getAppointmentDate();
					
					bills bl = new bills(patientID, appointmentID, TotalAmount, PaymentStatus, AppointmentData);
					int i = dao.insert(bl);
					System.out.println(i != 0 ? "Success.." : "something went wrong");
				}
				break;
				
				case 2:{
					List<bills> bl = dao.read();
					for(bills b :bl ) {
						System.out.println(b);
					}
				}
				break;
				
				case 3:{
					int patientID = view.PatientId();
					int appointmentID = view.getappointmentId();
					double TotalAmount = view.gettotalAmount();
					String PaymentStatus = view.getPaymentStatus();
					Date AppointmentData = view.getAppointmentDate();
					
					int billId = view.getBillId();
					bills bl = new bills(billId, patientID, appointmentID, TotalAmount, PaymentStatus, AppointmentData);
					
					
					int i = dao.update(bl);
					System.out.println(i != 0 ? "Success.." : "something went wrong");
				}
				break;
				case 4:{
					int billsId = view.getBillId();
	
					int i = dao.delete(billsId);
					System.out.println(i != 0 ? "Success.." : "something went wrong");
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
