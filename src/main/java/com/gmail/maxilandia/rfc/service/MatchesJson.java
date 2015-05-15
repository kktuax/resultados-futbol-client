package com.gmail.maxilandia.rfc.service;

import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gmail.maxilandia.rfc.Result;
import com.gmail.maxilandia.rfc.Team;

@JsonIgnoreProperties(ignoreUnknown = true)
class MatchesJson {

	private List<Match> match;

	List<Match> getMatch() {
		return match;
	}
	void setMatch(List<Match> matches) {
		this.match = matches;
	}

	@SuppressWarnings("unused")
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Match implements com.gmail.maxilandia.rfc.Match{
		
		private Integer id, year, group, round, team1, team2, group_code,
				status, hour, minute;
		private String local, visitor, competition_name, local_shield,
				visitor_shield, result, date, local_goals, visitor_goals;
		private Boolean playoffs;
		private Float coef;
		
	    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
		private Date schedule;
		void setId(Integer id) {
			this.id = id;
		}
		void setYear(Integer year) {
			this.year = year;
		}
		void setGroup(Integer group) {
			this.group = group;
		}
		void setRound(Integer round) {
			this.round = round;
		}
		void setTeam1(Integer team1) {
			this.team1 = team1;
		}
		void setTeam2(Integer team2) {
			this.team2 = team2;
		}
		void setGroup_code(Integer group_code) {
			this.group_code = group_code;
		}
		void setLocal_goals(String local_goals) {
			this.local_goals = local_goals;
		}
		void setVisitor_goals(String visitor_goals) {
			this.visitor_goals = visitor_goals;
		}
		void setStatus(Integer status) {
			this.status = status;
		}
		void setHour(Integer hour) {
			this.hour = hour;
		}
		void setMinute(Integer minute) {
			this.minute = minute;
		}
		void setLocal(String local) {
			this.local = local;
		}
		void setVisitor(String visitor) {
			this.visitor = visitor;
		}
		void setCompetition_name(String competition_name) {
			this.competition_name = competition_name;
		}
		void setLocal_shield(String local_shield) {
			this.local_shield = local_shield;
		}
		void setVisitor_shield(String visitor_shield) {
			this.visitor_shield = visitor_shield;
		}
		void setResult(String result) {
			this.result = result;
		}
		void setDate(String date) {
			this.date = date;
		}
		void setPlayoffs(Boolean playoffs) {
			this.playoffs = playoffs;
		}
		void setCoef(Float coef) {
			this.coef = coef;
		}
		void setSchedule(Date schedule) {
			this.schedule = schedule;
		}
		public Team getLocalTeam() {
			return new TeamImpl(team1, local, local_shield);
		}
		public Team getVisitorTeam() {
			return new TeamImpl(team2, visitor, visitor_shield);
		}
		public Integer getId() {
			return id;
		}
		public Date getSchedule() {
			return schedule;
		}
		public Integer getGroup() {
			return group;
		}
		public Integer getRound() {
			return round;
		}
		public Result getResult() {
			return new ResultImpl(status, result);
		}
		@Override
		public String toString() {
			return "Match [team1=" + getLocalTeam() + ", team2=" + getVisitorTeam() + ", result="
					+ result + "]";
		}
		
	}

}