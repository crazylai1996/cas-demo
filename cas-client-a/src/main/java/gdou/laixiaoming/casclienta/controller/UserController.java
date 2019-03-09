package gdou.laixiaoming.casclienta.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping("/")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("role","VISITOR!");
		return mav;
	}

	@RequiresPermissions({"admin"})
	@GetMapping("/admin")
	public ModelAndView admin(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("role","ADMIN!");
		return mav;
	}

	@GetMapping("/logouttips")
	public ModelAndView logoutTips(){
		ModelAndView mav = new ModelAndView("tips");
		return mav;
	}

	@GetMapping("/logout")
	public String logout(){
		SecurityUtils.getSubject().logout();
		return "redirect:https://www.laixiaoming.com:8443/cas/logout?service=https://www.laixiaoming.com:9090/logouttips";
	}
}
