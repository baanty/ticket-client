package com.pijush.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pijush.common.vo.TicketVo;

@RestController
public class TicketController {

	@GetMapping(value = "/ticket")
	public TicketVo getTicketVo() {
		
		TicketVo ticket = new TicketVo();
		ticket.setTicketNumber(9933842);
		ticket.setUserId(254584);
		return ticket;
	}
}
