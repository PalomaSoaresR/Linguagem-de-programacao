package com.tarefa5;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AtualizarController implements Initializable {

    @FXML
    private ComboBox<String> cbAlunos;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtCurso;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnAtualizar;

    @FXML
    private Button btnVoltar;

    private DadosAlunos ddAlunos = new DadosAlunos();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadAlunos();

        cbAlunos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                loadAlunoDetails(newValue);
            }
        });
    }

    private void loadAlunos() {
        ObservableList<String> alunos = ddAlunos.alunoList();
        cbAlunos.setItems(alunos);
    }

    private void loadAlunoDetails(String nomeAluno) {
        Aluno aluno = ddAlunos.getAlunoByName(nomeAluno);
        if (aluno != null) {
            txtNome.setText(aluno.getNome());
            txtIdade.setText(Integer.toString(aluno.getIdade()));
            txtCurso.setText(aluno.getCurso());
        } else {
            clearFields(); 
        }
    }

    @FXML
    private void handleBtnAtualizar() {
        String nomeAluno = cbAlunos.getValue();
        Aluno alunoAtual = ddAlunos.getAlunoByName(nomeAluno);

        if (alunoAtual != null) {
            int idAluno = alunoAtual.getId();
            String novoNome = txtNome.getText();
            int novaIdade = Integer.parseInt(txtIdade.getText());
            String novoCurso = txtCurso.getText();
            String nomeAntigo = txtNome.getText();
            boolean dadosAlterados = !novoNome.equals(alunoAtual.getNome())
                    || novaIdade != alunoAtual.getIdade()
                    || !novoCurso.equals(alunoAtual.getCurso());

            if (!dadosAlterados) {
                showAlert(Alert.AlertType.INFORMATION, "Informação", "Nada alterado.");
            } else {
                ddAlunos.update(nomeAntigo, novoNome, novaIdade, novoCurso);
                clearFields(); 
                loadAlunos(); 
            }
        } else {
            showAlert(Alert.AlertType.WARNING, "Aviso", "Nenhum aluno selecionado para atualizar.");
        }
    }

    @FXML
    private void handleBtnExcluir() {
        String nomeAluno = cbAlunos.getValue();
        Aluno alunoParaExcluir = ddAlunos.getAlunoByName(nomeAluno);
        
        if (alunoParaExcluir != null) {
            int idAluno = alunoParaExcluir.getId();
            ddAlunos.delete(nomeAluno);
            clearFields();
            loadAlunos();
        } else {
            showAlert(Alert.AlertType.WARNING, "Aviso", "Nenhum aluno selecionado para excluir.");
        }
    }

    private void clearFields() {
        txtNome.setText("");
        txtIdade.setText("");
        txtCurso.setText("");
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
