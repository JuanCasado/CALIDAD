
class Integral {
  private double init;
  private double end;
  private double step;
  public Integral (double init, double end, double step){
    this.init = init;
    this.end = end;
    this.step = step;
  }

  public double integrate (Expresion expression) {
    double value = 0;
    for (double i = this.init; i < this.end; i+=this.step){
      value += expression.evaluate(i) * this.step;
    }
    return value;
  }
}