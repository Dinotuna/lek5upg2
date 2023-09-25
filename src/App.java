import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){
        int[] tangentbordfält = new int[4];
        tangentbordfält[0] = tangentbord.nextInt();
        tangentbordfält[1] = tangentbord.nextInt();
        tangentbordfält[2] = tangentbord.nextInt();
        tangentbordfält[3] = tangentbord.nextInt();
        System.out.println(tangentbordfält[0]+" "+tangentbordfält[1]+" "+ tangentbordfält[2]+" "+tangentbordfält[3]);
        int tal1 = tangentbordfält[0];
        System.out.println(tangentbordfält[0]+" "+ tangentbordfält[3]);

        }
    }
}
