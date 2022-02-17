package com.mycricbuzz.MyCricBuzz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cricbuzz.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        Person person1=new Person("Kavin","21-May-2000",21,"Chennai");
//        person1.setName("Ishu");
//        person1.setDateOfBirth("16-July-2001");
//		person1.setAge(20);
//		person1.setHomeTown("Madurai");
		
		Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
		
		
		SessionFactory factory=config.buildSessionFactory();
		Session session= factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(person1);
		transaction.commit();
		
    }
}
