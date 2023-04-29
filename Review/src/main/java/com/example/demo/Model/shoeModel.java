package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class shoeModel
{
	@Id
      private int shoestorenum;
      private String shoestorename;
      private String ownername;
      private int years;
      private String opentime;
      private String closetime;
	public int getShoestorenum() {
		return shoestorenum;
	}
	public void setShoestorenum(int shoestorenum) {
		this.shoestorenum = shoestorenum;
	}
	public String getShoestorename() {
		return shoestorename;
	}
	public void setShoestorename(String shoestorename) {
		this.shoestorename = shoestorename;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getClosetime() {
		return closetime;
	}
	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}
      
}
