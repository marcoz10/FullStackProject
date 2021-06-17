import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import TypeButton from "../TypeButton";

function SinglePokemon() {
  function capitalize(str) {
    // if (!str) {
    //   return;
    // }
    const lower = str.toLowerCase();
    return str.charAt(0).toUpperCase() + lower.slice(1);
  }

  const [pokemon, setPokemon] = useState({});
  let { id } = useParams();
  const { name, sprites, height, weight, type, type2 } = pokemon;

  useEffect(() => {
    function fetchPokemon() {
      const url = `https://pokeapi.co/api/v2/pokemon/${id}`;
      fetch(url)
        .then((res) => res.json())
        .then((data) => {
          console.log(data);
          let type = data.types[0].type.name;
          let type2;

          if (data.types.length > 1) {
            type2 = data.types[1].type.name;
          }
          const {
            name,
            height,
            weight,
            base_experience,
            abilities,
            moves,
            stats,
            sprites,
          } = data;
          setPokemon({
            name,
            height,
            weight,
            base_experience,
            abilities,
            moves,
            stats,
            sprites,
            type,
            type2,
          });
        });
    }
    fetchPokemon();
  }, [id]);

  return (
    <>
      {pokemon.name ? (
        <div className="p-2 m-2 border border-red-500 bg-red-100 card-bounce cardmon">
          <h4 className="text-lg text-center font-press-start">
            #{id}: {capitalize(name)}
          </h4>
          <img
            className="mx-auto"
            src={sprites.other["official-artwork"]["front_default"]}
            alt={name}
          />
          <div className="flex justify-center space-x-3 pb-1">
            <TypeButton label={capitalize(type)} />
            {type2 && <TypeButton label={capitalize(type2)} />}
          </div>
          <p className="text-sm font-press-start p-1">Height: {height}</p>
          <p className="text-sm font-press-start p-1">Weight: {weight}</p>
        </div>
      ) : (
        <p>Loading</p>
      )}
    </>
  );
}

export default SinglePokemon;
