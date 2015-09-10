package com.breakthroughfuel.fs.domain.txn

import com.breakthroughfuel.fs.domain.txn.GeographicLocation
import com.breakthroughfuel.fs.domain.txn.State

class GeographicLocationAlias {

	static belongsTo = [geographicLocation:GeographicLocation, state:State]
	GeographicLocation geographicLocation
	State state
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey
	String city
	String zip
	Long divisionPkey
	
    static mapping = {
		table name:'geographic_location_aliases', schema:"btf"
		version false
		id column:'pkey'
		columns {
			geographicLocation column:'location_pkey', lazy:false
			state column:'state_pkey', lazy:false
		}
	}
}
