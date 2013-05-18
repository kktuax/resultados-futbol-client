package com.gmail.maxilandia.rfc.service;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class Matches {

	private List<Match> match;

	public List<Match> getMatch() {
		return match;
	}
	public void setMatch(List<Match> matches) {
		this.match = matches;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Match {
		private Integer id, year, group, round, team1, team2, group_code,
				local_goals, visitor_goals, status, hour, minute;
		private String local, visitor, competition_name, local_shield,
				visitor_shield, result, date;
		private Boolean playoffs;
		private Float coef;
		
	    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-DD HH:mm:ss")
		private Date schedule;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getYear() {
			return year;
		}
		public void setYear(Integer year) {
			this.year = year;
		}
		public Integer getGroup() {
			return group;
		}
		public void setGroup(Integer group) {
			this.group = group;
		}
		public Integer getRound() {
			return round;
		}
		public void setRound(Integer round) {
			this.round = round;
		}
		public Integer getTeam1() {
			return team1;
		}
		public void setTeam1(Integer team1) {
			this.team1 = team1;
		}
		public Integer getTeam2() {
			return team2;
		}
		public void setTeam2(Integer team2) {
			this.team2 = team2;
		}
		public Integer getGroup_code() {
			return group_code;
		}
		public void setGroup_code(Integer groupCode) {
			group_code = groupCode;
		}
		public Integer getLocal_goals() {
			return local_goals;
		}
		public void setLocal_goals(Integer localGoals) {
			local_goals = localGoals;
		}
		public Integer getVisitor_goals() {
			return visitor_goals;
		}
		public void setVisitor_goals(Integer visitorGoals) {
			visitor_goals = visitorGoals;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getHour() {
			return hour;
		}
		public void setHour(Integer hour) {
			this.hour = hour;
		}
		public Integer getMinute() {
			return minute;
		}
		public void setMinute(Integer minute) {
			this.minute = minute;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public String getVisitor() {
			return visitor;
		}
		public void setVisitor(String visitor) {
			this.visitor = visitor;
		}
		public String getCompetition_name() {
			return competition_name;
		}
		public void setCompetition_name(String competitionName) {
			competition_name = competitionName;
		}
		public String getLocal_shield() {
			return local_shield;
		}
		public void setLocal_shield(String localShield) {
			local_shield = localShield;
		}
		public String getVisitor_shield() {
			return visitor_shield;
		}
		public void setVisitor_shield(String visitorShield) {
			visitor_shield = visitorShield;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Boolean getPlayoffs() {
			return playoffs;
		}
		public void setPlayoffs(Boolean playoffs) {
			this.playoffs = playoffs;
		}
		public Float getCoef() {
			return coef;
		}
		public void setCoef(Float coef) {
			this.coef = coef;
		}
		public Date getSchedule() {
			return schedule;
		}
		public void setSchedule(Date schedule) {
			this.schedule = schedule;
		}

	}

}