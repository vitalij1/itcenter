package company;

import java.io.Serializable;

public class Employee implements IEmployee, Serializable{


	private static final long serialVersionUID = 1928124219139174495L;

	Employee() {
	}

	Employee(String lastName, String phoneNumber, int age, String adress) {
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.adress = adress;
	}

	private String lastName;
	private String phoneNumber;
	private int age;
	private String adress;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Last Name = " + lastName + ", Phone Number = "
				+ phoneNumber + ", Age = " + age + ", Adress = " + adress;
	}
	
	
}