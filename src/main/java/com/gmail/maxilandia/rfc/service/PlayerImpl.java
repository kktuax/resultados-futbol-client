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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		PlayerImpl other = (PlayerImpl) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		return true;
	}
	
}