package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {

    private Player player1;
    private Player player2;
    
    public PlayerTest() {
        this.player1= new Player();
        this.player2= new Player();
    }

    @Test
    public void player_one_choose_rock() {
        Figure rock = player1.choose("Rock");  
        assertTrue(rock instanceof Rock);
        assertEquals("Rock", rock.getType());
     }

     @Test
    public void player_two_choose_rock() {
        Figure rock = player2.choose("Rock");  
        assertTrue(rock instanceof Rock);
        assertEquals("Rock", rock.getType());
     }

     @Test
    public void player_one_choose_paper() {
        Figure paper = player1.choose("Paper"); 
        assertTrue(paper instanceof Paper);
        assertEquals("Paper", paper.getType());
     }

     @Test
     public void player_two_choose_paper() {
         Figure paper = player2.choose("Paper"); 
         assertTrue(paper instanceof Paper);
         assertEquals("Paper", paper.getType());
      }

      @Test
      public void player_one_choose_scissors() {
          Figure scissors = player1.choose("Scissors"); 
          assertTrue(scissors instanceof Scissors);
          assertEquals("Scissors", scissors.getType());
       }
  

    }

   


