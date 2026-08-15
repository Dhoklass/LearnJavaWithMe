class practice{
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;

        int [] age = {12,14,16,43,25,64};
        
        System.out.println(marks[4]);

        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
            
        for(int i=0;i < age.length ;i++){
            System.out.println(age[i]);
        }
        // in reverse order
        for(int i = age.length -1;i >= 0 ;i--){
            System.out.println(age[i]);
        }

        System.out.println("\nprinting marks using element\n");
        for(int element: marks){
            System.out.println(element);
        }
    }
}