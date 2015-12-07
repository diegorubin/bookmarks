package com.diegorubin.bookmarks.services.v1;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.diegorubin.bookmarks.models.Bookmark;
import com.diegorubin.bookmarks.repositories.BookmarkRepository;

@RestController
@RequestMapping("/api/v1/bookmarks")
public class BookmarksController {
	
	@Autowired
	private BookmarkRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Bookmark> get() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Bookmark> post(@RequestBody Bookmark bookmark) {
		repository.save(bookmark);
		return new ResponseEntity<Bookmark>(bookmark, HttpStatus.OK);
	}
	
}
