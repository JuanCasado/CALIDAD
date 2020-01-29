
class Function {

  constructor (operation, leftFunction, rightFunction) {
    this.fun = operation
    this.leftFunction = leftFunction
    this.rightFunction = rightFunction 
  }

  evaluate (value) {
    return this.fun.evaluate(this.leftFunction.evaluate(value), this.rightFunction.evaluate(value))
  }
}

module.exports = Function