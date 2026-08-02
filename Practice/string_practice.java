class string_practice{
    public static void main(String[] args){
        String str = "Harry";
        System.out.println("" + str);
        System.out.println("" + str.substring(1,4));
        System.out.println("" + str.replace("r", "p"));
        System.out.println("" + str.replace("rry", "ier"));
        System.out.println("" + str.replace("r", "ier"));
        System.out.println("" + str.startsWith("Ha"));
        System.out.println("" + str.startsWith("Va"));
        System.out.println("" + str.toLowerCase());

        String str2 = "   Harry   Yash   ";
        System.out.println("" + str2.replace(" ", "_"));

        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println("" + letter.replace("<|name|>", "Harry"));
    }
}