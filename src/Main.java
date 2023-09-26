
class Main {
    public static void main(String[] args) {
        int A[] = new int[]{4,0,-2,7,-5,-8,3,6,-1,5};
        int n = A.length;
        for(int i = 0; i < n; i++) {
            int randIndex = (int) (Math.random() * (n - i)) + i;
            System.out.print(" Index: " + i);
            System.out.print("  Random Index: " + randIndex);
            int number = A[i];
            A[i] = A[randIndex];
            A[randIndex] = number;
            System.out.print("  :  A = [");
            for(int j = 0; j < n; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.print("] \n");
        }

    }
}