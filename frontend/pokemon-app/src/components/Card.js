import React from "react";
import TypeChip from "./TypeChip";

function Card({ id, name, height, weight, type, type2, image }) {
  return (
    <div className="p-2 m-2 w-1/6 border border-red-500">
      <h4>
        #{id}: {name}
      </h4>
      <img src={image} alt={name} />
      <p>Height: {height}</p>
      <p>Weight: {weight}</p>
      <TypeChip label={type} />
      {type2 && <TypeChip label={type2} />}
    </div>
  );
}

export default Card;
