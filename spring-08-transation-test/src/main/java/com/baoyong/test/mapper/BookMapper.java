package com.baoyong.test.mapper;

import com.baoyong.test.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
public interface BookMapper {
    List<Book> getBooks();

    int insertOne(Book book);

    int delete(@Param("id") String id);
}
