import React, { Component } from 'react';
import axios from 'axios';
import NavBar from './components/navbar/NavBar';
import DeviceList from './components/devicelist/DeviceList';

class App extends Component {
  render() {
    axios.get('http://localhost:8080/react-wildfly-demo/api/device/devicelist')
    .then(res => console.log(res));
    return (
      <div>
        <NavBar />
        <DeviceList />
      </div>
    );
  }
}

export default App;
