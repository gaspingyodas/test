package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import com.breakthroughfuel.fs.domain.txn.GeographicLocation
import com.breakthroughfuel.fs.domain.txn.IntermodalLane

class IntermodalLaneHub {
	
	IntermodalLane intermodalLane
	GeographicLocation geographicLocation
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey
	Long hubNumber
	String name
	String pcmilerCity
	String pcmilerState
	String pcmilerZip
	String railLine
	String mot

    static mapping = {
		table name:'intermodal_lane_hubs', schema:"btf"
		version false
		id column:'pkey'
		columns {
			intermodalLane column: 'intermodal_lane_pkey', lazy:false
			geographicLocation column: 'geographic_location_pkey', lazy:false
		}
	}
}
