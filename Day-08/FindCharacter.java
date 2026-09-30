public class FindCharacter {
    public static void main(String[] args) {

        String text = "Java Backend";
        char target = 'B';
        int position = text.indexOf('B');

        if (position != -1) {
            System.out.println("Character found ");
        }
        else {
            System.out.println("Character not found");
        }
    }
}
