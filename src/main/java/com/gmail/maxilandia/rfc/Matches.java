package com.gmail.maxilandia.rfc;

import com.google.common.base.Predicate;
import com.google.common.collect.Ordering;

public class Matches {

	private Matches(){}
	
	public static Predicate<Match> predicateForTeamName(final String teamName){
		return new Predicate<Match>() {
			@Override
			public boolean apply(Match arg0) {
				if((arg0.getLocalTeam() != null) && (arg0.getVisitorTeam() != null)){
					return teamName.equals(arg0.getLocalTeam().getName())
						|| teamName.equals(arg0.getVisitorTeam().getName());	
				}else{
					return false;
				}
			}
		};
	}
	
	public static final Predicate<Match> FINISHED_PREDICATE = new Predicate<Match>() {
		@Override
		public boolean apply(Match arg0) {
			if(arg0.getResult() != null){
				return ResultStatus.FINISHED.equals(arg0.getResult().getResultStatus());
			}else{
				return false;
			}
		}
	};
	
	public static final Ordering<Match> SCHEDULE_ORDERING = new Ordering<Match>() {
		@Override
		public int compare(Match arg0, Match arg1) {
			return arg0.getSchedule().compareTo(arg1.getSchedule());
		}
	};
	
}
