import {React} from 'react';
import {Link} from "react-router-dom";
export const MatchSmallCard=({teamName,match})=> {
    if (!match) {
        return null;
    }
    const otherTeam=match.team1===teamName?match.team2:match.team1;
    const otherTeamRoute=`/team/${otherTeam}`;
    console.log("teamName:", teamName);
    console.log("team1:", match.team1);
    console.log("team2:", match.team2);
    return (
        <div className="MatchSmallCard">
            <h3>vs
                <Link to={otherTeamRoute}>{otherTeam}</Link></h3>
            <p>{match.matchWinner} won by {match.resultMargin} {match.result}</p>
        </div>
    );
}

