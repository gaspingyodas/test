package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import java.math.BigDecimal

import com.breakthroughfuel.fs.domain.txn.CurrencyExchangeCountryCode

class CurrencyExchangeRate {

	static belongsTo = [currencyExchangeCountryCode:CurrencyExchangeCountryCode]
	CurrencyExchangeCountryCode currencyExchangeCountryCode
	
	Date lastChanged
	Date dateAdded
	Date readingDate
	BigDecimal exchangeRate
	String source
	
    static mapping = {
		table name:'currency_exchange_rates', schema:"btf"
		version false
		id column:'pkey'
		columns {
			currencyExchangeCountryCode column: 'currency_exchange_country_code_pkey', lazy:false
		}
	}
}
