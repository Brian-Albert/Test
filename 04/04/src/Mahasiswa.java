
public class Mahasiswa {
    public String nama;
    public int nim;
    public double ipk;
    //public [nama class] ([parameter])
    public Mahasiswa(String nama, int nim, double ipk){
        //this melambangkan class itu sendiri. lalu di set dengan variabel nama yang ada di parameter. 
        this.nama = nama; //this supaya gk ambigu.this biar gk bingung. 
        this.nim = nim;
        this.ipk = ipk;
    } 


    @Override
    public String toString() {
        return "{" +
            " nama='" + nama + "'" +
            ", nim='" + nim + "'" +
            ", ipk='" + ipk + "'" +
            "}";
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }
}