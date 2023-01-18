package Transport;

public class BDTransport {

    private Car[] car = {
                new Car("Toyota", "Mark II", "седан", 1992, "Япония",
            "МКПП",3.0,230, "White Pearl", 5, null),
                new Car("Audi", null, "седан", 2020, "Германия",
            "  ", 3.0, 180, "Чёрный", 4, "п234на161"),
                new Car("BMW", "Z8", "седан", 2021, "Германия",
            "АКПП", 0, 210, " ", 5, "у054ра178")
    };

    private Bus[] bus = {
                new Bus("Ikarus","250 SL",1990,"Венгрия","Красный",120 ),
                new Bus("ЛиАЗ","677",1979,"СССР","жёлтый",70),
                new Bus("ЛАЗ","695Н",1989,"СССР","Белый",86)
    };

    public void printTransportCar() {
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }
    public void printTransportBus() {
        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
        }
    }
}
