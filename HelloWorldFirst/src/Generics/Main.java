package Generics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckman = new SoccerPlayer ("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
		//adelaideCrows.addPlayer(pat);
		//adelaideCrows.addPlayer(beckman);
			
		
		System.out.println(adelaideCrows.numPlayers());
				
		Team<BaseballPlayer> baseballTeam = new Team <> ("Chicago Cubs");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenTeam = new Team <> ("this won't work");
		brokenTeam.addPlayer(beckman);
		
		
		/*ArrayList<Integer> items = new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		printDouble (items);*/
	}
	
	private static void printDouble(ArrayList<Integer> n) {
		for(Integer i :n) {
			System.out.println( i *2);
		}
	}

}
