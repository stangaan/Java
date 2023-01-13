package HausworksJava;

public class Pension extends Main {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;


    private String namePensionFond;

    private boolean isState;

    private int dateCreate;

    public Pension( String namePensionFond, boolean isState, int dateCreate) {
        this.namePensionFond = namePensionFond;
        this.isState = isState;
        this.dateCreate = dateCreate;
    }




    public double pensionСalculation(int age, double maxSalary, double minSalary){
       double averageSalary;
        if (isState){
            averageSalary = AveregeCalculationUtil.twoNamber(maxSalary,minSalary);
        }
        else {
            averageSalary = AveregeCalculationUtil.threeNamber(maxSalary, minSalary, AVERAGE_SALARY);
        }
        return averageSalary * age * PENSION_COEFFICIENT;

    }

}


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