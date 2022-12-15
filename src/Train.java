/*


public  abstract class Transport {


    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double maxSpeed;

    protected Transport(String model) {
        this.model = model;
    }


    public Transport(String brand, String model, String productionCountry, int productionYear, String color, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.color = color;

    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

}

    //public Train(String refill) {
        //super(brand, getModel(), getProductionYear(), productionCountry, "Данные не корректные", maxSpeed);
        //this.refill = refill;


        */
/**
         *
         *//*

    @Override
    public void refill() {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}


// *public Train(String brand, String model, int productionYear, String productionCountry) {
       // this(brand, model, productionYear, productionCountry, 0, 0, 0,
            //    "Данные не корректные", "Данные не корректные", 10, "дизель");
    //*

    */
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

     *//*

