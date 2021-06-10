import React from "react";
import TypeButton from "./TypeButton";
import "./styles/card-styles.css";

function Card({ id, name, height, weight, type, type2, image }) {
  function capitalize(str) {
    const lower = str.toLowerCase();
    return str.charAt(0).toUpperCase() + lower.slice(1);
  }

  return (
    <div className="p-2 m-2 border border-red-500 bg-red-100 card-bounce">
      <h4 className="text-lg text-center font-press-start">
        #{id}: {capitalize(name)}
      </h4>
      <img className="mx-auto" src={image} alt={name} />
      <div className="flex justify-center space-x-3 pb-1">
        <TypeButton label={capitalize(type)} />
        {type2 && <TypeButton label={capitalize(type2)} />}
      </div>
      <p className="text-sm font-press-start p-1">Height: {height}</p>
      <p className="text-sm font-press-start p-1">Weight: {weight}</p>
    </div>
  );
}

export default Card;
