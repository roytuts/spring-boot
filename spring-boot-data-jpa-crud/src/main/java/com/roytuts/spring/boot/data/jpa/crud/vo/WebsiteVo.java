package com.roytuts.spring.boot.data.jpa.crud.vo;

public class WebsiteVo {

	private Integer id;
	private String name;
	private String url;

	public WebsiteVo() {
	}

	public WebsiteVo(Integer id, String name, String url) {
		this.id = id;
		this.name = name;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
