/*
* File: AboutController.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-11-20
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML 
    void onClickGoBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
