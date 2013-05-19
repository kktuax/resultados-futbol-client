package com.gmail.maxilandia.rfc.service;

import com.gmail.maxilandia.rfc.LineUp;

class LineUpImpl implements LineUp{
	
	public LineUpImpl(CompleteDetailsJson.LineUps.Player player) {
		super();
		this.role = player.role;
	}
	
	private final Integer role;
	
	@Override
	public Integer getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "LineUpImpl [role=" + role + "]";
	}

}