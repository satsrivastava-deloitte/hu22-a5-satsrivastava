import React from "react";
import "./index.scss";

interface IProps {
  name: string;
  color: string;
}

const SampleComponent: React.FC<IProps> = ({ color, name }) => {
  return (
    <div className="sample-component" style={{ backgroundColor: color }}>
      <div className="component-text">{`Hi, You are currently in ${name}`}</div>
    </div>
  );
};

export default SampleComponent;
