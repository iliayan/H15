public class Distance {
    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void print() {
        System.out.println("Відстань: " + distance + " метрів");
    }

    public static class Converter {
        public static double metersToKilometers(double meters) {
            return meters / 1000.0;
        }

        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }

        public static double milesToKilometers(double miles) {
            return miles / 0.621371;
        }
    }

    public static void main(String[] args) {
        // Створюємо об'єкт класу Distance
        Distance distance = new Distance(5000);

        // Виводимо відстань у метрах
        distance.print();

        // Конвертуємо відстань з метрів у кілометри та виводимо
        double kilometers = Converter.metersToKilometers(distance.distance);
        System.out.println("Відстань у кілометрах: " + kilometers + " км");

        // Конвертуємо відстань з кілометрів в милі та виводимо
        double miles = Converter.kilometersToMiles(kilometers);
        System.out.println("Відстань у милях: " + miles + " миль");

        // Конвертуємо відстань з миль в кілометри та виводимо
        double kilometersFromMiles = Converter.milesToKilometers(miles);
        System.out.println("Відстань у кілометрах: " + kilometersFromMiles + " км");
    }
}