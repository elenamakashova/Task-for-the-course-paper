public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder ("А роза упала на лапу Азора");
        String string = str.toString();
        str.reverse();
        String string2 = str.toString();
        string = string.replace (" ", "");
        string2 = string2.replace (" ","");
        System.out.println(string);
        System.out.println(string2);
        System.out.println();
        if (string.equalsIgnoreCase(string2)) {
            System.out.println("Строка является палиндромной");
        }
        else System.out.println("Строка не является палиндромной");

    }
}