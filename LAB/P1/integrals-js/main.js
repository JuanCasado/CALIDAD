
const I = require('./I.js')
const Integral = require('./Integral.js')

const integral = new Integral(0, 10, 0.000001)
const expression = I('f', I('+'), I('c', 2), I('f', I('+'), I('c', 2), I('x')))

console.log(integral.integrate(expression))