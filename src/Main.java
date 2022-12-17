import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void determineTheWeightYear( int time) {
        boolean target = ((time % 4) == 0 && (time % 100 != 0)) || ((time % 400) == 0);

        if (target) {
            System.out.println("Год весокостный");
        } else System.out.println("Год не весокостный");
    }

    public static void task1() {
        //Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        //Эту проверку вы уже реализовывали в задании по условным операторам.
        //Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        //Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
        // «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».

        System.out.println("\nЗадача_1");
        int year = 100;
        determineTheWeightYear(year);
    }

    public static void determineTheOSAndAgeOfTheDevice (int operationalSystem, int deviseYear) {
        int currentYear = LocalDate.now().getYear();

        if (operationalSystem == 0) {
            if (deviseYear >= currentYear) {
                System.out.println("Скачайте прилжение для IOS по ссылке:");
            } else {
                System.out.println("Скачайте облегчённую версию приложения для IOS по ссылке:");
            }
        } else if (operationalSystem == 1) {
            if (deviseYear >= currentYear) {
                System.out.println("Скачайте приложение для Андройд по ссылке:");
            } else {
                System.out.println("Скачайте олегчённую версию приложение для Андройд по ссылке:");
            }
        } else
            System.out.println("Продай свой тапок и купи нормальный телефон");

    }


    public static void task2() {
        //Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
        //Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        //Если устройство старше текущего года, предложите ему установить облегченную версию.
        //Текущий год можно получить таким способом:
        //int currentYear = LocalDate.now().getYear();
        //Или самим задать значение вручную — ввести в переменную числовое значение.
        //В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
        // и для какой ОС (Android или iOS) установить пользователю.

        System.out.println("\nЗадача_2");
        int clientOS = 0;
        int clientsDevisesYear = 2015;
        determineTheOSAndAgeOfTheDevice(clientOS,clientsDevisesYear);
    }
    public static void determinateDeliveryTime(int deliveryDistance, int deliveryTime) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime++;
            System.out.println("Потребуется дней " + deliveryTime);
        } else System.out.println("Доставки нет");
    }

    public static void task3() {
        //Возвращаемся к задаче на расчет дней доставки банковской карты.
        //
        //Текст прошлого задания
        //В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта,
        // нужно знать расстояние от офиса до адреса доставки.
        //Правила доставки такие:
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        //
        //Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.

        System.out.println("\nЗадача_3");
        int deliveryDistance = 110;
        int deliveryTime = 1;
        determinateDeliveryTime(deliveryDistance, deliveryTime);
    }

}