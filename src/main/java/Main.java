import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) throws JsonProcessingException, FileNotFoundException {



        Cadet cadet = new Cadet("Асет", "Лейтенант", 23);
        Cadet cadet1 = new Cadet("Петя", "рядовой", 17);
        Cadet cadet2 = new Cadet("Бека", "ефрейтор", 19);
        Cadet cadet3 = new Cadet("Дони", "сержант", 22);

//        Cadet[] st = new Cadet[]{
//                cadet, cadet1,cadet2,cadet3
//        };
        ArrayList<Cadet> Cadet = new ArrayList<Cadet>();
        Cadet.add(cadet);
        Cadet.add(cadet1);
        Cadet.add(cadet2);
        Cadet.add(cadet3);
        String sep = "\n" ;

        ObjectMapper objectMapper = new JsonMapper();
        PrintWriter printWriter = new PrintWriter("1.json");
        for(int i = 0; i<Cadet.size();i++){
            String jsonObj = objectMapper.writeValueAsString(Cadet);
            System.out.println(jsonObj);
            printWriter.write(jsonObj);
            printWriter.close();

        }
        System.out.println(cadet3.compareTo(cadet1));
    }
}
