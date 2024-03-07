import java.util.*;

public class League {
    List<Score> Tpoints = new ArrayList<>();
    List<Matches> matches = new ArrayList<>();

    Set<String> sNames = new HashSet<>();

    public void addMatch(Matches match) {
        sNames.add(match.getTeam1());
        sNames.add(match.getTeam2());
        matches.add(match);
    }

    public void Game(String team, int points) {
        for (var t : Tpoints) {
            if (t.getTeam().equals(team)) {
                t.add(points);
                return;
            }
        }
    }

    public void setNames() {
        for (var t : sNames) {
            var sc = new Score(t);
            Tpoints.add(sc);
        }
    }

    public void Winners() {
        for (var m : matches) {
            if (m.getT1Score() > m.getT2Score()) {
                Game(m.getTeam1(), 3);
            } else if (m.getT1Score() < m.getT2Score()) {
                Game(m.getTeam2(), 3);
            } else {
                Game(m.getTeam1(), 1);
                Game(m.getTeam2(), 1);
            }
        }
    }

    @Override
    public String toString() {
        Collections.sort(Tpoints);

        String res = "";
        int i = 1;
        for (var t : Tpoints) {
            res += "%d. %s\n%d\n".formatted(i, t.getTeam(), t.getPoints());
            i++;
        }
        return res;
    }

}
