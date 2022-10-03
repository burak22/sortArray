import java.util.Scanner;

public class Pratik {

    public static void main(String[] args) {
        //Arrayi oluşturma
        Scanner sc = new Scanner(System.in);
        System.out.print("Arrayinizin uzunluğu: ");
        int length = sc.nextInt();
        int[] mainArray = new int[length];
        for (int i = 1; i <= length; i++) {
            System.out.print("Arrayinizin " + i + ". Elemanı: ");
            mainArray[i-1] = sc.nextInt();
        }
        sc.close();

        //Arrayi sıralama
        int[] sortedArray = new int[mainArray.length];
        int[] puppetArray = mainArray.clone();
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < puppetArray.length; i++) {
            for (int j : puppetArray) {
                if(j<smallest){
                    smallest = j;
                }
            }
            //En küçük değeri bulduktan sonra arrayden kaldırıyoruz ki bir sonraki döngüyü etkilemesin
            sortedArray[i] = smallest;
            puppetArray[findIndexOf(smallest, mainArray)] = Integer.MAX_VALUE;
            smallest = Integer.MAX_VALUE;
        }

        //Arrayi ekrana yazdırma
        System.out.print("\nArrayiniz: ");
        for (int i : mainArray) {
            System.out.print(i + " ");
        }
        System.out.print("\n\nSorted Arrayiniz: ");
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
    public static int findIndexOf(int n, int[] array){
        for (int i = 0; i < array.length; i++) {
            if(n == array[i]){
                return i;
            }
        }
        return -1;
    }
}
