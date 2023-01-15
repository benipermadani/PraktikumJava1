import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String namaDepan = "Beni";
        String namaTengah = " ";
        String namaBelakang = "Permadani";
        int usia = 18;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println("Nama Depan : ");
        namaDepan=scanner.nextLine();
        System.out.println("Usia : " );
        usia=scanner.nextInt();
        System.out.println("IPK :" + ipk);
        ipk=scanner.nextDouble();
        System.out.println("Nilai nilai Abjad");
        nilaiAbjad=scanner.next().charAt(0);
        System.out.println("Tampan :");
        tampan=scanner.nextBoolean();
        

        System.out.println("==================OUTPUT==================");
        System.out.println("Nama Tengah : " + namaTengah);
        System.out.println("Nama Belakang : " + namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah :" + targetTahunKuliah + "tahun");
        System.out.println("IPK :" + ipk);
        System.out.println("Nilai PBO :" + nilaiAbjad);
        System.out.println("Tampan :" + tampan);
        JOptionPane.showMessageDialog(null, "Hai, " +namaDepan + namaTengah + namaBelakang);



    }
}
