package br.com.gaia.admin.model;

public class Usuario {
    private String nome;
    private String cargo;
    private String email;
    private String senha;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public Usuario(String nome, String cargo, String email, String senha, boolean ativo) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }
}
