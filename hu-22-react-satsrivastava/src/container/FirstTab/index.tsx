import {  Button, Container,Typography } from "@mui/material";
import "./index.scss";
import { Link,useHistory } from "react-router-dom";
import type {FormEvent,} from "react"


  const FirstTab = () => {
    
    let history=useHistory();
const sendForm=async(event:FormEvent<HTMLFormElement>)=>{
  event.preventDefault()
  const{first,last,password,pan,date}=event.target as typeof event.target &{
    first:{value:string}
    last:{value:string}
    pan:{value:string}
    password:{value:string}
    date:{value:string}
  }
//console.log(name.value,password.value)
  let result=await fetch("/https://stock-marketplace-urtjok3rza-wl.a.run.app/auth/signUp",{
    headers:{
      "Content-Type":"application/json"
    },
    method:"POST",
    body: JSON.stringify({
      first: first.value,
      last: last.value,
      pan: pan.value,
      date: date.value,
      password:password.value,
    })
  })
  result=await result.json()
  localStorage.setItem("user-info",JSON.parse(JSON.stringify(result)));
  history.push("/ThirdTab");
}

  return (

    <Container fixed>
    <div className="first-tab-container">
      <div className="posts-container" style={{ backgroundColor: "white" }}>
        <div id="circle"></div>
      
        <h1 className="test">Sign up</h1>
        <p className="test">Welcome to smart investment</p>
        <form className="wrap" onSubmit={sendForm}>

        <fieldset className="field-area">
            <label htmlFor="text"></label>
            <input type="text" id="first" placeholder="Firstname"/>
          </fieldset>

          <fieldset className="field-area">
            <label htmlFor="text"></label>
            <input type="text" id="Last" placeholder="Lastname"/>
          </fieldset>

          <fieldset className="field-area">
            <label htmlFor="text"></label>
            <input type="text" id="email" placeholder="email"/>
          </fieldset>

          <fieldset className="field-area">
            <label htmlFor="date"></label>
            <input type="date" id="birth" placeholder="Birthday"/>
          </fieldset>
          <fieldset className="field-area">
            <label htmlFor="PAN"></label>
            <input type="text" id="pan" placeholder="PAN"/>
          </fieldset>

          <fieldset className="field-area">
            <label htmlFor="text"></label>
            <input type="number" id="mobile" placeholder="Mobile no."/>
          </fieldset>
          <fieldset className="field-area">
            <label htmlFor="password"></label>
            <input type="password" id="password" placeholder="password"/>
          </fieldset>

        <Button  id="button" type="submit">Sign up</Button>
          </form>
          <Typography variant="caption" id="para">Already registered?<Link href="#" to="/SecondTab"><b>{"Sign up"}</b></Link></Typography>
        </div>
        </div>
        </Container>
  );
};

//export default connect(mapStateToProps, { getPosts, resetPosts })(FirstTab);

 export default FirstTab;

