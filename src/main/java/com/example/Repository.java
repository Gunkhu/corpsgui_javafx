/*
* File: Repository.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-11-20
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import java.util.List;

public interface Repository<T> {
    public List<T> findAll();
}
