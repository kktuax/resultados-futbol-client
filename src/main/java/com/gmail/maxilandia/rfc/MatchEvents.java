package com.gmail.maxilandia.rfc;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Ordering;

public class MatchEvents {

	private MatchEvents(){}
	
	public static final Ordering<MatchEvent> MINUTE_ORDERING = new Ordering<MatchEvent>() {
		@Override
		public int compare(MatchEvent left, MatchEvent right) {
			return left.getMinute().compareTo(right.getMinute());
		}
	};

	public static Predicate<MatchEvent> playerPredicate(final Player player){
		return new Predicate<MatchEvent>() {
			@Override
			public boolean apply(MatchEvent input) {
				return player.getId().equals(input.getPlayer().getId());
			}
		};
	}
	
	public static Predicate<MatchEvent> minutePredicate(final Integer minute){
		return new Predicate<MatchEvent>() {
			@Override
			public boolean apply(MatchEvent input) {
				return minute.equals(input.getMinute());
			}
		};
	}
	
	public static final Function<MatchEvent, Player> TO_PLAYER_FUNCTION = new Function<MatchEvent, Player>() {
		@Override
		public Player apply(MatchEvent input) {
			return input.getPlayer();
		}
	};
	
}
