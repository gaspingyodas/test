package com.breakthroughfuel.fs.domain.txn

import java.util.Date;
import java.math.BigDecimal

class StateFuelPriceAverage {

	Date lastChanged
	Date dateAdded
	BigDecimal cost
	BigDecimal costPlus
	BigDecimal retail
	BigDecimal retailOff
	Long lastChangeUserPkey
	Date fuelPriceDate
	String stateCode
	BigDecimal reeferCost
	BigDecimal reeferCostPlus
	
	static mapping = {
		table name:'state_fuel_price_averages', schema:"btf"
		version false
		id column:'pkey'
	}
}
