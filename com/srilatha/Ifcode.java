package com.srilatha;

public class Ifcode {
    public static void main(String[] args){
        boolean gameOver=true;
        int Score=5000;
        int levelCompleted=5;
        int bonus=100;

        if(gameOver){
            int finalScore=Score+(levelCompleted*bonus);
            System.out.println("here is the finalscore" +" " +finalScore);
        }
        int score=8000;
        int Bonus=200;
        int levelcompleted=8;
        if(gameOver){
            int finalScore= score+(levelcompleted*Bonus);
            System.out.println("here is the newScore" +" "+ finalScore);

        }

    }
}
