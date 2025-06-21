public class a70_selectionSort {
    public static void main(String[] args) {
        int arr[]={11,33,11,33,22};


// Selection sort algorithm
for (int i = 0; i < arr.length - 1; i++) {
    int minIdx = i;
    for (int j = i + 1; j < arr.length; j++) {
    if (arr[j] < arr[minIdx]) {
        minIdx = j;
    }
    }
    // Swap arr[i] and arr[minIdx]
    int temp = arr[i];
    arr[i] = arr[minIdx];
    arr[minIdx] = temp;
}

// Print sorted array
for (int num : arr) {
    System.out.print(num + " ");
}

    }
}