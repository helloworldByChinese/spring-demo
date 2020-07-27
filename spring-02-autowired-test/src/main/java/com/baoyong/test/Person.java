package com.baoyong.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

/**
 * @author JiangBaoyong
 * @date 2020/07/19
 **/
public class Person {
    @Autowired
    private Dog dog;

    @Autowired
    @Nullable
    private Cat cat;

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog getDog() {
        return dog;
    }

    public Person setDog(Dog dog) {
        this.dog = dog;
        return this;
    }

    public Cat getCat() {
        return cat;
    }

    public Person setCat(Cat cat) {
        this.cat = cat;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
