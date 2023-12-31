package chapter13_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
//      createNewFile();
        numbersExceptionHandling();
        createNewFileRethrow();
    }

    public static void createNewFile(){
        File file = new File("resource/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resource/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resource/numbers.txt");



        try(Scanner fileReader = new Scanner(file)) {

            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("File or input its wrong.");
            e.printStackTrace();
        }
    }
}
