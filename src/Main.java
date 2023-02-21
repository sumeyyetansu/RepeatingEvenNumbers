import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 6, 4, 6, 2, 7 ,9, 2, 3, 5, 6, 4};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(i != j && list[i] % 2 == 0){
                    if(!isFind(dublicate, list[i])) {
                        dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int value : dublicate){
            if(value != 0){
                System.out.print(value + " ");
            }
        }
    }
}