package com.breakthroughfuel.fs.domain.txn

import java.util.Date

class FuelPriceImportResult {

    Date lastChanged
	Date dateAdded
	String filename
	Date fuelPriceDate
	String fuelPriceType
	String importStatus
	
	static mapping = {
		table name:'fuel_price_import_results', schema:"btf"
		version false
		id column:'pkey'
	}
}
