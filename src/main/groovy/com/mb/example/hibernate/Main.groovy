package com.mb.example.hibernate

import org.springframework.beans.factory.annotation.Autowired
import com.mb.example.hibernate.library.LibraryService
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import com.mb.example.hibernate.domain.Book

class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext('applicationContext.xml');

        LibraryService service = (LibraryService)context.getBean('libraryService')

        service.create(new Book(title: 'Spring rocks', author: 'Miles'))

        println service.list()
    }
}
