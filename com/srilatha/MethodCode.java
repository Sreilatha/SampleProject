package com.srilatha;

public class MethodCode {
    public static void main(String[] args){
        boolean gameOver;
        int score;
        int levelCompleted;
        int bonus;
        displayHighScore(true,"jayanth",5);


    }
    public static void displayHighScore( boolean gameOver,String playerName,int position){
        if(gameOver){
            System.out.println(playerName +" " +"gothis"+" " + position +" "+ "managed highscore" );
        }
    }
    int Scored;
    Scored = 1400;
    public static int calculateHighScore(int Scored){
        if(Scored>1000) {
            System.out.println("the score is" + Scored);
            return Scored;
        }else if(Scored<1500){
            System.out.println("score is"+ Scored);
       return Scored;
        }
        return Scored;
    }
}
