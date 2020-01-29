package com.kite.mm.member.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kite.mm.member.domain.MemberVo;

@RestController
public class RestApiController {

	@CrossOrigin
	@PostMapping("/api/members")
	public String insertMember(@RequestBody MemberVo member) {		
		return member.toString(); 
	}

}




