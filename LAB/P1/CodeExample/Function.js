
class Function {

  constructor (newFunction) {
    this.fun = newFunction
  }

  evaluate (value1, value2) {
    return this.fun.evaluate(value1.evaluate(), value2.evaluate())
  }
}