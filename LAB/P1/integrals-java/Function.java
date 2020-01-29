
class Function implements Expresion{
  private Operation operation;
  private Expresion leftExpresion;
  private Expresion rightExpresion;
  public Function (Operation operation, Expresion leftExpresion, Expresion rightExpresion) {
    this.operation = operation;
    this.leftExpresion = leftExpresion;
    this.rightExpresion = rightExpresion;
  }

  public double evaluate (double value) {
    return operation.evaluate(leftExpresion.evaluate(value), rightExpresion.evaluate(value));
  }
}