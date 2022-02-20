import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211139 {
    public static void main(String[] args) {

       //Kumpulan Variabel
       String Nama, Umur, Asal, Hobi, Makanan, Impian, Warna, Digit1, Digit2;
       int IntDigit1;
       double HitungDigit, doubleDigit;

       //Mulai Metode
        String[] options = new String[]{"Boleeh","Gx dlu deh kak"};
        int introInt = JOptionPane.showOptionDialog(null, "Hai orang yang disana! Main yukk!", "apa nih?", 0, 2, null, options, options[0]);
        if (introInt != 0 ){
            JOptionPane.showMessageDialog(null, "Yah sombong banget sihh","Gamau temenan ahh huft",2);
            System.exit(0);
        };

        Nama = (String)JOptionPane.showInputDialog((Component) null, "Kenalan dong! Nama kamu siapa?", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Umur = (String)JOptionPane.showInputDialog((Component) null, "Umur kamu sekarang berapa nih?", "Kenalan dong!", 3, (Icon) null, (Object[]) null, "");

        Asal = (String)JOptionPane.showInputDialog((Component) null, "Kamu asalnya darimana?", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Hobi = (String)JOptionPane.showInputDialog((Component) null, "Kamu kalo bosen sukanya ngapain ya?? ", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Makanan = (String)JOptionPane.showInputDialog((Component) null, "Apa makanan kesukaan kamu?", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Impian = (String)JOptionPane.showInputDialog((Component) null, "Kamu kalo gede maunya jadi apa?", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Warna = (String)JOptionPane.showInputDialog((Component) null, "Warna favorit kamu spill disini dong!", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Digit1 = (String)JOptionPane.showInputDialog((Component) null, "Masukin angka desimal diantara 0-1", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        Digit2 = (String)JOptionPane.showInputDialog((Component) null, "Satu lagi angkanya diantara 11-20", "Kenalan dong!", 3, (Icon)null, (Object[])null, "" );

        doubleDigit = Double.parseDouble(Digit1);
        IntDigit1 = Integer.parseInt(Digit2);
        HitungDigit = doubleDigit*IntDigit1;

        //Selesai kenalan
        String[] options2 = new String[]{"Apa tuh kak?"};
        int introInt2 = JOptionPane.showOptionDialog(null, "Makasih udah mau kenalan! Aku mau pamer betapa pinternya aku..", "uwoh", 0, 2, null, options2, options2 [0]);

        //Mulai gombal
        String[] options3 = new String[]{"enggak kak.."};
        int introInt3 = JOptionPane.showOptionDialog((Component) null, "Kamu tau gak kalo " +Digit1 + " dikali sama " +Digit2 +"\nsama dengan " +HitungDigit +"?", "hah?", 0, 2, null, options3, options3 [0]);

        String[] options4 = new String[]{"emm apatuh?"};
        int introInt4 = JOptionPane.showOptionDialog((Component) null, "Oh, gatau ya? Yaudah deh aku kasih tau yang kamu tau aja", "hah?", 0, 2, null, options4, options4 [0]);

        JOptionPane.showMessageDialog((Component) null, "I Love You So Much <3");
        //Akhir gombal
    }
}//Ujung class
