/*
* In this program I Implement logic that translates stringifies integer value into numeric format
* */

public class NumberFormatter {
    public static void main(String[] args) {
        System.out.println(parseInt("-12345"));
        System.out.println(parseInt("1") + 1);
    }

    public static int parseInt(String str) {
        if (str.isEmpty()) {
            System.out.println("The string cannot be empty");
            System.exit(0);
        }
        String stringWithNumbers = str.substring(1);
        String stringWithSign = str.substring(0, 1);

        switch (stringWithSign) {
            case "+":
                return Integer.parseInt(stringWithNumbers);
            case "-":
                return -Integer.parseInt(stringWithNumbers);
        }
        return Integer.parseInt(str);
    }
}

