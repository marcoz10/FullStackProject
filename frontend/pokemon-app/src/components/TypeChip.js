import React from "react";
import Chip from "@material-ui/core/Chip";

// This will be used for the types ex. Grass, Fire, Water
function TypeChip({ label }) {
  let color;

  switch (label) {
    case "Normal":
      color = "#A8A878";
      break;
    case "Fire":
      color = "#F08030";
      break;
    case "Water":
      color = "#6890F0";
      break;
    case "Grass":
      color = "#78C850";
      break;
    case "Electric":
      color = "#F8D030";
      break;
    case "Psychic":
      color = "#F85888";
      break;
    case "Ice":
      color = "#98D8D8";
      break;
    case "Dragon":
      color = "#7038F8";
      break;
    case "Dark":
      color = "#705848";
      break;
    case "Fairy":
      color = "#EE99AC";
      break;
    case "Fighting":
      color = "#C03028";
      break;
    case "Flying":
      color = "#A890F0";
      break;
    case "Poison":
      color = "#A040A0";
      break;
    case "Ground":
      color = "#E0C068";
      break;
    case "Rock":
      color = "#B8A038";
      break;
    case "Bug":
      color = "#A8B820";
      break;
    case "Ghost":
      color = "#705898";
      break;
    case "Steel":
      color = "#B8B8D0";
      break;
    case "???":
      color = "#68A090";
      break;
    default:
      color = "#fff";
  }

  const styles = {
    fontFamily: "Press Start 2P, cursive",
  };

  return (
    <>
      <Chip label={label} style={{ backgroundColor: color }} classes={styles} />
    </>
  );
}

export default TypeChip;
