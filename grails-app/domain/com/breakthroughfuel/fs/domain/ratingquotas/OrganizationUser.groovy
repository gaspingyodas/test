package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import java.util.Set
import com.breakthroughfuel.fs.domain.ratingquotas.Organization
import com.breakthroughfuel.fs.domain.ratingquotas.RateTransaction

class OrganizationUser implements Serializable {
	
	private static final long serialVersionUID = 103L

	Organization organization
	Set rateTransaction
	
	Date lastChanged
	String name
	Long quotaOverride
	int accountTypeId
	
	static hasMany = [rateTransactions:RateTransaction]
	
    static mapping = {
		table name:'organization_users', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
}
