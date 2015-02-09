package com.spaneos.scb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spaneos.scb.pojo.Contact;
@Repository
public class ContactDaoImp implements ContactDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

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
		List<Contact> contactList = new ArrayList<Contact>();
		contactList = jdbcTemplate.query("select * from contact",
				new RowMapper<Contact>() {

					@Override
					public Contact mapRow(ResultSet rs, int count)
							throws SQLException {
						Contact contact = new Contact();
						int cid = rs.getInt("cid");
						String fname = rs.getString("fullname");
						String mobile = rs.getString("mobile");
						String email = rs.getString("email");
						contact.setCid(cid);
						contact.setFullName(fname);
						contact.setEmail(email);
						contact.setMobile(mobile);
						return contact;
					}
				});

		return contactList;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}