package com.magnit.ehcservice.service;

import javax.servlet.http.HttpServletResponse;

import com.magnit.ehcservice.models.Qmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class EHCService {

		public ResponseEntity<Object> login(Qmodel ans) {
		Map res=new HashMap<String,Integer>();
		try {
			Integer totalScore=ans.getQ1()+ans.getQ2()+ans.getQ3()+ans.getQ4()+ans.getQ5();
			log.info("totalScore-->"+totalScore);
			res.put("totalScore",totalScore);
		}catch (Exception e){
			return new ResponseEntity<Object>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Object>(res, HttpStatus.OK);
	}
		
}
