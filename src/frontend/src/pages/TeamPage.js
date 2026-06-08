import {React, useEffect, useState} from 'react';
import {useParams,Link} from "react-router-dom";
import {MatchDetailCard} from "../components/MatchDetailCard";
import {MatchSmallCard} from "../components/MatchSmallCard";
import { PieChart } from 'react-minimal-pie-chart';

import './TeamPage.scss';

export const TeamPage=()=> {
    const [team,setTeam]=useState(null);
    const {teamName}=useParams();
    useEffect(
        ()=>{
            const fetchTeam=async ()=>{
              const response=await fetch(`/team/${teamName}`);
              const data=await response.json();
              console.log(data);
              setTeam(data);
            };
            fetchTeam();
        },[teamName]);
    if (!team) {
        return <h1>Loading...</h1>;
    }

    return (
        <div className="TeamPage">
            <div className="team-Name-Section">
                <h1 className="team-Name">{team.teamName}</h1>
            </div>
            <div className="win-Loss-Section">
                <PieChart
                    data={[
                        { title: 'Losses', value: team.totalMatches-team.totalWins, color: '#a34d5d' },
                        { title: 'Wins', value: team.totalWins, color: '#4da375' },
                    ]}
                />
            </div>
            <div className="match-Detail-Section">
                <MatchDetailCard teamName={team.teamName} match={team.matches[0]}/>
            </div>
            {team.matches.slice(1).map(match => (
                <MatchSmallCard
                    key={match.id}
                    match={match}
                    teamName={team.teamName}
                />
            ))}
            <div className="more-Link">
                <Link to={`/team/${teamName}/matches/${process.env.REACT_APP_DATA_END_YEAR}`}>More ></Link>
            </div>
        </div>
    );
}

