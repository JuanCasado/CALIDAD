
class Factory {
  public Expresion c(double value){
    return new Constant(value);
  }
  public Expresion x(){
    return new Variable();
  }
  public Expresion f(Operation operation, Expresion e1, Expresion e2){
    return new Function(operation, e1, e2);
  }
  public Operation o(char operation){
    switch(operation){
      case '+': return new Add();
      case '-': return new Sub();
      case '*': return new Mul();
      case '/': return new Div();
      case '^': return new Exp();
    }
    return null;
  }
}