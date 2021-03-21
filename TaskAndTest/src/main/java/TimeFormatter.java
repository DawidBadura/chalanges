import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        List<String> listRes = new ArrayList<>();
        String result = "";
        final int secInMin=60;
        final int secInHour=secInMin*60;
        final int secInDay=secInHour*24;
        final int secInYear=secInDay*365;

        int temp=0;
        if(seconds==0) return "now";
        if(seconds>=secInYear){
            temp=seconds/secInYear;
            result = String.valueOf(temp)+" year";

            if(temp!=1)result+="s";

            seconds-=temp*secInYear;
            if (seconds>0) {
                listRes.add(result);
                result="";
            }
        }
        if(seconds>=secInDay){
            temp=seconds/secInDay;
            result = String.valueOf(temp)+" day";

            if(temp!=1)result+="s";

            seconds-=temp*secInDay;
            if (seconds>0) {
                listRes.add(result);
                result="";
            }
        }
        if(seconds>=secInHour) {
            temp=seconds/secInHour;
            result = String.valueOf(temp)+" hour";

            if(temp!=1)result+="s";

            seconds-=temp*secInHour;
            if (seconds>0) {
                listRes.add(result);
                result="";
            }
        }

        if(seconds>=secInMin) {
            temp=seconds/secInMin;
            result = String.valueOf(temp)+" minute";


            if(temp!=1)result+="s";

            seconds-=temp*secInMin;
            if (seconds>0) {
                listRes.add(result);
                result="";

            }


        }

        if(seconds>=1) {

            temp=seconds;
            result = String.valueOf(temp)+" second";

            if(temp!=1)result+="s";
        }

        if (listRes.size()>0&&result!="") result= " and " + result;

        System.out.println(listRes);

        return listRes.stream()
                .collect(Collectors.joining(", "))+result;
    }
}