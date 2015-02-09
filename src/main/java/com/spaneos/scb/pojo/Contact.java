package com.spaneos.scb.pojo;

public class Contact {
	private int cid;
	private String fullName;
	private String mobile;
	private String email;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", fullName=" + fullName + ", mobile="
				+ mobile + ", email=" + email + "]";
	}

}
