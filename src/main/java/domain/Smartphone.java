package domain;


public class Smartphone extends Product {
    private String model;

    public Smartphone(int id, String name, int price) {
        super(id, name, price);
        this.model = getModel();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
