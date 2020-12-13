package com.ibm.currencyconversion.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.currencyconversion.dto.ManageCurrencyConvDTO;
import com.ibm.currencyconversion.entity.*;
import com.ibm.currencyconversion.service.ManageCurrencyService;

@RequestMapping("manageCurrency")
@RestController
public class ManageCurrencyConvController {

	@Autowired
	ManageCurrencyService manageCurrencyService;

	@GetMapping("/")
	public ResponseEntity<ManageCurrencyConversion> getCurrencyConversion(
			@RequestParam(value = "countryCode") String countryCode) {

		Optional<ManageCurrencyConversion> mcc = manageCurrencyService.getConversionFactor(countryCode);

		if (mcc.isPresent()) {

			return ResponseEntity.status(HttpStatus.OK).body(mcc.get());
		} else {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}

	}

	@GetMapping("/{countryCode}") 
	public Double getCurrencyConversion1(@RequestParam(value = "countryCode") String countryCode) {

		Optional<ManageCurrencyConversion> mcc = manageCurrencyService.getConversionFactor(countryCode);

		if (mcc.isPresent()) {

			return mcc.get().getConversionFactor();
		} else {

			return null;
		}

	}

	@PostMapping("/add")
	public ResponseEntity<ManageCurrencyConversion> addConversionFactor(@RequestBody ManageCurrencyConvDTO dto) {

		return ResponseEntity.status(HttpStatus.CREATED).body(manageCurrencyService.addConversionFactor(dto));
	}

	@PostMapping("/update")
	public ResponseEntity<ManageCurrencyConversion> updateConversionFactor(@RequestBody ManageCurrencyConvDTO dto) {

		return ResponseEntity.status(HttpStatus.CREATED).body(manageCurrencyService.addConversionFactor(dto));
	}
}
