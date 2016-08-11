package net.slipp.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	// 
	@RequestMapping("/")
	public String home() {
		// 이동할 뷰의 이름 - home
		// /home.jsp - suffix, prefix가 자동으로 붙는다.
		// 결국 홈에 있는 home.jsp를 호출하게 된다.
		return "home";
	}
}
