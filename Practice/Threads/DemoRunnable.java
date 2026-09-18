class MyThread1 implements Runnable{
    public void run(){
        for(int i = 0;i<=100;i++){
            System.out.println("I'm a THREAD HEHE , count: " + i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i = 0;i<=100;i++){
            System.out.println("I'm a THREAT HAHAHAHA, count: " + i);
        }
    }
}

class DemoRunnable{
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);

        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}