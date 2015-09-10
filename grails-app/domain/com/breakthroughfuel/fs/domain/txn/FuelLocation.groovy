package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import java.math.BigDecimal

import com.breakthroughfuel.fs.domain.txn.FuelProvider
import com.breakthroughfuel.fs.domain.txn.GeographicLocation

class FuelLocation {

	static belongsTo = [fuelProvider:FuelProvider, geographicLocation:GeographicLocation]
	FuelProvider fuelProvider
	GeographicLocation geographicLocation
	
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
	boolean f3Location
	BigDecimal f3Markup
	BigDecimal retailOff
	String preference
	Long promilesId
	boolean loadRefundableIfta
	Date f3EffectiveDate
	Date pricingLocationEffectiveDate
	boolean pricingLocation
	String rmHighway
	String rmExit
	String rmLocation
	String rmCity
	String rmState
	String rmZip
	String rmCountry
	String latitude
	String longitude
	boolean reviewPending
	String randMcnallyId
	String rmName
	boolean setByUpdate
	String opisId
	BigDecimal reeferFlatTaxUs
	BigDecimal reeferPercentageTaxUs
	BigDecimal reeferFlatTaxCanada
	BigDecimal reeferPercentageTaxCanada
	
	static mapping = {
		table name:'fuel_locations', schema:"btf"
		version false
		id column:'pkey'
		columns {
			f3Location column:'f3_location'
			f3Markup column:'f3_markup'
			f3EffectiveDate column:'f3_effective_date'
			fuelProvider column: 'fuel_provider_pkey', lazy:false  //do not lazily fetch the fuelProvider
			geographicLocation column: 'location_pkey', lazy:false  //do not lazily fetch the geographicLocation
		}
	}
}