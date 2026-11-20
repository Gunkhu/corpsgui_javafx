/*
* File: Config.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-11-20
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config extends Properties {
    private final String fileName = "config.properties";
    
    public Config(){
        init();
    }
    
    private void init(){
        try {
            tryInit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tryInit()throws IOException{
        InputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
    }
}
