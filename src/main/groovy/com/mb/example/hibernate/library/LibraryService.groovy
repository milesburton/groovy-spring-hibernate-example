package com.mb.example.hibernate.library

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired
import org.hibernate.SessionFactory
import com.mb.example.hibernate.domain.Book
import org.hibernate.Session

@Component
class LibraryService {

    @Autowired
    SessionFactory sessionFactory

    String create(Book book){

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(book);
        book.setId(id);
        session.getTransaction().commit();
        session.close();

        return book;
    }

    List list(){

        Session session = sessionFactory.openSession();

        List book = session.createQuery("from Book").list();
        session.close();

        return book;
    }
}
