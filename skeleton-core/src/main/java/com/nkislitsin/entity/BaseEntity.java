package com.nkislitsin.entity;

import java.util.Date;

import com.googlecode.objectify.annotation.Index;

/**
 * @author nkislitsin
 *
 */
public class BaseEntity {
	
	private Date created;
	private Date lastModified;
	@Index
	private String author;
	
	public BaseEntity(String author, Date created){
		this.created = created;
		this.lastModified = created;
		this.author = author;
	}
	
	protected BaseEntity(){}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
}
