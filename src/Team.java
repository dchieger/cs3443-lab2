import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Superhero> teamMembers = new ArrayList<Superhero>();

    public Team(String teamName) {
        setTeamName(teamName);
    }

    public void loadHeros(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] hero = line.split(",");
                Superhero newHero = new Superhero(hero[0], hero[1], hero[2], hero[3], hero[4], hero[5], Boolean.parseBoolean(hero[6]), hero[7]);
                teamMembers.add(newHero);
            }
        } catch (IOException e) {
            System.out.println("E ->" + e);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", teamMembers=" + teamMembers +
                '}';
    }
}
