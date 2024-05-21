package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class ProximoController {

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblModelo;

    @FXML
    private Label lblVelocidade;

    @FXML
    private Button btnAcelerar;

    @FXML
    private Button btnFreiar;

    @FXML
    private Button btnVoltar;

    private int velocidade;

    public void initData(String marca, String modelo, int velocidade) {
        lblMarca.setText(marca);
        lblModelo.setText(modelo);
        lblVelocidade.setText(String.valueOf(velocidade));
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @FXML
    private void onBtnAcelerar() throws IOException {
        velocidade += 10;
        atualizarVelocidade();
    }

    @FXML
    private void onBtnFreiar() throws IOException {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
        atualizarVelocidade();

    }

    private void atualizarVelocidade() {
        lblVelocidade.setText(String.valueOf(velocidade));
    }

    public void onBtnVoltar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("carro.fxml"));
        Parent root = loader.load();
        Scene scene = btnVoltar.getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.setScene(new Scene(root));
    }
}