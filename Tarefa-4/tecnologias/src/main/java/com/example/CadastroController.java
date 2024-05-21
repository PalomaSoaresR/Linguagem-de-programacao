package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CadastroController {

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblModelo;

    @FXML
    private Label lblTouch;

    @FXML
    private Button btnVoltar;

    public void initData(String marca, String modelo, String touch) {
        lblMarca.setText(marca);
        lblModelo.setText(modelo);
        lblTouch.setText(touch);
    }

    public void onBtnVoltar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tecnologias.fxml"));
        Parent root = loader.load();
        Scene scene = btnVoltar.getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.setScene(new Scene(root));
    }
}