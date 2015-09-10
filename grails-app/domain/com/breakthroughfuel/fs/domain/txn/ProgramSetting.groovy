package com.breakthroughfuel.fs.domain.txn

class ProgramSetting {
	String propertyName
	String value
	Program program

	static belongsTo = [Program]

	static mapping = {
        table name: 'program_settings', schema: 'btf'
		id column: "pkey" //, generator: "sequence", params:[sequence:'program_setting_pkey_seq']
		version false
		program column: 'program_pkey'
	}
/*
	static constraints = {
		propertyName unique: ["program"]
	}
*/	
}
