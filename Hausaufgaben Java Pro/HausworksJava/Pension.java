package HausworksJava;

public class Pension {

    double pensionCoefficient;

    String namePension;

    boolean statesPension;


    public int getDateCreate() {
        return dateCreate;
    }

    private int dateCreate;

    public Pension(double pensionCoefficient, String namePension, boolean statesPension, int dateCreate) {
        this.pensionCoefficient = pensionCoefficient;
        this.namePension = namePension;
        this.statesPension = statesPension;
        this.dateCreate = dateCreate;
    }

    public int pensionСalculation(int a, int b, int c){
        return (b + c) * a;
    }}


//
//а) КОНСТАНТА коэффициент пенсии = 0.02
//        б) Именование пенсионного фонда
//        в) булеан переменная, явлется ли он государственным
//        г) Дата создания (изменить нельзя)
//
//
//        3) Добавьте в класс пенсионного фонда конструктор
//
//
//        4) Добавьте метод расчета пенсии, который принимает параметры:
//        сколько лет отработал человек, сколько зарабатывал минимально,
//        сколько зарабатывал максимально. Ответ ВОЗВРАЩАЕТСЯ в виде числа с помощью return
//
//
//        Этот метод должен быть реализован так:
//
//
//        а) Если фонд государственный, тогда метод вызывает класс-утилиту и
//        находит среднее значение между максимальной и минимальной зп. Потом это значение умножает на коэффициент пенсии и на количество лет
//
////
//        б) Если фонд НЕгосударственный, тогда метод вызывает класс-утилиту и находит среднее значение между максимальной,
//                минимальной зп и средним значение пенсии в стране - 1500.
//                Потом это значение умножает на коэффициент пенсии и на количество лет.