public class StringMutable {
    public static void main(String[] args) {

        String st = new String("lukasz");
        st +=" kowalski";

        System.out.println(st);

        for (int i = 0; i < 10; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("more");
    }
}
