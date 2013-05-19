package com.gmail.maxilandia.rfc.service;

import com.gmail.maxilandia.rfc.Player;

class PlayerImpl implements Player{
	
	public PlayerImpl(CompleteDetailsJson.LineUps.Player player) {
		super();
		this.id = player.idplayer;
		this.nick = player.nick;
	}
	
	public PlayerImpl(CompleteDetailsJson.Events.Event event) {
		super();
		this.id = event.player_id;
		this.nick = event.player;
	}
	
	private final Integer id;
	private final String nick;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public String getNick() {
		return nick;
	}

	@Override
	public String toString() {
		return "PlayerImpl [id=" + id + ", nick=" + nick + "]";
	}
	
}