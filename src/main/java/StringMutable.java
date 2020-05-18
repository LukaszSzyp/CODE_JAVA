public class StringMutable {
    public static void main(String[] args) {

        String st = new String("lukasz");
        st += " kowalski";

        System.out.println(st);

        mark: for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    break mark;
                }
                System.out.println(i);
            }
        }
        System.out.println("more");
    }
}
