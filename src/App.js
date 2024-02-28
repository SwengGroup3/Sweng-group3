import React from 'react';
import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import { useAuth0 } from '@auth0/auth0-react';
import LoginButton from './components/login';
import LogoutButton from './components/logout';
import Home from './components/Home';
import Profile from './components/profile';
import CreationPage from './components/AudienceCreation';
import Navbar from './components/NavBar';
import logoImage from './assets/finch-logo.png'; // Make sure the path to your logo is correct
import './App.css';

function App() {
  const { isAuthenticated, isLoading } = useAuth0();

  if (isLoading) {
    return <div>Loading...</div>;
  }

  return (
    <Router>
      <div className='App'>
      {isAuthenticated && (
        <img src={logoImage} alt="Logo" className="App-logo" />
      )}
        <Navbar />
        <Routes>
          <Route path="/" element={isAuthenticated ? <Home /> : <Navigate to="/login" replace />} />
          <Route path="/login" element={!isAuthenticated ? <LoginButton /> : <Navigate to="/" replace />} />
          <Route path="/profile" element={isAuthenticated ? <Profile /> : <Navigate to="/login" replace />} />
          <Route path="/logout" element={isAuthenticated ? <LogoutButton /> : <Navigate to="/login" replace />} />
          <Route path="/AudienceCreation" element={isAuthenticated ? <CreationPage /> : <Navigate to="/login" replace />} />
          {/* Add more routes as needed */}
        </Routes>
      </div>
    </Router>
  );
}

export default App;
