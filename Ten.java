public class Ten {
        public static void main(String[] args) {
            // Anonymous array
            int[] numbers = new int[]{1, 2, 3};

            System.out.print("Elements of the anonymous array: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }

            displayArray(new int[]{4, 5, 6});
        }
        private static void displayArray(int[] arr) {
            System.out.print("\nElements of the array passed to the method: ");
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }


