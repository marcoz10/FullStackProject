const fetch = require("node-fetch");

function fetchPokemon() {
  let promises = [];
  for (let i = 1; i <= 150; i++) {
    const url = `https://pokeapi.co/api/v2/pokemon/${i}`;
    promises.push(fetch(url).then((res) => res.json()));
  }

  Promise.all(promises).then((results) => {
    const pokemon = results.map((data) => ({
      name: data.name,
      id: data.id,
      image: data.sprites["front_default"],
      height: data.height,
      weight: data.weight,
      types: data.types.map((type) => type.type.name).join(", "),
    }));
    console.log(pokemon);
  });
}

fetchPokemon();
