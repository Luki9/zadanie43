import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class  array05{
        public static void main(String[] args) throws FileNotFoundException {


            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            List<Integer> array = new LinkedList<>();
            int currentNumber;

            while (scanner.hasNextLine()) {
                currentNumber = scanner.nextInt();
                array.add(currentNumber);
            }

            Map<Integer, Integer> result = new HashMap<Integer, Integer>();
            int arryNum[] = {6,3,4,5,6,3};
            for(int i: arryNum){
                if (result.containsKey(i)) result.put(i, result.get(i)+1);
                else result.put(i, 1);
            }
            for (int i: result.keySet()) System.out.println(i + ":" + result.get(i));
        }
    }