package Ex1;

public class Main {
    public static void main(String[] args) {
                Forma r = new Retangulo(5,10);
            System.out.println("Área esperada: 5 * 10 = 50, mas retorna: " + r.getArea());

        Forma q = new Quadrado(10,10);
        System.out.println("Área esperada: 10 * 10 = 100, mas retorna: " + q.getArea());
    }
}




