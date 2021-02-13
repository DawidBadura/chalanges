import java.util.*;

public class Kata
{
    public static long nextBiggerNumber(long n)
    {
        List<Long> ints = new ArrayList<>();
        List<Long> intsToSort = new ArrayList<>();
        long m=n;
        long result=0;
        long smalestBigger;
        long buff;

        while(m>9){
            ints.add(0,m%10);
            m/=10;
        }
        ints.add(0, m);

        for(int i=ints.size()-2; i>=0; i--){
            if(ints.get(i)<ints.get(i+1)){

                smalestBigger=ints.get(i+1);
                for(int j=0; j<intsToSort.size();j++){
                    if (intsToSort.get(j)<smalestBigger&&intsToSort.get(j)>ints.get(i)){
                        buff=smalestBigger;
                        smalestBigger=intsToSort.get(j);
                        intsToSort.set(j,buff);
                    }
                }

                ints.set(i+1, ints.get(i));
                ints.set(i, smalestBigger);

                intsToSort.add(ints.get(i+1));
                ints.remove(i+1);
                break;
            }
            else {
                intsToSort.add(ints.get(i+1));
                ints.remove(i+1);
            }
        }

        Collections.sort(intsToSort);

        for(Long l:ints){
            result*=10;
            result+=l;
        }

        for(Long l:intsToSort){
            result*=10;
            result+=l;
        }

        if(result>n) return result;
        else return -1;
    }
}