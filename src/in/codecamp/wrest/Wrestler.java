package in.codecamp.wrest;
import java.util.*;

public class Wrestler {
	public String name;
	public int rank;
	public double height;
	public double weight;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;
  public Wrestler(String name, int rank, double height, double weight, int matchesWon, int matchesLost) {
		
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
		
	}
	
	public String toString() {
		return "name: " + this.name + ", rank: " + this.rank;
	}
	
	public int setMatchesWon(int wins) throws Exception {
		if(wins < this.matchesWon) {
			throw new Exception("How come the matches won decrease!");
		}
		this.matchesWon = wins;
		
		this.totalMatches = this.matchesWon + this.matchesLost;
		
		return wins;
	}
	
	public void incrementMatchesWon() {
		this.matchesWon++;
		
		this.totalMatches++;
	}
	
	public static List<Wrestler> defaultDeck() {
		List<Wrestler> deck = new ArrayList<Wrestler>();
		
		deck.add(new Wrestler("Undertaker", 1, 10.5, 100.0, 40, 5));
		deck.add(new Wrestler("Hulk Hogan", 2, 10.5, 100.0, 40, 5));
		deck.add(new Wrestler("HHH", 5, 10.5, 100.0, 40, 5));
		deck.add(new Wrestler("Kane", 17, 10.5, 100.0, 40, 5));
		
		return deck;
	}
}
	


