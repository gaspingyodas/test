package com.breakthroughfuel.fs.domain.txn

import java.util.Date

class Country {

	Date lastChanged
	String countryCode
	String name
	
	static mapping = {
		table name:'countries', schema:"btf"
		version false
		id column:'pkey'
	}
}