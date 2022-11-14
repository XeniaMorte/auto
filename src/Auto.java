public class Auto {
   String brand;
   String model;
float engineVolume;
     String color;
 int year;
 String country;
 public Auto(  String brand,String model,float engineVolume,String color,int year,String country){
     this.brand=brand;
     this.color=color;
     this.engineVolume=engineVolume;
     this.year=year;
     this.model=model;
     this.country=country;
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

    public   void info(){
        System.out.println( brand+" "+model+" "+engineVolume+" "+color+ " "+year+" "+ country );
    }
}

