package com.spaneos.scb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaneos.scb.dao.ContactDao;
import com.spaneos.scb.pojo.Contact;
@Service
public class ContactServiceImp implements ContactService{
	@Autowired
	private ContactDao contactDao;
	
	@Override
	public boolean createNewContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact getContact(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getContactList() {
		return contactDao.getContactList();
	}

	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
}