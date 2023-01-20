package com.example.TournamentWinner;

import java.util.*;

class Program {

    public int HOME_TEAM_WON = 1;

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBestTeam = "";
        HashMap<String, Integer> Scores = new HashMap<String, Integer>();
        Scores.put(currentBestTeam, 0);
        for (int idx = 0; idx < competitions.size(); idx++) {
            // Look into the results array and if Hometeam won put it into the array and
            // update scores
            // if(results[idx] == HOME_TEAM_WON){
            // // if the score of home team is greater then the currentBestTeam, Replace the
            // team and update scores
            // competitions.get(HOME_TEAM_WON)
        }
        // elif{

        // }
        // }

        return "";
    }

    public void updateScores(String currentBestTeam, int pointsIncrease, HashMap<String, Integer> Scores) {

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
        String expected = "Python";

    }

}
