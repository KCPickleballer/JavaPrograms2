public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 36));

        String switchVal = "Dude";

        switch (switchVal.toLowerCase()) {
            case "dude":
                System.out.println("Dude!");
                break;
            case "butt":
                System.out.println("B");
                break;
            default:
                System.out.println("Neither");
        }

    }

    public static boolean isCatPlaying(boolean summer, int temp){
        int upperLim = 35;
        if (summer)
            upperLim = 45;

        if (temp >= 25 && temp <= upperLim)
            return true;
        else
            return false;


    }
}
