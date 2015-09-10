package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date

class RluKraftRoutingMileageOverride implements Serializable {
	
	private static final long serialVersionUID = 113L

    Date lastChanged
	
	String originCity
	String originState
	String originPostalCode
	String destinationCity
	String destinationState
	String destinationPostalCode
	Long miles
	
	static mapping = {
		table name:'rlu_kraft_routing_mileage_overrides', schema:"ratingquotas"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'ratingquotas.rlu_kraft_routing_mileage_overrides_id_seq']
		columns {
			id column:'id'
		}
	}
	
	static constraints = {
		originCity(nullable: true)
		originState(nullable: true)
		originPostalCode(nullable: true)
		destinationCity(nullable: true)
		destinationState(nullable: true)
		destinationPostalCode(nullable: true)
	}
}
