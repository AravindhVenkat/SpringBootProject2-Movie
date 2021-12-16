package com.sprboot.demo.entities;

import java.io.Serializable;

public class Movie implements Serializable{
	private int mid;
	private String mname;
	private String mgenre;
	private int mrating;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMgenre() {
		return mgenre;
	}
	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}
	public int getMrating() {
		return mrating;
	}
	public void setMrating(int mrating) {
		this.mrating = mrating;
	}
	public Movie(int mid, String mname, String mgenre, int mrating) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mgenre = mgenre;
		this.mrating = mrating;
	}
	public Movie() {
		
	}
}
