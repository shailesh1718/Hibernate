package com.shailesh;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setsName("Navin");
        s1.setsAge(32);
        /*Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(com.shailesh.Student.class); // if we don't add this then compiler won't identify Student class as persister
        cfg.configure();*/

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.shailesh.Student.class)
                .configure()
                .buildSessionFactory();          //cfg.buildSessionFactory();
        Session session = sf.openSession();

        Student s2 = null;
        s2 = session.get(Student.class,70);
        session.remove(s2);
        Transaction transaction = session.beginTransaction();
        //session.persist(s1); //session.save(s1); before hibernate v6

        //session.merge(s1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println();

    }

}