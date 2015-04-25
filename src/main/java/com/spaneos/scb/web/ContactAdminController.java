package com.spaneos.scb.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spaneos.scb.service.ContactService;

/**
 * Servlet implementation class ShowMessageServlet
 */
@Controller("/admin/*")
public class ContactAdminController  {
		@Autowired
		private ContactService contactService;

	

}
