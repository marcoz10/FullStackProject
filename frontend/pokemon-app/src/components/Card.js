import React from "react";
import TypeChip from "./TypeChip";

function Card({ id, name, height, weight, type, type2, image }) {
  function capitalize(str) {
    const lower = str.toLowerCase();
    return str.charAt(0).toUpperCase() + lower.slice(1);
  }

  return (
    <div className="p-2 m-2 w-1/6 border border-red-500">
      <h4>
        #{id}: {capitalize(name)}
      </h4>
      <img src={image} alt={name} />
      <p>Height: {height}</p>
      <p>Weight: {weight}</p>
      <TypeChip label={capitalize(type)} />
      {type2 && <TypeChip label={capitalize(type2)} />}
    </div>
  );
}

export default Card;
