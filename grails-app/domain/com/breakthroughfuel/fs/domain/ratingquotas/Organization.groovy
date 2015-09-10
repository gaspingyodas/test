package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import java.util.Set

import com.breakthroughfuel.fs.domain.ratingquotas.OrganizationUser
import com.breakthroughfuel.fs.domain.ratingquotas.QuotaInterval
import com.breakthroughfuel.fs.domain.ratingquotas.RateTransaction

class Organization implements Serializable {

	private static final long serialVersionUID = 102L
	
    Set organizationUser
	Set rateTransaction
	QuotaInterval quotaInterval
	
    Date lastChanged
	String name
	Long quota
	boolean allowBatch
	boolean allowInteractive
	Date activationDate
	Date expirationDate
	int organizationTypeId
	int accountTypeId
	String ftpId 
	String ftpHost
	String ftpPort
	String ftpUser
	String ftpPass
	String ftpUploadPath
	String ftpUploadDelimiter
	String defaultEmail
	
	static hasMany = [organizationUsers:OrganizationUser, rateTransactions:RateTransaction]
	
    static mapping = {
		table name:'organizations', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
	
    static constraints = {
    }
}
