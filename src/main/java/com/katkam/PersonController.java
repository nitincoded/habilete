package com.katkam;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

// import org.springframework.web.servlet.mvc.AbstractController;
// import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

@Controller
public class PersonController {
	@RequestMapping("/person/list.do")
	public ModelAndView list() {
		ModelAndView m = new ModelAndView("/person/list");
		return m;
	}
}