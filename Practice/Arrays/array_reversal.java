class array_reversal{
    public static void main(String[] args) {
        int [] arr1 = {10,30,25,46,35};
        
        for(int i = arr1.length - 1;i >= 0; i--){
            System.out.println(arr1[i]);

        }
        int max = arr1[0];
        for(int i = 0; i<arr1.length;i++){
            if(max < arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println("max: " + max);

         int min = arr1[0];
        for(int i = 0; i<arr1.length;i++){
            if(min > arr1[i]){
                min = arr1[i];
            }
        }
        System.out.println("min: " + min);

    }


}

