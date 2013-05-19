package com.gmail.maxilandia.rfc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gmail.maxilandia.rfc.MatchDetails;
import com.gmail.maxilandia.rfc.MatchEvent;
import com.gmail.maxilandia.rfc.Result;
import com.gmail.maxilandia.rfc.Team;

@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
class Details {

	Integer id, team1, team2, local_goals, visitor_goals, status;

	String local, visitor, stadium, league, team1_twitter,
			team2_twitter, local_abbr, visitor_abbr, result, local_shield,
			visitor_shield, referee;

	Date schedule;

	Boolean playoffs;

	Events events;

	LineUps lineups;
	
	void setId(Integer id) {
		this.id = id;
	}
	void setTeam1(Integer team1) {
		this.team1 = team1;
	}
	void setTeam2(Integer team2) {
		this.team2 = team2;
	}
	void setLocal_goals(Integer local_goals) {
		this.local_goals = local_goals;
	}
	void setVisitor_goals(Integer visitor_goals) {
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
	void setEvents(Events events) {
		this.events = events;
	}
	void setLineups(LineUps lineups) {
		this.lineups = lineups;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Events{
		
		List<Event> cards, goals, changes;

		void setCards(List<Event> cards) {
			this.cards = cards;
		}
		void setGoals(List<Event> goals) {
			this.goals = goals;
		}
		void setChanges(List<Event> changes) {
			this.changes = changes;
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public static class Event implements MatchEvent{
			
			private Integer minute, action_type, player_id;
			
			private String action, player, action_icon, team;

			void setMinute(Integer minute) {
				this.minute = minute;
			}
			void setAction_type(Integer action_type) {
				this.action_type = action_type;
			}
			void setPlayer_id(Integer player_id) {
				this.player_id = player_id;
			}
			void setAction(String action) {
				this.action = action;
			}
			void setPlayer(String player) {
				this.player = player;
			}
			void setAction_icon(String action_icon) {
				this.action_icon = action_icon;
			}
			void setTeam(String team) {
				this.team = team;
			}
			public com.gmail.maxilandia.rfc.Player getPlayer() {
				return new PlayerImpl(player_id, player);
			}
			public MatchEvent.Team getTeam() {
				try{
					return MatchEvent.Team.valueOf(team);					
				}catch (IllegalArgumentException e) {
					return null;
				}
			}
			public Integer getMinute() {
				return minute;
			}
			public String getEvent() {
				return action;
			}
			public String getEventIcon() {
				return action_icon;
			}
			
		}
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class LineUps{
		
		private String local_tactic, visitor_tactic;
		
		private List<Player> local, visitor;
		
		void setLocal_tactic(String local_tactic) {
			this.local_tactic = local_tactic;
		}
		void setVisitor_tactic(String visitor_tactic) {
			this.visitor_tactic = visitor_tactic;
		}
		void setLocal(List<Player> local) {
			this.local = local;
		}
		void setVisitor(List<Player> visitor) {
			this.visitor = visitor;
		}
		List<Player> getLocal() {
			return local;
		}
		List<Player> getVisitor() {
			return visitor;
		}

		public static class Player implements com.gmail.maxilandia.rfc.Player, com.gmail.maxilandia.rfc.MatchDetails.LineUp{
			
			private Integer num, pos, idplayer, role, goals, reds, yellows;
			
			private String nick, name, last_name, image;

			void setNum(Integer num) {
				this.num = num;
			}
			void setPos(Integer pos) {
				this.pos = pos;
			}
			void setIdplayer(Integer idplayer) {
				this.idplayer = idplayer;
			}
			void setRole(Integer role) {
				this.role = role;
			}
			void setGoals(Integer goals) {
				this.goals = goals;
			}
			void setReds(Integer reds) {
				this.reds = reds;
			}
			void setYellows(Integer yellows) {
				this.yellows = yellows;
			}
			void setNick(String nick) {
				this.nick = nick;
			}
			void setName(String name) {
				this.name = name;
			}
			void setLast_name(String last_name) {
				this.last_name = last_name;
			}
			void setImage(String image) {
				this.image = image;
			}
			public Integer getId() {
				return idplayer;
			}
			public String getNick() {
				return nick;
			}
			public Integer getRole() {
				return role;
			}			
			
		}
		
	}

	
}
