package com.nkislitsin.di;

import com.google.inject.servlet.ServletModule;
import com.nkislitsin.servlets.TestServlet;

/**
 * @author nkislitsin
 *
 */
public class MainModule extends ServletModule {

	  @Override
	  protected void configureServlets() { 
		  super.configureServlets(); 
		  
		  serve("/test").with(TestServlet.class); 
	  }
}
