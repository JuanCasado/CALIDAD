
class Integral {
  constructor(init, end, step){
    this.init = init
    this.end = end
    this.step = step
  }

  integrate (expression) {
    let integral = 0
    for (let i = this.init; i <= this.end; i+=this.step){
      integral += expression.evaluate(i)*this.step
    }
    return integral
  }

}

module.exports = Integral