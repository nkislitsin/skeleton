package com.nkislitsin.entity;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.nkislitsin.enums.NoteType;

/**
 * @author nkislitsin
 *
 */

@Entity
@Cache
public class Note {

	@Id
	private Long id;
	@Index
	private String name;
	private String text;
	@Index
	private NoteType type;
	
	@SuppressWarnings("unused")
	private Note(){}
	
	public Note(Long id, String name, String text, NoteType type) {
		this.id = id;
		this.name = name;
		this.text = text;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public NoteType getType() {
		return type;
	}

	public void setType(NoteType type) {
		this.type = type;
	}

}
