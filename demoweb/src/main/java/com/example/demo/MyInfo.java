package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyInfo {

	private String info ;
	private String moreInfo ;

	public MyInfo () {
		this.info = "Default info" ;
		this.moreInfo = "Default more info" ;
	}

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getMoreInfo() {
		return moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	@Override
	public String toString() {
		return "MyInfo [info=" + info + ", moreInfo=" + moreInfo + ", getInfo()=" + getInfo() + ", getMoreInfo()="
				+ getMoreInfo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}
