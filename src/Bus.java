public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color,
               double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }


    @Override
    public void refill() {
        System.out.println("Заправить бензином/дизелем на заправке");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ", " + getProductionYear() +
                " года, страна выпуска - " + getProductionCountry() +
                ", максимальная скорость передвижения - " +
                getMaxSpeed() + ".";
    }

    private String getMaxSpeed() {
        return null;
    }
}