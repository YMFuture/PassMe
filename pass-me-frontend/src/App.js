import './App.css';
import { useEffect, useState } from 'react';

function App() {

  const [text, setText] = useState('loading ...');

  useEffect(() => {
    // GET request
    fetch('http://localhost:8080/getresponse')
      .then(response => response.text())
      .then(responsetext => {
        setText(responsetext)
      })
      .catch((error) => {
        console.error("NetworkError: The server isn't reachable" + error)
        setText("Server is not reachable, please try again later")
      })
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          {text}
        </a>
      </header>
    </div>
  );
}

export default App;
