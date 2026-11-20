package com.example;

import java.util.List;

public interface Repository<T> {
    public List<T> findAll();
}
