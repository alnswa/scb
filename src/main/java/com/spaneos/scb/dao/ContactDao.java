package com.spaneos.scb.dao;

import java.util.List;

import com.spaneos.scb.pojo.Contact;

public interface ContactDao{
	boolean createNewContact(Contact contact);
	boolean deleteContact(int cid);
	Contact getContact(int cid);
	boolean updateContact(Contact contact);
	List<Contact> getContactList();

}