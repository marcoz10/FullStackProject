import React from "react";
import Card from "./Card";

function Cards() {
  const pokemen = [
    {
      id: 1,
      name: "bulbasaur",
      url: "",
      type: "grass",
      type2: "poison",
      weight: "300",
      height: "7",
    },
    {
      id: 4,
      name: "charmander",
      url: "",
      type: "fire",
      weight: "40",
      height: "73",
    },
    {
      id: 7,
      name: "squirtle",
      url: "",
      type: "water",
      weight: "47",
      height: "25",
    },
    {
      id: 69,
      name: "bellsprout",
      url: "",
      type: "grass",
      type2: "poison",
      weight: "47",
      height: "25",
    },
    {
      id: 81,
      name: "magnemite",
      url: "",
      type: "electric",
      type: "steel",
      weight: "47",
      height: "25",
    },
    {
      id: 64,
      name: "kadabra",
      url: "",
      type: "psychic",
      weight: "47",
      height: "25",
    },
  ];

  return (
    <div className="flex justify-items-start">
      {pokemen.map((pokemon) => {
        return <Card key={pokemon.id} {...pokemon} />;
      })}
    </div>
  );
}

export default Cards;
