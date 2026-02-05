package com.app.calculator.controller;

import java.util.List;

import com.app.calculator.dto.RequestDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.app.calculator.dto.ResultDto;
import com.app.calculator.exception.CalculateException;
import com.app.calculator.service.Calculate;

import jakarta.validation.constraints.Pattern;

@RestController
@Validated
@RequestMapping("/math")
public class CalculatorController {
	
	private Calculate calcService;
	
	@Autowired
	public CalculatorController(Calculate calcService) {
		// TODO Auto-generated constructor stub
		this.calcService = calcService;
	}
	
	@PostMapping("/operation")
	public ResponseEntity<ResultDto> getResult(@Valid @RequestBody RequestDto reqdto) throws CalculateException {
		
		ResultDto dto = null;
		//ResponseEntity<ResultDto> result = null;
		if(reqdto == null){
			throw new CalculateException("Please do an operation !");
		}else{

			String operation = reqdto.getOperationType();
			Double elementOne = reqdto.getElementOne();
			Double elementTwo = reqdto.getElementTwo();
			dto = calcService.calculation(operation, elementOne, elementTwo);
		}

		
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping("/history")
	public ResponseEntity<List<ResultDto>> getHistory(){
		
		List<ResultDto> histories = null;
		
		histories = calcService.getLatest10History();
		
		return ResponseEntity.ok(histories);
	}

}
