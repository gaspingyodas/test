package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import java.math.BigDecimal

import com.breakthroughfuel.fs.domain.txn.FuelLocation

class FuelPrice {

	static belongsTo = [fuelLocation:FuelLocation]
	FuelLocation fuelLocation
	
	Date lastChanged
	Date date
	String rackId
	BigDecimal rackPrice
	BigDecimal refundableIfta
	BigDecimal freight
	BigDecimal environmentalFee
	BigDecimal spread
	BigDecimal opisCost
	BigDecimal retail
	BigDecimal f3Price
	BigDecimal fedTax
	BigDecimal stateTax
	BigDecimal localTax
	BigDecimal salesTax
	BigDecimal costPlus
	BigDecimal retailOff
	boolean retailModified
	BigDecimal reeferCost
	BigDecimal reeferCostPlus
	
	static mapping = {
		table name:'fuel_prices', schema:"btf"
		version false
		id column:'pkey'
		columns {
			f3Price column: 'f3_price'
			fuelLocation column: 'fuel_location_pkey', lazy:false
		}
	}
}