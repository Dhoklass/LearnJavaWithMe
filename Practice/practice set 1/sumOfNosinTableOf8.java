class sumOfNosinTableOf8{
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for(int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
            sum += n*i;

        }
        System.out.println("Sum = " + sum);
    }
}