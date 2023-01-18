public class Main {

    public static void main(String[] args) {

        Car [] car = new Car[3];

        car [0] = new Car("Toyota", "Mark II", "седан", 1992, "Япония",
                "МКПП",3.0,230, "White Pearl", 5, null);
        car [1] = new Car("Audi", null, "седан", 2020, "Германия",
                "  ", 3.0, 180, "Чёрный", 4, "п234на161");
        car [2] = new Car("BMW", "Z8", "седан", 2021, "Германия",
                "АКПП", 0, 210, " ", 5, "у054ра178");

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

    }
}