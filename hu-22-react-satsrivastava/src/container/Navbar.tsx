import { Typography } from '@mui/material';
import React from 'react'
import { useState } from 'react';
import { FaUserAlt, } from "react-icons/fa";
import {GiHamburgerMenu} from "react-icons/gi"
import { Link, NavLink } from 'react-router-dom';
import "./navbar.scss";
import Search from './Search';
import NoService from './NoService';

const Navbar=()=> {
    const[showMediaIcons,setShowMediaIcons]=useState(false);
  return (
    <>
    <nav className='main-nav'>
        {/* 1st logopart */}
        <div className='logo'>
            <h2>
                <span>H</span>ashedin
                <span>U</span>niversity
            </h2>
        </div>

        {/* 2nd menu part */}
        <div className={showMediaIcons?"menu-link mobile-menu-link":"menu-link"}>
            <ul>
                <li>
                    <a href="https://hashedin.com/">Home</a>
                </li>
                <li>
                    <a href="https://hashedin.com/about-us/">about</a>
                </li>
                <li>
                    {/* <NavLink to="./NoService">Service</NavLink> */}
                    <a href="#" target={"./NoService"}>Service</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
                <li> 
                     <Search />
                 </li>
            </ul>
        </div>
         {/* 3rd part image */}
        <div className='social-media'>
             <ul className='social-media-desktop'>
                 <li>
                     <a href="#" target={"_blank"}>
                         <FaUserAlt className="admin"/></a>
                 </li>
                 

            </ul>
            {/* hamburger menu start  */}
            <div className="hamburger-menu">
                <a href="#" onClick={()=> setShowMediaIcons(!showMediaIcons)}>
                    <GiHamburgerMenu/></a>
            </div>
        </div>
    </nav>
    {/* <div>
        <Search/>
    </div> */}

    {/* hero section */}
     {/* <section className='hero-section'>
        <p>Welcome to</p>
        <h1>Assignment5</h1>
    </section> */}
    </>
  )
}

export default Navbar;