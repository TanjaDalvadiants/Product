package ru.netology.javaqa.javaqamvn.repository;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String msg) {
        super(msg);

    }
}
