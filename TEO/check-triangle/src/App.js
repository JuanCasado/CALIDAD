import React from 'react';
import './App.css'

import equilatero_acutangulo from './img/equilatero-acutangulo.png';
import escaleno_acutangulo from './img/escaleno-acutangulo.png';
import escaleno_obtusangulo from './img/escaleno-obtusangulo.png';
import escaleno_rectangulo from './img/escaleno-rectangulo.png';
import isosceles_acutangulo from './img/isosceles-acutangulo.png';
import isosceles_obtusangulo from './img/isosceles-obtusangulo.png';
import isosceles_rectangulo from './img/isosceles-rectangulo.png';

import TextField from '@material-ui/core/TextField';
import Grid from '@material-ui/core/Grid';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';

const stateFactory = (stateName, index) => {
  switch(stateName){
    case 'missing-input': return {
      error: true,
      label: 'Missing input',
      help: 'Introduce 3 edge lengths: 5 4 3',
      imageSource: ''
    }
    case 'too-much-input': return {
      error: true,
      label: 'Too much inputs',
      help: 'Introduce only 3 edge lengths: 5 4 3',
      imageSource: ''
    }
    case 'not-enough-input': return {
      error: true,
      label: 'Not enough inputs',
      help: 'Introduce at least 3 edge lengths: 5 4 3',
      imageSource: ''
    }
    case 'no-number': return {
      error: true,
      label: (index? ('Value at position '+index+' '):'Something')+'is not a number',
      help: 'Introduce 3 numeric edge lengths: 5 4 3',
      imageSource: ''
    }
    case 'invalid-number': return {
      error: true,
      label: (index? ('Value at position '+index+' '):'Something')+'is not greater than 0',
      help: 'Introduce 3 numeric edge lengths: 5 4 3',
      imageSource: ''
    }
    case 'no-triangle': return {
      error: true,
      label: 'Values do not creat a triangle',
      help: 'Introduce 3 valid edge lengths: 5 4 3',
      imageSource: ''
    }
    case 'equilatero-acutangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Equilatero Acutangulo',
      imageSource: equilatero_acutangulo
    }
    case 'escaleno-acutangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Escaleno Acutangulo',
      imageSource: escaleno_acutangulo
    }
    case 'escaleno-obtusangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Escaleno Obtusangulo',
      imageSource: escaleno_obtusangulo 
    }
    case 'escaleno-rectangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Escaleno Rectangulo',
      imageSource: escaleno_rectangulo 
    }
    case 'isosceles-acutangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Isosceles Acutangulo',
      imageSource: isosceles_acutangulo 
    }
    case 'isosceles-obtusangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Isosceles Obtusangulo',
      imageSource: isosceles_obtusangulo 
    }
    case 'isosceles-rectangulo': return {
      error: false,
      label: 'Valid triangle',
      help: 'Isosceles Rectangulo',
      imageSource: isosceles_rectangulo 
    }
    default: return null
  }
}

class App extends React.Component {

  constructor (props) {
    super(props)
    this.state = {
      value: '',
      ...stateFactory('missing-input')
    }
    this.handleChange = this.handleChange.bind(this)
  }

  handleChange(event){
    //CLEAR CANVAS
    const canvas = this.refs.canvas
    const ctx = canvas.getContext('2d');
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    //CHECK INPUT
    const value  = event.target.value+''
    this.setState({value:value})//UPDATE INPUT STATE
    if (!value) {
      this.setState(stateFactory('missing-input'))
      return
    }
    const lengthsSTR = value.split(' ').filter(x => x)
    if (lengthsSTR.length !== 3){
      if (lengthsSTR.length > 3){
        this.setState(stateFactory('too-much-input'))
        return
      }
      if (lengthsSTR.length < 3){
        this.setState(stateFactory('not-enough-input'))
        return
      }
    }
    for (let i in lengthsSTR) {
      if (!lengthsSTR[i] || isNaN(lengthsSTR[i])) {
        this.setState(stateFactory('no-number', Number(i)+1))
        return
      }
    }
    let lengths = []
    for (let length of lengthsSTR){
      lengths.push(Number(length))
    }
    for (let i in lengths){
      if (lengths[i] <= 0){
        this.setState(stateFactory('invalid-number', Number(i)+1))
        return
      }
    }
    if (lengths[0] + lengths[1] <= lengths[2] || lengths[0] + lengths[2] <= lengths[1] || lengths[1] + lengths[2] <= lengths[0]){
      this.setState(stateFactory('no-triangle'))
      return
    }

    //DRAW TRIANGLE

    const dpi = window.devicePixelRatio;
    const style_height = +getComputedStyle(canvas).getPropertyValue("height").slice(0, -2);
    const style_width = +getComputedStyle(canvas).getPropertyValue("width").slice(0, -2);
    canvas.setAttribute('height', style_height * dpi);
    canvas.setAttribute('width', style_width * dpi);

    const scaleFactor = 80
    const R1=lengths[0]*scaleFactor, R2=lengths[1]*scaleFactor, R3=lengths[2]*scaleFactor;
    const Ax=0, Ay=0;
    const Bx=R3, By=0;
    const Cx=(R2*R1+R3*R3-R1*R1)/(2*R3);
    const Cy=Math.sqrt(R2*R2-Cx*Cx);
    const Ox = canvas.width / 2 - Bx/2;
    const Oy = canvas.height / 2 + Cy/2;
    ctx.beginPath();
    ctx.moveTo(Ox+Ax, Oy-Ay);
    ctx.lineTo(Ox+Bx, Oy-By);
    ctx.lineTo(Ox+Cx, Oy-Cy);
    ctx.closePath();
    ctx.fillStyle="gold"; ctx.lineWidth=2;
    ctx.stroke(); ctx.fill();

    //CALCULATE TRIANGLE TYPE

    if (lengths[0] === lengths[1] && lengths[0] === lengths[2]){
      this.setState(stateFactory('equilatero-acutangulo'))
      return
    }
    const edge = (lengths[0] !== lengths[1] && lengths[0] !== lengths[2] && lengths[1] !== lengths[2])? 'escaleno':'isosceles'
    const angles = [
      Math.acos((Math.pow(lengths[0],2) - Math.pow(lengths[1],2) - Math.pow(lengths[2],2)) / (-2*lengths[1]*lengths[2])),
      Math.acos((Math.pow(lengths[1],2) - Math.pow(lengths[0],2) - Math.pow(lengths[2],2)) / (-2*lengths[0]*lengths[2])),
      Math.acos((Math.pow(lengths[2],2) - Math.pow(lengths[1],2) - Math.pow(lengths[0],2)) / (-2*lengths[1]*lengths[0]))
    ]
    for (let angle of angles){
      if (angle > 1.5708){
        this.setState(stateFactory(edge+'-obtusangulo'))
        return
      }
    }
    for (let angle of angles){
      if (angle > 1.57075){
        this.setState(stateFactory(edge+'-rectangulo'))
        return
      }
    }
    this.setState(stateFactory(edge+'-acutangulo'))
  }

  render () {
    return (
      <Grid container spacing={0}>
        <Grid item xs={40}>
          <TextField
            error={this.state.error}
            label={this.state.label}
            helperText={this.state.help}
            variant='filled'
            onChange={this.handleChange}
            value={this.state.value}
          />
          <h1>{'Examples:'}</h1>
          <List component="nav" className="triangle-list">
            <ListItem button onClick={()=>{this.handleChange({target:{value:'2 2 2'}})}}>
              <ListItemText inset primary='Equilatero acutangulo: 2 2 2'/>
            </ListItem>
            <ListItem button onClick={()=>{this.handleChange({target:{value:'4 5 6'}})}}>
              <ListItemText inset primary='Escaleno acutangulo: 4 5 6'/>
            </ListItem>
            <ListItem button onClick={()=>{this.handleChange({target:{value:'4 5 8'}})}}>
              <ListItemText inset primary='Escaleno obtusangulo: 4 5 8'/>
            </ListItem>
            <ListItem button onClick={()=>{this.handleChange({target:{value:'3 4 5'}})}}>
              <ListItemText inset primary='Escaleno rectangulo: 3 4 5'/>
            </ListItem>
            <ListItem button onClick={()=>{this.handleChange({target:{value:'5 5 3'}})}}>
              <ListItemText inset primary='Isosceles acutangulo: 5 5 3'/>
            </ListItem>
            <ListItem button onClick={()=>{this.handleChange({target:{value:'3 3 5'}})}}>
              <ListItemText inset primary='Isosceles obtusangulo: 3 3 5'/>
            </ListItem>
            <ListItem button onClick={()=>{this.handleChange({target:{value:'5 5 7.071'}})}}>
              <ListItemText inset primary='Isosceles rectangulo: 5 5 7.071'/>
            </ListItem>
          </List>
          {this.state.error? null:<img src={this.state.imageSource} alt={'triangle'} />}
        </Grid>
        <Grid item xs={60}>
          <canvas ref='canvas' className='canvas'></canvas>
        </Grid>
      </Grid>
    );
  }
}

export default App;
