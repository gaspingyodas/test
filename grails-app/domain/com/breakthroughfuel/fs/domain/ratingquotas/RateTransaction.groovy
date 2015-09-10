package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import java.util.Set
import com.breakthroughfuel.fs.domain.ratingquotas.Organization
import com.breakthroughfuel.fs.domain.ratingquotas.OrganizationUser
import com.breakthroughfuel.fs.domain.ratingquotas.RateTransactionStop

class RateTransaction implements Serializable {

	private static final long serialVersionUID = 100L
	
	Set rateTransactionStops
	
	Organization organization
	OrganizationUser organizationUser
	
	Date lastChanged
	Date dateCalculated
	Date pickupDate
	String referenceNumber
	BigDecimal fuelRate
	String source
	String resultDeliveryType
	String mode
	String scac
	String tempClass
	String commodityType
	
	static hasMany = [rateTransactionStops:RateTransactionStop]
	
	static mapping = {
		table name:'rate_transactions', schema:"ratingquotas"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'ratingquotas.rate_transactions_id_seq']
		columns {
			id column:'id'
		}
	}
	
	static constraints = {
		referenceNumber(nullable: true)
		mode(nullable: true)
		scac(nullable: true)
		tempClass(nullable: true)
		commodityType(nullable: true)
	}
}
