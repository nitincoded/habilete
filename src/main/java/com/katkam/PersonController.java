package com.katkam;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

// import org.springframework.web.servlet.mvc.AbstractController;
// import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PersonController {
	@RequestMapping("/person/list.do")
	public ModelAndView list() {
		ModelAndView m = new ModelAndView("/person/list");
		return m;
	}

	@RequestMapping("/person/edit.do")
	public ModelAndView edit() {
		ModelAndView m = new ModelAndView("/person/edit");
		return m;
	}

	@RequestMapping("/person/save.do") //, method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute PersonModel model) {
		return new ModelAndView(new RedirectView("list.do"));
		//return new ModelAndView(new RedirectView("list.do?name="+model.getName() ));

		//to remove query params, do a redirectViewObj.setExposeModelAttributes(false);
		//alternatively, change the return type to String and :- return "redirect:" + redirectUrl;
	}
}