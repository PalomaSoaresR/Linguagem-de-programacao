package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class TecnologiasController {

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtTouch;

    @FXML
    private Button btnCadastro;

    @FXML
    private Button btnLimpar;

    public void onBtnCadastrar(ActionEvent event) throws IOException {
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String touch = txtTouch.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastrar.fxml"));
        Parent resultParent = loader.load();

        CadastroController cad = loader.getController();
        cad.initData(marca, modelo, touch);

        Scene resultScene = new Scene(resultParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(resultScene);
        window.show();
    }

    public void onBtnLimpar() {
        txtMarca.clear();
        txtModelo.clear();
        txtTouch.clear();
    }

}