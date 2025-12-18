import { useState } from "react";
import { useEffect } from "react";
import { createContext, useContext } from "react";
import { useReducer } from "react";
import { useLayoutEffect } from "react";
import { useMemo } from "react";
import { useCallback } from "react";

/* ---------- useState ---------- */
function Counter() {
  const [count, setCount] = useState(0);

  return (
    <button onClick={() => setCount(count + 1)}>
      Count: {count}
    </button>
  );
}

/* ---------- useEffect ---------- */
function ExampleEffect() {
  useEffect(() => {
    console.log("Component loaded");
  }, []);

  return <h1>Hello</h1>;
}

/* ---------- useContext ---------- */
const MyContext = createContext();

function ExampleContext() {
  const value = useContext(MyContext);
  return <h1>{value}</h1>;
}

/* ---------- useReducer ---------- */
function reducer(state, action) {
  if (action.type === "increment") {
    return state + 1;
  }
  return state;
}

function ExampleReducer() {
  const [count, dispatch] = useReducer(reducer, 0);

  return (
    <button onClick={() => dispatch({ type: "increment" })}>
      {count}
    </button>
  );
}

/* ---------- useLayoutEffect ---------- */
function ExampleLayoutEffect() {
  useLayoutEffect(() => {
    console.log("Layout updated");
  }, []);

  return <div>Hello</div>;
}

/* ---------- useMemo ---------- */
function ExampleMemo({ number }) {
  const result = useMemo(() => number * 2, [number]);

  return <p>{result}</p>;
}

/* ---------- useCallback ---------- */
function ExampleCallback() {
  const handleClick = useCallback(() => {
    console.log("Clicked");
  }, []);

  return <button onClick={handleClick}>Click</button>;
}

/* ---------- Custom Hook ---------- */
function useCounter() {
  const [count, setCount] = useState(0);
  return [count, setCount];
}

function ExampleCustomHook() {
  const [count, setCount] = useCounter();

  return (
    <button onClick={() => setCount(count + 1)}>
      {count}
    </button>
  );
}















// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <div>
//       <h1>Anjali Jha</h1>
//       <p>Bhiwandi, Maharashtra</p>
//       <p>Email: anjalijha2000001@gmail.com</p>
//       <p>Contact: 8355963886</p>

//       <h2>Introduction</h2>
//       <p>
//         I am a Java Developer with experience in backend and basic frontend
//         development. I have worked on academic and AI-based projects using Java,
//         databases, and web technologies. I am interested in building simple,
//         efficient, and user-friendly applications.
//       </p>

//       <h2>Technical Skills</h2>
//       <p>
//         Java, JavaScript, SQL, Spring Boot, Hibernate, JDBC, MySQL,
//         HTML, CSS, Bootstrap, GitHub
//       </p>

//       <h2>Projects</h2>
//       <p>
//         <b>Next Word Predictor</b><br />
//         An AI-based Java application that predicts the next word using NLP
//         techniques and supports speech recognition.
//       </p>

//       <p>
//         <b>Travel and Tourism Management System</b><br />
//         A web application developed using Java, Hibernate, MySQL, JSP, HTML, and
//         CSS to manage travel and booking information.
//       </p>

//       <h2>Education</h2>
//       <p>
//         Bachelor of Engineering in Information Technology<br />
//         Sant Gadge Baba Amravati University<br />
//         2021 - 2024
//       </p>

//       <p>
//         Diploma in Information Technology<br />
//         MSBTE Board<br />
//         2018 - 2021
//       </p>

//       <p>
//         Secondary School Certificate<br />
//         Maharashtra State Board<br />
//         2017
//       </p>
//     </div>
//   )
// }

// export default App
