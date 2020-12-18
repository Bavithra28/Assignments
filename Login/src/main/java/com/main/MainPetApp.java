package com.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public class MainPetApp {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("com/hcl/pp/config/hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = new User();
        user.setUsername("there");
        user.setUserPassword("Three");
        Pet pet1 = new Pet();
        pet1.setName("JIMMY");
        pet1.setAge(2);
        pet1.setPlace("HYD");
        pet1.setUser(user);
        Pet pet2 = new Pet();
        pet2.setName("JOHNY");
        pet2.setAge(4);
        pet2.setPlace("CHENNAI");
        pet2.setUser(user);
        Set<Pet> pets = new HashSet<Pet>();
        pets.add(pet1);
        pets.add(pet2);
        user.setPets(pets);
        session.save(user);
        transaction.commit();
        session.close();
        factory.close();
	}

}
