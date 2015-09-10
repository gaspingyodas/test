package com.breakthroughfuel.fs.domain.txn

import java.math.BigDecimal
import java.util.Date

class RailFuelLocation {
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey
	String city
	String stateCode
	String countryCode
	String taxType
	BigDecimal taxAmount
	boolean enabled
	BigDecimal percentageTax
	BigDecimal flatTax1
	BigDecimal flatTax2
	BigDecimal flatTax3
	BigDecimal flatTax4
	BigDecimal flatTax5
	BigDecimal flatFee1
	BigDecimal flatFee2
	BigDecimal flatFee3
	BigDecimal flatFee4
	BigDecimal flatFee5
	String btfId

    static mapping = {
		table name:'rail_fuel_locations', schema:"btf"
		version false
		id column:'pkey'
		columns {
			flatTax1 column: 'flat_tax_1'
			flatTax2 column: 'flat_tax_2'
			flatTax3 column: 'flat_tax_3'
			flatTax4 column: 'flat_tax_4'
			flatTax5 column: 'flat_tax_5'
			flatFee1 column: 'flat_fee_1'
			flatFee2 column: 'flat_fee_2'
			flatFee3 column: 'flat_fee_3'
			flatFee4 column: 'flat_fee_4'
			flatFee5 column: 'flat_fee_5'
		}
	}
}
