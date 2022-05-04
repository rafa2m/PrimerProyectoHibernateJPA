package org.primerproyecto.hibernate.jpa;

public class Phone {
	private long id;
	
	private String number;
	private User user;
	
	public Phone() {}
	public Phone(String number) {
		this.number = number;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
}
