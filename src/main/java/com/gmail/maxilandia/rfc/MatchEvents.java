package com.gmail.maxilandia.rfc;

import com.google.common.collect.Ordering;

public class MatchEvents {

	private MatchEvents(){}
	
	public static final Ordering<MatchEvent> MINUTE_ORDERING = new Ordering<MatchEvent>() {
		@Override
		public int compare(MatchEvent left, MatchEvent right) {
			return left.getMinute().compareTo(right.getMinute());
		}
	};
	
}
