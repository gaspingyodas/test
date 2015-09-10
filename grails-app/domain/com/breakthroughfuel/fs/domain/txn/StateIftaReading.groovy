package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import java.math.BigDecimal

class StateIftaReading {

	Date lastChanged
	Date dateAdded
	BigDecimal iftaReading
	BigDecimal iftaSurcharge
	Long lastChangeUserPkey
	Date periodBegin
	Date periodEnd
	String stateCode
	int quarter
	int year
	
	static mapping = {
		table name:'state_ifta_readings', schema:"btf"
		version false
		id column:'pkey'
	}
}
