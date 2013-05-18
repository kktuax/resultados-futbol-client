package com.gmail.maxilandia.rfc.service;

import com.gmail.maxilandia.rfc.Team;

class TeamImpl implements Team{
	
	public TeamImpl(Integer id, String name, String shield) {
		super();
		this.id = id;
		this.name = name;
		this.shield = shield;
	}
	
	private final Integer id;
	private final String name, shield;
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getShield() {
		return shield;
	}
	
	@Override
	public String toString() {
		return "TeamImpl [id=" + id + ", name=" + name + "]";
	}
	
}