window.onload = function () {
    document.getElementById("fetchJoke").addEventListener("click", getJokeWithFetchAndAsync);
}
let apiUrl = "https://icanhazdadjoke.com/";
let state = { joke: '' };
let updateContent = function() {
    document.getElementById('joke').innerText = state.joke;
}

async function getJokeWithFetchAndAsync() {
    // clean up the Promises syntax, fewer chained .then() statements..
    try {
        let response = await fetch(apiUrl, {method:"GET", headers:{"Accept":"application/json"}});
        let data = await response.json();
        state.joke = data.joke;
        updateContent();
    } catch(error) {
        console.log(error);
    }
}

function getJokeWithFetch() {
    fetch(apiUrl, {method:"GET", headers:{"Accept":"application/json"}})
        //define behavior for when response returns
        .then((response) => {
            //return unwrapped promise object for the next chained operation
            let data = response.json();
            return data;
        })
        // utilize unwrapped promise as a JS object
        .then((data) => {
            console.log(data);
            state.joke = data.joke;
            updateContent();
        })
        //what if there's a problem?
        .catch((error) => {
            alert('oh no :(');
            console.log(error);
        });
}