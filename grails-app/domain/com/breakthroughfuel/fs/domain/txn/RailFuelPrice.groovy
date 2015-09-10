package com.breakthroughfuel.fs.domain.txn

import java.math.BigDecimal
import java.util.Date
import com.breakthroughfuel.fs.domain.txn.RailFuelLocation

class RailFuelPrice {
	
	RailFuelLocation railFuelLocation
	
	Date lastChanged
	Date dateAdded
	Date fuelPriceDate
	String source
	String fuelType
	String priceType
	BigDecimal ultraLowSulfer
	BigDecimal lowSulfer
	BigDecimal highSulfer
	BigDecimal no2
	BigDecimal no1
	BigDecimal pre
	BigDecimal no2Ls
	BigDecimal no2Rd
	BigDecimal no2Hs
	BigDecimal ulsdLow
	BigDecimal ulsdHigh
	BigDecimal ulsdAvg
	BigDecimal usablePrice
	BigDecimal rank
	boolean useThisPrice

    static mapping = {
		table name:'rail_fuel_prices', schema:"btf"
		version false
		id column:'pkey'
		columns {
			railFuelLocation column: 'rail_fuel_location_pkey', lazy:false
			no2 column: 'no_2'
			no1 column: 'no_1'
			no2Ls column: 'no_2_ls'
			no2Rd column: 'no_2_rd'
			no2Hs column: 'no_2_hs'
		}
	}
}
