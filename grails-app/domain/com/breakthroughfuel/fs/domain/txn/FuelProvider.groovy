package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import java.math.BigDecimal

//import com.breakthroughfuel.fs.domain.txn.FuelLocation
import com.breakthroughfuel.fs.domain.txn.PriceCalculationType

class FuelProvider {

	static belongsTo = [priceCalculationType:PriceCalculationType]
	PriceCalculationType priceCalculationType
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey
	String idCode
	String name
	String address1
	String address2
	String city
	Long statePkey
	String zip
	String phone1
	String phone2
	String fax
	String shortName
	boolean f3Provider
	BigDecimal f3Markup
	BigDecimal retailOff
	String f3Type
	boolean pricingProvider
	Date pricingProviderEffectiveDate
	
	static mapping = {
		table name:'fuel_providers', schema:"btf"
		version false
		id column:'pkey'
		columns {
			idCode column: 'id'
			f3Type column: 'f3_type'
			f3Markup column: 'f3_markup'
			f3Provider column: 'f3_provider'
			priceCalculationType column: 'price_calculation_type_pkey', lazy:false
		}
	}
}