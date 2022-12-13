

public class Train extends Transport {

    private static final String model1 = null;
    double travelPrice;
    double travelTime;
    String departureStation;
    String arrivalStation;
    int wagonsCount;
    private String refill;

    public Train(String brand, String model, String productionCountry, int productionYear, String color, double maxSpeed) {
        super(brand, model, productionCountry, productionYear, color, model1, productionCountry1, productionCountry2, productionCountry3, maxSpeed);
    }

    public Train(String brand, String model, int productionYear, String productionCountry, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, maxSpeed, model1, productionCountry1, productionCountry2, productionCountry3);
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, String brand1, String model1, int productionYear1, String productionCountry1) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, brand1, model1, productionYear1, productionCountry1);
    }

    //public Train(String refill) {
        //super(brand, getModel(), getProductionYear(), productionCountry, "Данные не корректные", maxSpeed);
        //this.refill = refill;


    @Override
    public void refill() {

    }
}


// *public Train(String brand, String model, int productionYear, String productionCountry) {
       // this(brand, model, productionYear, productionCountry, 0, 0, 0,
            //    "Данные не корректные", "Данные не корректные", 10, "дизель");
    //*

    /*public Train(double maxSpeed) {
        super(brand, model, productionYear, productionCountry, maxSpeed);

        this.departureStation = ValidateUtils.validateString(departureStation);
        this.arrivalStation = ValidateUtils.validateString(arrivalStation);
        this.travelPrice = ValidateUtils.validateDoubleNum(travelPrice);
        this.travelTime = ValidateUtils.validateDoubleNum(travelTime);
        this.wagonsCount = ValidateUtils.validateNum(wagonsCount);
        this.refill = ValidateUtils.validateString(refill);
    //}

    @Override
    public void refill() {
        System.out.println("Заправить дизелем");
    }

    public void showCharacteristics() {
        System.out.println(toString());
    }


    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {

        new Train(travelPrice);
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {

        this.travelTime = ValidateUtils.validateDoubleNum(travelTime);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public String getRefill() {
        return refill;
    }

    public void setRefill(String refill) {

        this.refill = validateString(refill);
    }

    private String validateString(String refill) {
        return null;
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {

        this.wagonsCount = validateNum(wagonsCount);
    }

    private int validateNum(int wagonsCount) {
        return 0;
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getProductionYear() + " года, страна выпуска - " +
                getProductionCountry() + ", максимальная скорость передвижения - " + getMaxSpeed() + ", " +
                "станция отправления: " + getDepartureStation() + ", станция прибытия: " + getArrivalStation() +
                ", время в пути: " + getTravelTime() + "ч. Цена поездки: " + getTravelPrice() + " рублей, в поезде "
                + getWagonsCount() + " вагонов, заправка: " + refill + ".";
    }

     */
