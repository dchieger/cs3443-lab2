/*
* David Hieger
* david.hieger@my.utsa.edu
* YPK967
* */
public class driver {
    public static void main(String[] args) {
        Team teamA = new Team("Team A:");
        teamA.loadHeros("data-A.csv");
        System.out.println(teamA.getTeamName());
        System.out.println(teamA);

        Team teamB = new Team("Team B: ");
        teamB.loadHeros("data-A.csv");
        System.out.println(teamB.getTeamName());
        System.out.println(teamB);
    }
}