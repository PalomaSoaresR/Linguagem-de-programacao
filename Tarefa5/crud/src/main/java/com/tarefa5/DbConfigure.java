package com.tarefa5;

public class DbConfigure {
    private String urlBd;
    private String userBd;
    private String passwordBd;
    private String nameBd;

    public DbConfigure() {
        try {
            this.urlBd = "jdbc:postgresql://localhost:5432/";
            this.userBd = "postgres";
            this.passwordBd = "admin";
            this.nameBd = "bd_aluno";
            
        } catch (Exception e) {
            System.out.println("erro " + e.getMessage());
        }

    } 

    public String getUrlBd() {
        return urlBd;
    }

    public String getUserBd() {
        return userBd;
    }

    public String getPasswordBd() {
        return passwordBd;
    }

    public String getNameBd() {
        return nameBd;
    }

}
