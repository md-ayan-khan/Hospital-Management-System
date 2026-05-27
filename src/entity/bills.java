package entity;

import java.util.Date;

public class bills {
	private int bill_id;
    private int patient_id;
  
    private int appointment_id;
    private double total_amount;
    private String payment_status;
    private Date bill_date;
    
	public bills(int patient_id, int appointment_id, double total_amount, String payment_status, Date bill_date) {
		super();
		this.patient_id = patient_id;
		this.appointment_id = appointment_id;
		this.total_amount = total_amount;
		this.payment_status = payment_status;
		this.bill_date = bill_date;
	}

	public bills(int bill_id, int patient_id, int appointment_id, double total_amount, String payment_status,
			Date bill_date) {
		super();
		this.bill_id = bill_id;
		this.patient_id = patient_id;
		this.appointment_id = appointment_id;
		this.total_amount = total_amount;
		this.payment_status = payment_status;
		this.bill_date = bill_date;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

	@Override
	public String toString() {
		return "bills [bill_id=" + bill_id + ", patient_id=" + patient_id + ", appointment_id=" + appointment_id
				+ ", total_amount=" + total_amount + ", payment_status=" + payment_status + ", bill_date=" + bill_date
				+ "]";
	}


	
    
}