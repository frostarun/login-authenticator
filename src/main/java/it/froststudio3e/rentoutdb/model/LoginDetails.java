package it.froststudio3e.rentoutdb.model;

import lombok.Getter;
import lombok.Setter;

public class LoginDetails {

	@Getter
	@Setter
	public String email;

	@Getter
	@Setter
	public String password;

	@Getter
	@Setter
	public String token;

	// Constructors
	public LoginDetails() {
	}

}
