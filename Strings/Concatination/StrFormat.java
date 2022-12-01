class StrFormat{
    public static void main (String args[]){
        String s1 = new String("java");
        String s2 = new String(" programming");
        String s3 = String.format("%s%s",s1,s2);
        System.out.println(s3.toString());
    }
}
