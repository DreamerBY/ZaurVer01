package Lesson4Z;


    import java.util.Scanner;

    public class AICalculator {
        public static void main(String[] args) {
            double num1, num2, result;
            char operator;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка! Неверный оператор.");
                    return;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

