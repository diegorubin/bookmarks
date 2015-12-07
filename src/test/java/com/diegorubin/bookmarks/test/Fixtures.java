package com.diegorubin.bookmarks.test;

import com.diegorubin.bookmarks.models.Bookmark;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class Fixtures {
	
	public static void createBookmarkTemplates() {
		Fixture.of(Bookmark.class).addTemplate("valid", new Rule(){{
			add("title", "a Title");
			add("url", "http://diegorubin.com");
		}});
	}

}
