package com.breakthroughfuel.fs.domain.txn

import java.math.BigDecimal
import java.util.Date
import com.breakthroughfuel.fs.domain.txn.DoeRegion

class DoeRegionReading {

	static belongsTo = [doeRegion:DoeRegion]
	DoeRegion doeRegion
	
	Date lastChanged
	BigDecimal reading
	Date readingDate
		
	static mapping = {
		table name:'doe_region_readings', schema:"btf"
		//cache = false
		version false
		id column:'pkey'
		doeRegion column:'doe_region_pkey', lazy:false
	}
}
