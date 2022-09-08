public class Main {
    public static void main(String[] args) {
        Printable[] printable = {createObject("Mercedes"), createObject("Tesla"),
                createObject("Honda")};
        for (Printable print : printable) {
            print.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Mercedes":
                return new Mercedes(3.5);
            case "Tesla":
                return new Tesla("Sport");
            case "Honda":
                return new Honda(2002);
        }
        return null;
    }
}