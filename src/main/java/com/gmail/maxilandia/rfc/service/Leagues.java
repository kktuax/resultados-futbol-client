package com.gmail.maxilandia.rfc.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
class Leagues {

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
		public Integer getYear() {
			return year;
		}
		public String getName() {
			return name;
		}
		public String getCountry() {
			return country;
		}
		public Integer getTotalGroupCount() {
			return total_group;
		}
		public Integer getTotalRoundCount() {
			return total_rounds;
		}
		void setId(Integer id) {
			this.id = id;
		}
		void setYear(Integer year) {
			this.year = year;
		}
		void setGroup_code(Integer group_code) {
			this.group_code = group_code;
		}
		void setPlayoff(Integer playoff) {
			this.playoff = playoff;
		}
		void setCurrent_round(Integer current_round) {
			this.current_round = current_round;
		}
		void setTotal_group(Integer total_group) {
			this.total_group = total_group;
		}
		void setTotal_rounds(Integer total_rounds) {
			this.total_rounds = total_rounds;
		}
		void setOrder(Integer order) {
			this.order = order;
		}
		void setName(String name) {
			this.name = name;
		}
		void setCountry(String country) {
			this.country = country;
		}
		void setFlag(String flag) {
			this.flag = flag;
		}
		void setPhase(String phase) {
			this.phase = phase;
		}

	}
	
}
