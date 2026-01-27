package com.bookStore.service;


import com.bookStore.entity.Book;
import com.bookStore.entity.RequestDTO;
import com.bookStore.entity.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DTOMapper {

    public Book getBookFromDTO(RequestDTO request, BookService bookService) {
        Book newBook = new Book();
        newBook.setTitle(request.getTitle());
        newBook.setAuthor(request.getAuthor());
        newBook.setPrice(request.getPrice());
        return newBook;
    }


    public ResponseDTO getDTOFromBook(Book book ){
        return new ResponseDTO(book);
    }
    public ResponseDTO getDTOFromId(Long id, BookService bookService){
        return new ResponseDTO(bookService.findBookById(id));
    }
    public List<ResponseDTO> getAllDTO(List<Book> books){
        ArrayList<ResponseDTO> responseDTOs= new ArrayList<>();
        for (Book book:books){
            responseDTOs.add(getDTOFromBook(book));
        }
        return responseDTOs;
    }
}
