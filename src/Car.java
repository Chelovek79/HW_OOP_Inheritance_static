public class Car extends Transport {

    private final String carBodyType;
    private final int numberOfSeats;
    private double engineVolume;
    private String transmission;
    private String registrationNumber;

    public Car(String brand, String model, String carBodyType, int productionYear, String productionCountry, String transmission,
               double engineVolume, int maxSpeed, String colour, int numberOfSeats, String registrationNumber) {
        super(brand, model, productionYear, productionCountry, colour, maxSpeed);
        this.carBodyType = carBodyType;
        this.numberOfSeats = numberOfSeats;
        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        this.setRegistrationNumber(registrationNumber);
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isBlank()) ? "top secret" : transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber == null || registrationNumber.isBlank())
                ? "а000аа49" : registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\t тип кузова - '" + carBodyType + "'\n" +
                "\t количество мест - " + numberOfSeats + "\n" +
                "\t объём двигателя - " + engineVolume + " л\n " +
                "\t трансмиссия - '" + transmission + "'\n" +
                "\t регистрационный знак - " + registrationNumber + "\n";
    }
}
