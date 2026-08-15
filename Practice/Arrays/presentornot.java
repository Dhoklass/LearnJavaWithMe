class presentornot{
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};

        boolean hastheno = false;
        for(int num:nums){
            if(num==3){
                hastheno = true;
                break;
            } 
        }
        System.out.println(hastheno);
    }
}