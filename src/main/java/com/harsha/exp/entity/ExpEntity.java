package com.harsha.exp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Exp")
public class ExpEntity {
	@Id
	@GeneratedValue
	private Long no;

	@Column(name = "NAME")
	private String name;
	@Column(name = "FEES")
	private int fees;
	@Column(name = "EXP")
	private int exp;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
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
		return "ExpEntity [no=" + no + ", name=" + name + ", fees=" + fees + ", exp=" + exp + "]";
	}

}
