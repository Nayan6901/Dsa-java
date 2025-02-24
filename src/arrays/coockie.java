package arrays;

import java.util.Arrays;

public class coockie {
    public static void main(String[] args) {
        int []nums={};



    } public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        if(trainers.length==1){
            return 1;
        }
        int count=0;
        int i=0;
        int j=trainers.length-1;
        while(i<players.length){
            if(players[i]<=trainers[j]){
                count++;
                i++;
                j--;

            }
            i++;

        }
        return count+1;

    }
}
