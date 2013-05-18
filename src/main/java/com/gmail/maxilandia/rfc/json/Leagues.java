package com.gmail.maxilandia.rfc.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Leagues {

	private List<League> league;

	public List<League> getLeague() {
		return league;
	}
	public void setLeague(List<League> league) {
		this.league = league;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class League implements com.gmail.maxilandia.rfc.League{

		private Integer id, year, group_code, playoff, current_round, total_group,
				total_rounds, order;

		private String name, country, flag, phase;

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
		public Integer getGroup_code() {
			return group_code;
		}
		public void setGroup_code(Integer groupCode) {
			group_code = groupCode;
		}
		public Integer getPlayoff() {
			return playoff;
		}
		public void setPlayoff(Integer playoff) {
			this.playoff = playoff;
		}
		public Integer getCurrent_round() {
			return current_round;
		}
		public void setCurrent_round(Integer currentRound) {
			current_round = currentRound;
		}
		public Integer getTotal_group() {
			return total_group;
		}
		public void setTotal_group(Integer totalGroup) {
			total_group = totalGroup;
		}
		public Integer getTotal_rounds() {
			return total_rounds;
		}
		public void setTotal_rounds(Integer totalRounds) {
			total_rounds = totalRounds;
		}
		public Integer getOrder() {
			return order;
		}
		public void setOrder(Integer order) {
			this.order = order;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getFlag() {
			return flag;
		}
		public void setFlag(String flag) {
			this.flag = flag;
		}
		public String getPhase() {
			return phase;
		}
		public void setPhase(String phase) {
			this.phase = phase;
		}
		public Integer getTotalGroupCount() {
			return getTotal_group();
		}
		public Integer getTotalRoundCount() {
			return getTotal_rounds();
		}

	}
	
}
