public class Main {
    public static void main(String[] args) {


        double[] array;
        array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int a=1;
        for (int i = 0; i < array.length; i++) {

            System.out.println("Position number " + a++ + " - " + array[i]);
        }
    }
}
