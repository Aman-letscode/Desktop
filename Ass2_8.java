public class Ass2_8 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("AMAN");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.indexOf("M"));
        System.out.println(s.charAt(2));
        System.out.println(s.lastIndexOf("A"));
        System.out.println(s.delete(0, 1));
        System.out.println(s.reverse());
        System.out.println(s.length());
        System.out.println(s.substring(2));
        System.out.println(s.replace(0, s.length(), "AGRAWAL"));
    }

}
