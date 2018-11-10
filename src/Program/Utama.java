/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Fernandes_WB
 */
import java.util.*;
public class Utama {

    static List<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

    public static void sortingMenu() {
        int input = 0;
        if (mhs.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            do {

                System.out.println("");
                System.out.println("--------------------------");
                System.out.println("1. Sorting NIM");
                System.out.println("2. Sorting NAMA");
                System.out.println("3. Sorting IPK");
                System.out.println("4. Kembali ke menu awal");
                System.out.print("Pilih: ");
                Scanner s = new Scanner(System.in);
                input = s.nextInt();
                s.nextLine();
                switch (input) {
                    case 1:
                        Collections.sort(mhs, new SortingNim());
                        int counter = 1;
                        for (Mahasiswa opt : mhs) {
                            System.out.println("-------------------------");
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + opt.getNim());
                            System.out.println("Nama: " + opt.getNama());
                            System.out.println("IPK : " + opt.getIpk());
                            counter++;
                        }
                        break;
                    case 2:
                        Collections.sort(mhs, new SortingNama());
                        counter = 1;
                        for (Mahasiswa opt : mhs) {
                            System.out.println("-------------------------");
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + opt.getNim());
                            System.out.println("Nama: " + opt.getNama());
                            System.out.println("IPK : " + opt.getIpk());
                            counter++;
                        }
                        break;
                    case 3:
                        Collections.sort(mhs, new SortingIpk());
                        counter = 1;
                        for (Mahasiswa opt : mhs) {
                            System.out.println("-------------------------");
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + opt.getNim());
                            System.out.println("Nama: " + opt.getNama());
                            System.out.println("IPK : " + opt.getIpk());
                            counter++;
                        }
                        break;
                }
            } while (input != 4);
        }
    }

    public static void main(String args[]){
        int input = 0;
        do {
            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Masukan nim   : ");
                    String nim = s.nextLine();
                    System.out.print("Masukan nama  : ");
                    String nama = s.nextLine();
                    System.out.print("Masukan ipk   : ");
                    float ipk = s.nextFloat();
                    Mahasiswa m = new Mahasiswa(nim,nama,ipk);
                    mhs.add(m);
                    break;
                case 2:
                    if (mhs.isEmpty()) {
                        System.out.println("Data masih kosong");
                    } else {
                        System.out.println("-------------------------");
                        int counter = 1;
                        for (Mahasiswa mahasiswa : mhs) {
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + mahasiswa.getNim());
                            System.out.println("Nama: " + mahasiswa.getNama());
                            System.out.println("IPK : " + mahasiswa.getIpk());
                            counter++;
                        }
                    }
                    break;
                case 3:
                    sortingMenu();
                    break;
            }
        } while (input != 4);
    }
}

