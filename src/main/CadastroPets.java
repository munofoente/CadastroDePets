package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Program {

    public static void lerPerguntas(){

        String path = "c:\\Users\\munof\\IdeaProjects\\CadastroPets\\src\\resources\\formulario.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String lines = br.readLine();
            while (lines != null){
                System.out.println(lines);
                lines = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Erro: arquivo não encontrado " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        
    }

}
