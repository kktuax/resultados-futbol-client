package com.gmail.maxilandia.rfc.service;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class Details {

	private Integer id, team1, team2, local_goals, visitor_goals, status;

	private String local, visitor, stadium, league, team1_twitter,
			team2_twitter, local_abbr, visitor_abbr, result, local_shield,
			visitor_shield, referee;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-DD HH:mm:ss")
	private Date schedule;

	private Boolean playoffs;

	private Events events;

	private LineUps lineups;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getTeam1_twitter() {
		return team1_twitter;
	}

	public void setTeam1_twitter(String team1Twitter) {
		team1_twitter = team1Twitter;
	}

	public String getTeam2_twitter() {
		return team2_twitter;
	}

	public void setTeam2_twitter(String team2Twitter) {
		team2_twitter = team2Twitter;
	}

	public String getLocal_abbr() {
		return local_abbr;
	}

	public void setLocal_abbr(String localAbbr) {
		local_abbr = localAbbr;
	}

	public String getVisitor_abbr() {
		return visitor_abbr;
	}

	public void setVisitor_abbr(String visitorAbbr) {
		visitor_abbr = visitorAbbr;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public Date getSchedule() {
		return schedule;
	}

	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}

	public Boolean getPlayoffs() {
		return playoffs;
	}

	public void setPlayoffs(Boolean playoffs) {
		this.playoffs = playoffs;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public LineUps getLineups() {
		return lineups;
	}

	public void setLineups(LineUps lineups) {
		this.lineups = lineups;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Events{
		
		private List<Event> cards;
		
		private List<Event> goals;

		public List<Event> getCards() {
			return cards;
		}
		public void setCards(List<Event> cards) {
			this.cards = cards;
		}
		public List<Event> getGoals() {
			return goals;
		}
		public void setGoals(List<Event> goals) {
			this.goals = goals;
		}
		
		@JsonIgnoreProperties(ignoreUnknown = true)
		public static class Event{
			
			private Integer minute, action_type, player_id;
			
			private String action, player, action_icon, team;
			public Integer getMinute() {
				return minute;
			}
			public void setMinute(Integer minute) {
				this.minute = minute;
			}
			public Integer getAction_type() {
				return action_type;
			}
			public void setAction_type(Integer actionType) {
				action_type = actionType;
			}
			public Integer getPlayer_id() {
				return player_id;
			}
			public void setPlayer_id(Integer playerId) {
				player_id = playerId;
			}
			public String getAction() {
				return action;
			}
			public void setAction(String action) {
				this.action = action;
			}
			public String getPlayer() {
				return player;
			}
			public void setPlayer(String player) {
				this.player = player;
			}
			public String getAction_icon() {
				return action_icon;
			}
			public void setAction_icon(String actionIcon) {
				action_icon = actionIcon;
			}
			public String getTeam() {
				return team;
			}
			public void setTeam(String team) {
				this.team = team;
			}
			
		}
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class LineUps{
		
		private String local_tactic, visitor_tactic;
		
		private List<Player> local, visitor;
		
		public String getLocal_tactic() {
			return local_tactic;
		}
		public void setLocal_tactic(String localTactic) {
			local_tactic = localTactic;
		}
		public String getVisitor_tactic() {
			return visitor_tactic;
		}
		public void setVisitor_tactic(String visitorTactic) {
			visitor_tactic = visitorTactic;
		}
		public List<Player> getLocal() {
			return local;
		}
		public void setLocal(List<Player> local) {
			this.local = local;
		}
		public List<Player> getVisitor() {
			return visitor;
		}
		public void setVisitor(List<Player> visitor) {
			this.visitor = visitor;
		}
		public static class Player{
			
			private Integer num, pos, idplayer, role, goals, reds, yellows;
			
			private String nick, name, last_name, image;

			public Integer getNum() {
				return num;
			}

			public void setNum(Integer num) {
				this.num = num;
			}

			public Integer getPos() {
				return pos;
			}

			public void setPos(Integer pos) {
				this.pos = pos;
			}

			public Integer getIdplayer() {
				return idplayer;
			}

			public void setIdplayer(Integer idplayer) {
				this.idplayer = idplayer;
			}

			public Integer getRole() {
				return role;
			}

			public void setRole(Integer role) {
				this.role = role;
			}

			public Integer getGoals() {
				return goals;
			}

			public void setGoals(Integer goals) {
				this.goals = goals;
			}

			public Integer getReds() {
				return reds;
			}

			public void setReds(Integer reds) {
				this.reds = reds;
			}

			public Integer getYellows() {
				return yellows;
			}

			public void setYellows(Integer yellows) {
				this.yellows = yellows;
			}

			public String getNick() {
				return nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLast_name() {
				return last_name;
			}

			public void setLast_name(String lastName) {
				last_name = lastName;
			}

			public String getImage() {
				return image;
			}

			public void setImage(String image) {
				this.image = image;
			}
			
		}
		
	}
	
	
	
}
