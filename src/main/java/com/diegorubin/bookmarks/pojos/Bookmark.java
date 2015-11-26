package com.diegorubin.bookmarks.pojos;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.data.annotation.Id;

public class Bookmark {

	@Id
	private String id;
	
	@JsonView
	private String url;
	
	@JsonView
	private String title;
	
	public String getUrl() {
		return this.url;
	}
	
	public String getTitle() {
		return this.title;
	}

}
