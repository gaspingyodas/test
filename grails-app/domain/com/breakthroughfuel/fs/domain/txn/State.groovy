package com.breakthroughfuel.fs.domain.txn

import java.util.Date

import com.breakthroughfuel.fs.domain.txn.Country
import com.breakthroughfuel.fs.domain.txn.DoeRegion

class State {

	static belongsTo = [country:Country, doeRegion:DoeRegion]
	Country country
	DoeRegion doeRegion
	
	Date lastChanged
	String stateCode
	String name
	Long f3RegionPkey
	String randMcnallyStateCode
	
	static mapping = {
		table name:'states', schema:"btf"
		version false
		id column:'pkey'
		columns {
			f3RegionPkey column: 'f3_region_pkey'
			country column: 'country_pkey', lazy:false
			doeRegion column:'doe_region_pkey', lazy:false
		}
	}
}