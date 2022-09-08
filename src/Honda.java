public class Honda extends Car implements Printable {
    private int year;

    public Honda(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDE97\nГод хонды: " + year);
    }
}