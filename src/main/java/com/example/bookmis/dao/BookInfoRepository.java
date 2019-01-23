package com.example.bookmis.dao;

import com.example.bookmis.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * by hokis
 */
@Repository
public interface BookInfoRepository extends JpaRepository<BookInfo,String>,JpaSpecificationExecutor<BookInfo> {

}
