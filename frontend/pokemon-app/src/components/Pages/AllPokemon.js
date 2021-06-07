import React, { useState, useEffect } from "react";
import Card from "../Card";

function AllTypes() {
  const [pokemon, setPokemon] = useState([]);

  useEffect(() => {
    function fetchPokemon() {
      let promises = [];
      for (let i = 1; i <= 150; i++) {
        const url = `https://pokeapi.co/api/v2/pokemon/${i}`;
        promises.push(fetch(url).then((res) => res.json()));
      }

      Promise.all(promises).then((results) => {
        const pokemon = results.map((data) => {
          let type = data.types[0].type.name;
          let type2;

          if (data.types.length > 1) {
            type2 = data.types[1].type.name;
          }
          const singlePokemon = {
            name: data.name,
            id: data.id,
            image: data.sprites["front_default"],
            height: data.height,
            weight: data.weight,
            type,
            type2,
          };
          return singlePokemon;
        });
        setPokemon(pokemon);
      });
    }

    fetchPokemon();
  }, []);
  return (
    <div className="grid grid-cols-3 gap-4">
      {pokemon.map((poke) => {
        return <Card key={poke.id} {...poke} />;
      })}
    </div>
  );
}

export default AllTypes;
