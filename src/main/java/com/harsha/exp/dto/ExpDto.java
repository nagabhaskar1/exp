package com.harsha.exp.dto;

public class ExpDto {

	private int no;
	private String name;
	private int fees;
	private int exp;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "ExpDto [no=" + no + ", name=" + name + ", fees=" + fees + ", exp=" + exp + "]";
	}

}
