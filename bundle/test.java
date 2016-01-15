package com.test.core.servlets;

import java.io.IOException;

import javax.jcr.Session;
import javax.servlet.ServletException; 

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.jcr.api.SlingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;


/*
 * Servlet for "Convert JSAM to CQAM" using selector JSAMToCQAM .
 * @author Phool Chandra 
 * @created on January 2015
 * Notes:
 */
 

@SlingServlet(
		description = "Servlet which crate a copy of JSAM to CQAM",
		methods = { "GET", "POST" },
		resourceTypes = { "sling/servlet/default" },
		extensions = { "html" },
		label = "No, really. THIS is the only Servlet you will ever need...",
		metatype = true,
		name = "com.att.myatt.core.servlets.JSAMToCQAM",
		generateService = true,
		generateComponent = true,
		selectors = { "JSAMToCQAM" }
		)

public class JSAMToCQAM extends SlingAllMethodsServlet{
	
    
    private static final Logger LOGGER = LoggerFactory.getLogger(JSAMToCQAM.class);
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException,	IOException {
		//Session jcrSession=request.getResourceResolver().adaptTo(Session.class);
		PageManager pageManger=request.getResourceResolver().adaptTo(PageManager.class);
		Resource resource=request.getResource();
		//resolve(HttpServletRequest request) 
		LOGGER.error("This is starting ponint of JSAMToCQAM Servlet--"+resource.getPath());	
		
		
	}
	public void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
