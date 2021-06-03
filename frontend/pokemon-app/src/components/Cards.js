import React from "react";
import Card from "./Card";

function Cards() {
  const pokemen = [
    {
      id: 1,
      name: "balbusaur",
      url: "",
      type: "grass",
      type2: "dragon",
      weight: "300",
      height: "7",
    },
    {
      id: 2,
      name: "dookie",
      url: "",
      type: "fire",
      weight: "40",
      height: "73",
    },
    {
      id: 3,
      name: "creack",
      url: "",
      type: "water",
      type2: "electric",
      weight: "47",
      height: "25",
    },
  ];

  return (
    <div>
      {pokemen.map((pokemon) => {
        return <Card key={pokemon.id} {...pokemon} />;
      })}
    </div>
  );
}

export default Cards;
