package com.magnit.ehcservice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.magnit.ehcservice.models.Qmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.magnit.ehcservice.service.EHCService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/ehc")
@Slf4j
@CrossOrigin
public class EHCController {

	@Autowired
	EHCService ehcService;

	@RequestMapping(value = "/calculateHappinessLevels", method = RequestMethod.POST,consumes = "application/json",produces ="application/json" )
	public ResponseEntity<Object> login(@RequestBody @Valid Qmodel answers) {
		ResponseEntity<Object> resEntity = ehcService.login(answers);
		return resEntity;
	}

	}
