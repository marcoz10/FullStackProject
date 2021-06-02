import React from 'react'
import Card from './Card'

function Cards() {
    const pokemen = [
        {
            id: 1,
            name: "balbusaur",
            url: "",
            type: "Grass",
            weight: "300",
            height: "7"
        },
        {
            id: 2,
            name: "dookie",
            url: "",
            type: "poop",
            weight: "40",
            height: "73"
        },
        {
            id: 3,
            name: "creack",
            url: "",
            type: "swoop",
            weight: "47",
            height: "25"
        }
    ]
    
    return (
        <div>
            {pokemen.map((pokemon) => {
                return <Card key={pokemon.id} {...pokemon}/>
            })}
        </div>
    )
}

export default Cards
