package com.mb.example.hibernate.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.GenerationType
import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode
import javax.persistence.Table
import javax.persistence.Column

@ToString
@EqualsAndHashCode
@Entity
@Table(name="Book")
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column(name="author")
    String author

    @Column(name="title")
    String title
}
