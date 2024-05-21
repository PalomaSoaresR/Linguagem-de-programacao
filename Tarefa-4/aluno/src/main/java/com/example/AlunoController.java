package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class AlunoController {

    @FXML
    private TextField nomeTextField;
    @FXML
    private TextField idadeTextField;
    @FXML
    private TextField cursoTextField;

    @FXML
    private Button btnCadastrar;

    @FXML
    private void btnCadastrar(ActionEvent event) throws IOException {
        String nome = nomeTextField.getText();
        int idade = Integer.parseInt(idadeTextField.getText());
        String curso = cursoTextField.getText();

        Aluno aluno = new Aluno(nome, idade, curso);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastrar.fxml"));
        Parent resultParent = loader.load();
        CadastroController cadastro = loader.getController();
        cadastro.initData(aluno);
        Scene resultScene = new Scene(resultParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(resultScene);
        window.show();
    }

    @FXML
    public void onBtnLimpar() {
        nomeTextField.clear();
        idadeTextField.clear();
        cursoTextField.clear();
    }
}
