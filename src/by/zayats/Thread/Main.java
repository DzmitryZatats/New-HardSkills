package by.zayats.Thread;

public class Main {

    public static void main(String[] args) {

//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread);
//
//
//        new MyThread("Первый поток. ").start();
//        new MyThread("Второй поток. ").start();
//        new MyThread("Третий поток. ").start();
//        new MyThread("Четвертый поток. ").start();
//        new MyThread("Пятый поток. ").start();
//
//        for (int i = 0; i < 100; i++) {
//
//            if(i % 10 == 0){
//                System.out.println(i);
//            }
//            System.out.println(i);
//        }

        System.out.println("Main thread started...");
        Thread myThread1 = new Thread(new MyThread1(), "MyThread1 ");
        myThread1.start();
        System.out.println("Main thread finished");


    }
}
