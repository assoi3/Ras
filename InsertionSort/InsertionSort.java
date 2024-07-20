public class InsertionSort {
    public static void sort(int[] elements){
        for (int i=0; i< elements.length; i++) {
            int elementToSort = elem[i];        
        int j = i;

        while (j>0 && elementToSort <elements[j - 1]){
            elem[j] = elem[j - 1];
            j --;

        }


        elem[j] = elemToSort;
    }
}
}
