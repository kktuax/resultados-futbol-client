package com.gmail.maxilandia.rfc;

import com.google.common.base.Predicate;

public class Players {
	
	private Players(){}
	
	public static Predicate<Player> playerPredicate(final Player player){
		return new Predicate<Player>() {
			@Override
			public boolean apply(Player input) {
				return player.getId().equals(input.getId());
			}
		};
	}
	
}
