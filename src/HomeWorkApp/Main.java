package HomeWorkApp;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public static void main(String[] args) {
        new Main().oneThreadsArray();
        new Main().twoThreadsArray();
    }
    private void calcArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * (Math.cos(0.4f + i / 2)));
        }
    }
    private void oneThreadsArray() {
        long a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            a = System.currentTimeMillis();
        }
            calcArray(arr);
            System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    private void twoThreadsArray() {
        long a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            a = System.currentTimeMillis();
        }
        Thread thread1 = new Thread(() -> {
            float[] a1 = new float[h];
            System.arraycopy(arr, 0, a1, 0, h);
            calcArray(a1);
            System.arraycopy(a1, 0, arr, 0, h);
            });

        Thread thread2 = new Thread(() -> {
            float[] a2 = new float[h];
            System.arraycopy(arr, h, a2, 0, h);
            calcArray(a2);
            System.arraycopy(a2, 0, arr, h, h);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);

        }
}