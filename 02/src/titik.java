//package app.main;

public class titik {
    private double x,y; //hanya bisa di akses dari dalam class nya saja. dibuatkan 
    final int para_umur = 10; 
    public final float pi = 22/7;
    public titik(){

    }
    public titik(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(){
        this.y = y;
    }


    public void tampil(){ //prosedur, tdk mengembalikan nilai sama sekali
        //para_umur += 1; // error, krn dia sudah final, gk bs modifikasi lagi.  
        System.out.println("Selamat Datang");
    } 
    public String tampilData(){//function, yg mengembalikan suatu nilai 
        return "Halllloooo";
    }
}
