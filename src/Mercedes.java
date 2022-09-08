public class Mercedes extends Car implements Printable {
    private double volume;

    public Mercedes(double volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDE97\nОбьем мерседеса: " + volume);
    }
}