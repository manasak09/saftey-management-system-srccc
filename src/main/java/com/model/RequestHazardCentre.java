  package com.model;

}
package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class RequestHazardCentre {
	@Id
	@GeneratedValue
	private int RequestHazardCentreid1;
	
	@Size(min=1,max=100)
	private String username;
	
	@NotNull
    @Size(min=1,max=100)
	private  String password;
	
	@Size(min=10,max=11)
	private String mobile;

	
	public RequestHazardCentre() 
	{
		
	}


	public int getRequestHazardCentreid1() {
		return RequestActionid1;
	}


	public void setRequestHazardCentreid1(int requestHazardCentreid1) {
		RequestHazardCentreid1 = requestHazardCentreid1;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


}