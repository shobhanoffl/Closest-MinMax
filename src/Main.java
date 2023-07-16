import java.util.Scanner;
public class Main {

    public static int getAbs(int a){
        if(a>0){
            return a;
        }else{
            return a*-1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int[] nos = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for(int i=0; i<size; i++){
            if(array[i]<min){
                min=array[i];
                minIndex=i;
            }else{
                if(array[i]>max){
                    max=array[i];
                    maxIndex=i;
                }
            }
        }
        System.out.println(getAbs(minIndex-maxIndex)+1);

    }
}