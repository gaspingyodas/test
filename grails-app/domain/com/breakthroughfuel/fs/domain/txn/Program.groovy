package com.breakthroughfuel.fs.domain.txn

class Program {
	Date date
	Boolean enabled
	Date lastRunStart
	Date lastRunStop
	String name
	Boolean running
	String shortName

	static hasMany = [//logs: Log,
	                  settings: ProgramSetting]

	static mapping = {
		table name: 'programs', schema: 'btf'
		id column: "pkey" //, generator: "sequence", params:[sequence:'program_pkey_seq']
		version false
	}
/*
	static constraints = {
		lastRunStart nullable: true
		lastRunStop nullable: true
		name unique: true
		shortName maxSize: 40, unique: true
	}
*/	
}