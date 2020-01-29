
const Add = require('./Add.js')
const Sub = require('./Sub.js')
const Mul = require('./Mul.js')
const Div = require('./Div.js')
const Exp = require('./Exp.js')
const Function = require('./Function.js')
const Constant = require('./Constant.js')
const Variable = require('./Variable.js')

function I (required, v1, v2, v3) {
  switch(required) {
    case '+': return new Add()
    case '-': return new Sub()
    case '*': return new Mul()
    case '/': return new Div()
    case '^': return new Exp()
    case 'f': return new Function(v1, v2, v3)
    case 'c': return new Constant(v1)
    case 'x': return new Variable()
  }
}

module.exports = I