package com.ibm.currencyconversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.currencyconversion.entity.ManageCurrencyConversion;

@Repository
public interface CurrConvRepository extends JpaRepository<ManageCurrencyConversion, String>{

}
