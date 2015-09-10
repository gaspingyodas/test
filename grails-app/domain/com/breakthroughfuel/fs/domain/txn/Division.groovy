package com.breakthroughfuel.fs.domain.txn

class Division {
	enum RouteTypes {
		Practical ('Practical'),
		Quickest('Quickest'),
		HouseholdGoods('Household Goods'),
		LowestCost('Lowest Cost'),
		PCMilerTruckPractical('PCM Truck Practical'),
		PCMilerTruckShortest('PCM Truck Shortest')
		
		def String value
		
		RouteTypes(String value) {
			this.value = value;
		}
	}
	
	String accountNumber
	String address1
	String address2
	Boolean allowIntraCanadaShipments
	String bankNumber
	String baseRateBehaviorBasis
	BigDecimal btfRebateGallonRate
	Boolean calculateDeadheadMiles
	BigDecimal calculateDeadheadMilesPercentage
	Boolean calculateLoadedMiles
	String city
	String crossBorderBehaviorBasis
	Boolean ediSupported
	Boolean eligibleForCanadianPricing
	Boolean eligibleForNaturalGasPricing
	Boolean eligibleForReeferPricing
	Boolean estimatePrice
	Boolean expireLoads
	Integer expireSettlementsDays
	BigDecimal expiredTransactionFee
	String fax
	BigDecimal feePerExpiredGallon
	BigDecimal feePerSettledGallon
	BigDecimal feePerSettledIntermodalGallon
	BigDecimal feePerSettledIntermodalNaturalGasGallon
	BigDecimal feePerSettledNaturalGasGallon
	String homeOverride
	String divisionId
	Boolean importLocationLookupUseLike
	Boolean invoiceCutoffFri
	Boolean invoiceCutoffMon
	Boolean invoiceCutoffSat
	Boolean invoiceCutoffSun
	Boolean invoiceCutoffThu
	Boolean invoiceCutoffTue
	Boolean invoiceCutoffWed
	Boolean invoicePartialMatches
	Boolean limitFifoMatchCap
	Boolean limitFifoMatchDoe
	Boolean limitLaneMatchCap
	Boolean limitLaneMatchDoe
	Boolean limitRegionMatchCap
	Boolean limitRegionMatchDoe
	Boolean limitStateMatchCap
	Boolean limitStateMatchDoe
	String miCalcRouteType
	Long mileageCap
	String name
	BigDecimal percentOfExpiredSavingsFee
	BigDecimal percentOfSavingsFee
	String phone1
	String phone2
	Boolean reportPreInvoiceFri
	Boolean reportPreInvoiceMon
	Boolean reportPreInvoiceSat
	Boolean reportPreInvoiceSun
	Boolean reportPreInvoiceThu
	Boolean reportPreInvoiceTue
	Boolean reportPreInvoiceWed
	Integer reviewDaysFri
	Integer reviewDaysMon
	Integer reviewDaysSat
	Integer reviewDaysSun
	Integer reviewDaysThu
	Integer reviewDaysTue
	Integer reviewDaysWed
	String routeType
	String routingMileageCalculationSystemVersionNumber
	String shortName
	BigDecimal transactionFee
	String zip
	Boolean allowNegativeReeferCredit
	Date reeferEligibilityDate
	Shipper shipper
	State state

	static mapping = {
		table name: 'divisions', schema: 'btf'
		id column: "pkey", generator: "sequence", params:[sequence:'division_pkey_seq']
		version false
		divisionId column: 'id'
        previousWindowPricingDay column: "previous_window_days_pkey"
        fifoMatchPricingDay column: "fifo_match_day_pkey"
        stateMatchPricingDay column: "state_match_day_pkey"
        initialInvoiceStatus column: "initial_invoice_status_pkey"
        regionMatchPricingDay column: "region_match_day_pkey"
        postWindowPricingDay column: "post_window_days_pkey"
        shipper column: "shipper_pkey"
        state column: "state_pkey"
	}

	static constraints = {
		accountNumber nullable: true, maxSize: 15
		address1 maxSize: 40
		address2 maxSize: 40
		allowIntraCanadaShipments nullable: true
		bankNumber maxSize: 15
		baseRateBehaviorBasis maxSize: 20
		calculateDeadheadMilesPercentage nullable: true
		city maxSize: 40
		crossBorderBehaviorBasis maxSize: 20
		fax maxSize: 14
		homeOverride maxSize: 50
		id maxSize: 20, unique: ["shipper"]
		miCalcRouteType maxSize: 20
		name maxSize: 40
		phone1 maxSize: 14
		phone2 maxSize: 14
		reviewDaysFri nullable: true
		reviewDaysMon nullable: true
		reviewDaysSat nullable: true
		reviewDaysSun nullable: true
		reviewDaysThu nullable: true
		reviewDaysTue nullable: true
		reviewDaysWed nullable: true
		routeType maxSize: 20
		routingMileageCalculationSystemVersionNumber nullable: true, maxSize: 5
		shortName maxSize: 10
		zip maxSize: 9
		lastChangeUserPkey nullable: true
		reeferEligibilityDate nullable: true
	}
}
