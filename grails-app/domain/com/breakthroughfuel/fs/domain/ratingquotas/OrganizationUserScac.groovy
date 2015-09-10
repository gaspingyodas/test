package com.breakthroughfuel.fs.domain.ratingquotas

import java.io.Serializable
import java.util.Date
import com.breakthroughfuel.fs.domain.ratingquotas.OrganizationUser
import com.breakthroughfuel.fs.domain.ratingquotas.Scac
import com.breakthroughfuel.fs.domain.ratingquotas.RluShipper

class OrganizationUserScac implements Serializable {
	
	private static final long serialVersionUID = 107L

    OrganizationUser organizationUser
	Scac scac
	RluShipper shipper
	
	Date lastChanged
	
	static mapping = {
		table name:'organization_user_scacs', schema:"ratingquotas"
		//cache = false
		version false
		columns {
			id column:'id'
		}
	}
}
