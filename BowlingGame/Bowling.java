import java.util.*; 
import java.util.Iterator;
import java.util.LinkedList;

public class Bowling {
    HashMap<String, Integer> players;
    LinkedList<Integer> scores;
    Bowling() {
        players = new HashMap<String, Integer>();
        scores = new LinkedList<Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
        scores.add(p);
    }
    //your code goes here
    public void getWinner() {
        Iterator<Integer> it = players.iterator();
        while (it.hasNext()){

}
Collections.max();
        System.out.println();
    }
}
