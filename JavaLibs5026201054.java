import javax.swing.JOptionPane;

public class JavaLibs5026201054 {
    public static void main(String[] args) {

JOptionPane.showMessageDialog(null,"Halo semua, Saya Ernando","Salam Kenal",JOptionPane.PLAIN_MESSAGE);

JOptionPane.showInputDialog(null,"Nama Anda","Dialog Box",2,null,null,"Ketik Sesuatu.");

String[] acceptableValues = {"15-17 tahun", "Lebih dari 17 tahun"};
JOptionPane.showInputDialog(null,"Umur Anda","Dialog Box",2,null,acceptableValues,acceptableValues[1]);

JOptionPane.showInputDialog(null,"Buah Kesukaan","Dialog Box",2,null,null,"Ketik Sesuatu.");

    }
}
