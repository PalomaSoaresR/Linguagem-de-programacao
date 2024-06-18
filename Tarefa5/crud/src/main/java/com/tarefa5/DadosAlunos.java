package com.tarefa5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DadosAlunos {
    
    private DbConnection bd = new DbConnection();

    public void create(String nome, int idade, String curso) {
        Connection conn = null;
        try {
            conn = bd.getConnection();
            String sql = "INSERT INTO alunos (nome_completo, idade, curso) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, curso);
            stmt.executeUpdate();
            showAlert(AlertType.INFORMATION, "Sucesso", "Aluno criado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Erro", "Erro ao criar aluno: " + e.getMessage());
        } finally {
            bd.disconnect(conn);
        }
    }
    public void update(String nomeAntigo, String novoNome, int novaIdade, String novoCurso) {
        Connection conn = null;
        try {
            conn = bd.getConnection();
            String sql = "UPDATE alunos SET nome_completo = ?, idade = ?, curso = ? WHERE nome_completo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, novaIdade);
            stmt.setString(3, novoCurso);
            stmt.setString(4, nomeAntigo);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                showAlert(AlertType.INFORMATION, "Sucesso", "Aluno atualizado com sucesso.");
            } else {
                showAlert(AlertType.WARNING, "Aviso", "Nenhum aluno encontrado com o nome: " + nomeAntigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Erro", "Erro ao atualizar aluno: " + e.getMessage());
        } finally {
            bd.disconnect(conn);
        }
    }
    

    public void delete(String nomeAluno) {
        Connection conn = null;
        try {
            conn = bd.getConnection();
            String sql = "DELETE FROM alunos WHERE nome_completo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeAluno);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                showAlert(AlertType.INFORMATION, "Sucesso", "Aluno deletado com sucesso.");
            } else {
                showAlert(AlertType.WARNING, "Aviso", "Nenhum aluno encontrado com o nome: " + nomeAluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Erro", "Erro ao deletar aluno: " + e.getMessage());
        } finally {
            bd.disconnect(conn);
        }
    }

    public ObservableList<String> alunoList() {
        ObservableList<String> listaAlunos = FXCollections.observableArrayList();
        Connection conn = null;
        try {
            conn = bd.getConnection();
            String sql = "SELECT nome_completo FROM alunos";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nomeAluno = rs.getString("nome_completo");
                listaAlunos.add(nomeAluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Erro", "Erro ao listar alunos: " + e.getMessage());
        } finally {
            if (conn != null) {
                bd.disconnect(conn);
            }
        }
        return listaAlunos;
    }

    public Aluno getAlunoById(int idAluno) {
        Aluno aluno = null;
        Connection conn = null;
        try {
            conn = bd.getConnection();
            String sql = "SELECT * FROM alunos WHERE id_aluno = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_aluno");
                String nomeCompleto = rs.getString("nome_completo");
                int idade = rs.getInt("idade");
                String curso = rs.getString("curso");
                aluno = new Aluno(id, nomeCompleto, idade, curso);
            } else {
                System.out.println("Aluno não encontrado com o ID: " + idAluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao buscar detalhes do aluno: " + e.getMessage());
            showAlert(AlertType.ERROR, "Erro", "Erro ao buscar detalhes do aluno: " + e.getMessage());
        } finally {
            if (conn != null) {
                bd.disconnect(conn);
            }
        }
        return aluno;
    }

    public Aluno getAlunoByName(String nome) {
        Aluno aluno = null;
        Connection conn = null;
        try {
            conn = bd.getConnection();
            String sql = "SELECT * FROM alunos WHERE nome_completo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_aluno");
                String nomeCompleto = rs.getString("nome_completo");
                int idade = rs.getInt("idade");
                String curso = rs.getString("curso");
                aluno = new Aluno(id, nomeCompleto, idade, curso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert(AlertType.ERROR, "Erro", "Erro ao buscar detalhes do aluno: " + e.getMessage());
        } finally {
            bd.disconnect(conn);
        }
        return aluno;
    }

    private void showAlert(AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
