package com.driver.services;

import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository1;

    public void create(Author author){
        //try{
            authorRepository1.save(author);
        //}
//        catch (Exception e){
//            log.info("createAuthor has caused an error");
//            return "Create author didn't work";
//        }
//        return "Author created successfully";
    }
}
