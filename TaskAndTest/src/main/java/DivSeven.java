class DivSeven {
    public static long[] seven(long m) {
        int i = 0;
        while(m>99){
            m = m/10-m%10*2;
            i++;
        }
        long longArr[] = new long[2];
        longArr[0]=m;
        longArr[1]=i;
        return longArr;
    }
}
