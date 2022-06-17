public class Nasabah2 {
    private String NoRek; //objek variabel
    private String Nama; //objek variabel
    private int Saldo = 500000; 

    public Nasabah2(){ //constructor utk menggantikan:  Nasabah2 susi = new Nasabah2(); 
        this.Nama = "Tanpa Nama";
        this.NoRek = "0000000";
        this.Saldo = 123456; 
    }
    //menambah data
    public void tambahSaldo(int nominal){
        this.Saldo += nominal;
    }

    public Nasabah2(String NoRek, String Nama) {
        this.NoRek = NoRek;
        this.Nama = Nama;
        this.Saldo = 500000;
    }
     

    public String getNoRek(){
        return this.NoRek;
    } 

    public void setNoRek(String NoRek){ //tidak berfungsi karena cuma mau menaruh nilai saja
        this.NoRek = NoRek;
    }

    public String getNama(){
        return this.Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    } 

    public int getSaldo(){
        return this.Saldo;
    }

    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }


    public static void cetakNomorRekening(){ //bs Nasabah2.cetakNomorRekening();
        System.out.println("nomor rekening");
    } 

    public void cetakNama(){
        System.out.println("Nama");
    }


    @Override
    public String toString() {
        return getNoRek() + "\t\t" + 
               getNama() + " \t" +
               getSaldo();
    }


}
