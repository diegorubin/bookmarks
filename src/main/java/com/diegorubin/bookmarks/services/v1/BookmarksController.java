package com.diegorubin.bookmarks.services.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegorubin.bookmarks.models.Bookmark;

@RestController
public class BookmarksController {

	@RequestMapping("/api/v1/bookmarks")
	public Bookmark get() {
		return new Bookmark("http://diegorubin.com");
	}
	
}
