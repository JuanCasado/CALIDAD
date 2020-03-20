
public class Main {
  public static void main(String[] args) {
    Factory I = new Factory();
    Integral integral = new Integral(0, 10, 0.00001);
    // ((2+5*x+2^x)/(x+2))+5
    Expresion expression = I.f(I.o('+'), I.f(I.o('/'), I.f(I.o('+'), I.c(2), I.f(I.o('+'), I.f(I.o('*'), I.c(5), I.x()), I.f(I.o('^'), I.c(2), I.x()))), I.f(I.o('+'), I.x(), I.c(2))), I.c(5));
    System.out.println(integral.integrate(expression));
  }
}
