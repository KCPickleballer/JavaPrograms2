public class TeenNumberChecker {

    public static void main(String[] args) {
        boolean hasT = hasTeen(9, 99, 10);
        System.out.println("hasT " + hasT);
    }

    public static boolean hasTeen(int x, int y, int z){
        boolean hasT = false;

        if ( (x >= 13 && x <= 19 ) || ( y >= 13 && y <= 19 ) || (  z >= 13 && z <= 19 )) {
            hasT = true;
        }
        return (hasT);

    }
}
