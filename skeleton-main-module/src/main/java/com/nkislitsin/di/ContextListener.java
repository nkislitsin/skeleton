package com.nkislitsin.di;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * @author nkislitsin
 *
 */
public class ContextListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new EndpointsModule(), new MainModule(), new CoreModule());
	}

}
