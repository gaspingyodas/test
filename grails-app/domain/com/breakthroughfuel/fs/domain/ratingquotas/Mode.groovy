package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date

class Mode implements Serializable {
	
	private static final long serialVersionUID = 105L

    Date lastChanged
	String name
	
	static mapping = {
		table name:'modes', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
}
