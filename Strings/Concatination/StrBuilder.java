class StrBuilder{
    public static void main(String args[]){
        StringBuilder s1 = new StringBuilder("java");
        StringBuilder s2 = new StringBuilder("programming");
        StringBuilder s = s1.append(s2);
        System.out.println(s.toString());
        System.out.println(s);
    }
}