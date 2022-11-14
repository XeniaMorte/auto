package transport;

public class Auto {
     private String brand;
   private String model;
    float engineVolume;
    String color;
   private int year;
    private String country;
     String kpp;
    private String typecuzov;
     String regNumber;
    private  int  countseats;
    String rezina;


    public Auto(String brand, String model, float engineVolume, String color, int year, String country,String kpp,String typecuzov,String rezina, String regNumber,int countseats) {

        this.color = color ==null? " белый":color;
        this.engineVolume = engineVolume <= 0 ? 1.5f : engineVolume;
        this.year = year <=0 ? 2000: year;
        this.brand = brand == null ? "default" : brand;
        this.model = model == null ? "default" : model;
        this.country = country == null ? "default" : country;
        this.countseats=countseats==0?2:countseats;
        this.kpp=kpp== null ? "default" : kpp;
        this.rezina= rezina==null ? "default" : rezina;
        this.regNumber=regNumber== null ? "default" :regNumber;
        //^[АВЕКМНОРСТУХ]\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\d{2,3}$/ui
        this.typecuzov=typecuzov== null ? "default" : typecuzov;


    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getCountry() {
        return country;
    }

    public void info() {
        System.out.println(brand + " " + model + " " + engineVolume + " " + color + " " + year + " " + country);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getCountseats() {
        return countseats;
    }



    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getTypecuzov() {
        return typecuzov;
    }

    public String getKpp() {
        return kpp;
    }

    public void setRezina(String rezina) {
        this.rezina = rezina;
    }

    public String getRezina() {
        return rezina;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String turnRezina(String rezina){
        // boolean isSummer=true;
        String summer="летняя";
        String winter    = "зимняя";
        if (getRezina().equals(summer)){
            return winter;
        }
        else  {
            return summer;
        }


    }
    public void info2(){
        System.out.println( brand + " " + model + " " + engineVolume + " " + color + " " + year + " " + country+" "+rezina+" "+regNumber+" "+countseats+" "+ regNumber+" "+kpp);
    }
}


