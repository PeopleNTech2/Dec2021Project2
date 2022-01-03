package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

        //file not found and IOException are compile time exceptions

        //handle exception with throws keyword (this is not the ideal way)

        FileReader fileReader = new FileReader("/Users/nacer-zimu/Desktop/test");;
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str = "";

        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }

        fileReader.close();
        bufferedReader.close();


    }
}
