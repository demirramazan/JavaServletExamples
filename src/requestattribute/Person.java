package requestattribute;

public class Person {
	long personId;
	String name;
	String surName;
	long phoneNumber;

	public Person(long personId, String name, String surName, long phoneNumber) {
		super();
		this.personId = personId;
		this.name = name;
		this.surName = surName;
		this.phoneNumber = phoneNumber;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
