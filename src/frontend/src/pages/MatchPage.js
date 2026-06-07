import {React, useEffect, useState} from 'react';
import {useParams} from "react-router-dom";
import {MatchDetailCard} from "../components/MatchDetailCard";
import {MatchSmallCard} from "../components/MatchSmallCard";
import {TeamPage} from "./TeamPage";
import './MatchPage.scss';
import {YearSelector} from "../components/YearSelector";

export const MatchPage=()=> {
    const [matches,setMatches]=useState([]);
    const {teamName,year}=useParams();
    useEffect(
        ()=>{
            const fetchMatches=async ()=>{
                const response=await fetch(`http://localhost:8080/team/${teamName}/matches?year=${year}`);
                const data=await response.json();
                console.log(data);
                setMatches(data);
            };
            fetchMatches();
        },[]);
    return (
        <div className="MatchPage">
            <div className="year-selector">
                <YearSelector/>
            </div>

            <div className="right-column">
                {matches.map(match => (
                    <MatchDetailCard
                        key={match.id}
                        match={match}
                        teamName={teamName}
                    />
                ))}
            </div>
        </div>
    );
}

