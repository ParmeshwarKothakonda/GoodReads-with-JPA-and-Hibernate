package com.example.goodreads.repository;

import com.example.goodreads.model.Book;
import org.springframework.data.jpa.repository.JpaRepository; //importing Jpa Repository
import org.springframework.stereotype.Repository;

@Repository
public interface BookJpaRepository extends JpaRepository<Book,Integer>{

}