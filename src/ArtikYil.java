import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        boolean tekrar=true;
        do{


        System.out.println("Artık yıl hesaplama\nBir yıl giriniz");
        int yil=girdi.nextInt(), kalan,kalan1;

        kalan1=yil%400;
        kalan=yil%4;
        if(kalan1==0){
            System.out.println("girdiğiniz "+yil+" yılı artık yıldır");
        } else if(kalan==0 && ((kalan1%100)==0)){
             System.out.println("girdiğiniz "+yil+" yılı artık yıl değildir");
          } else{
             System.out.println("girdiğiniz "+yil+" yılı artık yıldır");
          }


            System.out.println("işlem tekrar etsinmi 1 or 2");
            int tek= girdi.nextInt();
            if(tek==2) tekrar=false;
            else tekrar=true;

        } while (tekrar);






        /*if(yil<400){
            kalan=yil%4;
            if(kalan==0)System.out.println("girdiğiniz "+yil+" yılı artık yıldır");
            else System.out.println("girdiğiniz "+yil+" yılı artık yıl değildir");
        }else{
            kalan=yil%4;
            kalan1=yil%400;
            if(kalan==0 || kalan1==0){
                System.out.println("girdiğiniz "+yil+" yılı artık yıldır");
            } else System.out.println("girdiğiniz "+yil+" yılı artık yıl değildir");
        }*/


    }
}
