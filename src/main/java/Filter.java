import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private final int thresholdForValues;

    public Filter(int thresholdForValues){
        this.thresholdForValues = thresholdForValues;
    }

    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstanceLogger();
        logger.log("Запускаем фильрацию");
        List<Integer> result = new ArrayList<>();
        for (Integer i : source){
            if(i > thresholdForValues){
                result.add(i);
                logger.log(String.format("Элемент %d проходит", i));
            } else logger.log(String.format("Элемент %d не проходит", i));
        }
        return  result;
    }
}
