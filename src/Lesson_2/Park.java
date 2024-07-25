package Lesson_2;

public class Park {
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.attractionName = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 200);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "12:00 - 20:00", 300);

        attraction1.printInfo();
        attraction2.printInfo();
    }
}