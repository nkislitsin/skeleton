package com.nkislitsin.di;

import java.util.HashSet;
import java.util.Set;

import com.google.api.server.spi.guice.GuiceSystemServiceServletModule;
import com.nkislitsin.endpoints.NoteEndpoint;

/**
 * @author nkislitsin
 *
 */
public class EndpointsModule extends GuiceSystemServiceServletModule {
	  @Override
	  protected void configureServlets() {
	    super.configureServlets();

	    Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
	    serviceClasses.add(NoteEndpoint.class);
	    this.serveGuiceSystemServiceServlet("/_ah/spi/*", serviceClasses);
	  }
}
