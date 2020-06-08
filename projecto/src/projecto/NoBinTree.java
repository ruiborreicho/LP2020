package projecto;

public class NoBinTree {

    int valor;
    String nome;
    NoBinTree filhoEsquerda;
    NoBinTree filhoDireita;

    // Acessores 
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public NoBinTree getFilhoEsquerda() {
        return filhoEsquerda;
    }
    public void setFilhoEsquerda(NoBinTree filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }
    public NoBinTree getFilhoDireita() {
        return filhoDireita;
    }
    public void setFilhoDireita(NoBinTree filhoDireita) {
        this.filhoDireita = filhoDireita;
    }


    // Construtores
    public NoBinTree(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }

}