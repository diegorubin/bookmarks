package com.diegorubin.bookmarks.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;

public class Bookmark {

	@Id
	private String id;
	
	@JsonView
	private String url;
	
	@JsonView
	private String title;
	
	@JsonView
	private Optional<List<String>> tags = Optional.empty();
	
	public String getUrl() {
		return this.url;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public List<String> getTags() {
		return tags.orElse(new ArrayList<String>());
	}
	
}
