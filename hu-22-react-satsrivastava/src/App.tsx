import React from "react";
import "./App.scss";
import Header from "./component/Header";
import FirstTab from "./container/FirstTab";
import SecondTab from "./container/SecondTab";
import ThirdTab from "./container/ThirdTab";
import ForthTab from "./container/ForthTab";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import { Provider } from "react-redux";
import store from "./store/Store";
import Navbar from "./container/Navbar";
import Sidebar from "./container/Sidebar";


const App: React.FC = () => {
  //this is just for demo purpose, change this router as per your requirement
  return (
    // provider for redux store
  
    <Provider store={store}>

      <Navbar/>
     
      <BrowserRouter>
        <div className="App">
          <Switch>
            {/* <Route exact path="/" component={FirstTab}></Route> */}
            <Route path="/firstTab" exact component={FirstTab} />
            <Route path="/secondTab" component={SecondTab} />
            <Route path="/thirdTab" component={ThirdTab} />
            <Route path="/fourthTab" component={ForthTab} />
          </Switch>
        </div>
        <Sidebar/>
       
      </BrowserRouter>
    </Provider>
  );
};

export default App;
