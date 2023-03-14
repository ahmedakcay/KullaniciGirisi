import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        String username  , password , newpassword;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz :");
        username = scanner.nextLine();
        System.out.print("Şifreyi giriniz :");
        password = scanner.nextLine();

        if (username.equals("ahmet") && password.equals("hashaslimelemen")) {
            System.out.println("Başarılı giriş Yaptınız");

        }else {
            System.out.println("Hatalı giriş yaptınız");
            System.out.println("Şifreyi sıfırlamak ister misiniz?\n EVET için 1 e HAYIR için 2 ye basın ");

            choice = scanner.nextInt();


            switch (choice){
                case 1:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Yeni sifreyi giriniz :");
                    newpassword = scanner2.nextLine();
                    if (newpassword.equals("hashaslimelemen")){

                        System.out.println("Şifreniz bir önceki şifre ile aynı olamaz! Tekrar deneyiniz");
                    }else {
                        System.out.println(" Yeni şifreniz oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("İşleminiz sonlandırıldı");
                    break;
                default:
                    System.out.println("Geçerli bir sayı girmediniz !");

                    }

            }

        }
}
