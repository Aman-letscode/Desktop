public class StringBuff {
    public static void main(String[] args) {
         //StringBuffer
         StringBuffer str1 = new StringBuffer("Walchand College");
         System.out.println(str1);

         //Append
         System.out.println(str1.append(" of Engineering"));

         //insert
         System.out.println(str1.insert(0,"The "));

         //Delete
         System.out.println(str1.delete(0, 4));

         //Reverse
         System.out.println(str1.reverse());
    
         //Replace
         System.out.println(str1.replace(0, 3, "THE"));

         //length
         System.out.println(str1.length());

         //subString
         System.out.println(str1.substring(4));

         //indexOf
         System.out.println(str1.indexOf("laW"));

         //subSequence
         System.out.println(str1.subSequence(0, 7));

    }
}
