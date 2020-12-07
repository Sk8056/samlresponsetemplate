package com.template;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author Ram Chetan
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {
	
	@JsonProperty("mail")
	private String mail;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("organization_name")
	private String organizationName;
	@JsonProperty("roles")
	private List<String> roles;
	
	public UserDetails() {}
		
	public UserDetails(String mail, String firstName, String lastName, String userName, String organizationName,
			List<String> roles) {
		super();
		this.mail = mail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.organizationName = organizationName;
		this.roles = roles;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "UserDetails [mail=" + mail + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", organizationName=" + organizationName + ", roles=" + roles + "]";
	}
	
	
	

}
