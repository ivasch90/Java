package HomeWorkApp;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {
        oneThreadsArray();
        twoThreadsArray();
    }

    private static void oneThreadsArray() {
        long a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            a = System.currentTimeMillis();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * (Math.cos(0.4f + i / 2)));
            System.currentTimeMillis();
        }
        System.out.println(System.currentTimeMillis() - a);

    }

    private static void twoThreadsArray() {
        long a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            a = System.currentTimeMillis();
        }
        Thread thread1 = new Thread(() -> {
            float[] a1 = new float[h];
            System.arraycopy(arr, 0, a1, 0, h);
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a1, 0, arr, 0, h);
            });

        Thread thread2 = new Thread(() -> {
            float[] a2 = new float[h];
            System.arraycopy(arr, h, a2, 0, h);
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a2, 0, arr, h, h);

        });

        thread1.start();
        thread2.start();
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);

        }

}
