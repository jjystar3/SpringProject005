package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController {

	@GetMapping({"/exLayout01","/exLayout02" , "/fragment02", "/fragment03", "/basic", "/exSidebar"})
	public void ex1() {
		// 리턴타입이 void면 URL경로가 HTML파일의 경로가 된다
	}
}
