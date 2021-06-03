import React from "react";
import TypeChip from "./TypeChip";

function Card({ id, name, height, weight, type, type2 }) {
  return (
    <div style={{ border: "1px solid red" }}>
      <h4>
        #{id}: {name}
      </h4>
      <p>Height: {height}</p>
      <p>Weight: {weight}</p>
      <TypeChip label={type} />
      {type2 && <TypeChip label={type2} />}
    </div>
  );
}

export default Card;
