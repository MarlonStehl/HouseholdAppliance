public class Shooting implements Team {
    private String name;
    private int numAthletes, numGoldMedals;

    public Shooting(String name, int numAthletes, int numGoldMedals) {
        this.name = name;
        this.numAthletes = numAthletes;
        this.numGoldMedals = numGoldMedals;
    }

    @Override
    public void printNameAndAthlets() {
        // TODO Auto-generated method stub
        System.out.println("Team: " + name + ", Number of Athletes: " + numAthletes);
    
    }

    @Override
    public void printNameAndMedals() {
        // TODO Auto-generated method stub
        System.out.println("Team: " + name + ", Number of Gold Medals: " + numGoldMedals);
    }

}
