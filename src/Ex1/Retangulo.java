package Ex1;

class Retangulo implements Forma {

    //atributos
    protected int largura;
    protected int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public int getArea() {
        return largura * altura;
    }
}


