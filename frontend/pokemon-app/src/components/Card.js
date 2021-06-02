import React from 'react'

function Card({id, name, height, weight, type}) {

    return (
        <div style={{border: '1px solid red'}}>

            <h4>#{id}: {name}</h4>
            <p>Height: {height}</p>
            <p>Weight: {weight}</p>
            <p>Type: {type}</p>
        </div>
    )
}

export default Card
