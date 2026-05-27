package entity;

public class doctors {
	private int doctor_id;
	private String doctor_name;
	private String  specialization;
	private String phone;
	private String email;
	private int department_id;
	
	
	
	public doctors() {
		super();
	}
	public doctors(String doctor_name, String specialization, String phone, String email, int department_id) {
		super();
		this.doctor_name = doctor_name;
		this.specialization = specialization;
		this.phone = phone;
		this.email = email;
		this.department_id = department_id;
	}
	public doctors(int doctor_id, String doctor_name, String specialization, String phone, String email,
			int department_id) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.specialization = specialization;
		this.phone = phone;
		this.email = email;
		this.department_id = department_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id =doctor_id ;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "doctors [doctor_id=" + doctor_id + ", doctor_name=" + doctor_name + ", specialization=" + specialization
				+ ", phone=" + phone + ", email=" + email + ", department_id=" + department_id + "]";
	}
	
	
	
	
	
}
