package com.breakthroughfuel.fs.domain.txn

import java.util.Date

class CurrencyExchangeCountryCode {

    Date lastChanged
	Date dateAdded
	String isoCode
	String isoCountryName
	String isoUom
	
	static mapping = {
		table name:'currency_exchange_country_codes', schema:"btf"
		version false
		id column:'pkey'
	}
}
