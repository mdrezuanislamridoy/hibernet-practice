package org.example;

import org.example.modules.auth.user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        try(SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()){
            Session s  = sf.openSession();
            Transaction t= s.beginTransaction();

            User user = new User("Ridoy","sbsandelbuzz@gmail.com","Ridoy1234");
            s.persist(user);

            t.commit();

            s.close();
            sf.close();

            System.out.println("User created successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}