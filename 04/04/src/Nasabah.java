public class Nasabah{

    //deklarasi variabel
    public String nama;
    public String rek;
    public int saldo;
    public int jumlah;
    
    public Nasabah (String nama, String rek, int saldo, int jumlah){
    this.nama = nama;
    this.rek = rek;
    this.saldo = saldo;
    this.jumlah = jumlah;
    } 


    @Override
    public String toString() {
        return "{" +
            " nama='" + nama + "'" +
            ", rek='" + rek + "'" +
            ", saldo='" + saldo + "'" +
            ", jumlah='" + jumlah + "'" +
            "}";
    } 

    // //buat method untuk ceksaldo
    
    // // public void ceksaldo(){
    // //     System.out.println("Nama Anda : "+nama);
    // //     System.out.println("Nomor Rekening Anda : "+rek);
    // //     System.out.println("Saldo Anda Saat Ini : "+saldo);
    // //     }
        
    // //     //method setorUang, return valuenya adalah saldo
        
    //     public int kasihUang(int jumlah){
    //     this.jumlah = jumlah;
    //     saldo = saldo-jumlah;
    //     return saldo;
    //     } 
        
        
    //     //method tarikUang, return valuenya adalah jumlah yg ditarik
        
    //     public int terimaUang(int jumlah){
    //     this.jumlah=jumlah;
    //     saldo=saldo+jumlah;
    //     return jumlah;
    //     }
        
    //     public static void main (String args[]){
        
        //buat object dari class nasabah
        // Nasabah nasabah1 = new Nasabah ("nasabah 1",123666,500000);
        // Nasabah nasabah2 = new Nasabah ("nasabah 2",1236666,300000);
        
        // nasabah1.ceksaldo();
        // nasabah2.ceksaldo();
        
        // //transfer
        // int jumlahtransfer=100000;
        
        // System.out.println("====Saldo nasabah setelah transfer sejumlah " +jumlahtransfer+ "====");
        
        // nasabah1.setorUang(nasabah2.terimaUang(jumlahtransfer));
        
        // nasabah1.ceksaldo();
        // nasabah2.ceksaldo();
        
        // }
        
}