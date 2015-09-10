package com.breakthroughfuel.fs.domain.txn

import java.util.Date

class PriceCalculationType {

	Date lastChanged
	String name
	
	static mapping = {
		table name:'price_calculation_types', schema:"btf"
		version false
		id column:'pkey'
	}
}