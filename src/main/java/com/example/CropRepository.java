/*
* File: CropRepository.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-11-20
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import java.util.List;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class CropRepository implements Repository<Crop> {
    private final String hostApi;
    public CropRepository(){
        Config config = new Config();
        hostApi = config.getProperty("hostApi");
    }
    public List<Crop> findAll() {
        ResClient client = new ResClient();
        String json = client.get(hostApi + "/crops");
        CropResponse res = ResConvert.toObject(json, CropResponse.class);
        List<Crop> cropList = res.data;
        System.out.println(cropList);
        return cropList;
    }
}
