public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println("First test " + getDurationString(182, 31));
        System.out.println("Second test " + getDurationString(1000));
    }

    public static String getDurationString(int minIn, int secondsIn ){
        String timeStr = "Invalid parameters";
        if (minIn > 0 && (secondsIn >= 0 && secondsIn <= 59)){
            int hoursOut = minIn / 60;
            int minOut = minIn % 60;

            timeStr = hoursOut + "h " + minOut + "m " + secondsIn + "s";
        }

        return timeStr;
    }

    public static String getDurationString(int secondsIn ){
        String timeStr = "Invalid parameters";

        if (secondsIn > 0){
            int minOut = secondsIn / 60;
            int secOut = secondsIn % 60;
            timeStr = getDurationString(minOut, secOut);
        }

        return timeStr;
    }



}
