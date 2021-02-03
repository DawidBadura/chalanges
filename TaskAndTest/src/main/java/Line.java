

public class Line {
    public static String WhoIsNext(String[] names, int n)
    {
        int x=1;
        while(x* names.length<n){
            n-=names.length*x;
            x*=2;
        }
        if(n%x==0) return names[n/x-1];
        else return names[n/x];
    }
}