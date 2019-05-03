package com.fr.adaming;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.entities.Contact;
import com.fr.adaming.repository.IContactRepo;

@SpringBootApplication
public class Convo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Convo1Application.class, args);
		IContactRepo ict = ctx.getBean(com.fr.adaming.repository.IContactRepo.class);
		
		Contact c1 = new Contact(null, "BENALI", "IBRAHIM", new Date(), "ibrenali@adaming.fr", "21142424", "");
		Contact c2 = new Contact(null, "RENAUDY", "PHILIPPE", new Date(), "ibrenali@adaming.fr", "21142424", "");
		Contact c3 = new Contact(null, "BENSALHA", "MEHDI", new Date(), "ibrenali@adaming.fr", "21142424", "");
		Contact c4 = new Contact(null, "BARAKET", "SAMI", new Date(), "ibrenali@adaming.fr", "21142424", "");
		ict.save(c1);
		ict.save(c2);
		ict.save(c3);
		ict.save(c4);
	}

}
