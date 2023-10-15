package com.payilagam.myprojectweb;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class InternetConnection {
	private String IPAddress;
	private String speed;
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
 public void SwitchOn()
 {
	 System.out.println("Switching on internet");
 }
	
	
}
