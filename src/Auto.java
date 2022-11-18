public class Auto {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Auto(String brand, String model, float engineVolume, String color, int year, String country) {

        this.color = color ==null? " белый":color;
        this.engineVolume = engineVolume <= 0 ? 1.5f : engineVolume;
        this.year = year <=0 ? 2000: year;
        this.brand = brand == null ? "default" : brand;
        this.model = model == null ? "default" : model;
        this.country = country == null ? "default" : country;

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
}

