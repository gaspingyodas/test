package com.breakthroughfuel.fs.domain.oa

import java.io.Serializable
import java.util.Date

class OaRegionMargin implements Serializable {

    private static final long serialVersionUID = 109L
	
	Date dateAdded
	Date lastChanged
	Date effectiveDate
	String regionId
	String regionName
	BigDecimal margin
	BigDecimal tax
	BigDecimal volatility
	String mode
	
	static mapping = {
		table name:'oa_region_margins', schema:"oppass"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'oppass.oa_region_margin_id_seq']
		columns {
			id column:'id'
		}
	}
}
