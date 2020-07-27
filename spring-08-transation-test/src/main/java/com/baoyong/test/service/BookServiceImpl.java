package com.baoyong.test.service;

import com.baoyong.test.mapper.BookMapper;
import com.baoyong.test.pojo.Book;

import java.util.List;

/**
 * 实际开发中都会有 接口类 BookService的，因为这样AOP的动态代理就能选择JDK的动态代理，
 *      像我这样直接写就只能使用cglib动态代理
 *      而且实际开发中路径之类的也写在接口类中
 *
 * @author JiangBaoyong
 * @date 2020/07/24
 **/
public class BookServiceImpl {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void testDemo() {
        Book book = new Book("123", "测试新增", 123);
        bookMapper.insertOne(book);
        List<Book> bookList = bookMapper.getBooks();
        bookList.forEach(System.out::println);
        bookMapper.delete("35461c4c-345b-4863-8532-c04c7c114079");
    }

    public void getDemo() {
        Book book = new Book("123", "测试新增", 123);
        bookMapper.insertOne(book);
        List<Book> bookList = bookMapper.getBooks();
        bookList.forEach(System.out::println);
        bookMapper.delete("35461c4c-345b-4863-8532-c04c7c114079");
    }
}
