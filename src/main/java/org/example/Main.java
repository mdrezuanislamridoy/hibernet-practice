package org.example;

import org.example.modules.auth.user.entity.Profile;
import org.example.modules.auth.user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try(SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()){
            Session s  = sf.openSession();
            Transaction t= s.beginTransaction();

            // create
//            User user = new User("Ridoy","sbsandelbuzz@gmail.com","Ridoy1234");
//            s.persist(user);

//            Profile profile = new Profile("softvence", "UNISA", 20500.00);

            // update
//            User user = s.find(User.class, 1L);
//            user.setProfile(profile);

//            s.persist(user);

            // get

//            List<User> u = s.createQuery("from User", User.class).list();
//
//            u.forEach(user -> System.out.println(user.getName()+ " "+ user.getEmail()));

            t.commit();

            s.close();
            sf.close();

//            System.out.println("User created successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}