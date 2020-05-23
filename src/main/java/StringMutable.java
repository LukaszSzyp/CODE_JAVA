public class StringMutable {
    public static void main(String[] args) {

       String word = "something";

       char[] chars = word.toCharArray();

       System.out.println(chars.length);

       char sign = word.charAt(2);

       System.out.println(sign);

       char[] chars1 = new char[3];
       word.getChars(0,3,chars1,0);
       System.out.println(chars1);


    }
}
