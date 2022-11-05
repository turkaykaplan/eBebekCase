import java.util.Scanner;

public class KullaniciGirisiDONGUSUZ {
    public static void main(String[] args) {
        String userName, password, select, newPassword;
        Scanner yazdir = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı girin: ");
        userName = yazdir.nextLine();
        System.out.println("Şifrenizi girin: ");
        password = yazdir.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız.");

        } else {
            System.out.println("Şifreniz yanlış. Şifre sıfırlamak için '1' ya da '2' yazın");
            select = yazdir.nextLine();

            if (select.equals("1")) {

                System.out.println("Yeni şifreyi girin: ");
                newPassword = yazdir.nextLine();
                if (!newPassword.equals("java123")) {
                    System.out.println("Sifreniz oluşturuldu.");

                }else if (newPassword.equals("java123")) {
                        System.out.println("Yeni şifreniz eskisi sifrenizle aynı olamaz. Lütfen başka bir şifre giriniz.");
                        System.out.print("Şifreniz: ");
                        newPassword = yazdir.nextLine();
                            if (!newPassword.equals(password)) {
                                System.out.println("Yeni şifreniz oluşturuldu!");

                            }
                }

            }else{
                System.out.println("Çıkış yaptınız!");}
        }

    }
}