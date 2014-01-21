package com.nkislitsin.endpoints;

import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.nkislitsin.dao.NoteDao;
import com.nkislitsin.di.CoreModule;
import com.nkislitsin.entity.Note;
import com.nkislitsin.enums.NoteType;

/**
 * @author nkislitsin
 *
 */
public class NoteEndpointTest {
	private static final long NOTE_ID = 100L;
	
	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(
			new LocalDatastoreServiceTestConfig());
	
	private Injector i = Guice.createInjector(new CoreModule());
	
	private NoteEndpoint endpoint;

	@Before
	public void setUp() {
		helper.setUp();
		
		NoteDao noteDao = i.getInstance(NoteDao.class);
		Note note = new Note("name", "text", NoteType.PRIVATE);
		note.setId(NOTE_ID);
		noteDao.save(note);
		
		endpoint = new NoteEndpoint(noteDao);
	}

	@After
	public void tearDown() {
		helper.tearDown();
	}

	@Test
	public void run() {
		Note note = endpoint.getNote(NOTE_ID);
		
		assertNotNull(note);
	}
}
