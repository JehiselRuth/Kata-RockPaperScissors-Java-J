package com.factoriaf5.rps.models;

public class Player {

    public Figure choose(String string) {
        if (string == "Rock") {
         new Rock();
        }
        if (string == "Paper") {
            new Paper();
        }
        if (string == "Scissors") {
            new Scissors();
        }
        
        return null;
    }

    public Player() {
    }

   


    
}
