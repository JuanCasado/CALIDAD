
public class Constant implements Expresion {
  private double value;
  public Constant (double value){
    this.value = value;
  }
  public double evaluate() {
    return value;
  }
  public double evaluate(double notUse) {
    return this.evaluate();
  }
}