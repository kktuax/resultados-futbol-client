package com.gmail.maxilandia.rfc;

import java.util.Date;

public interface Match {

	public Integer getId();
	
	public Date getSchedule();
	
	public Team getLocalTeam();
	
	public Team getVisitorTeam();
	
	public Result getResult();
	
}