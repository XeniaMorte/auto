import transport.Auto;

public class Main {
    public static void main(String[] args) {
        Auto ladaGranta = new Auto("Lada", "Lada Granta", 1.7f, "желтый", 2015, "Россия", "auto", "ffe", "зимняя", "3456", 6);
        Auto Audi = new Auto("Audi ", "Audi A8 50 L TDI quattro", 3, "черный", 2020, "Германия", "auto", "fe", "зимняя", "3456", 2);
        Auto Bmw = new Auto("BMW  ", "BMW Z8", 3, "черный", 2021, "Германия", "auto", "ffe", "зимняя", "3456", 06);
        Auto Kia = new Auto("Kia", "Kia Sportage ", 2.4f, "красный", 2018, "Южная корея", "auto", "ffe", "летняя", "56", 129);
        Auto Hyundai = new Auto("Hyundai", "Hyundai Avante ", 1.6f, "оранжевый ", 2016, "Южная корея", "auto", "уаfe", "зимняя", "987656", 100);
        ladaGranta.info();
        Audi.info();
        Bmw.info();
        Kia.info();
        Hyundai.info2();
        ladaGranta.info2();
        Audi.info2();
        Bmw.info2();
        Kia.info2();
        Hyundai.info2();

    }
}
