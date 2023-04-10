public class Vehicle {
    public static void main(String[] args) {
        int a1 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));
        int a2 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));
        int a3 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));
        int a4 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));

        int d1 = (int) (Math.random() * 10);
        int d2 = (int) (Math.random() * 10);
        int d3 = (int) (Math.random() * 10);
        int d4 = (int) (Math.random() * 10);
        int d5 = (int) (Math.random() * 10);
        int d6 = (int) (Math.random() * 10);

        System.out.println((char)a1 + "" + (char) a2 + "" + d1 + "" + d2 + "" + (char) a3 + "" + (char) a4 + "" + d3 + "" + d4 + "" + d5 + "" + d6);
    }
}
