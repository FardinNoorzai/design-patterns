package com.example.designpatterns.patterns.iterator;

public interface Container<T>{
    Iterator<T> createIterator();
}
