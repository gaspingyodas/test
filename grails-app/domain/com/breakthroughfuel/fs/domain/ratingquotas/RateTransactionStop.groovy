package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import java.util.Set
import com.breakthroughfuel.fs.domain.ratingquotas.RateTransaction

class RateTransactionStop implements Serializable {

	private static final long serialVersionUID = 101L
	
	RateTransaction rateTransaction
	
	Date lastChanged
	String city
	String state
	String postalCode
	Long stopNumber
	
	static mapping = {
		table name:'rate_transaction_stops', schema:"ratingquotas"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'ratingquotas.rate_transaction_stops_id_seq']
		columns {
			id column:'id'
		}
	}
	
	static constraints = {
		city(nullable: true)
		state(nullable: true)
		postalCode(nullable: true)
	}
}
