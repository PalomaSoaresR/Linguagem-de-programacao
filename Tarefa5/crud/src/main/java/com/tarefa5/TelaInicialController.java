package com.tarefa5;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaInicialController {

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnAtualizar;

    @FXML
    public void openCadastrar() throws IOException {
        App.setRoot("cadastrarAluno");
    }
    @FXML
    public void openAtualizar() throws IOException {
        App.setRoot("atualizarAluno");
    }



}
