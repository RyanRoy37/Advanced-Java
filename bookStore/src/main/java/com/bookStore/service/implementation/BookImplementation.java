package com.bookStore.service.implementation;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import com.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book){
        Book existingBook = findBookById(book.getId());
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());
        return bookRepository.save(existingBook);
    }

    @Override
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(Long id){
        return bookRepository.findById(id).get();
    }

    @Override
    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }

}
