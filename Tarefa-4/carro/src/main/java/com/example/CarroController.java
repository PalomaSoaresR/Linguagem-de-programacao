package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class CarroController {

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtVelocidade;

    @FXML
    private Button btnProximo;

    @FXML
    private void onBtnProximo(ActionEvent event) throws IOException {
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        int velocidade = Integer.parseInt(txtVelocidade.getText());

        FXMLLoader loader = new FXMLLoader(getClass().getResource("proximo.fxml"));
        Parent proximoParent = loader.load();

        ProximoController proximo = loader.getController();
        proximo.initData(marca, modelo, velocidade);

        Scene proximoScene = new Scene(proximoParent);
        Stage window = (Stage) btnProximo.getScene().getWindow();
        window.setScene(proximoScene);
        window.show();

    }

    public void onBtnLimpar() {
        txtMarca.clear();
        txtModelo.clear();
        txtVelocidade.clear();
    }

}