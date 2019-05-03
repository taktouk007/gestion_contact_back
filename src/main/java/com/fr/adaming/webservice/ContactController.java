package com.fr.adaming.webservice;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Contact;
import com.fr.adaming.service.IContactService;

@CrossOrigin
@RestController
public class ContactController {

	@Autowired
	IContactService contactService;
	
	@PostMapping("/contact/save")
	public Contact save(@RequestBody Contact contact) {
		return contactService.save(contact);
	}
	
	@GetMapping("/contacts")
	public List<Contact> findAll() {
		return contactService.findAll();
	}
	
	@PostMapping("contact/update")
	public Contact update(@RequestBody Contact contact) {
		return contactService.update(contact);
	}
	
	@DeleteMapping("contact/delete/{id}")
	public void delete(@PathVariable Long id) {
		contactService.delete(id);
	}
	
	@GetMapping("contact/{id}")
	public Contact findById(@PathVariable Long id) {
		return contactService.findById(id);
	}
}
