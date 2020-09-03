import React from 'react';
import logo from './logo.svg';
import './App.css';
import CustomersList from './components/customers/customersList';
import 'bootstrap/dist/css/bootstrap.min.css';

import { BrowserRouter, Route, Switch } from 'react-router-dom';
import AppNavBar from './components/pages/AppNavBar';
import HomePage from './components/pages/HomePage';
import CustomerForm from './components/customers/customerForm';
import CustomerDetails from './components/customers/CustomerDetails';



function App() {
  return (
    <div className="container">
      <BrowserRouter>
        <AppNavBar />
        <br />
        <hr />
        <Switch>
          <Route exact path="/" component={HomePage} />
          <Route exact path="/customers" component={CustomersList} />
          <Route exact path="/customers/:id" component={CustomerDetails} />
          <Route path="/new/customers/" component={CustomerForm} />
          <Route path="/customers/:id/edit" component={CustomerForm} />
          
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
