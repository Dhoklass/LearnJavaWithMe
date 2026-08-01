class MathematicalExpression{
    public static void main(String[] args) {
        int v = 5;
        int u = 5;
        int a = 2;
        int s = 6;
        double expression = ((Math.pow(v, 2) - Math.pow(u, 2))/ (2 * a * s));
        System.out.printf("%.2f", expression);
    }
}