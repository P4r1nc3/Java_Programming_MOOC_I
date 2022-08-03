import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;
    public JokeManager () {
        this.jokes = new ArrayList<>();
    }

    public void addJoke (String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke () {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        return jokes.get(new Random().nextInt(jokes.size()));
    }

    public void printJokes () {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
