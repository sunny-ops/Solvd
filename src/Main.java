//public class Main {
//    public static void main(String [] args) {
//        String name = args[0];
//        System.out.println("Hello " + name);
//        int[] arr = new int[]{10,9,8,7,6,5,4,3,2,1};
//        quicksort(arr, 0, arr.length - 1);
//        for (int num: arr) {
//            System.out.println(num);
//        }
//    }
//
//    private static void quicksort(int[] arr, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//        int left = start, right = end;
//        int mid = (left + right) / 2;
//        int pivot = arr[mid];
//        while (left <= right) {
//            while (left <= right && arr[left] < pivot) {
//                left++;
//            }
//            while (left <= right && arr[right] > pivot) {
//                right--;
//            }
//            if (left <= right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//        quicksort(arr, start, right);
//        quicksort(arr, left, end);
//
//    }
//}
