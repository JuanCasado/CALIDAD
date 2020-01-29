

public class Main {
  public static void main(String[] args) {
    Factory I = new Factory();
    Integral integral = new Integral(0, 10, 0.00001);
    Expresion expression = I.f(I.o('+'), I.c(2), I.f(I.o('+'), I.c(2), I.x()));
    System.out.println(integral.integrate(expression));
  }
}