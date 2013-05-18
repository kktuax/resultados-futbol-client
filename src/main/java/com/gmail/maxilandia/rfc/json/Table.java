package com.gmail.maxilandia.rfc.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Table {

	private List<TableEl> table;

	public List<TableEl> getTable() {
		return table;
	}
	public void setTable(List<TableEl> table) {
		this.table = table;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class TableEl {

		private String team;
		private Integer id, group, points, wins, draws, losses, gf, ga, avg, mark, round;

		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getGroup() {
			return group;
		}
		public void setGroup(Integer group) {
			this.group = group;
		}
		public Integer getPoints() {
			return points;
		}
		public void setPoints(Integer points) {
			this.points = points;
		}
		public Integer getWins() {
			return wins;
		}
		public void setWins(Integer wins) {
			this.wins = wins;
		}
		public Integer getDraws() {
			return draws;
		}
		public void setDraws(Integer draws) {
			this.draws = draws;
		}
		public Integer getLosses() {
			return losses;
		}
		public void setLosses(Integer losses) {
			this.losses = losses;
		}
		public Integer getGf() {
			return gf;
		}
		public void setGf(Integer gf) {
			this.gf = gf;
		}
		public Integer getGa() {
			return ga;
		}
		public void setGa(Integer ga) {
			this.ga = ga;
		}
		public Integer getAvg() {
			return avg;
		}
		public void setAvg(Integer avg) {
			this.avg = avg;
		}
		public Integer getMark() {
			return mark;
		}
		public void setMark(Integer mark) {
			this.mark = mark;
		}
		public Integer getRound() {
			return round;
		}
		public void setRound(Integer round) {
			this.round = round;
		}

	}
	
}
