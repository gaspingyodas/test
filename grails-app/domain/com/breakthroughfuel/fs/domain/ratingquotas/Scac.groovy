package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date

class Scac implements Serializable {
	
	private static final long serialVersionUID = 108L
	
	Date lastChanged
	String name

    static mapping = {
		table name:'scacs', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
}
