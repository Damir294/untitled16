public  abstract class Transport {


    String brand;
    private final String model;
    private int productionYear;
    private String productionCountry1;
    private String productionCountry2;
    private String productionCountry;
    private String color;
    private double maxSpeed;


    //public Transport(String brand, String model, int productionYear, String productionCountry, String ignoredДанныеНеКорректные, double maxSpeed) {
            //this(null, null, 0, null, null, 0.0);


    public Transport(String brand, String model, int productionCountry, String productionYear, String color, String model1, String productionCountry1, String productionCountry2, String productionCountry3, double maxSpeed) {
            this(brand, model, productionYear, productionCountry, color, 0, productionCountry1, productionCountry2, productionCountry3);
        this.model = model1;
        this.maxSpeed = maxSpeed;
        this.brand = null;
    }

        public Transport(String brand, String model, int productionYear, String productionCountry, double maxSpeed, String model1, String productionCountry1, String productionCountry2, String productionCountry3) {
            this(brand, model, productionYear, productionCountry, "Данные не корректные", model1, productionCountry1, productionCountry2, productionCountry3, maxSpeed);
            this.productionYear = productionYear;
            this.maxSpeed = maxSpeed;
            this.productionCountry1 = productionCountry1;
            this.productionCountry2 = productionCountry2;
            this.productionCountry = productionCountry3;
            this.brand = null;
        }


        public Transport(String brand, String model, int productionYear, String productionCountry,
                         String color, double maxSpeed, String brand1, String model1, int productionYear1, String productionCountry1) {

           //= validateDoubleNum(maxSpeed);
            this.brand = brand1;
            this.model = model1;
            this.productionYear = productionYear1;
            this.productionCountry = productionCountry1;
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

        public String getColor() {
            return color;
        }

        public void setColor(String color) {

            this.color = ValidateUtils.validateString(color);


        //public double getMaxSpeed() {
           // return maxSpeed;
        //}

        //public void setMaxSpeed(double maxSpeed) {
            //this.maxSpeed = validateDoubleNum(maxSpeed);
        //}

      //  public void showCharacteristics() {
          //  System.out.println(toString());
//}/*
