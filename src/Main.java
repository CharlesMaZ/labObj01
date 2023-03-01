import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Point p1 = new Point(2, 3);

        System.out.println(p1.x);
        // locale.ENGHLISH - format angielski dodający kropki
        String s = String.format(Locale.ENGLISH,"<line y1=\"%f\" x1=\"%f\" y1=\"%f\" x1=\"%f\" stroke=\"green\" />");
        System.out.println(s);

        int array[] = new int[4];
        array[1] = 2;


    }


}