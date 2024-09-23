package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/ex01")
	public void ex01() {
		// 리턴 타입이 void인 경우,url 경로와 일치하는 html 파일을 찾아 반환
		// 템플릿경로: /templates/sample/ex01.html
	}

	@GetMapping("/ex02")
	public void ex02(Model model) { // Model은 화면에 값을 전달하는 역할
		// 모델에 문자열을 담기 (첫번째인자:변수명, 두번째인자:값)
		model.addAttribute("msg", "안녕하세요");
	}

	@GetMapping("/ex03")
	public void ex03(Model model) {
		model.addAttribute("msg1", "안녕하세요");
		model.addAttribute("msg2", "반가워요");
		// model 객체에 데이터를 여러번 담을 수 있음
	}

}
