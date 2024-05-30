package math_class;

public class Main {
    public static void main(String[] args) {

        double x = 3.14;
        int y = -10;

        double a = Math.max(x, y); // maior valor
        double b = Math.min(x,y); // menor valor
        int c = Math.abs(y); // valor sem sinal negativo
        long d = Math.round(a); // valor arredondado
        double e = Math.ceil(a); // valor arredondado para cima
        double f = Math.floor(a); // valor arredondado para baixo
        double g = Math.sqrt(x); // raiz quadrada

        System.out.println(e);
    }
}