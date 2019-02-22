import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class  Test{
        public static void main(String[] args) throws FileNotFoundException {


            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            List<Integer> array = new LinkedList<>();
            int arrayNum;

            while (scanner.hasNextLine()) {
                arrayNum = scanner.nextInt();
                array.add(arrayNum);
            }

            Map<Integer, Integer> result = new HashMap<Integer, Integer>();

            for(int i: array){
                if (result.containsKey(i)) result.put(i, result.get(i)+1);
                else result.put(i, 1);
            }
            for (int i: result.keySet()) System.out.println(i + ":" + result.get(i));
        }
    }
