package datastructure;

public class Array {
    public static void main(String[] args) {

        int [] array2 = {7, 4, 1, 5, 3};//inline declared and assigned array

        String [] lunch = new String [3];//array declaration [type name = length] --> **********************static list

        lunch[0] = "Hummus";//data assignment [name[index] = value]
        lunch[1] = "Steak";//data assignment [name[index] = value]
        lunch[2] = "Chocolate mousse";//data assignment [name[index] = value]
//        lunch[3] = "coffee";//data assignment [name[index] = value]

//        for (int i = 0; i < array.length ; i++) {
//            System.out.println(array[i]);
//        }

        System.out.println(lunch);
//        for (String a: lunch) {
//            System.out.println(a);
//        }



    }
}
