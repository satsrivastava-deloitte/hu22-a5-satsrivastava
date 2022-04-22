import React from 'react'
import { SidebarData } from './SidebarData';
import "./Sidebar.scss"

function Sidebar() {
  return (
    <div className='Sidebar'>
      <ul className='SidebarList'>
          {SidebarData.map((val,key)=>{
              return(
                  <li className='row'
                  id={window.location.pathname==val.link?"active":""}
                  onClick={()=>{
                      window.location.pathname=val.link;
                  }
                }
                >  
                    <div id="icon">{val.icon}</div>
                    <div id="title">{val.title}</div>
                </li>
              );
          })}
      </ul>
     
    </div>
    

  )
};

export default Sidebar;
