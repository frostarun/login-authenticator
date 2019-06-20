package it.froststudio3e.rentoutdb.controller;

import it.froststudio3e.rentoutdb.model.Users;
import it.froststudio3e.rentoutdb.model.RegisterDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class LoginController {

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	@ResponseBody
	public String authenticate(@Valid @RequestBody Users loginDetail, HttpServletResponse response) {
		String status= "";
		if(loginDetail.username.equals("test@test.com")) {
			status = "{\"status\":\"success\",\"token\":\"asdf1234CsfdvsdWECfvFGVTg\"}";
		}else {
			status = "{\"status\":\"failure\"}";
		}
		return status;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@Valid @RequestBody RegisterDetails registerDetail, HttpServletResponse response) {
		String status= "";
		if (registerDetail.email.equals("test@test.com")) {
			status = "{\"status\":\"success\",\"token\":\"asdf1234CsfdvsdWECfvFGVTg\"}";
		}else {
			status = "{\"status\":\"failure\"}";
		}
		return status;
	}

	@RequestMapping(value = "/public", method = RequestMethod.POST)
	@ResponseBody
	@GetMapping
	public String getMessage() {
		return "Hello from public API controller";
	}

}
