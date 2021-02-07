import java.util.*;

class FactDecomp {

    public static String decomp(int n) {
        String result = "";
        int count;
        List<Long> primes = new ArrayList();
        boolean isPrime;

        for(int i=2; i<=n; i++) {
            isPrime=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) isPrime = false;
            }
            if(isPrime) primes.add((long)i);
        }

        for (Long temp: primes){
                count = 0;
                int m;
                for(int k=1; k<=n; k++){
                    m=k;
                while (m % temp == 0) {
                    m /= temp;
                    count++;
                }}
                if (count != 0) {
                    if (result != "") result += " * ";
                    result += Long.toString(temp);
                    if(count != 1) result+="^" + Integer.toString(count);
                }
            }

        return result;
    }
}
