package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import com.breakthroughfuel.fs.domain.txn.IntermodalLane
import com.breakthroughfuel.fs.domain.txn.RailFuelLocation

class IntermodalLaneRailFuelLocation {
	
	IntermodalLane intermodalLane
	RailFuelLocation railFuelLocation
	
	Date lastChanged
	Date dateAdded
	Long lastChangeUserPkey

    static mapping = {
		table name:'intermodal_lane_rail_fuel_locations', schema:"btf"
		version false
		id column:'pkey'
		columns {
			intermodalLane column: 'intermodal_lane_pkey', lazy:false
			railFuelLocation column: 'rail_fuel_location_pkey', lazy:false
		}
	}
}
