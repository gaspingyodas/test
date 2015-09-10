package com.breakthroughfuel.fs.domain.txn

import java.util.Date
import com.breakthroughfuel.fs.domain.txn.Shipper

class IntermodalLane {

	Shipper shipper
	
	Date lastChanged
	Date dateAdded
	Date effectiveDate
	Long lastChangeUserPkey
	String scac
	String stop1Zip
	String stop2Zip
	Long railMiles
	Long injectRailAfterStop
	boolean enabled
	String laneId
	String equipmentType
	String stop1City
	String stop1StateCode
	String stop2City
	String stop2StateCode
	String firstLegMot
	boolean oneHubPermitted
	Long daysInTransit
	String parentLaneId
	String laneType
	
    static mapping = {
		table name:'intermodal_lanes', schema:"btf"
		version false
		id column:'pkey'
		columns {
			shipper column: 'shipper_pkey', lazy:false
			stop1Zip column: 'stop1_zip'
			stop2Zip column: 'stop2_zip'
			stop1City column: 'stop1_city'
			stop1StateCode column: 'stop1_state_code'
			stop2City column: 'stop2_city'
			stop2StateCode column: 'stop2_state_code'
		}
	}
	
	static constraints = {
		daysInTransit(nullable: true)
	}
}
