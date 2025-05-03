package MultiplicationTable;

class Multiplication {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 0; i <= 10; i++) {
            int table = i * n;
            System.out.println(n + " x " + i + " = " + table);
        }

    }
}
