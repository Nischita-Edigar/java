class TestStringComparision{
    public static void main(String args[]){
        String s1 = "java";
        String s2 = "java";
        String s3 = "programming";
        String s4 = "JAVA";
        String s5 = new String("java");
        //Using equals method
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        //using == operator
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        //using compare to method
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}