public class Match {
    private Team team1;
    private Team team2;
    private Team team3;
    private Team loser;
    Match(Team team, Team team3)
    {
        this.team1 = team;
        this.team2 = team3;
    }
    public Team getTeam1() {
        return team1;
}
public Team getTeam2() {
    return team2;
}
public Team getWinner() {
    return winner;
}
public void setWinner(Team winner) {
    this.winner = winner;
}
public Team getloser() {
    return loser;
}
public void setLoser(Team loser) {
    this.loser = loser;
}
public String to String() {
    String matchDescription =team1 + "vs " + team2;
    if(winner != null){
        String result = "\ Winner = "+this.Winner.toString()+" Loser = "+this.loser.toString()+"\n;
        matchDescription = matchDescription +result;
    }
    return matchDescription;
}
}