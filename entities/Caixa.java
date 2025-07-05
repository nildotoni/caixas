package entities;

public class Caixa {
    private String nome;
    private Integer largura;
    private Integer altura;
    private Integer comprimento;

    public Caixa(Integer largura, Integer altura, Integer comprimento, String nome) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.nome = nome;
    }

    public Caixa() {}

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }
}
