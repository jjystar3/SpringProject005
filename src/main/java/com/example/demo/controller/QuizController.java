package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("/q01")
	public void q01(Model model) {
		model.addAttribute("name", "둘리");
		model.addAttribute("age", 20);
		model.addAttribute("address", "인천 구월동");
	}

	@GetMapping("/q02")
	public void q02(Model model) {
		model.addAttribute("title", "스프링부트웹프로젝트");
		model.addAttribute("author", "구멍가게 코딩단");
		model.addAttribute("publicationDate", LocalDate.of(2022,12,25));
	}

	@GetMapping("/q03")
	public void q03(Model model) {
		model.addAttribute("msg1", "안녕하세요");
		model.addAttribute("msg2", "반가워요");
	}

}
