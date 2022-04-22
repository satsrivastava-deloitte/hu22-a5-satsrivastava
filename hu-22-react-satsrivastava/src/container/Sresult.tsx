import React from 'react'

const Sresult=(props: any)=> {
    const img='http://localhost:3000/?${props.name}';
  return (
    <div>
      <img src={img} alt="Search" />
    </div>
  )
}

export default Sresult;
