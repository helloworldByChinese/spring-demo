package com.baoyong.test;

import java.util.*;

/**
 * @author JiangBaoyong
 * @date 2020/07/19
 **/
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;

    private Map<String, String> card;

    private Set<String> games;

    private String wife;

    private Properties properties;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", properties=" + properties +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public Student setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String[] getBooks() {
        return books;
    }

    public Student setBooks(String[] books) {
        this.books = books;
        return this;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public Student setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
        return this;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public Student setCard(Map<String, String> card) {
        this.card = card;
        return this;
    }

    public Set<String> getGames() {
        return games;
    }

    public Student setGames(Set<String> games) {
        this.games = games;
        return this;
    }

    public String getWife() {
        return wife;
    }

    public Student setWife(String wife) {
        this.wife = wife;
        return this;
    }

    public Properties getProperties() {
        return properties;
    }

    public Student setProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
}
