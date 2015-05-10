package com.gmail.maxilandia.rfc;

import com.google.common.base.Predicate;
import com.google.common.collect.Ordering;

public class Leagues {

	private Leagues(){}
	
	public static Predicate<League> predicateForName(final String name){
		return new Predicate<League>() {
			@Override
			public boolean apply(League arg0) {
				return name.equals(arg0.getName());
			}
		};
	}
	
	public static final Ordering<League> YEAR_ORDERING = new Ordering<League>() {
		@Override
		public int compare(League arg0, League arg1) {
			return arg0.getYear().compareTo(arg1.getYear());
		}
	};
}
