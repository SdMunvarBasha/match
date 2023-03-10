public class App
{
    public static void main(String[] args)
    {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("India"));
        teams.add(new Team("Australia"));
        teams.add(new Team("England"));
        teams.add(new Team("Pakistan"));
        teams.add(new Team("NZ"));
        List<Match> matches = Schedule.createSchedule(teams);
        System.out.println(matches);
        Simulator.playMatches(matches);
        Simulator.showPointsTable(teams,matches);
    }
}