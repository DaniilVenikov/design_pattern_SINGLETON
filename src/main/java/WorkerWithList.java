import java.util.List;
import java.util.Random;

public class WorkerWithList implements WorksWithList{
    private final Random random = new Random();
    private final int valueBoundary;
    private final int sizeList;

    public WorkerWithList(int sizeList, int valueBoundary){
        this.sizeList = sizeList;
        this.valueBoundary = valueBoundary;
    }

    @Override
    public void fillList(List<Integer> source) {
        Logger logger = Logger.getInstanceLogger();
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < sizeList; i++){
            source.add(random.nextInt(valueBoundary));
        }
        System.out.println("Вот случайный список: " + source);
    }


}
