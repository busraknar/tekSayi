
import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
        int t, toplam=0;
        Scanner input= new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz:");
            t= input.nextInt();
            if(t%4==0){
                toplam+=t;
            }
        }while(t%2==0);
        System.out.println("4 e bölünen sayıların toplamı:"+ toplam);

    }
}
