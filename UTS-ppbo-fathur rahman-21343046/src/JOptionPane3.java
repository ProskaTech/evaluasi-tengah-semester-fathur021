/**
 *creted by 21343046_fathur rahman
 * 
 */
import javax.swing.JOptionPane;
public class JOptionPane3 {

   public static void main(String[] args) {
       String nilai = "", message = "";
        int angka;

        nilai = JOptionPane.showInputDialog("Masukkan Nilai : ");
        angka = Integer.parseInt(nilai);

        if(angka >= 0) {
            message = angka + " ini adalah  bilangan POSITIF";
        }
        else if(angka < 0) {
            message = angka + " ini adalah  bilangan NEGATIF";
        }
        else{
            message = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
}

