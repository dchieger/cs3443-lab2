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
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                String[] superHero = currentLine.split(",");
                Superhero newHero = new Superhero(superHero[0], superHero[1], superHero[2], superHero[3],
				                  superHero[4], superHero[5], Boolean.parseBoolean(superHero[6]), superHero[7]);
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
