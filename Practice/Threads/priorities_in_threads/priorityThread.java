class myThr extends Thread{
    public myThr(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        //while (i<=5){ 
        System.out.println("i am a thread" + this.getName());
        //i++;
        //}
    }
}

class priorityThread{
    public static void main(String[] args) {
        
        
        myThr t1 = new myThr("Harry1");
        myThr t2 = new myThr("Harry2");
        myThr t3 = new myThr("Harry3");
        myThr t4 = new myThr("Harry4");
        myThr t5 = new myThr("Harry5");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}