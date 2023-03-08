package com.factoriaf5.rps;

import com.factoriaf5.rps.application.Game;

public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game("Jay", "Mike", "Scissors Wins", "Rock Wins", "Scissors Wins", "Rock Wins", "Lizard Wins", "Spock Wins", "Scissors Wins", "Lizard Wins", "Paper Wins", "Spock Wins", "Rock Wins");
    
        System.out.println("Player: " + "" + game.getPlayer1() + "" + "choose" + "" + game.getPaperVsRock());
    }
    
}
