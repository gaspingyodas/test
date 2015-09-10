package com.breakthroughfuel.fs.domain.txn

import java.util.Date

import com.breakthroughfuel.fs.domain.txn.State

class Shipper {
	
	State state
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey
	String idCode
	String name
	String address1
	String address2
	String city
	String zip
	String phone1
	String phone2
	String fax
	String shortName
	String homeOverride
	Date canadaWeightedPricingEffectiveDate

    static mapping = {
		table name:'shippers', schema:"btf"
		version false
		id column:'pkey'
		columns {
			idCode column: 'id'
			state column: 'state_pkey'
			address1 column: 'address1'
			address2 column: 'address2'
			phone1 column: 'phone1'
			phone2 column: 'phone2'
		//	f3Price column: 'f3_price'
	//		fuelLocation column: 'fuel_location_pkey', lazy:false
		}
	}
}
