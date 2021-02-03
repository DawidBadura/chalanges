import java.util.Arrays;

public class Greed{
    public static int greedy(int[] dice){
        int[] arr = new int[6];
        int points=0;
        for(int i=0;i<5;i++)
        {
            arr[dice[i]-1]++;
        }
        if(arr[0]>=3){arr[0]-=3;points+=1000;}
        points+=(100*arr[0]);

        for(int i=1;i<6;i++)
        {
            if(arr[i]>=3){points+=(i+1)*100;arr[i]-=3;}
        }
        points+=(arr[4]*50);
        return points;}
}