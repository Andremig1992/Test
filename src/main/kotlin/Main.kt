import kotlin.random.Random

fun main() {
//Водитель в Якутске собирается поехать из пункта А в пункт Б. Он готов взять с собой попутчиков.
//Написать алгоритм, который предложит водителю наиболее подходящие заказы по пути маршрута.

    // координаты начала пути
    val A = Map(30, 30, "начало пути")
    // координаты окончания пути
    val B = Map(45, 300, "конец пути")

    // пассажиры предлагающие подвезти
    var Passenger1 = Map(0, 35, "Алексей")
    var Passenger2 = Map(45, 45, "Анна")
    var Passenger3 = Map(50, 35, "Виктория")
    var Passenger4 = Map(40, 300, "Василий")
    var Passenger5 = Map(50, 50, "Николай")

    // поиск пассажиров
    var Passengers = mutableListOf<Map> ()
    if (Passenger1.Width >= A.Width && Passenger1.Width <= B.Width) {
        if(Passenger1.Length >= A.Length && Passenger1.Length<=B.Length) {
            Passengers.add(Passenger1)
            println("Пассажир ${Passenger1.name} предлагает его/ее подвезти")
            // расстояние от начала маршрута
            var ADistance=(Passenger1.Width-A.Width)+(Passenger1.Length-A.Length)
            println("Расстояние до пассажира от начальной точки $ADistance")
            // расстояние от конца маршрута
            var BDistance=(B.Width-Passenger1.Width)-(B.Length-Passenger1.Length)
            println("Расстояние до пассажира от конечной точки $BDistance")
            }
    }

    if (Passenger2.Width >= A.Width && Passenger2.Width <= B.Width) {
        if(Passenger2.Length >= A.Length && Passenger2.Length<=B.Length) {
            Passengers.add(Passenger2)
            println("Пассажир ${Passenger2.name} предлагает его/ее подвезти")
            // расстояние от начала маршрута
            var ADistance=(Passenger2.Width-A.Width)+(Passenger2.Length-A.Length)
            println("Расстояние до пассажира от начальной точки $ADistance")
            // расстояние от конца маршрута
            var BDistance=(B.Width-Passenger2.Width)-(B.Length-Passenger2.Length)
            println("Расстояние до пассажира от конечной точки $BDistance")
        }
    }

    if (Passenger3.Width >= A.Width && Passenger3.Width <= B.Width) {
        if(Passenger3.Length >= A.Length && Passenger3.Length<=B.Length) {
            Passengers.add(Passenger3)
            println("Пассажир ${Passenger3.name} предлагает его/ее подвезти")
            // расстояние от начала маршрута
            var ADistance=(Passenger3.Width-A.Width)+(Passenger3.Length-A.Length)
            println("Расстояние до пассажира от начальной точки $ADistance")
            // расстояние от конца маршрута
            var BDistance=(B.Width-Passenger3.Width)-(B.Length-Passenger3.Length)
            println("Расстояние до пассажира от конечной точки $BDistance")
        }
    }
    if (Passenger4.Width >= A.Width && Passenger4.Width <= B.Width) {
        if(Passenger4.Length >= A.Length && Passenger4.Length<=B.Length) {
            Passengers.add(Passenger4)
            println("Пассажир ${Passenger4.name} предлагает его/ее подвезти")
            // расстояние от начала маршрута
            var ADistance=(Passenger4.Width-A.Width)+(Passenger4.Length-A.Length)
            println("Расстояние до пассажира от начальной точки $ADistance")
            // расстояние от конца маршрута
            var BDistance=(B.Width-Passenger4.Width)-(B.Length-Passenger4.Length)
            println("Расстояние до пассажира от конечной точки $BDistance")
        }
    }
    if (Passenger5.Width >= A.Width && Passenger5.Width <= B.Width) {
        if(Passenger5.Length >= A.Length && Passenger5.Length<=B.Length) {
            Passengers.add(Passenger5)
            println("Пассажир ${Passenger5.name} предлагает его/ее подвезти")
            // расстояние от начала маршрута
            var ADistance=(Passenger5.Width-A.Width)+(Passenger5.Length-A.Length)
            println("Расстояние до пассажира от начальной точки $ADistance")
            // расстояние от конца маршрута
            var BDistance=(B.Width-Passenger5.Width)-(B.Length-Passenger5.Length)
            println("Расстояние до пассажира от конечной точки $BDistance")
        }
    }
    println("Через Ваш маршрут ${Passengers.size} пассажиров предлагают Вам поездку")

}
