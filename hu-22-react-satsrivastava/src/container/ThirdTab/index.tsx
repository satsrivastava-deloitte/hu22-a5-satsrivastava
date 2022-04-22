import {Paper,} from "@mui/material";
import "./index.scss";
import {  useEffect,useState } from "react";
import axios from "axios";
import { Grid } from "@mui/material";
const ThirdTab = (props: any) => {
const paperStyle={padding:"30px 20px" ,width:900,margin:"0px 1800px auto 460px"}
 const[niftyindex,setNiftyindex]=useState<any>("");
 <h3>Index</h3>
 useEffect(()=>{
   axios.get("https://stock-marketplace-urtjok3rza-wl.a.run.app/index",{})
     .then((response)=>{
     setNiftyindex(response.data)
   }).catch((error)=>{
     console.log(error);
   });
  },[]);
  return (
    <><Grid>
      <Paper elevation={20} style={paperStyle}>

        <div className="first-tab-container" style={{ backgroundColor: "grey" }}>
          <div className="nifty-ind"> <b>Logo</b> </div>
          <div className="nifty-ind"><b>{niftyindex.index}</b></div>
          <div className="nifty-ind">{Number(niftyindex.normalisedMarketCap).toFixed(2)}</div>
          <div className="niftyitem">{Number(niftyindex.gainLossPercent).toFixed(6)}</div>

        </div>
      </Paper>
    </Grid>
    
    </>
    )
  };

// Using callbacks

export default ThirdTab;

