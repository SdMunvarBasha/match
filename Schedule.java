public class Schedule {
    public static List<match> createSchedule(List<Team>teams){
        List<match> matches new ArrayList<>();
        for (int i=o; i<teams.size(); i++){
            for(int j=i+1; j<teams.size(); j++){
                Match match = new Match (teams.get(i),teams.get(j));
                matches.add(match); 
        }
    }
    return matches;
}
}
