package hrn.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hrn.test.form.LoginForm;

@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
	return "index";
	}

	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	 public String login(Model model, @ModelAttribute("loginForm") LoginForm loginForm) {
	 model.addAttribute("loginName", loginForm.getLoginName());

	 return "top";
	 }
	//初期用
// @RequestMapping(value = "/login", method = RequestMethod.POST)
// public String login(Model model) {
// return "top";
// }
}