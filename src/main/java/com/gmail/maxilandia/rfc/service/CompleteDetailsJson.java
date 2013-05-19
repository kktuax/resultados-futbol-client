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
class CompleteDetailsJson extends DetailsJson{

	Events events;

	LineUps lineups;
	
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
		public static class Event{
			
			Integer minute, action_type, player_id;
			
			String action, player, action_icon, team;

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
			
			
		}
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class LineUps{
		
		String local_tactic, visitor_tactic;
		
		List<Player> local, visitor;
		
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

		@JsonIgnoreProperties(ignoreUnknown = true)
		public static class Player{
			
			Integer num, pos, idplayer, role, goals, reds, yellows;
			
			String nick, name, last_name, image;

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
			
		}
		
	}

	
}
