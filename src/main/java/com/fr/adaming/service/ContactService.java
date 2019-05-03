package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entities.Contact;
import com.fr.adaming.repository.IContactRepo;

@Service
public class ContactService implements IContactService{

	@Autowired
	IContactRepo contactRepo;
	
	@Override
	public Contact save(Contact contact) {
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> findAll() {
		return contactRepo.findAll();
	}

	@Override
	public Contact update(Contact contact) {
		return contactRepo.save(contact);
	}

	@Override
	public void delete(Long id) {
		contactRepo.deleteById(id);
	}

	@Override
	public Contact findById(Long id) {
		return contactRepo.getOne(id);
	}

}
