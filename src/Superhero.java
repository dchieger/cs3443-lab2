public class Superhero {
    String name;
    String heroName;
    String gender;
    String heightFt;
    String heightIn;
    String weight;
    boolean superPowers;
    String location;

    public Superhero(String name, String heroName, String gender, String heightFt, String heightIn, String weight, boolean superPowers, String location) {
        setName(name);
        setHeroName(heroName);
        setGender(gender);
        setHeightFt(heightFt);
        setHeightIn(heightIn);
        setWeight(weight);
        setSuperPowers(superPowers);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getGender() {
        return gender;
    }

    public String getHeightFt() {
        return heightFt;
    }

    public String getHeightIn() {
        return heightIn;
    }

    public String getWeight() {
        return weight;
    }

    public boolean isSuperPowers() {
        return superPowers;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeightFt(String heightFt) {
        this.heightFt = heightFt;
    }

    public void setHeightIn(String heightIn) {
        this.heightIn = heightIn;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setSuperPowers(boolean superPowers) {
        this.superPowers = superPowers;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //Come back and fix this 06/28
    @Override
    public String toString() {
        System.out.println("\t-" + this.heroName + "\n" +
                "\t\tReal Name: " + this.name + "\n" +
                "\t\tGender: " + this.gender + "\n" +
                "\t\tHeight: " + this.heightFt + "'" + this.heightIn + "\"" + "\n" +
                "\t\tWeight: " + this.weight + "\n" +
                "\t\tPowers: " + this.superPowers + "\n" +
                "\t\tLocation: " + this.location + "\n");
        return "";
    }
}
