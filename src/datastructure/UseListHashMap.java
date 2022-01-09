package datastructure;

import java.util.*;

public class UseListHashMap {//number 1
    public static void main(String[] args) {

        Map<String, String> personalInfo = new HashMap<>();

        personalInfo.put("first name", "jack");
        personalInfo.put("last name", "sparrow");
        personalInfo.put("position", "pirate");
        personalInfo.put("phone number", "3478971243");

        System.out.println(personalInfo.get("last name"));

        List<String> citiesOfUsa = new ArrayList<>();
        citiesOfUsa.add("NYC");
        citiesOfUsa.add("PHI");
        citiesOfUsa.add("MIA");

        List<String> CitiesOfCanada = new ArrayList<>();
        CitiesOfCanada.add("TO");
        CitiesOfCanada.add("MO");
        CitiesOfCanada.add("OT");

        List<String> CitiesOfAlgeria = new ArrayList<>();
        CitiesOfAlgeria.add("ALG");
        CitiesOfAlgeria.add("TIZ");
        CitiesOfAlgeria.add("CAN");

        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("USA", citiesOfUsa);
        map.put("Canada", CitiesOfCanada);
        map.put("Algeria", CitiesOfAlgeria);

        for (int i = 0; i < map.size(); i++) {//when we have indexed list
            //list.size() = array.length
        }

        //for (type var_name : list) { body }

//        for (Map.Entry entry: map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        System.out.println(map.size());//length


    }
}
