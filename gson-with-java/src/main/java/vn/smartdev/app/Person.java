package vn.smartdev.app;

public class Person {
	String name;
	String email;
	float phone;
	
	public Person(String name, String email, float phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getPhone() {
		return phone;
	}

	public void setPhone(float phone) {
		this.phone = phone;
	}

}
