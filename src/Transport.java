public abstract class Transport{


    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double maxSpeed;

    protected Transport(String model, String s, int productionYear, String productionCountry, String color, double maxSpeed, String brand1, String model1, int productionYear1, String productionCountry1) {
        this.model = model;
    }

    public Transport(String brand, String model, String productionCountry, int productionYear, String color, double maxSpeed) {
    }


    public void Transport(String brand, String model, String productionCountry, int productionYear, String color, double maxSpeed) {
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

  /*      //public Transpor(String brand, String model, int productionYear, String productionCountry, double maxSpeed, String model1, String productionCountry1, String productionCountry2, String productionCountry3) {
            //this(brand, model, productionYear, productionCountry, "Данные не корректные", model1, productionCountry1, productionCountry2, productionCountry3, maxSpeed);
            //this.productionYear = productionYear;
            //this.maxSpeed = maxSpeed;
            //this.productionCountry1 = productionCountry1;
            ///this.productionCountry2 = productionCountry2;
            //this.productionCountry = productionCountry3;
            //this.brand = null;
        //}


        //*public Transpor(String brand, String model, int productionYear, String productionCountry,
                        // String color, double maxSpeed, String brand1, String model1, int productionYear1, String productionCountry1) {

           //= validateDoubleNum(maxSpeed);
          //  this.brand = brand1;
            //this.model = Train.model1;
            //this.productionYear = productionYear1;
            //this.productionCountry = productionCountry1;
        //*}

    //*public abstract void refill();

   //     public String getBrand() {
            return Integer.parseInt(brand);
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
            String color1 = color;
            return color1;
       //* }

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

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
  //*  }*/