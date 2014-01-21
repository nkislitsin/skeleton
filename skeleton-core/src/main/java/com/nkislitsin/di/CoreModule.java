package com.nkislitsin.di;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.nkislitsin.dao.NoteDao;

/**
 * @author nkislitsin
 *
 */
public class CoreModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(NoteDao.class).in(Singleton.class);
	}

}
