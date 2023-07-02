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

    public void loadHeroes(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                String[] lineIndex = currentLine.split(",");
                Superhero newHero = new Superhero(lineIndex[0], lineIndex[1], lineIndex[2], lineIndex[3],
				                  lineIndex[4], lineIndex[5], Boolean.parseBoolean(lineIndex[6]), lineIndex[7]);
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
       System.out.println("Team " + teamName + ":");
        for(Superhero hero : teamMembers) {
            System.out.println(hero.toString());
        }
        return "";

    }
}
