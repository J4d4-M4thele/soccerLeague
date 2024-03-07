public class Score implements Comparable<Score>{

    private String team;

    private Integer points;

    public String getTeam() {
        return team;
    }

    public Integer getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Score{ " +
                "\nTeam Name: " + team
                + ", \nPoints: " + points + " }";
    }

    public Score(String team) {
        this.team = team;
        this.points = 0;
    }

    public void add(int points) {
        this.points += points;
    }

    @Override
    public int compareTo(Score sc) {
        int res = sc.getPoints() - points;
        if(res != 0) return res;
        return this.getTeam().compareTo(sc.getTeam());
    }
}


