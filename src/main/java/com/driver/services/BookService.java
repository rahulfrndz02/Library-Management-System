package com.driver.services;

import com.driver.models.Author;
import com.driver.models.Book;
import com.driver.repositories.AuthorRepository;
import com.driver.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Slf4j //for logs
public class BookService {

    @Autowired
    BookRepository bookRepository2;

    public void createBook(Book book){
        bookRepository2.save(book);
    }

    public List<Book> getBooks(String genre, boolean available, String author){
        //find the elements of the list by yourself
        if(genre != null && author != null){
            return bookRepository2.findBooksByGenreAuthor(genre, author, available);
        }else if(genre != null){
            return bookRepository2.findBooksByGenre(genre, available);
        }else if(author != null){
            return bookRepository2.findBooksByAuthor(author, available);
        }else{
            return bookRepository2.findByAvailability(available);
        }
    }
}
