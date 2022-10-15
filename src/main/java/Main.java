import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        Logger logger = Logger.getInstanceLogger();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int sizeList = scanner.nextInt();
        if(!checkValid(sizeList)){
            throw new IllegalArgumentException();
        }
        System.out.println("Введите верхнюю границу для значений: ");
        int valueBoundary = scanner.nextInt();
        if(!checkValid(valueBoundary)){
            throw new IllegalArgumentException();
        }

        WorkerWithList workerWithList = new WorkerWithList(sizeList, valueBoundary);
        workerWithList.fillList(source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int thresholdForValues = scanner.nextInt();
        if(!checkValid(thresholdForValues)){
            throw new IllegalArgumentException();
        }

        Filter filter = new Filter(thresholdForValues);
        List<Integer> result = filter.filterOut(source);

        logger.log("Выводим резултат на экран");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу ");
    }


    public static boolean checkValid(int enteredValue){
        Logger logger = Logger.getInstanceLogger();
        if(enteredValue <= 0){
            logger.log("Пользователь ввёл неккорректное значение");
            System.out.println("Вы ввели неккоректное значение");
            return false;
        }
        return true;
    }
}
