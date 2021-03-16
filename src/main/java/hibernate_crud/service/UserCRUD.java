package hibernate_crud.service;

import hibernate_crud.model.User;
import hibernate_crud.util.HibernateUtil;
import org.hibernate.Session;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class UserCRUD {


    public void save(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.flush();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.flush();
        session.close();
    }

    public List<User> getAllUsers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(User.class).list();
    }

    public User getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        return user;
    }


}
