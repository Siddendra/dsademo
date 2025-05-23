package dynamicprogram;

import java.util.Arrays;

public class RankTeamsByVotes {
    public static String rankTeams(String[] votes) {
        int voters = votes.length;
        int ranks = votes[0].length();

        int[][] voteGrid =  new int[26][ranks+1];

        for(int i=0; i<26; i++) {
            voteGrid[i][ranks] = i;
        }

        for(int i=0; i<voters; i++) {
            for (int j=0; j<ranks; j++) {
                voteGrid[votes[i].charAt(j) - 'A'][j]++;
            }
        }

        //Sort the Grid descending (highest votes first)

        Arrays.sort(voteGrid, (arr1, arr2) -> {
            for (int i=0; i<ranks; i++) {
                if(arr1[i] != arr2[i]) return arr2[i] - arr1[i];
            }
            return 0;
        });

        //Get the last Column and return as a string

        StringBuilder res = new StringBuilder();
        for (int i=0; i<ranks; i++) {
            res.append((char) (voteGrid[i][ranks]+'A'));
        }

        return res.toString();
    }


    public static void main(String args[]) {
        String[] votes = {"ABC","ACB","ABC","ACB","ACB"};

        String results = rankTeams(votes);
        System.out.println(results);
    }

}
