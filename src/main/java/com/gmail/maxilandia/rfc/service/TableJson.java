package com.gmail.maxilandia.rfc.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gmail.maxilandia.rfc.ClassificationDetails;
import com.gmail.maxilandia.rfc.Team;

@JsonIgnoreProperties(ignoreUnknown = true)
class TableJson {

	private List<TableEl> table;

	List<TableEl> getTable() {
		return table;
	}
	void setTable(List<TableEl> table) {
		this.table = table;
	}
	
	@SuppressWarnings("unused")
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class TableEl implements ClassificationDetails {

		private String team;
		
		private Integer id, group, points, wins, draws, losses, gf, ga, avg, mark, round;
		
		void setTeam(String team) {
			this.team = team;
		}
		void setId(Integer id) {
			this.id = id;
		}
		void setGroup(Integer group) {
			this.group = group;
		}
		void setPoints(Integer points) {
			this.points = points;
		}
		void setWins(Integer wins) {
			this.wins = wins;
		}
		void setDraws(Integer draws) {
			this.draws = draws;
		}
		void setLosses(Integer losses) {
			this.losses = losses;
		}
		void setGf(Integer gf) {
			this.gf = gf;
		}
		void setGa(Integer ga) {
			this.ga = ga;
		}
		void setAvg(Integer avg) {
			this.avg = avg;
		}
		void setMark(Integer mark) {
			this.mark = mark;
		}
		void setRound(Integer round) {
			this.round = round;
		}
		public Team getTeam() {
			return new TeamImpl(id, team);
		}
		public Integer getGroup() {
			return group;
		}
		public Integer getPoints() {
			return points;
		}
		public Integer getWins() {
			return wins;
		}
		public Integer getDraws() {
			return draws;
		}
		public Integer getLosses() {
			return losses;
		}
		public Integer getGf() {
			return gf;
		}
		public Integer getGa() {
			return ga;
		}

	}
	
}
