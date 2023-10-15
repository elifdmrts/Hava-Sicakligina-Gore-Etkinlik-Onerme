import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hava;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Hava Kaç Derece?: ");
        hava=scanner.nextInt();

        if(hava<5){
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (hava>5 && hava<15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (hava>15 && hava<25) {
            System.out.println("Pikniğe Gidebilirsiniz.");
        } else if (hava>25) {
            System.out.println("Yüzmeye Gidebirsiniz");
        }
    }
}