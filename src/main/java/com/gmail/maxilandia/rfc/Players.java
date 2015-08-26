package com.gmail.maxilandia.rfc;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class Players {
	
	private Players(){}
	
	public static final Function<Player, String> TO_NICK_FUNCTION = new Function<Player, String>() {
		@Override
		public String apply(Player input) {
			return input.getNick();
		}
	};
	
	public static Predicate<Player> playerPredicate(final Player player){
		return new Predicate<Player>() {
			@Override
			public boolean apply(Player input) {
				return player.getId().equals(input.getId());
			}
		};
	}
	
}
