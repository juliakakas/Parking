public class Auto {
    private String licensePlateNumber;
    private CarType carType;
    private CarColor color;
    private int person;
    private int cargo;

    Auto(String licensePlateNumber, CarType carType, CarColor color,int person, int cargo){
        this.licensePlateNumber = licensePlateNumber;
        this.carType = carType;
        this.color = color;
        this.person = person;
        this.cargo = cargo;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
