package com.diegorubin.bookmarks.models;

import org.junit.Before;
import org.junit.Test;

import com.diegorubin.bookmarks.test.Fixtures;

import br.com.six2six.fixturefactory.Fixture;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookmarkTest {
	
	/* attributes tests */
	private Bookmark bookmark;
	private final String aTitle = "a Title";
	private final String aUrl = "http://diegorubin.com";
	
	@Before
	public void setUp() {
		Fixtures.createBookmarkTemplates();
		bookmark = Fixture.from(Bookmark.class).gimme("valid");
	}
	
	@Test
	public void shouldHaveTitle() {
		assertThat(bookmark.getTitle(), is(aTitle));
	}
	
	@Test
	public void shouldHaveUrl() {
		assertThat(bookmark.getUrl(), is(aUrl));
	}
	
	@Test
	public void shouldHaveEmptyTagList() {
		assertThat(bookmark.getTags().isEmpty(), is(true));
	}
	
	@Test
	public void shouldHaveTagList() {
		assertThat(bookmark.getTags().isEmpty(), is(true));
	}

}
