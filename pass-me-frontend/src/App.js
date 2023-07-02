import './App.css';
import { useEffect } from 'react';

function App() {

  useEffect(() => {
    // GET request
    fetch('http://localhost:8080/getresponse')
      .then(response => {
        return response.text()
      })
      .then(text => {
        console.log(text)
      })
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <p>
          Edit <code>src/App.js</code> and save to reload. 
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
