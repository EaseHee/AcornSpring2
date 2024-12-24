package com.acorn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acorn.dto.EateriesDto;
import com.acorn.process.EateriesProcess;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/main/eatery")
@CrossOrigin("http://localhost:3000")
public class DetailsController {
	@Autowired
	private EateriesProcess eateriesProcess;
	
	@GetMapping("/{no}")
	public ResponseEntity<EateriesDto> getEatery (@PathVariable("no") int no) {
		return ResponseEntity.ok().body(eateriesProcess.getEatery(no));
	}
}
