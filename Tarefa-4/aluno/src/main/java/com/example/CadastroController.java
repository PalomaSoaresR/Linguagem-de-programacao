package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

public class CadastroController {

    @FXML
    private Label nomeLabel;
    @FXML
    private Label idadeLabel;
    @FXML
    private Label cursoLabel;
    @FXML
    private Button btnVoltar;

    public void initData(Aluno aluno) {
        nomeLabel.setText(aluno.getNome());
        idadeLabel.setText(String.valueOf(aluno.getIdade())); // Convertendo para
        cursoLabel.setText(aluno.getCurso());

    }

    public void onBtnVoltar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("aluno.fxml"));
        Parent root = loader.load();
        Scene scene = btnVoltar.getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.setScene(new Scene(root));
    }
}