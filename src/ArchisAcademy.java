package src;

public class ArchisAcademy {
    public static void main(String[] args) {
        System.out.println("Archis Academy Steak ve Heap Konu Anlatımı");
        int a = 5;
        int b = a;
        a=10;
        System.out.println("Stack'ta tutulan sayı :"+b);

        int[] sayiOne={1,2,3};
        int[] sayiTwo=sayiOne;

        sayiOne[0]=100;
        System.out.print("Heap'ta tutulan sayı = ");
        for (int number : sayiTwo){
            System.out.print(number+" , ");
        }

    }
}
