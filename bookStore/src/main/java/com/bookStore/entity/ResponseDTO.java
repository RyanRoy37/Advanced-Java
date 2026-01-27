package com.bookStore.entity;

import lombok.Data;

@Data
public class ResponseDTO {

    private String bookName;
    private Long bookId;

    public ResponseDTO(Book book){
        this.bookName=book.getTitle();
        this.bookId=book.getId();
    }
}
