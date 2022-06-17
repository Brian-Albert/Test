//package app.main;
public class Loop {
    public static void main(String[] args) throws Exception {
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }

        //array
        System.out.println();
        System.out.println("Array");
        int[] bilangandesimal = {3,4,5,6,7,8,9,10,11,12,13};
        for(int i=0;i<9;i++){
            System.out.println("Bilangan ke-"+i+"="+ bilangandesimal[i]);
        }
        
        System.out.println();
        for(int i:bilangandesimal){
            System.out.print(i+",");
        }

        System.out.println();
        for(int i=0;i<bilangandesimal.length;i++){
            System.out.println("Bilangan ke-"+i+"="+ bilangandesimal[i]);
        }

        System.out.println();
        int i =0;
        while(i<=10){
            System.out.print("i="+i+",");
            i+=1;
        }
        System.out.println("");
        System.out.println();
        i =0;
        do{
            System.out.print("i="+i+",");
            i+=1;
        }while(i<=10);

    }
}