class MyThread extends Thread{
    public void run(){
        int i = 0;
        while (i <= 10){
            System.out.println("running");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while (i <= 10){
            System.out.println("running2");
            i++;
        }
    }
}

class DemoThread{
    public static void main(String[] args){
        //System.out.println("")
        MyThread mt1 = new MyThread();
        MyThread2 mt2 = new MyThread2();
        mt1.start();
        mt2.start();
    }
}