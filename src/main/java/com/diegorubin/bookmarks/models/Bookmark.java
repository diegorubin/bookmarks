package com.diegorubin.bookmarks.models;

import com.fasterxml.jackson.annotation.JsonView;

public class Bookmark {
	
	@JsonView
	private String url;
	
	public Bookmark(String url) {
		this.url = url;
	}
	
	public String getBookmark() {
		return this.url;
	}

}
