public abstract class Transport {

    private final String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String colour;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String colour, int maxSpeed) {
        this.brand = brand;
        this.setModel(model);
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.setColour(colour);
        this.setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = (model == null || model.isBlank()) ? "Корч" : model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = (colour == null || colour.isBlank()) ? "Жемчужный" : colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed <=0) ? 160 : maxSpeed;
    }

    @Override
    public String toString() {
        return brand +" " + model + '\n' +
                "\t год выпуска - " + productionYear + "г.\n" +
                "\t страна производитель - '" + productionCountry + "'\n" +
                "\t цвет кузова - '" + colour + "'\n" +
                "\t максимальная скорость - " + maxSpeed + "км/ч\n";
    }
}
