package entity;

public class patients {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String phone;
	private String address;
	private String blood_group;
	
	public patients() {
		super();
	}

	public patients(int id, String name, String gender, int age, String phone, String address, String blood_group) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.blood_group = blood_group;
	}
	
	public patients(String name, String gender, int age, String phone, String address, String blood_group) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.blood_group = blood_group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	@Override
	public String toString() {
		return "patients [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + ", blood_group=" + blood_group + "]";
	}
	
	
	
}
