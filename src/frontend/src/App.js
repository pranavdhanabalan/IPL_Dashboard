import './App.scss';
import {TeamPage} from "./pages/TeamPage";
import {BrowserRouter as BrowserRouter, Route, Routes} from 'react-router-dom';
import {MatchPage} from "./pages/MatchPage";
function App() {
  return (
    <div className="App">
        <BrowserRouter>
            <Routes>
                <Route path="/team/:teamName/matches/:year" element={<MatchPage/>}/>
                <Route path="/team/:teamName" element={<TeamPage />} />
            </Routes>
        </BrowserRouter>
    </div>
  );
}

export default App;
