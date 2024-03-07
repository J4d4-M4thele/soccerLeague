import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeagueResults {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Jada\\OneDrive\\Documents\\Bootcamp\\Java\\8_Java_Advanced\\input.txt");
        League league = new League();
        try {
            List<String> lines = Files.readAllLines(path);
            for(String l: lines) {
                Matches match = getMatch(l);
                league.addMatch(match);
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        league.setNames();
        league.Winners();
        System.out.println(league);
    }
    private static Matches getMatch(String in) {
        String[] out;
        out = in.split(",");

        String team1 = out[0].substring(0, out[0].length()-2).trim();
        String team2 = out[1].substring(0, out[1].length()-2).trim();

        int t1Score = Integer.parseInt(out[0].substring(out[0].length()-1));
        int t2Score = Integer.parseInt(out[1].substring(out[1].length()-1));

        return new Matches(team1, t1Score, team2, t2Score);
    }

}
