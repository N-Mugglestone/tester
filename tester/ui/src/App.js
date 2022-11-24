import { BrowserRouter as Router, Routes, Route, Navigate } from "react-router-dom"

import AddAPerson from '../src/Components/AddAPerson.jsx';
import NewPost from '../src/Components/NewPost.jsx';
import Posts from '../src/Components/Posts.jsx';
import Header from '../src/Components/Header.jsx';
import Footer from '../src/Components/Footer.jsx';
import HomePage from '../src/Components/HomePage.jsx';
import './App.css';

function App() {
  return (
       <>
< Header />

    <Router>
        <Routes>

          <Route path="/" element={<HomePage />} />

          <Route path="/AddAPerson" element={<AddAPerson />} />
          <Route path="/newPost" element={<NewPost />} />
          <Route path="/Posts" element={<Posts />} />

          <Route path="*" element={<Navigate to="/" />} />

        </Routes>
    </Router>

<Footer />
        </>
  );
}

export default App;





