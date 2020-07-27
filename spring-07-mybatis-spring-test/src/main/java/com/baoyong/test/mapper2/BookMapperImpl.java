package com.baoyong.test.mapper2;

import com.baoyong.test.pojo.Book;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
public class BookMapperImpl implements BookMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    @Override
    public List<Book> getBooks() {
        BookMapper bookMapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return bookMapper.getBooks();
    }
}
