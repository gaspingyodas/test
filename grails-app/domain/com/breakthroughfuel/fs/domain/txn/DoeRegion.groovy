package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import com.breakthroughfuel.fs.domain.txn.DoeRegionReading

class DoeRegion {

	static hasMany = [doeRegionReadings:DoeRegionReading]
	Set doeRegionReadings
	
	Date lastChanged
	String name
	
	static mapping = {
		table name:'doe_regions', schema:"btf"
		version false
		id column:'pkey'
	}
}
