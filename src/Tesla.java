public class Tesla extends Car implements Printable {
    private String model;

    public Tesla(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDE97\nМодель теслы: " + model);
    }
}

