package com.ibm.currencyconversion.converter;

import com.ibm.currencyconversion.dto.ManageCurrencyConvDTO;
import com.ibm.currencyconversion.entity.ManageCurrencyConversion;

public class CurrencyConverter {
	
	public ManageCurrencyConversion convertToEntity(ManageCurrencyConvDTO dto) {
		
		ManageCurrencyConversion mcc = new ManageCurrencyConversion();
		
		mcc.setCountryCode(dto.getCountryCode());
		mcc.setConversionFactor(dto.getConversionFactor());
		
		return mcc;
	}
	
	public ManageCurrencyConvDTO convertToDTO(ManageCurrencyConversion entity) {
		
		ManageCurrencyConvDTO mccDto = new ManageCurrencyConvDTO();
	//	mccDto.setId(entity.getId());
		mccDto.setCountryCode(entity.getCountryCode());
		mccDto.setConversionFactor(entity.getConversionFactor());
		return mccDto;
	}


}
