package entities;

public class Cliente {
    private String nome;
    private Caixa caixa;

    public Cliente(String nome, Caixa caixa) {
        this.nome = nome;
        this.caixa = caixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}
