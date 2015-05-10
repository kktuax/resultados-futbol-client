package com.gmail.maxilandia.rfc;

public enum ResultStatus {
	
	FINISHED(1);

	private ResultStatus(Integer code) {
		this.code = code;
	}

	private final Integer code;
	
	public static ResultStatus getResultStatus(Integer statusCode){
		for(ResultStatus rs :  ResultStatus.values()){
			if(statusCode.equals(rs.code)){
				return rs;
			}
		}
		throw new IllegalArgumentException("Unkown status code: " + statusCode);
	}
}
