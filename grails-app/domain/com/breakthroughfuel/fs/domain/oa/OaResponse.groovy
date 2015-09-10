package com.breakthroughfuel.fs.domain.oa

import java.io.Serializable
import java.math.BigDecimal
import java.util.Date

class OaResponse implements Serializable {

    private static final long serialVersionUID = 110L
	
	Date dateAdded
	Date lastChanged
	String companyName
	String firstName
	String lastName
	String email
	String phone
	String freightTypeDomesticUs
	String freightTypeDomesticCanada
	String freightTypeDomesticMexico
	String freightTypeCrossBorderUsCanada
	String freightTypeCrossBorderUsMexico
	BigDecimal regionAllocationPadd1
	BigDecimal regionAllocationPadd2
	BigDecimal regionAllocationPadd3
	BigDecimal regionAllocationPadd4
	BigDecimal regionAllocationPadd5
	BigDecimal regionAllocationPaddCanadaEast
	BigDecimal regionAllocationPaddCanadaWest
	BigDecimal regionAllocationPaddMexico
	BigDecimal truckloadMiles
	BigDecimal intermodalMiles
	BigDecimal truckloadGallons
	BigDecimal intermodalGallons
	BigDecimal truckloadSavings
	BigDecimal intermodalSavings
	BigDecimal truckloadCostPerGallonSavings
	BigDecimal intermodalCostPerGallonSavings
	BigDecimal truckloadGallonsForPadd1
	BigDecimal truckloadGallonsForPadd2
	BigDecimal truckloadGallonsForPadd3
	BigDecimal truckloadGallonsForPadd4
	BigDecimal truckloadGallonsForPadd5
	BigDecimal truckloadGallonsForPaddCanadaEast
	BigDecimal truckloadGallonsForPaddCanadaWest
	BigDecimal truckloadGallonsForPaddMexico
	BigDecimal intermodalGallonsForPadd1
	BigDecimal intermodalGallonsForPadd2
	BigDecimal intermodalGallonsForPadd3
	BigDecimal intermodalGallonsForPadd4
	BigDecimal intermodalGallonsForPadd5
	BigDecimal intermodalGallonsForPaddCanadaEast
	BigDecimal intermodalGallonsForPaddCanadaWest
	BigDecimal intermodalGallonsForPaddMexico
	BigDecimal truckloadSavingsForPadd1
	BigDecimal truckloadSavingsForPadd2
	BigDecimal truckloadSavingsForPadd3
	BigDecimal truckloadSavingsForPadd4
	BigDecimal truckloadSavingsForPadd5
	BigDecimal truckloadSavingsForPaddCanadaEast
	BigDecimal truckloadSavingsForPaddCanadaWest
	BigDecimal truckloadSavingsForPaddMexico
	BigDecimal intermodalSavingsForPadd1
	BigDecimal intermodalSavingsForPadd2
	BigDecimal intermodalSavingsForPadd3
	BigDecimal intermodalSavingsForPadd4
	BigDecimal intermodalSavingsForPadd5
	BigDecimal intermodalSavingsForPaddCanadaEast
	BigDecimal intermodalSavingsForPaddCanadaWest
	BigDecimal intermodalSavingsForPaddMexico
	
	static mapping = {
		table name:'oa_responses', schema:"oppass"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'oppass.oa_response_id_seq']
		columns {
			id column:'id'
			regionAllocationPadd1 column:'region_allocation_padd1'
			regionAllocationPadd2 column:'region_allocation_padd2'
			regionAllocationPadd3 column:'region_allocation_padd3'
			regionAllocationPadd4 column:'region_allocation_padd4'
			regionAllocationPadd5 column:'region_allocation_padd5'
			regionAllocationPaddCanadaEast column:'region_allocation_paddcanadaeast'
			regionAllocationPaddCanadaWest column:'region_allocation_paddcanadawest'
			regionAllocationPaddMexico column:'region_allocation_paddmexico'
			truckloadMiles column:'truckload_miles'
			intermodalMiles column:'intermodal_miles'
			truckloadGallons column:'truckload_gallons'
			intermodalGallons column:'intermodal_gallons'
			truckloadSavings column:'truckload_savings'
			intermodalSavings column:'intermodal_savings'
			truckloadCostPerGallonSavings column:'truckload_cost_per_gallon_savings'
			intermodalCostPerGallonSavings column:'intermodal_cost_per_gallon_savings'
			truckloadGallonsForPadd1 column:'truckload_gallons_padd1'
			truckloadGallonsForPadd2 column:'truckload_gallons_padd2'
			truckloadGallonsForPadd3 column:'truckload_gallons_padd3'
			truckloadGallonsForPadd4 column:'truckload_gallons_padd4'
			truckloadGallonsForPadd5 column:'truckload_gallons_padd5'
			truckloadGallonsForPaddCanadaEast column:'truckload_gallons_padd_canada_east'
			truckloadGallonsForPaddCanadaWest column:'truckload_gallons_padd_canada_west'
			truckloadGallonsForPaddMexico column:'truckload_gallons_padd_mexico'
			intermodalGallonsForPadd1 column:'intermodal_gallons_padd1'
			intermodalGallonsForPadd2 column:'intermodal_gallons_padd2'
			intermodalGallonsForPadd3 column:'intermodal_gallons_padd3'
			intermodalGallonsForPadd4 column:'intermodal_gallons_padd4'
			intermodalGallonsForPadd5 column:'intermodal_gallons_padd5'
			intermodalGallonsForPaddCanadaEast column:'intermodal_gallons_padd_canada_east'
			intermodalGallonsForPaddCanadaWest column:'intermodal_gallons_padd_canada_west'
			intermodalGallonsForPaddMexico column:'intermodal_gallons_padd_mexico'
			truckloadSavingsForPadd1 column:'truckload_savings_padd1'
			truckloadSavingsForPadd2 column:'truckload_savings_padd2'
			truckloadSavingsForPadd3 column:'truckload_savings_padd3'
			truckloadSavingsForPadd4 column:'truckload_savings_padd4'
			truckloadSavingsForPadd5 column:'truckload_savings_padd5'
			truckloadSavingsForPaddCanadaEast column:'truckload_savings_padd_canada_east'
			truckloadSavingsForPaddCanadaWest column:'truckload_savings_padd_canada_west'
			truckloadSavingsForPaddMexico column:'truckload_savings_padd_mexico'
			intermodalSavingsForPadd1 column:'intermodal_savings_padd1'
			intermodalSavingsForPadd2 column:'intermodal_savings_padd2'
			intermodalSavingsForPadd3 column:'intermodal_savings_padd3'
			intermodalSavingsForPadd4 column:'intermodal_savings_padd4'
			intermodalSavingsForPadd5 column:'intermodal_savings_padd5'
			intermodalSavingsForPaddCanadaEast column:'intermodal_savings_padd_canada_east'
			intermodalSavingsForPaddCanadaWest column:'intermodal_savings_padd_canada_west'
			intermodalSavingsForPaddMexico column:'intermodal_savings_padd_mexico'
			
			
		}
	}
	
	static constraints = {
		companyName(nullable: true)
		firstName(nullable: true)
		lastName(nullable: true)
		email(nullable: true)
		phone(nullable: true)
		freightTypeDomesticUs(nullable: true)
		freightTypeDomesticCanada(nullable: true)
		freightTypeDomesticMexico(nullable: true)
		freightTypeCrossBorderUsCanada(nullable: true)
		freightTypeCrossBorderUsMexico(nullable: true)
		regionAllocationPadd1(nullable: true)
		regionAllocationPadd2(nullable: true)
		regionAllocationPadd3(nullable: true)
		regionAllocationPadd4(nullable: true)
		regionAllocationPadd5(nullable: true)
		regionAllocationPaddCanadaEast(nullable: true)
		regionAllocationPaddCanadaWest(nullable: true)
		regionAllocationPaddMexico(nullable: true)
		truckloadMiles(nullable: true)
		intermodalMiles(nullable: true)
		truckloadGallons(nullable: true)
		intermodalGallons(nullable: true)
		truckloadSavings(nullable: true)
		intermodalSavings(nullable: true)
		truckloadCostPerGallonSavings(nullable: true)
		intermodalCostPerGallonSavings(nullable: true)
		truckloadGallonsForPadd1(nullable: true)
		truckloadGallonsForPadd2(nullable: true)
		truckloadGallonsForPadd3(nullable: true)
		truckloadGallonsForPadd4(nullable: true)
		truckloadGallonsForPadd5(nullable: true)
		truckloadGallonsForPaddCanadaEast(nullable: true)
		truckloadGallonsForPaddCanadaWest(nullable: true)
		truckloadGallonsForPaddMexico(nullable: true)
		intermodalGallonsForPadd1(nullable: true)
		intermodalGallonsForPadd2(nullable: true)
		intermodalGallonsForPadd3(nullable: true)
		intermodalGallonsForPadd4(nullable: true)
		intermodalGallonsForPadd5(nullable: true)
		intermodalGallonsForPaddCanadaEast(nullable: true)
		intermodalGallonsForPaddCanadaWest(nullable: true)
		intermodalGallonsForPaddMexico(nullable: true)
		truckloadSavingsForPadd1(nullable: true)
		truckloadSavingsForPadd2(nullable: true)
		truckloadSavingsForPadd3(nullable: true)
		truckloadSavingsForPadd4(nullable: true)
		truckloadSavingsForPadd5(nullable: true)
		truckloadSavingsForPaddCanadaEast(nullable: true)
		truckloadSavingsForPaddCanadaWest(nullable: true)
		truckloadSavingsForPaddMexico(nullable: true)
		intermodalSavingsForPadd1(nullable: true)
		intermodalSavingsForPadd2(nullable: true)
		intermodalSavingsForPadd3(nullable: true)
		intermodalSavingsForPadd4(nullable: true)
		intermodalSavingsForPadd5(nullable: true)
		intermodalSavingsForPaddCanadaEast(nullable: true)
		intermodalSavingsForPaddCanadaWest(nullable: true)
		intermodalSavingsForPaddMexico(nullable: true)
		
	}
}
