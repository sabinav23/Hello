package com.company;

public class Words {

    public void isTheSame(String word1, String word2){
        if(word1.equals(word2)){
            System.out.println("Great!");
        }
        else if(word1.equalsIgnoreCase(word2)){
            System.out.println("Good");
        }
        else if(word1.length() == word2.length()){
            System.out.println("Okayish");
        }
        else{
            System.out.println("Bad");
        }
    }


}
