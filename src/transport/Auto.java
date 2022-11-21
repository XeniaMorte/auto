package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

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
    private int countseats;
    String rezina;
    public Key key;
    private Insurance insurance;



    public static class Key {
        private final boolean isAutoEngine;
        private final boolean isAutoKeyAcsess;

        public Key(boolean isAutoEngine, boolean isAutoKeyAcsess) {
            this.isAutoEngine = isAutoEngine;
            this.isAutoKeyAcsess = isAutoKeyAcsess;
        }


        public boolean isAutoEngine() {
            return isAutoEngine;
        }

        public boolean isAutoKeyAcsess() {
            return isAutoKeyAcsess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "isAutoEngine=" + isAutoEngine +
                    ", isAutoKeyAcsess=" + isAutoKeyAcsess +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate duration;
        private int coastIns;
        private String number;

        public Insurance(LocalDate duration) {
            this.duration = duration;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public int getCoastIns() {
            return coastIns;
        }

        public LocalDate getDuration() {
            return duration;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "duration=" + duration +
                    ", coastIns=" + coastIns +
                    ", number='" + number + '\'' +
                    '}';
        }

        public void setCoastIns(int coastIns) {
            this.coastIns = coastIns;
        }

        public boolean isValideNumberInsuranse(String number) {
            if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}", number)) {
                return true;
            } else {
                System.out.println("ERROR NUMBER");
                return false;
            }
        }

        public LocalDate sceckDuration() {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("Прострочена страховка");
                return LocalDate.now();

            } else {
                return duration;
            }
        }
    }

    public Auto(String brand, String model, float engineVolume, String color, int year, String country, String kpp, String typecuzov, String rezina, String regNumber, int countseats) {

        this.color = color == null ? " белый" : color;
        this.engineVolume = engineVolume <= 0 ? 1.5f : engineVolume;
        this.year = year <= 0 ? 2000 : year;
        this.brand = brand == null ? "default" : brand;
        this.model = model == null ? "default" : model;
        this.country = country == null ? "default" : country;
        this.countseats = countseats == 0 ? 2 : countseats;
        this.kpp = kpp == null ? "default" : kpp;
        this.rezina = rezina == null ? "default" : rezina;
        this.regNumber = regNumber == null ? "default" : regNumber;
        //^[АВЕКМНОРСТУХ]\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\d{2,3}$/ui
        this.typecuzov = typecuzov == null ? "default" : typecuzov;


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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }


    public String turnRezina(String rezina) {
        // boolean isSummer=true;
        String summer = "летняя";
        String winter = "зимняя";
        if (getRezina().equals(summer)) {
            return winter;
        } else {
            return summer;
        }


    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", kpp='" + kpp + '\'' +
                ", typecuzov='" + typecuzov + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", countseats=" + countseats +
                ", rezina='" + rezina + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public void info2() {
        System.out.println(brand + " " + model + " " + engineVolume + " " + color + " " + year + " " + country + " " + rezina + " " + regNumber + " " + countseats + " " + regNumber + " " + kpp);
    }
    public void info3() {
        System.out.println(this);
    }

}


