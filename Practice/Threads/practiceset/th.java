class gm extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <= 100){
            System.out.println("Good Morning");
            i++;
            }
    }
}

class wc extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <= 100){
            System.out.println("Welcome");
            i++;
        }
    }
}

class th{
    public static void main(String[] args) {
        gm g1 = new gm();
        wc w1 = new wc();
        g1.start(); 
        // try {
        //     g1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        w1.start();
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        g1.setPriority(Thread.MAX_PRIORITY);
        
    }
}