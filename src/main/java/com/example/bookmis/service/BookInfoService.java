package com.example.bookmis.service;

import com.example.bookmis.dao.BookInfoRepository;
import com.example.bookmis.entity.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoRepository bookInfoRepository;

    public BookInfo getByid(String bookId){
        return bookInfoRepository.findById(bookId).get();
    }

    public List<BookInfo> findAll(){
        return bookInfoRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public BookInfo modifyInfo(BookInfo book){
        return bookInfoRepository.save(book);
    }
}
