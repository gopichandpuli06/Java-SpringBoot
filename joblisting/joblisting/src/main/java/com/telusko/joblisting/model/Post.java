package com.telusko.joblisting.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JobPost")
public class Post {
	public String profile;
	public String techs[];
	public String desc;
	public int exp;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Post [profile=" + profile + ", techs=" + Arrays.toString(techs) + ", desc=" + desc + ", exp=" + exp
				+ "]";
	}
	
	
	
}
