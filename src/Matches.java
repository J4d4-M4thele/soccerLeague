public class Matches {
    private String team1;
    private String team2;

    private int t1Score;
    private int t2Score;

    public Matches(String team1, int t1Score, String team2, int t2Score) {
        this.team1 = team1;
        this.t1Score = t1Score;
        this.team2 = team2;
        this.t2Score = t2Score;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getT1Score() {
        return t1Score;
    }

    public int getT2Score() {
        return t2Score;
    }

}
