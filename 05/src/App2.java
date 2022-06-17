import java.util.ArrayList;
import java.util.Scanner;
public class App2 {
    //cetak menu
    public static void cetakMenu(){ // bs dipangil tanpa perlu mendefinisikan objek terlbih dahulu 
        System.out.println("Selamat datang di Bank ABC !");
            System.out.println("----------------------------");
            System.out.println("1. Daftar No rekening baru");
            System.out.println("2. Transfer");
            System.out.println("3. Cetak log mutasi");
            System.out.println("4. Print semua menu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda [1/2/3/4/5] ? ");
            //cetakMenu2();, error karena tdk bs memanggil yg non static
    } 
    // cetak menu non static
    public void cetakMenu2(){
        System.out.println("Selamat datang di Bank ABC !");
        System.out.println("----------------------------");
        System.out.println("1. Transfer");
        System.out.println("2. Cetak log mutasi");
        System.out.println("3. Print semua nasabah");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Anda [1/2/3] ? ");
        cetakMenu();
    } 

    public static int cekNoRek(String NoRek, ArrayList<Nasabah2> dataNasabah){
        int idx = 0;
        //Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
        for(Nasabah2 nsb : dataNasabah){
            if(nsb.getNoRek().equalsIgnoreCase(NoRek)){
                //System.out.println("No rekening ditemukan pada indeks ke-" + idx);
                return idx;
            } 
            idx+=1;
        } 
        return idx = -1;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Nasabah2> dataNasabah = new ArrayList<Nasabah2>();
        dataNasabah.add(new Nasabah2("1234567", "Susi"));
        dataNasabah.add(new Nasabah2("7654321", "Budi"));
        dataNasabah.add(new Nasabah2("100", "Han"));



        //Nasabah2.cetakNomorRekening();
        //Nasabah2. // gk akan ada fungsi cetakNama(); krn bukan static. Kalo bkn static maka kita perlu buat jadi objek caranya dgn: 
        //Nasabah2 susi = new Nasabah2("1234567", "Susi");  //= objek
        // susi.Nama = "Susi";
        // susi.NoRek = "1234567"; //Kita mau ubah norek sbg sebuah class variabel
        //susi.cetakNama(); // berhasil!
        //cth fungsi yg pake static adlh Math
        //Math. // bs panggil apapun
        //utilitas: biasanya utk ormat tanggal, melakukan angka dibelakang koma,  
        // Nasabah2 budi = new Nasabah2();
        // budi.Nama = "Budi";
        // budi.NoRek = "7654321";

        // Nasabah2 han = new Nasabah2();
        // han.Nama = "Han";
        // han.NoRek = "2345678";

        // System.out.println();
        // System.out.println(susi);
        // System.out.println(susi.getNama() + " " + susi.getNoRek()); //class variabel
        // System.out.println(budi.getNama() + " " + budi.getNoRek()); //class variabel
        // System.out.println(han.getNama() + " " + han.getNoRek()); //class variabel
        // System.out.println(); 

        int pilihan;
        String yn = "y";
        Scanner input = new Scanner(System.in);
        //int idx = 0;
        //String[] logMutasi = new String[idx+2];
        //String[] logMutasi = new String[100];
        //logMutasi[0] =
        // ArrayList<String> logMutasi = new ArrayList<String>();
        // logMutasi.add(new ArrayList<String>());
        ArrayList <String> logMutasiSusi = new ArrayList<String>();
        ArrayList <String> logMutasiBudi = new ArrayList<String>();


        do{
            cetakMenu();
            pilihan = input.nextInt();
            if(pilihan == 1){
                int n;
                do{
                    System.out.print("Berapakah nasabah baru yang ingin anda tambahkan? ");
                    n = input.nextInt();
                } while(n <= 0);
                for(int i=0; i<n; i++){
                    String noRekBaru;
                    String namaNasabahBaru;
                    System.out.print("Masukkan nomor rekening baru: ");
                    noRekBaru = input.next();
                    System.out.print("Masukkan nama nasabah baru: ");
                    namaNasabahBaru = input.next();
                    System.out.println();
                    dataNasabah.add(new Nasabah2(noRekBaru, namaNasabahBaru));
                    System.out.println("Data nasabah baru sukses ditambahkan");
                }
            } else if(pilihan == 2){
                String noRekTujuan = "";
                String noRekAsal = "";
                int nominal;
                //1. masukkan no rek asal
                System.out.print("Masukkan Nomor Rekening Asal   :");
                noRekAsal = input.next();
                Nasabah2 rekAsal, rekTujuan;
                if(noRekAsal.length() == 7){
                    if(cekNoRek(noRekAsal, dataNasabah) >= 0){
                        rekAsal = dataNasabah.get(cekNoRek(noRekAsal, dataNasabah));
                        //2. Masukkan no rek tujuan
                        input.nextLine();
                        System.out.print("Masukkan Nomor Rekening Tujuan :");
                        noRekTujuan = input.nextLine();
                        if(noRekTujuan.length() == 7){
                            if(cekNoRek(noRekTujuan, dataNasabah) >= 0){
                                //3. masukkan nominal tranfer
                                rekTujuan = dataNasabah.get(cekNoRek(noRekTujuan, dataNasabah));
                                System.out.print("Masukkan Nominal :");
                                nominal = input.nextInt();
                                //4. cek apakah nominal cukup 
                                if((rekAsal.getSaldo()-100000) >= nominal){
                                    rekAsal.tambahSaldo(nominal * -1);
                                    rekTujuan.tambahSaldo(nominal);
                                    
                                    //jika ckp maka tranfer dan tulis log berita
                                    logMutasiSusi.add("Transfer ke noRek " + rekTujuan.getNoRek() + " (" + rekTujuan.getNama() +") sebesar Rp. " +  nominal);
                                    logMutasiBudi.add("Kredit dari noRek " + rekAsal.getNoRek() + " (" + rekAsal.getNama() +") sebesar Rp. " +  nominal);
                                    System.out.println("Transfer berhasil, Sisa Saldo: " + rekAsal.getSaldo());
                                    dataNasabah.set(cekNoRek(noRekAsal, dataNasabah),rekAsal);
                                    dataNasabah.set(cekNoRek(noRekTujuan, dataNasabah), rekTujuan);
                                } else {
                                    System.out.println("Saldo tidak mencukupi");
                                }
                                

                            } else {
                                System.out.println("No rekening tujuan tidak terdaftar");
                                continue;
                            }
                        } else {
                            System.out.println("No rekening harus 7 digit");
                            continue;
                        }
                    } else {
                        System.out.println("No rekening asal tidak terdaftar");
                        continue;
                    }
                } else {
                    System.out.println("No rekening harus 7 digit");
                    continue;
                }
            } else if (pilihan == 3){
                for(String mutasi : logMutasiSusi){
                    System.out.println(mutasi);
                }

            } else if (pilihan == 4){
                System.out.println("NoRek\t\tNama\tSaldo");
                for(Nasabah2 nsb2 : dataNasabah){
                    System.out.println(nsb2);
                }
            }
            else if (pilihan == 5){
                break;
            } else {
                System.out.println("Maaf, hanya bs input 1-3");
            }

        } while(yn.equalsIgnoreCase("y"));
         

    }
}
