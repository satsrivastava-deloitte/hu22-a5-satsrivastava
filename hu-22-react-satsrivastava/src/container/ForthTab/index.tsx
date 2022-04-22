import React from "react";
import "./index.scss";

import "./index.scss";
import {  useEffect,useState } from "react";
import axios from "axios";

import { Container } from "@mui/material";

const ForthTab = (props: any) => {
  
  const[values,value]=useState<any>("");
  useEffect(()=>{
    axios.get("https://stock-marketplace-urtjok3rza-wl.a.run.app/stock/fetch-all-stock",{})
      .then((response)=>{
      value(response.data)
    }).catch((error)=>{
      console.log(error);
    });
   },[]);
   return (
     <><Container>
         <div className="first-tab-container" style={{ backgroundColor: "white" }}>
           <div className="value-exchange">{values.stockId}</div>
           <div className="value-exchange"><b>{values.tickr}</b></div>
           <div className="value-exchange">{Number(values.price).toFixed(2)}</div>
           <div className="value-exchange">{Number(values.tickPrice).toFixed(6)}</div>
           <div className="value-exchange">{values.stockName}</div>
           <div className="value-exchange">{values.profit_loss_percentage}</div>
           <div className="value-exchange">{values.circulationQuantity}</div>
 
         </div>
     </Container>
     
     </>
     )
  
};
export default ForthTab;
