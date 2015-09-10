package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import com.breakthroughfuel.fs.domain.ratingquotas.Mode
import com.breakthroughfuel.fs.domain.ratingquotas.OrganizationUser
import com.breakthroughfuel.fs.domain.ratingquotas.RluShipper

class OrganizationUserMode implements Serializable {
	
	private static final long serialVersionUID = 106L

    Mode mode
	OrganizationUser organizationUser
	RluShipper shipper
	
	Date lastChanged
	
	static mapping = {
		table name:'organization_user_modes', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
}
