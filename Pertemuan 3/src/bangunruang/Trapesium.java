package bangunruang;

public class Trapesium {
    public int luas = 0;

    public void luasTrapesium(int a, int b, int t) {
        luas= (a+b)/2*t ;
        System.out.println("Rumus Luas Trapesium = (a + b) x t / 2 "); 
        System.out.println("Luas Trapesium = "+ luas + " cm^2");   
    }
}
