package com.crm.order.apiconstant;

public enum StatusCode {
    CODE_200("200", "OK"),
    CODE_400("400", "Bad Request"),
    CODE_401("401", "Unauthorized"),
	CODE_403("403", "Forbidden"),
	CODE_404("404", "Not Found"),
	CODE_500("500", "Internal Server Error"),
	CODE_501("501", "Not Implemented"),
	CODE_502("502", "Bad Gateway"),
	CODE_503("503", "Service Unavailable");

    public final String code;
    public final String msg;

    StatusCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public String getcode() {
    	return code;
    }
    
    public String getmsg() {
    	return msg;
    }
}
