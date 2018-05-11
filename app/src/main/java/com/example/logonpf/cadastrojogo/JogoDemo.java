package com.example.logonpf.cadastrojogo;

public class JogoDemo {

    private String nome;
    private String genero;
    private int anoLancamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JogoDemo jogoDemo = (JogoDemo) o;

        if (anoLancamento != jogoDemo.anoLancamento) return false;
        if (nome != null ? !nome.equals(jogoDemo.nome) : jogoDemo.nome != null) return false;
        return genero != null ? genero.equals(jogoDemo.genero) : jogoDemo.genero == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        result = 31 * result + anoLancamento;
        return result;
    }

    @Override
    public String toString() {
        return "JogoDemo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
