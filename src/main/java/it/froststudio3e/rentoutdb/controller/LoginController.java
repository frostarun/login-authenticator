package it.froststudio3e.rentoutdb.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.froststudio3e.rentoutdb.model.LoginDetails;

@RestController
@RequestMapping(value="/login")
public class LoginController {

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	@ResponseBody
	public String authenticate(@Valid @RequestBody LoginDetails loginDetail, HttpServletResponse response) {
		String status= "";
		if(loginDetail.email.equals("test@test.com")) {
			status = "{\"status\":\"success\",\"token\":\"asdf1234CsfdvsdWECfvFGVTg\"}";
		}else {
			status = "{\"status\":\"failure\"}";
		}
		return status;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String register(@Valid @RequestBody LoginDetails loginDetail, HttpServletResponse response) {
		String status= "";
		if(loginDetail.email.equals("test@test.com")) {
			status = "{\"status\":\"success\",\"token\":\"asdf1234CsfdvsdWECfvFGVTg\"}";
		}else {
			status = "{\"status\":\"failure\"}";
		}
		return status;
	}

}
