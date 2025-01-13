package com.codedifferently.labs.partA;

public class RockPaperScissor {

    public static void main(String[] args) {

        for( int i = 0; i < 20; i++){
            int x = (int) (Math.random()*3);
            System.out.println(x);
            if(x == 2){
                System.out.println("scissors");
            }else if(x == 1){
                System.out.println("paper");
            }else{
                System.out.println("rock");
            }
        }

    }
}
