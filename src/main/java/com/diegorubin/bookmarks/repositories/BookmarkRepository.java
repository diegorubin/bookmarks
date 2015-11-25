package com.diegorubin.bookmarks.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diegorubin.bookmarks.pojos.Bookmark;

public interface BookmarkRepository extends MongoRepository<Bookmark, String> {
	
	public Bookmark findByUrl(String url);

}
