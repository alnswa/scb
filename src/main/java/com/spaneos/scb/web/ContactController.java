package com.spaneos.scb.web;
import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spaneos.scb.pojo.Contact;
import com.spaneos.scb.service.ContactService;

/**
 * Servlet implementation class ShowMessageServlet
 */
@Controller
public class ContactController  {
		@Autowired
		private ContactService contactService;
		
		@RequestMapping(value={"/viewcontacts"},method=RequestMethod.GET)
		public String viewContacts(Model model){
			System.out.println("Contact Service"+contactService);
			List<Contact> contactList=contactService.getContactList();
			model.addAttribute("contactList", contactList);
			return "viewcontacts";
		}
		@RequestMapping(value={"/addcontactform","/addnewcontactform"})
		public String addContactForm(){
			return "addcontactform";
		}
		
		@RequestMapping(value={"/addcontact"},method=RequestMethod.POST)
		public String addContact(@ModelAttribute("contact") Contact contact){
			
			return "addcontactform";
		}
		
		public ContactService getContactService() {
			return contactService;
		}

		public void setContactService(ContactService contactService) {
			this.contactService = contactService;
		}

}
