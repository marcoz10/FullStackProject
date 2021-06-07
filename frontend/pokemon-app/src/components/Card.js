import React from "react";
import TypeChip from "./TypeChip";

function Card({ id, name, height, weight, type, type2, image }) {
  function capitalize(str) {
    const lower = str.toLowerCase();
    return str.charAt(0).toUpperCase() + lower.slice(1);
  }

  return (
    <div className="p-2 m-2 border border-red-500 bg-red-100">
      <h4 className="text-lg text-center font-press-start">
        #{id}: {capitalize(name)}
      </h4>
      <img className="mx-auto" src={image} alt={name} />
      <div className="flex justify-center space-x-1 py-1">
        <TypeChip label={capitalize(type)} />
        {type2 && <TypeChip label={capitalize(type2)} />}
      </div>
      <p className="text-sm font-press-start p-1">Height: {height}</p>
      <p className="text-sm font-press-start p-1">Weight: {weight}</p>
    </div>
  );
}

export default Card;
