import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) throws Exception {
        int[] nomor = new int[10]; 
        nomor[4] = 99;
        for(int i: nomor){
            System.out.print(i + " ");
        } 
        System.out.println();
        //30 03
        System.out.println();
        System.out.println("Array List");
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
        //ArrayList<String> mahasiswa = new ArrayList<String>();
        //Mahasiswa jovin = new Mahasiswa("a", 123);
        mahasiswa.add(new Mahasiswa("a", 123, 4.0));
        mahasiswa.add(new Mahasiswa("b", 123, 4.0));
        mahasiswa.add(new Mahasiswa("c", 123, 4.0));
        mahasiswa.add(new Mahasiswa("d", 123, 4.0));
        mahasiswa.add(new Mahasiswa("e", 123, 4.0));

        // System.out.println(mahasiswa.get(4));
        // mahasiswa.remove(4);
        mahasiswa.set(4, new Mahasiswa("ab", 123, 4.0));

        for(Mahasiswa mhs : mahasiswa){
            //System.out.println(mhs.nama + " " + mhs.nim + " " + mhs.ipk);
            System.out.println(mhs);
        }


    }
}
