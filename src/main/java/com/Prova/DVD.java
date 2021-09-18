package com.Prova;

public class DVD {

    Diretor diretor;
    Genero genero;
    private String nome;
    protected float valor;

    public DVD(Diretor diretor, Genero genero, String nome, float valor) {
        this.diretor = diretor;
        this.genero = genero;
        if ((nome == null) || (nome.trim().equals(""))){
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
        this.valor = valor;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor <= 0.0f) {
            throw new NullPointerException("O preço tem que ser maior que 0");
        }
        this.valor = valor;
    }

    public String getNomeDiretor() {
        return diretor.getNome();
    }

    public String getGeneroFilme() {
        return genero.getDescricao();
    }
}
