import React from 'react'
import { useState } from 'react';
import Sresult from './Sresult';
import SearchIcon from "@mui/icons-material/Search";
import "./SearchBar.scss"

const Search=()=> {
    const[img,setImg]=useState("");
    const inputEvent=(event: { target: { value: any; }; })=>{
        const data=event.target.value;
        console.log(data);
        setImg(data);
    };
  return (
    <div className='searchbar'>
          <input
              type={"text"} placeholder="Enter Service name" value={img}
              onChange={inputEvent} />
          {img === "" ? null : <Sresult name={img} />}
      </div>
  );
};

export default Search;