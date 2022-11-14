public class Main {
    public static void main(String[] args) {
        Auto ladaGranta = new Auto("Lada", "Lada Granta", 1.7f, "желтый", 2015, "Россия");
        Auto Audi = new Auto("Audi ", "Audi A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
        Auto Bmw = new Auto("BMW  ", "BMW Z8", 3, "черный", 2021, "Германия");
        Auto Kia = new Auto("Kia", "Kia Sportage ", 2.4f, "красный", 2018, "Южная корея");
        Auto Hyundai = new Auto("Hyundai", "Hyundai Avante ", 1.6f, "оранжевый ", 2016, "Южная корея");
        ladaGranta.info();
        Audi.info();
        Bmw.info();
        Kia.info();
        Hyundai.info();

    }
}