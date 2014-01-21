package com.nkislitsin.dao;

import com.nkislitsin.entity.Note;

/**
 * @author nkislitsin
 *
 */
public class NoteDao extends ObjectifyGenericDao<Note>{

	public NoteDao() {
		super(Note.class);
	}
	
}
