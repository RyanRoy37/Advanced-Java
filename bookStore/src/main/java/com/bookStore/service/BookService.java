package com.bookStore.service;


import com.bookStore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    Book createBook(Book book);
    Book updateBook(Book book);
    List<Book> findAllBooks();
    Book findBookById(Long id);
    void deleteBookById(Long id);

}
