public class MergeSort {
    public void sort(int[] elem){
        int length = elem.length;
        int[] sorted = mergeSort(elem, 0,length - 1);
        System.arraycopy(sorted, 0, elem, 0, length);
    }



    private int[] mergeSort(int[] elem, int left, int right){
        if(left == right) return new int[] {elem[left]};
        int middle = left + (right - left) / 2;
        int[] leftArray = mergeSort(elem, left,middle);
        int[] rightArray = mergeSort(elem, middle + 1, right);
        return merge(leftArray, rightArray); 
    }




    int[] merge(int[] leftArray, int[] rightArray) {
        int leftLen = leftArray.length;
        int rightLen = rightArray.length;

        int[] target new int[leftLen + rightLen];
        int targePos = 0;
        int leftPos = 0;
        int rightPos = 0;




        while(leftPos < leftLen && rightPos < rightLen){

            int leftValue = leftArray[leftPos];
            int rightValue = rightArray[rightPos];
            if(leftValue <= rigghtValue){
                target[targetPos ++] = leftValue;
                leftPos++;

        } else {
            target[targetPos++] = leftValue;
            leftPos++;

        } else{
            target[targetPos++] = leftValue;
            rightPos++;
        }
    }


    while(leftPos < leftLen){
        target[targetPos++] = leftArray[leftPos++];
    }

    while (rightPos< rightLen){
        target[targetPos++] = rightArray[rightPos];
        leftPos++;
    } else {
        target[targetPos++] = rightValue;
        rightPos++;
    }
}


while (leftPos < leftLen) {

    target[targetPos++] = leftArray[leftPos++];
}


while (rightPos < rightLen) {
    target[targetPos++] = rightArray[rightPos++];
}
return target;
}
