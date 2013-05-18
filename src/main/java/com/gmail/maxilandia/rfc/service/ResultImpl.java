package com.gmail.maxilandia.rfc.service;

import org.apache.commons.lang3.StringUtils;

import com.gmail.maxilandia.rfc.Result;

class ResultImpl implements Result{

	private final Integer localGoals, visitorGoals;
	
	/**
	 * @param result texto con el resultado, por ejemplo: 3-2
	 * @throws Exception si el formato no es correcto
	 */
	public ResultImpl(String result) throws Exception{
		 String[] els = StringUtils.split(result, '-');
		 if(els.length == 2){
			 this.localGoals = Integer.valueOf(els[0]);
			 this.visitorGoals = Integer.valueOf(els[1]);
		 }else{
			 throw new IllegalArgumentException("No se pudo obtener el resultado a partir del texto: " + result);
		 }
	}
	
	@Override
	public Integer getLocalGoals() {
		return localGoals;
	}

	@Override
	public Integer getVisitorGoals() {
		return visitorGoals;
	}
	
}