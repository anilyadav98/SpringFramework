package com.spring.valenetin.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ValentineEntity implements Serializable {
	
	private int id;
	private String name; 
	private String status;
	private	double ammountSpent;
	private	String gift;
	
	public ValentineEntity() 
	{
		System.out.println("create\t"+this.getClass().getSimpleName());
	}

	public ValentineEntity(int id, String name, String status, double ammountSpent, String gift) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.ammountSpent = ammountSpent;
		this.gift = gift;
	}
	
	
}
