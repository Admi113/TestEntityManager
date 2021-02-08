package web.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

@Repository
public class UserServiceImpl implements UserService{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User doSomething() {
        Session currentSession = sessionFactory.getCurrentSession();
        Session session= sessionFactory.getCurrentSession();
        User user = session.get(User.class,1);
        System.out.println(user);
        return user;
    }
}
