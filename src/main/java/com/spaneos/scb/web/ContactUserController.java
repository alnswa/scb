package com.spaneos.scb.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spaneos.scb.service.ContactService;

/**
 * Servlet implementation class ShowMessageServlet
 */
@Controller("/user/*")
public class ContactUserController  {
		@Autowired
		private ContactService contactService;

		public ContactService getContactService() {
			return contactService;
		}

		public void setContactService(ContactService contactService) {
			this.contactService = contactService;
		}
	

}
