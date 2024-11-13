import java.util.Scanner; // импортируем библиотеку сканнер

public class Main // Обьявляем основной класс
{
    public static void main(String[] args) //Обьявляем основный метод класса Main
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int a  = 0;

        for (int i = 0; i <= number; i++)
        {
            a += i;
        }

        System.out.print("Сумма чисел Равна:"+a);
    }
}
