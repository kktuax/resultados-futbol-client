package com.gmail.maxilandia.rfc.service;

import com.gmail.maxilandia.rfc.Player;

class PlayerImpl implements Player{
	
	public PlayerImpl(Integer id, String nick) {
		super();
		this.id = id;
		this.nick = nick;
	}
	
	private final Integer id;
	private final String nick;
	
	public Integer getId() {
		return id;
	}
	public String getNick() {
		return nick;
	}

	@Override
	public String toString() {
		return "PlayerImpl [id=" + id + ", nick=" + nick + "]";
	}
	
}