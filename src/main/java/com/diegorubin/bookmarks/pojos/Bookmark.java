package com.diegorubin.bookmarks.pojos;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.data.annotation.Id;

public class Bookmark {

	@Id
	private String id;
	
	@JsonView
	private String url;
	
	public String getUrl() {
		return this.url;
	}

}
