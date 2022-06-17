import java.util.Scanner;
public class Winar{

    public void bersihkanlayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
	
	static int opsi;
	static int susi = 213456;
	int budi = 314865;
	int saldo_Susi = 1000000;
	int saldo_Budi = 0;
	int rekening;
	int[] mutasi = new int[100];
	int index = 0;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Winar function = new Winar();
		while(opsi!=3) {
			System.out.println("Selamat Datang Di Bank");
			System.out.println("Nama : Susi");
			System.out.println("No rek: "+ susi);
			System.out.println("1. Transfer");
			System.out.println("2. Cek Mutasi");
			System.out.println("3. Keluar");
			System.out.print("Pilih Menu : ");
			opsi = keyboard.nextInt();
            function.bersihkanlayar();
				switch(opsi) {
					case 1 : function.transfer(keyboard);break;
					case 2 : function.mutasi(keyboard);break;
				}
		
			
		}
		
	}
	
	
	public void transfer(Scanner keyboard) {
		int jumlah=0;
		int opsi1=0;
			while(opsi1!=2) {
				System.out.println("Menu Transaksi");
				System.out.println("==============");
				System.out.println("Nama : Susi");
				System.out.println("Sisa Saldo : "+ saldo_Susi);
				System.out.println("1. Transfer");
				System.out.println("2. Keluar");
				System.out.print("Pilih Menu : ");
				opsi1 = keyboard.nextInt();
				switch(opsi1) {
				case 1 : System.out.print("Masukkan No.Rekening Yang Ingin Ditransfer : ");
					rekening = keyboard.nextInt();
					if(rekening == budi) {
						System.out.println("Rekening Yang Ingin Ditransfer : Budi");
						do {
						System.out.print("Jumlah Yang Ingin Ditransfer : ");
						jumlah = keyboard.nextInt();
						System.out.println("Transaksi sebesar : "+jumlah);
							if(jumlah > saldo_Susi) System.out.println("Saldo Tidak Mencukupi");
							
							else{
								System.out.println("Transaksi Berhasil");
							}
						}
						while(jumlah > saldo_Susi);
						saldo_Budi += jumlah;
						saldo_Susi -= jumlah;
						mutasi[index] = jumlah;
						index++;
						break;
					}
					else {
						System.out.println("No Rekening Salah");
					}
				}
			}
			
		}
	public void mutasi(Scanner keyboard) {
		int opsi2 = 0;
			while(opsi2 != 2) {
				System.out.println("Mutasi saldo");
				System.out.println("1. Cek Mutasi");
				System.out.println("2. Keluar");
				System.out.print("Pilih Menu : ");
				opsi2 = keyboard.nextInt();
				if(opsi2 == 1) {
					for(int i = 0; i < index; i++) {
					    System.out.println("Susi transfer sebesar " + mutasi[i] + " ke rekening Budi");	    
					}
					if(index == 0) {
						System.out.println("Belum Ad Mutasi");
					}
				
				}
				
				else if(opsi2==2) {
					break;
				}
					
			}
				
	}	
}