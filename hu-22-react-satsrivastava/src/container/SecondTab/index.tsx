import { Container} from "@mui/material";
import { Button, Typography } from "@mui/material";

import "./index.scss";

import type {FormEvent} from "react"
import { Link,useHistory } from "react-router-dom";

const SecondTab = () => {
  let history=useHistory();
  const sendForm=async(event:FormEvent<HTMLFormElement>)=>{
    
    event.preventDefault()
    const{name,password}=event.target as typeof event.target &{
      name:{value:string}
      password:{value:string}
    }
  console.log(name.value,password.value)
  try{
    let res=await fetch("https://stock-marketplace-urtjok3rza-wl.a.run.app/auth/login",{
      headers:{
        "Content-Type":"application/json"
      },
      method:"POST",
      body: JSON.stringify({
        name: name.value,
        password:password.value
      })
    })
    res=await res.json()
    localStorage.setItem("user-info",JSON.parse(JSON.stringify(res)));
    history.push("/ThirdTab");
  }
  catch(e){
  console.log(e);
  }
  }

  return (
    <Container fixed>
    <div className="first-tab-container">
      <div className="posts-container" style={{ backgroundColor: "white" }}>
        <div id="circle"></div>
      
        <h1 className="test">Login</h1>
        <p className="test">Welcome to smart investment</p>
        <form className="wrap" onSubmit={evt=>sendForm(evt)}>

          <fieldset className="field-area">
            <label htmlFor="text"></label>
            <input type="text" id="name" placeholder="Username"/>
          </fieldset>

          <fieldset className="field-area">
            <label htmlFor="password"></label>
            <input type="password" id="password" placeholder="password"/>
          </fieldset>

        <Button  id="button" type="submit">Log in</Button>
          </form>
          <Typography variant="caption" id="para">Don't have account? <Link href="#" to="/FirstTab"><b>{"Sign up"}</b></Link></Typography>
        </div>
        </div>
        </Container>
    
    /*<div className="first-tab-container">
      <Paper
        style={{ backgroundColor: "#efefef", padding: "30px" }}
        className="paper"
        elevation={3}
      >
        <Button variant="text">Text</Button>
        <Button variant="contained">Contained</Button>
        <Button variant="outlined">Outlined</Button>
      </Paper>
    </div>*/
  );
};

export default SecondTab;
