package lesson8_dz_2;

// 2. В первом классе создайте static final переменную Пи = 3,14.
//Используйте данную константу в non-static методе, который принимает
//в параметре значение радиуса и вычисляет площадь круга по формуле:
//Площадь = Пи * радиус * радиус.
// Также используйте данную константу
//в static методе, который принимает в параметре значение радиуса и
//вычисляет длину окружности по формуле: Площадь = 2 * Пи * радиус.


//Создайте ещё один non-static метод, который принимает в параметре
//значение радиуса и выводит на экран информацию о радиусе, площади
//круга и длине окружности. Используйте все 3 метода во 2-м классе
public class DZ_8_2 {
    static final double pi = 3.14;

    double calculatingTheAreaOfACircle(double radius) {
        return (radius * radius * pi);
    }

    void calculatingAll(double radius) {
        System.out.println("Radius = " + radius);
        double answer = (2 * radius * pi);
        System.out.println("Длинна окружности = " + answer);
        double area = (radius * radius * pi);
        System.out.println("Площадь окружности = " + area);
    }

    static void calculateTheCircumference(double radius) {
        double answer = (2 * radius * pi);
        System.out.println("Длинна окружности = " + answer);
    }

}

class DZ_Test {
    public static void main(String[] args) {
        DZ_8_2 obj1 = new DZ_8_2();
        System.out.println("Площадь окружности = " + obj1.calculatingTheAreaOfACircle(3));

        DZ_8_2.calculateTheCircumference(3);

        obj1.calculatingAll(3);
    }


}