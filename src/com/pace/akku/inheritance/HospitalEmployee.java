package com.pace.akku.inheritance;

public class HospitalEmployee {

	protected String name;
	protected int number;

	public void work() {
		System.out.println(name + " works for the hospital.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HospitalEmployee(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return name + " " + number;
	}

}
