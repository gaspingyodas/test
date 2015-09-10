package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date

class RluShipper implements Serializable {

	private static final long serialVersionUID = 112L
	
	Date lastChanged
	String shipperId
	
	static mapping = {
		table name:'rlu_shippers', schema:"ratingquotas"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'ratingquotas.rlu_shippers_id_seq']
		columns {
			id column:'id'
		}
	}
}
