import React from "react";
import { Link } from "react-router-dom";
import "./index.scss";

class Header extends React.Component {
  render() {
    return (
      <div className="header-container">
        <div className="header-title">Assignment_Frontened</div>
        <div className="tab-items-container">
          <Link className="tab-item" to="/firstTab">
            Sign up
          </Link>
          <Link className="tab-item" to="/secondTab">
            Login
          </Link>
          <Link className="tab-item" to="/thirdTab">
            Dashboard
          </Link>
          <Link className="tab-item" to="/fourthTab">
            Fourth tab
          </Link>
        </div>
        <div className="divider" />
      </div>
    );
  }
}

export default Header;
