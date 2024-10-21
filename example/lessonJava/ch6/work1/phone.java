package lessonJava.ch6.work1;

public class phone implements GPS{

    public static String getLocation() {
        return switch ((int) (Math.random() * 4 + 1)){
            case 1 -> "N " + (Math.random() * 90) + "," + "E " + (Math.random() * 180);
            case 2 -> "N " + (Math.random() * 90) + "," + "W " + (Math.random() * 180);
            case 3 -> "S " + (Math.random() * 90) + "," + "E " + (Math.random() * 180);
            case 4 -> "S " + (Math.random() * 90) + "," + "W " + (Math.random() * 180);
            default -> "Invalid Location";
        };
    }
}
