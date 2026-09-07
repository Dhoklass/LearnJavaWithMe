interface bicycle{
    void applybrake(int decrement);
    void speedup(int increment);
}

interface ride{
    void riding();
    }

class cycle implements bicycle, ride{       //multiple inheritance! A -> C, B -> C
    int speed = 7;
    public void applybrake(int decrement){
        speed  = speed - decrement;
    } 

    public void speedup(int increment){
        speed = speed + increment; 
    }

    public void riding(){
        System.out.println("people are riding the cycle!");
    }

}


class interface_example{
    public static void main(String[] args) {
        cycle c1 = new cycle();
        c1.speedup(10);
        c1.applybrake(5);  
        c1.riding();
        
    }
}