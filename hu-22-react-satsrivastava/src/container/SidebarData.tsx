import React from 'react'
import NoService from './NoService';
import { BsFillCloudSlashFill,BsRss,BsStickiesFill,BsStack,BsKeyFill,BsGearFill,BsFileEarmarkXFill } from "react-icons/bs";
export const SidebarData=[
    {
    title:"Computer Service",
    icon:<BsFillCloudSlashFill size={50}/>,
    link:"/component/ComputerService",
    },
   {
    title:"Networking Service",
    icon:<BsRss size={50}/>,
    link:"/component/ComputerService",
    },
    {    title:"Storage Service",
    icon:<BsStickiesFill size={50}/>,
    link:"/component/ComputerService",

    },
    {
        title:"Big Data",
        icon:<BsStack size={50}/>,
        link:"/component/ComputerService",
    },
    {
        title:"Security and identity Management",
        icon:<BsKeyFill size={50}/>,
        link:"/component/ComputerService",
    },
    {
        title:"Operations Tools",
        icon:<BsGearFill size={50}/>,
        link:"/component/ComputerService",
    },
    
        {
            title:"Other Function",
            icon:<BsFileEarmarkXFill size={50}/>,
            link:"./NoService",
        }
    


];
