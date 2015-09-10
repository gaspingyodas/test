package com.breakthroughfuel.fs.domain.txn

import java.util.Date

import com.breakthroughfuel.fs.domain.txn.State

class GeographicLocation {

	static belongsTo = [state:State]
	State state
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey
	String city
	String zip
	boolean handEntered
	
	static mapping = {
		table name:'geographic_locations', schema:"btf"
		version false
		id column:'pkey'
		columns {
			state column: 'state_pkey', lazy:false
		}
	}
}