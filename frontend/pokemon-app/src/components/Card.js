import React from "react";
import TypeChip from "./TypeChip";

function Card({ id, name, height, weight, type, type2 }) {
  return (
    <div class="p-2 m-2 w-1/6 border border-red-500">
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
