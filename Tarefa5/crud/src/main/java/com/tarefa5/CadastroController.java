package com.tarefa5;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class CadastroController {

   
    @FXML
    private TextField nomeField;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField cursoField;

    private DadosAlunos alunoModel;


    @FXML
    private void handleCadastrar() {
        alunoModel = new DadosAlunos();
        String nome = nomeField.getText();
        String idadeText = idadeField.getText();
        String curso = cursoField.getText();

        if (nome.isEmpty() || idadeText.isEmpty() || curso.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Erro de Validação", "Por favor, preencha todos os campos.");
            return;
        }

        int idade;
        try {
            idade = Integer.parseInt(idadeText);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Erro de Validação", "Idade deve ser um número inteiro.");
            return;
        }

        alunoModel.create(nome, idade, curso);
        clear();
    }
    
    private void clear() {
        nomeField.setText("");
        idadeField.setText("");
        cursoField.setText("");
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }    
    
    @FXML
    public void onBtnVoltar(ActionEvent event) throws IOException {
        App.setRoot("telaInicial");
    }
}
