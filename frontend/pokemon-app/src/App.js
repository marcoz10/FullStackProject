import "./App.css";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import Squads from "./components/Squads";
import Trainer from "./components/Trainer";
import AllPokemon from "./components/Pages/AllPokemon";
function App() {
  return (
    <>
      <BrowserRouter>
        <Switch>
          <Route path="/pokemon">
            <AllPokemon />
          </Route>
        </Switch>
      </BrowserRouter>
    </>
  );
}

export default App;
