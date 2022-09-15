
public class BubbleSort {

	public static void main(String[] args) {
        int a[] = {9 , 10, 4, 5, 6, 3, 2, 1, 8, 7};
        for(int j = 0;j<a.length-1;j++){
            for (int i = 0; i < a.length-j-1; i++){
                int b;
                if(a[i]>a[i+1]){
                    b = a[i+1];
                    a[i+1] = a[i];
                    a[i] = b;
                }
            }
        }
        for (int i = 0; i < (a.length); i++){
            System.out.println(a[i]+" ");
        }
    }

}
