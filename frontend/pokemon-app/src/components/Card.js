import React from "react";
import TypeChip from "./TypeChip";

function Card({ id, name, height, weight, type, type2, image }) {
  function capitalize(str) {
    const lower = str.toLowerCase();
    return str.charAt(0).toUpperCase() + lower.slice(1);
  }

  return (
    <div className="p-2 m-2 border border-red-500">
      <h4 className="text-xl text-center">
        #{id}: {capitalize(name)}
      </h4>
      <img className="mx-auto" src={image} alt={name} />
      <p>Height: {height}</p>
      <p>Weight: {weight}</p>
      <div className="flex justify-center space-x-1">
        <TypeChip label={capitalize(type)} />
        {type2 && <TypeChip label={capitalize(type2)} />}
      </div>
    </div>
  );
}

export default Card;
