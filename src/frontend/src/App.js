import './App.css';
import {TeamPage} from "./pages/TeamPage";
import {BrowserRouter as BrowserRouter, Route, Routes} from 'react-router-dom';
function App() {
  return (
    <div className="App">
        <BrowserRouter>
            <Routes>
                <Route path="/team/:teamName" element={<TeamPage />} />
            </Routes>
        </BrowserRouter>
    </div>
  );
}

export default App;
