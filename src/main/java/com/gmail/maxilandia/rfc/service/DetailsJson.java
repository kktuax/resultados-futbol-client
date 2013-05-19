package com.gmail.maxilandia.rfc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gmail.maxilandia.rfc.LineUp;
import com.gmail.maxilandia.rfc.MatchDetails;
import com.gmail.maxilandia.rfc.MatchEvent;
import com.gmail.maxilandia.rfc.MatchEventType;
import com.gmail.maxilandia.rfc.Result;
import com.gmail.maxilandia.rfc.Team;

@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
class DetailsJson {

	Integer id, team1, team2, status;

	String local, visitor, stadium, league, team1_twitter,
			team2_twitter, local_abbr, visitor_abbr, result, local_shield,
			visitor_shield, referee, local_goals, visitor_goals;

	Date schedule;

	Boolean playoffs;
	
	void setId(Integer id) {
		this.id = id;
	}
	void setTeam1(Integer team1) {
		this.team1 = team1;
	}
	void setTeam2(Integer team2) {
		this.team2 = team2;
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
	void setLocal(String local) {
		this.local = local;
	}
	void setVisitor(String visitor) {
		this.visitor = visitor;
	}
	void setStadium(String stadium) {
		this.stadium = stadium;
	}
	void setLeague(String league) {
		this.league = league;
	}
	void setTeam1_twitter(String team1_twitter) {
		this.team1_twitter = team1_twitter;
	}
	void setTeam2_twitter(String team2_twitter) {
		this.team2_twitter = team2_twitter;
	}
	void setLocal_abbr(String local_abbr) {
		this.local_abbr = local_abbr;
	}
	void setVisitor_abbr(String visitor_abbr) {
		this.visitor_abbr = visitor_abbr;
	}
	void setResult(String result) {
		this.result = result;
	}
	void setLocal_shield(String local_shield) {
		this.local_shield = local_shield;
	}
	void setVisitor_shield(String visitor_shield) {
		this.visitor_shield = visitor_shield;
	}
	void setReferee(String referee) {
		this.referee = referee;
	}
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-DD HH:mm:ss")
	void setSchedule(Date schedule) {
		this.schedule = schedule;
	}
	void setPlayoffs(Boolean playoffs) {
		this.playoffs = playoffs;
	}
		
}
