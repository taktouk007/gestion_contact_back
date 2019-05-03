package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entities.Contact;

public interface IContactService {

	Contact save(Contact contact);
	List<Contact> findAll();
	Contact update(Contact contact);
	void delete(Long id);
	Contact findById(Long id);
}
