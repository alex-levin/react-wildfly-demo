import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

class App extends Component {
  render() {
    axios.get('http://localhost:8080/react-wildfly-demo/api/device/devicelist')
    .then(res => console.log(res));
    return (
      <div className="App">
        Hello
      </div>
    );
  }
}

export default App;
