package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import java.util.Set
import com.breakthroughfuel.fs.domain.ratingquotas.Organization

class QuotaInterval implements Serializable {
	
	private static final long serialVersionUID = 104L

	Set organization
	
	Date lastChanged
	String name
	
	static hasMany = [organizations:Organization]
	
	static mapping = {
		table name:'quota_intervals', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
	
    static constraints = {
    }
}
