package com.gmail.maxilandia.rfc.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gmail.maxilandia.rfc.Result;
import com.gmail.maxilandia.rfc.ResultStatus;

class ResultImpl implements Result{

	private final Integer localGoals, visitorGoals;
	
	private final ResultStatus resultStatus;
	
	/**
	 * @param result texto con el resultado, por ejemplo: 3-2
	 */
	public ResultImpl(Integer statusCode, String result) {
		String[] els = StringUtils.split(result, '-');
		Integer localGoals = null, visitorGoals = null;
		ResultStatus resultStatus = null;
		try{
			resultStatus = ResultStatus.getResultStatus(statusCode);
		}catch (Exception e) {
			LOGGER.info("Estado no reconocido: " + statusCode);
		}
		this.resultStatus = resultStatus;
		try {
			if (els.length == 2) {
				localGoals = Integer.valueOf(els[0]);
				visitorGoals = Integer.valueOf(els[1]);
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			LOGGER.info("No se pudo obtener el resultado a partir del texto: " + result);
		}
		this.localGoals = localGoals;
		this.visitorGoals = visitorGoals;
	}
	
	@Override
	public Integer getLocalGoals() {
		return localGoals;
	}

	@Override
	public Integer getVisitorGoals() {
		return visitorGoals;
	}

	@Override
	public ResultStatus getResultStatus() {
		return resultStatus;
	}

	@Override
	public String toString() {
		return localGoals + "-" + visitorGoals + "(" + resultStatus + ")";
	}
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResultImpl.class);
	
}