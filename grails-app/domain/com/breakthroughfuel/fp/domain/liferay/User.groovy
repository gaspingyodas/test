package com.breakthroughfuel.fp.domain.liferay

import java.util.Date;

class User {

	String uuid_;
	int companyid;
	Date createdate;
	Date modifieddate;
	boolean defaultuser;
	int contactid;
	String password_;
	boolean passwordencrypted;
	boolean passwordreset;
	Date passwordmodifieddate;
	String reminderqueryquestion;
	String reminderqueryanswer
	int gracelogincount;
	String screenname;
	String emailaddress;
	String openid;
	int portraitid;
	String languageid;
	String timezoneid;
	String greeting;
	String comments;
	Date logindate;
	String loginip;
	Date lastlogindate;
	String lastloginip;
	Date lastfailedlogindate;
	int failedloginattempts;
	boolean lockout;
	Date lockoutdate;
	boolean agreedtotermsofuse;
	boolean active_;
	
	static mapping = {
		table name:'user_', schema:"public"
		//cache = false
		version false
		columns {
			id column:'userid'
		}
	}
	
    static constraints = {
    }
}
