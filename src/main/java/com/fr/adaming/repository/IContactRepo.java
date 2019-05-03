package com.fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entities.Contact;

@Repository
public interface IContactRepo extends JpaRepository<Contact, Long>{

}
