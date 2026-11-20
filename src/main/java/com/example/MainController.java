/*
* File: MainController.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-11-20
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TableView<Crop> cropTable;

    @FXML
    private TableColumn<Crop, Boolean> forageCol;

    @FXML
    private TableColumn<Crop, Integer> idCol;

    @FXML
    private TableColumn<Crop, String> nameCol;

    @FXML
    private TableColumn<Crop, Integer> quantityCol;

    @FXML 
    private void initialize(){
        initCols();
        initTable();

    }
    private void initCols(){
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        forageCol.setCellValueFactory(new PropertyValueFactory<>("forage"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    private void initTable(){
        CropRepository cropRep = new CropRepository();
        List<Crop> cropList = cropRep.findAll();
        cropTable.getItems().addAll(cropList);
    }

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML private javafx.scene.control.Button exitButton;

    @FXML
    void onClickExitButton(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

}
