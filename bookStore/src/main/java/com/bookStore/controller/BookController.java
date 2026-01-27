package com.bookStore.controller;


import com.bookStore.entity.Book;
import com.bookStore.entity.RequestDTO;
import com.bookStore.entity.ResponseDTO;
import com.bookStore.service.BookService;
import com.bookStore.service.DTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private DTOMapper dtoMapper;

    @GetMapping("/")
    public String home(){
        return "Server is running";
    }

    @PostMapping("/book")
    public ResponseEntity<ResponseDTO> saveBook(@RequestBody RequestDTO book){
        Book toBeSavedBook=dtoMapper.getBookFromDTO(book, bookService);
        Book savedBook= bookService.createBook(toBeSavedBook);
        return ResponseEntity.ok().body(dtoMapper.getDTOFromBook(savedBook));
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<ResponseDTO> getBookById(@PathVariable Long id) {
       // Book foundBook= bookService.findBookById(id);
        return ResponseEntity.ok().body(dtoMapper.getDTOFromId(id, bookService));
    }

    @GetMapping("/books")
    public ResponseEntity<List<ResponseDTO>> getAllBooks(){
        List<Book> books=bookService.findAllBooks();
        return ResponseEntity.ok().body(dtoMapper.getAllDTO(books));
    }

    @PutMapping("/book")
    public ResponseEntity<ResponseDTO> updateBook(@RequestBody RequestDTO bookDTO){
       // Long savedBookId= book.getId();
        Book toBeUpdatedBook=dtoMapper.getBookFromDTO(bookDTO, bookService);
        Book savedBook=bookService.updateBook(toBeUpdatedBook);
        return ResponseEntity.ok().body(dtoMapper.getDTOFromBook(savedBook));
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
        return "Deleted Book with id: "+id;
    }
}
