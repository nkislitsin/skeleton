package com.nkislitsin.endpoints;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.inject.Inject;
import com.nkislitsin.dao.NoteDao;
import com.nkislitsin.entity.Note;
import com.nkislitsin.enums.NoteType;

/**
 * @author nkislitsin
 *
 */
@Api(name = "skeleton", version = "v1")
public class NoteEndpoint {
	
	private NoteDao noteDao;
	
	@Inject
	public NoteEndpoint(NoteDao noteDao){
		this.noteDao = noteDao;
	}

	public void addNote(Note note) {
		noteDao.save(note);
	}

	public Note getNote(@Named("id") Long id) {
		return noteDao.get(id);
	}
	
	public void deleteNote(@Named("id") Long id) {
		noteDao.delete(id);
	}
	
	public List<Note> listNotes() {
		return noteDao.list();
	}
	
	@ApiMethod(name = "listByType", path="note/listByType")
	public List<Note> listByType(@Named("type") NoteType type) {
		return noteDao.listByProperty("type", type);
	}
	
}
