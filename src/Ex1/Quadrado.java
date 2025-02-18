package Ex1;

public class Quadrado implements Forma {
    protected int largura;
    protected int altura;

    public Quadrado(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}

