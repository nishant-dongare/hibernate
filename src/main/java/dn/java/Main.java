package dn.java;

import org.hibernate.cfg.Configuration;

import dn.java.one2many.One2Many;
import dn.java.one2one.One2One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(dn.java.one2one.Question.class);
        configuration.addAnnotatedClass(dn.java.one2one.Answer.class);
        configuration.addAnnotatedClass(dn.java.one2many.Question125.class);
        configuration.addAnnotatedClass(dn.java.one2many.Answer125.class);
        // Create Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // Initialize Session Object
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        // session.save(new One2One().getQuestion());
        session.save(new One2Many().getQuestion());

        t.commit();

    }
}