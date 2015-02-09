package com.spaneos.scb.service;

import java.util.List;

import com.spaneos.scb.pojo.Contact;

public interface ContactService{
	boolean createNewContact(Contact contact);
	boolean deleteContact(int cid);
	Contact getContact(int cid);
	boolean updateContact(Contact contact);
	List<Contact> getContactList();

}