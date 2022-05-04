package org.primerproyecto.hibernate.jpa;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	
	private String userName;
	
	private String userMessage;
	
	private List<Phone> phones = new ArrayList<Phone>();
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	/**
	 * Helper para añadir teléfonos
	 * @param phone
	 */
	public void addPhone(Phone phone) {
		this.phones.add(phone);
		phone.setUser(this);
	}
	
	public void removePhone(Phone phone) {
		this.phones.remove(phone);
		phone.setUser(null);
	}
	
}
