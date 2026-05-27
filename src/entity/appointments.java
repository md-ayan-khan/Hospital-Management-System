package entity;

import java.util.Date;

public class appointments {
	private int appointment_id;
	private int patient_id;
	private int doctor_id;
	private Date appointment_date;
	private String appointment_time;
	
	private String status;
	private String reason;
	
	public appointments() {
		super();
	}

	public appointments(int appointment_id, int patient_id, int doctor_id, Date appointment_date,
			String appointment_time, String status, String reason) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.appointment_date = appointment_date;
		this.appointment_time = appointment_time;
		this.status = status;
		this.reason = reason;
	}

	
	
	public appointments(int patient_id, int doctor_id, Date appointment_date, String appointment_time, String status,
			String reason) {
		super();
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.appointment_date = appointment_date;
		this.appointment_time = appointment_time;
		this.status = status;
		this.reason = reason;
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public Date getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}

	public String getAppointment_time() {
		return appointment_time;
	}

	public void setAppointment_time(String appointment_time) {
		this.appointment_time = appointment_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "appointments [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", doctor_id="
				+ doctor_id + ", appointment_date=" + appointment_date + ", appointment_time=" + appointment_time
				+ ", status=" + status + ", reason=" + reason + "]";
	}
	
	
	
	
	

}
