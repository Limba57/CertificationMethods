package ReturningDataFromMethods;

public class returningDtaFromMethods {

    public static void main(String[] args) {

        int num = 2;
        String word = "azert";

        num(num);
        word(word);
        System.out.println(num + word);

        word = word(word);
        System.out.println(num + word);

        num = num(num);
        System.out.println(num + word);
    }

    public static int num(int num) {
        num++;
        return num;
    }

    public static String word(String word) {
        word += "a";
        return word;
    }
}
