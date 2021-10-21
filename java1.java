import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class java1 {

    static ArrayList listKeluarga = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void showMenu() throws IOException{

        System.out.println("______ Data Keluarga _______");
        System.out.println("[1] Daftar Anggota Keluarga");
        System.out.println("[2] Tambah data Keluarga");
        System.out.println("[3] Ubah data keluarga");
        System.out.println("[4] hapus data keluarga");
        System.out.println("[5] keluar");
        System.out.print("MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch(selectedMenu){
            case 1:
                TampilkanSemuaKeluarga();
                break;
            case 2:
                tambahKeluarga();
                break;
            case 3:
                ubahKeluarga();
                break;
            case 4:
                hapusKeluarga();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");

        }


    }

    static void TampilkanSemuaKeluarga(){
        if(listKeluarga.isEmpty()){
            System.out.println("Belum ada data");
        } else {
            // tampilkan semua Keluarga
            for(int i = 0; i < listKeluarga.size(); i++){
                System.out.println(String.format("[%d] %s",i, listKeluarga.get(i)));
            }
        }
    }

    static void tambahKeluarga() throws IOException{
        System.out.print("Nama Keluarga: ");
        String namaKeluarga = input.readLine();
        listKeluarga.add(namaKeluarga);
    }

    static void ubahKeluarga() throws IOException{
        TampilkanSemuaKeluarga();
        System.out.print("Pilih nomer Keluarga: ");
        int indexKeluarga = Integer.valueOf(input.readLine());

        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();

        // ubah nama Keluarga
        listKeluarga.set(indexKeluarga, namaBaru);
    }

    static void hapusKeluarga() throws IOException{
        TampilkanSemuaKeluarga();
        System.out.print("Pilih nomer Keluarga: ");
        int indexKeluarga = Integer.valueOf(input.readLine());
        // hapus Keluarga
        listKeluarga.remove(indexKeluarga);
    }

    public static void main(String[] args) throws IOException {

        do {
            showMenu();
        } while (isRunning);

    }

}
